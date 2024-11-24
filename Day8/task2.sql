show databases;
create database BankDB;
use BankDB;

drop table Employees;
drop table Branches;
drop table Transactions;
drop table Accounts;
drop table Customers;

create table Customers(CustomerID int auto_increment primary key,
FirstName varchar(30),
LastName varchar(30),
Email varchar(30),
Phone varchar(10),
Address varchar(50)
);

create table Accounts(AccountID int auto_increment primary key,
CustomerID int, 
AccountType varchar(20),
Balance decimal(10,2),
CreatedDate date,
foreign key(CustomerID) references Customers(CustomerID)
);

create table Transactions(TransactionID int auto_increment primary key,
AccountID int,
TransactionType varchar(20),
Amount decimal(10,2),
TransactionDate datetime,
foreign key(AccountID) references Accounts(AccountID)
);

create table Branches(BranchID int Primary key auto_increment,
BranchName varchar(20),
Location varchar(20));

create table Employees(EmployeeID int auto_increment primary key,
BranchID int,
FirstName varchar(30),
LastName varchar(30),
Role varchar(20),
Salary decimal(7,2),
foreign key (BranchID) references Branches(BranchId)
);



INSERT INTO Customers (FirstName, LastName, Email, Phone, Address) VALUES ('John', 'Doe', 'john.doe@example.com', '1234567890', '123 Elm St'), ('Jane', 'Smith', 'jane.smith@example.com', '9876543210', '456 Oak St'), ('Michael', 'Brown', 'michael.brown@example.com', '5678901234', '789 Pine St');

INSERT INTO Accounts (CustomerID, AccountType, Balance, CreatedDate)
VALUES
(1, 'Savings', 5000.00, '2023-01-15'),
(1, 'Checking', 2000.00, '2023-02-10'),
(2, 'Savings', 10000.00, '2023-03-05'),
(3, 'Savings', 7000.00, '2023-04-20');


INSERT INTO Transactions (AccountID, TransactionType, Amount, TransactionDate)
VALUES
(1, 'Deposit', 1000.00, '2023-01-20 10:00:00'),
(1, 'Withdrawal', 500.00, '2023-01-25 14:30:00'),
(2, 'Deposit', 2000.00, '2023-02-15 09:15:00'),
(3, 'Withdrawal', 1000.00, '2023-04-25 16:45:00');

select * from Customers;
select * from Accounts;
select * from Employees;
select * from Transactions;
select * from Branches;

# JOINS 
select c.firstname, c.lastname, a.balance, a.accounttype,
 a.accountid from customers c inner join accounts a 
 on c.customerid = a.customerid;
 
 -- left join
 
select a.accountid, a.accounttype, t.transactiontype, t.transactionid, t.amount, t.transactiondate
from Accounts a left join transactions t 
 on a.accountid = t.accountid; 

select * from branches;
insert into branches values(101, 'HinjewadiPh3', 'Pune');
insert into branches values(103, 'Airoli', 'Mumbai');
insert into branches values(102, 'Talwade', 'Pune');

insert into employees(branchid, firstname, lastname, role, salary) values(101, 'Shreyash', 'Somvanshi', 'WebDev', 7000);
insert into employees(branchid, firstname, lastname, role, salary) values(102, 'Abhi', 'Ghodake', 'Software Engg', 9000);
insert into employees(branchid, firstname, lastname, role, salary) values(103, 'Pranit', 'Jadhav', 'WebDev', 8000);
insert into employees(branchid, firstname, lastname, role, salary) values(103, 'Abhi', 'Raut', 'WebDev', 7000);

select * from Employees;



-- Question: List all customers and their accounts with balances.
select c.FirstName, c.LastName, a.Balance from customers c join accounts a on a.CustomerID = c.CustomerID;

 select * from accounts;



/*


Problem Statement: List all employees who manage branches where the total account balances exceed $20,000.
Problem Statement: Identify accounts whose balance is higher than the average balance of accounts within their branch.
Problem Statement: Find customers who have at least one transaction of more than $1,000.
Problem Statement: Get the total deposits and total withdrawals for each account, along with the account type.
Problem Statement: Find pairs of customers who have accounts with the same account type and belong to the same branch.
Problem Statement: Find customers who do not have any transactions recorded.
Problem Statement: Rank customers based on their total balance across all accounts.
Problem Statement: List employees whose salary is above the average salary of all employees in their branch.

*/










