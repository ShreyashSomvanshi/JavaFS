create database bankdb1;
use bankdb1;

 
create table Customers(
	CustomerID int PRIMARY KEY auto_increment,
    FirstName varchar(50),
    LastName varchar(50),
    Email varchar(50),
    Phone varchar(15),
    Address varchar(50)
);


INSERT INTO Customers (FirstName, LastName, Email, Phone, Address) VALUES
('John', 'Doe', 'john.doe@example.com', '1234567890', '123 Elm St'),
('Jane', 'Smith', 'jane.smith@example.com', '9876543210', '456 Oak St'),
('Michael', 'Brown', 'michael.brown@example.com', '5678901234', '789 Pine St');
 
-- Accounts: AccountID  PRIMARY KEY, CustomerID , AccountType , Balance, CreatedDate , FOREIGN KEY (CustomerID)
 
create table Accounts(
	AccountID int PRIMARY KEY auto_increment,
    CustomerID int,
    AccountType varchar(50),
    Balance decimal(10,2),
    CreatedDate date,
	FOREIGN KEY (CustomerID) references Customers(CustomerId)
);
 
INSERT INTO Accounts (CustomerID, AccountType, Balance, CreatedDate)
VALUES
(1, 'Savings', 5000.00, '2023-01-15'),
(1, 'Checking', 2000.00, '2023-02-10'),
(2, 'Savings', 10000.00, '2023-03-05'),
(3, 'Savings', 7000.00, '2023-04-20');
 
 
-- TABLE Transactions:  TransactionID PRIMARY KEY, AccountID INT, TransactionType ,Amount ,TransactionDate, FOREIGN KEY (AccountID)
 
 
create table Transactions(
	 TransactionID int PRIMARY KEY auto_increment,
	 AccountID INT, 
     TransactionType varchar(50),
     Amount decimal(10,2),
     TransactionDate datetime
);
 
INSERT INTO Transactions (AccountID, TransactionType, Amount, TransactionDate)
VALUES
(1, 'Deposit', 1000.00, '2023-01-20 10:00:00'),
(1, 'Withdrawal', 500.00, '2023-01-25 14:30:00'),
(2, 'Deposit', 2000.00, '2023-02-15 09:15:00'),
(3, 'Withdrawal', 1000.00, '2023-04-25 16:45:00');
 
-- TABLE Branches :  BranchID  PRIMARY KEY, BranchName,Location
create table Branches(
	BranchID int  PRIMARY KEY auto_increment,
    BranchName varchar(50),
    Location varchar(50)
);
 
insert into Branches(BranchName,Location) values ('HDFC','Pune'), ('SBI','Mumbai');
 
-- Employees: EmployeeID PRIMARY KEY, BranchID , FirstName, LastName , Role , Salary , FOREIGN KEY (BranchID)
 
create table Employees(
	EmployeeID int PRIMARY KEY auto_increment,
    BranchID int,
    FirstName varchar(50),
    LastName varchar(50),
    Role varchar(50),
    Salary decimal(10,2),
    FOREIGN KEY (BranchID) references Branches(BranchID)
);
 
insert into Employees(BranchId,FirstName,LastName,Role,Salary) values 
	(1,'Alice','Johnson','Manager','75000.00'),
    (1,'Bob','Williams','Teller','40000.00'),
    (2,'Charlie','Devis','Manager',70000.00),
    (2,'Diana','Evans','Teller',42000.00);

 
 -- Question: List all customers and their accounts with balances.
 select c.firstname, c.lastname, a.balance, a.accounttype from customers c join accounts a on c.customerid = a.customerid;
 
 -- NULL
-- Problem Statement: List all employees who manage branches where the total account balances exceed $20,000.
 SELECT 
    e.EmployeeID,
    e.FirstName,
    e.LastName,
    e.Role,
    e.Salary,
    b.BranchID,
    b.BranchName,
    b.Location
FROM 
    Employees e
JOIN 
    Branches b ON e.BranchID = b.BranchID
WHERE 
    b.BranchID IN (
        SELECT 
            a.CustomerID
        FROM 
            Accounts a
        GROUP BY 
            a.CustomerID
        HAVING 
            SUM(a.Balance) > 20000
    );


