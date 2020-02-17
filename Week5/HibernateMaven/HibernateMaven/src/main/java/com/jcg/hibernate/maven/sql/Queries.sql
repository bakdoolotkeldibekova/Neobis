CREATE DATABASE IF NOT EXISTS mavenPr;

USE mavenPr;

DROP TABLE IF EXISTS cpu;

create table Cpu(
id integer primary key,
model varchar(50) not null,
nucleus integer not null,
frequency double not null
);