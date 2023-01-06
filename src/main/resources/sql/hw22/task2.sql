CREATE database java;
CREATE TABLE Customer (
  login INT NOT NULL PRIMARY KEY,
  firstName VARCHAR(30),
  lastName VARCHAR(30),
  dateOfBirth DATE,
  country VARCHAR(30),
  sex enum('male','female') DEFAULT 'male'
  );