-- Problem Statement: Identify accounts whose balance is higher than the average balance of accounts within their branch.
SELECT 
    a.AccountID,
    a.AccountType,
    a.Balance,
    e.BranchID,
    b.BranchName,
    b.Location
FROM 
    Accounts a
JOIN 
    Employees e ON a.CustomerID = e.BranchID
JOIN 
    Branches b ON e.BranchID = b.BranchID
WHERE 
    a.Balance > (
        SELECT AVG(a2.Balance)
        FROM Accounts a2
        JOIN Employees e2 ON a2.CustomerID = e2.BranchID
        WHERE e2.BranchID = e.BranchID
    );




 
-- Problem Statement: Find customers who have at least one transaction of more than $1,000.
select c.customerid, c.firstname from customers c join accounts a on a.customerid = c.customerid join transactions t on t.accountid = a.accountid where t.amount > 1000;


 SELECT DISTINCT 
    c.CustomerID,
    c.FirstName,
    c.LastName,
    c.Email,
    c.Phone,
    c.Address
FROM 
    Customers c
JOIN 
    Accounts a ON c.CustomerID = a.CustomerID
JOIN 
    Transactions t ON a.AccountID = t.AccountID
WHERE 
    t.Amount > 1000;

 
 
-- Problem Statement: Get the total deposits and total withdrawals for each account, along with the account type.
SELECT 
    a.AccountID,
    a.AccountType,
    COALESCE(SUM(CASE WHEN t.TransactionType = 'Deposit' THEN t.Amount END), 0) AS TotalDeposits,
    COALESCE(SUM(CASE WHEN t.TransactionType = 'Withdrawal' THEN t.Amount END), 0) AS TotalWithdrawals
FROM 
    Accounts a
LEFT JOIN 
    Transactions t ON a.AccountID = t.AccountID
GROUP BY 
    a.AccountID, a.AccountType;



-- Wrong
-- Problem Statement: Find pairs of customers who have accounts with the same account type and belong to the same branch.
SELECT 
    c1.CustomerID AS Customer1ID,
    c1.FirstName AS Customer1FirstName,
    c1.LastName AS Customer1LastName,
    c2.CustomerID AS Customer2ID,
    c2.FirstName AS Customer2FirstName,
    c2.LastName AS Customer2LastName,
    a1.AccountType
FROM 
    Accounts a1
JOIN 
    Employees e1 ON a1.CustomerID = e1.BranchID
JOIN 
    Customers c1 ON a1.CustomerID = c1.CustomerID
JOIN 
    Accounts a2 ON a1.AccountType = a2.AccountType
JOIN 
    Employees e2 ON a2.CustomerID = e2.BranchID
JOIN 
    Customers c2 ON a2.CustomerID = c2.CustomerID
WHERE 
    c1.CustomerID < c2.CustomerID  -- To avoid duplicate pairs and self-pairing
    AND e1.BranchID = e2.BranchID; -- Ensure they belong to the same branch


-- Problem Statement: Find customers who do not have any transactions recorded.
SELECT 
    c.CustomerID,
    c.FirstName,
    c.LastName
FROM 
    Customers c
LEFT JOIN 
    Transactions t ON c.CustomerID = t.CustomerID
WHERE 
    t.TransactionID IS NULL;


-- Problem Statement: Rank customers based on their total balance across all accounts.
 SELECT 
    c.CustomerID,
    c.FirstName,
    c.LastName,
    SUM(a.Balance) AS TotalBalance,
    RANK() OVER (ORDER BY SUM(a.Balance) DESC) AS BalanceRank
FROM 
    Customers c
JOIN 
    Accounts a ON c.CustomerID = a.AccountID  -- Assuming AccountID corresponds to CustomerID
GROUP BY 
    c.CustomerID, c.FirstName, c.LastName
ORDER BY 
    TotalBalance DESC;

 

-- Problem Statement: List employees whose salary is above the average salary of all employees in their branch.
SELECT 
    e.EmployeeID,
    e.FirstName,
    e.LastName,
    e.Role,
    e.Salary,
    b.BranchName
FROM 
    Employees e
JOIN 
    Branches b ON e.BranchID = b.BranchID
WHERE 
    e.Salary > (
        SELECT AVG(Salary)
        FROM Employees
        WHERE BranchID = e.BranchID
    )
ORDER BY 
    b.BranchName, e.Salary DESC;
 
 
