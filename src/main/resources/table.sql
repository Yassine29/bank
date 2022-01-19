/********** ACCOUNT *********/
DROP TABLE ACCOUNT IF EXISTS;
CREATE TABLE ACCOUNT (
    ACCOUNT_ID int IDENTITY primary key,
    ACCOUNT_NUMBER varchar(50) not null,
    BALANCE DECIMAL not null
);

/********** USER *********/
DROP TABLE USER IF EXISTS;
CREATE TABLE USER (
    USER_ID int IDENTITY primary key,
    USERNAME varchar(50) not null,
    PASSWORD varchar(50) not null,
    FIRSTNAME varchar(100) not null,
    LASTNAME varchar(100) not null,
    EMAIL varchar(100) not null,
    PHONE varchar(100) not null,
    ACCOUNT_ID int not null
);

/********** TRANSACTION *********/
DROP TABLE TRANSACTION IF EXISTS;
CREATE TABLE TRANSACTION (
    TRANSACTION_ID int IDENTITY primary key,
    TRANSACTION_DATE datetime not null,
    DESCRIPTION varchar(200) not null,
    TRANSACTION_TYPE varchar(50) not null,
    AMOUNT DECIMAL unique not null,
    AVAILABLE_BALANCE DECIMAL not null,
    ACCOUNT_ID int not null
);