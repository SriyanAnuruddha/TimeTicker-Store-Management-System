create table Customer(
cusID integer primary key,
cusName varchar(20),
email varchar(30),
address varchar(40),
invoiceNo integer, 
jobNo integer,
constraint Customer_fk1 foreign key (invoiceNo) references Invoice(invoiceNo) on delete cascade,
constraint Customer_fk2 foreign key (jobNo) references RepairJob(jobNo) on delete cascade
)


create table Invoice(
invoiceNo integer primary key,
issueDate date,
subtotal float
)
 
 create table Total(
 invoiceNo integer,
 watchName varchar(20),
 qty integer,
 total float,
 price float,
 constraint Total_fk1 foreign key (invoiceNo) references Invoice(invoiceNo) on delete cascade,
 constraint Total_pk primary key(invoiceNo,watchName)
 )
 
 
select * from Invoice;
select * from Customer;
select * from Total;

------------------

create table Suppliers(
supplierId integer primary key,
supplierName varchar(20),
email varchar(40)
)


create table SpareParts(
partName varchar(20),
partId integer primary key,
price float,
qty integer,
supplierId integer,
totalCost float,
constraint SpareParts_FK foreign key (supplierId) references Suppliers(supplierId)
)

select * from SpareParts;
select * from Suppliers;


-------------------------------------------

create table RepairJob(
jobNo integer primary key,
jobName varchar(20),
issueDate date,
dueDate date,
currentState varchar(20)
)

create table Employee(
empId int primary key,
empName varchar(20),
salary float
)

create table Working(
jobNo integer,
empId integer,
empRate float,
hours int,
constraint Working_Fk1 foreign key (jobNo) references RepairJob(jobNo ) on delete cascade,
constraint Working_Fk2 foreign key (empId) references Employee(empId ),
constraint Working_PK primary key(jobNo,empId) 
)



-----------------------
create table Users(
userName varchar(20),
password varchar(20),
constraint Users_PK primary key (userName,password)

)
insert into Users values ('minada','sysadmin');
insert into Users values ('sriyan','sysadmin');
insert into Users values ('nawodya','sysadmin');
insert into Users values ('piumi','sysadmin');
insert into Users values ('tharaka','sysadmin');
insert into Users values ('amaya','sysadmin');
insert into Users values ('chamiru','sysadmin');
insert into Users values ('shuaib','sysadmin');
insert into Users values ('thilina','sysadmin');
insert into Users values ('admin','sysadmin');


select * from Invoice;
select * from Customer;
select * from Total;

select * from RepairJob;
select * from Working;
select * from Employee;

select * from Suppliers;
select * from SpareParts;
select * from Users;

select * from Customer;
select * from RepairJob;


