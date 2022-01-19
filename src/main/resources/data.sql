/********** ACCOUNTS *********/
INSERT INTO ACCOUNT (ACCOUNT_NUMBER, BALANCE)
VALUES ('123456', 100), ('666666', 500);

/********** USERS *********/
INSERT INTO USER(USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, PHONE, ACCOUNT_ID) 
VALUES('BANKUSER01', 'TOTO2022!1*', 'John', 'snow', 'john.snow@gmail.com', '0612131415', '123456'),
('BANKUSER02', 'TOTO2022!1*', 'Daenerys', 'Targaryen', 'daenerys.targaryen@gmail.com', '0666778899', '666666');

/********** TRANSACTIONS *********/