--table Ram
-----------------------------------
create table Ram(
id serial primary key not null,
size double precision not null,
model varchar(50) not null
);


--table Os
-----------------------------------
create table Os(
id serial primary key not null,
name varchar(50) not null,
version varchar(50) not null
);

--table Hdd
-----------------------------------
create table Hdd(
id serial primary key not null,
size double precision not null,
speed double precision not null
);

--table Cpu
-----------------------------------
create table Cpu(
id serial primary key not null,
model varchar(50) not null,
nucleus integer not null,
frequency double precision not null
);

--table Computer
-----------------------------------
create table Computer(
id serial primary key not null,
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
id serial primary key not null,
price double precision not null,
isWithCard boolean
);

--table Order
-----------------------------------
create table Orders(
id serial primary key not null,
phoneNumOfClient integer unique,
Computer_id integer not null unique,
Payment_id integer not null,
date timestamp not null,
FOREIGN KEY (Computer_id) REFERENCES Computer(id) ON DELETE NO ACTION,
FOREIGN KEY (Payment_id) REFERENCES Payment(id) ON DELETE NO ACTION
);
