--table Ram
-----------------------------------
create table Ram(
id integer primary key,
size double not null,
model varchar(50) not null
);


--table Os
-----------------------------------
create table Os(
id integer primary key,
name varchar(50) not null,
version varchar(50) not null
);

--table Hdd
-----------------------------------
create table Hdd(
id integer primary key,
size double not null,
speed double not null
);

--table Cpu
-----------------------------------
create table Cpu(
id integer primary key,
model varchar(50) not null,
nucleus integer not null,
frequency double not null
);

--table Computer
-----------------------------------
create table Computer(
id integer primary key,
Hdd_id integer unique,
Ram_id integer unique,
Os_id integer unique,
Cpu_id integer unique,
FOREIGN KEY (Hdd_id) REFERENCES Hdd(id) ON DELETE NO ACTION,
FOREIGN KEY (Ram_id) REFERENCES Ram(id) ON DELETE NO ACTION,
FOREIGN KEY (Os_id) REFERENCES Os(id) ON DELETE NO ACTION,
FOREIGN KEY (Cpu_id) REFERENCES Cpu(id) ON DELETE NO ACTION
);

--table Payment
-----------------------------------
create table Payment(
id integer primary key,
price double not null,
isWithCard boolean
);

--table Order
-----------------------------------
create table Orders(
id integer primary key,
phoneNumOfClient integer unique,
Computer_id integer not null unique,
Payment_id integer not null REFERENCES Payment(id),
date timestamp not null,
FOREIGN KEY (Computer_id) REFERENCES Computer(id) ON DELETE NO ACTION,
FOREIGN KEY (Payment_id) REFERENCES Payment(id) ON DELETE NO ACTION
);
