use classicmodels;

select * from employees;
select * from products;
select * from customers;
select * from offices;
select * from orders;
select * from payments;

-- select max(distinct count(orderNumber)) from orders;

-- SELECT count(customerNumber) as max_order,customerNumber from orders group by(customerNumber) order by max_order desc;

-- Q1
select * from employees where (officeCode=1 or officeCode=6);

-- Q2
select * from orders where ((status='On Hold' or status='Shipped') and customerNumber > 300);

-- Q3
select * from customers where ((state='NY' or state='CT') and creditLimit > 600000);

-- Q4
select productName from products where productName like '%Mercedes%';
select productName, productDescription, buyPrice, quantityInStock from products where ((productName in ('1972 Alfa Romeo GTA','1952 Alpine Renault 1300','1968 Ford Mustang','2001 Ferrari Enzo', '2002 Suzuki XREO', '1969 Ford Falcon', '1928 Mercedes-Benz SSK')) and quantityInStock > 6000 );

-- Q5
select checkNumber, customerNumber from payments where paymentDate between '2003-06-25' and '2004-05-30';

-- Q6
select * from products where productCode like 'S32%';

select * from orders;

select customerNumber, timestampdiff(day, orderDate, ShippedDate) as ShippedInDays from orders;

select count(*) as total_orders
from orders
where timestampdiff(day, curdate(), orderDate) <= 20;
