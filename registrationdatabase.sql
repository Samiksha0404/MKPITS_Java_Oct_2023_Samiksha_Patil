CREATE DATABASE registrationDatabase;

USE registrationDatabase;
 drop table userdetails;
CREATE TABLE userdetails (
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(25) NOT NULL,
  Mobile  varchar(20) not null,
  City VARCHAR(10) NOT NULL,
  Gender varchar(100) NOT NULL,  -- Consider using ENUM for fixed set of values (M/F/O)
  Age varchar(30) NOT NULL,
  Email VARCHAR(200) NOT NULL ,
  Password varchar(50) NOT NULL
);
