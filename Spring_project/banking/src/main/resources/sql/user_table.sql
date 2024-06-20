create database banking;
use banking;
CREATE TABLE users (
  id INT NOT NULL AUTO_INCREMENT,
  fname VARCHAR(30) NOT NULL,
  mname VARCHAR(30) NULL,
  lname VARCHAR(30) NOT NULL,
  gender CHAR(1) NOT NULL,
  mobile VARCHAR(10) NOT NULL,
  email VARCHAR(45) NOT NULL,
  address VARCHAR(100) NULL,
  city VARCHAR(30) NULL,
  dob DATE NULL,
  created_by INT NULL,
  created_at DATETIME NULL,
  updated_by INT NULL,
  updated_at datetime NULL,
  PRIMARY KEY (id));