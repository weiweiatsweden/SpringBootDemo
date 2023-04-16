DROP TABLE members;
DROP TABLE address;


CREATE TABLE address(
    addressId INT NOT NULL AUTO_INCREMENT,
    street VARCHAR(50) NOT NULL,
    postalCode VARCHAR(10) NOT NULL,
    city VARCHAR(100) NOT NULL,
    PRIMARY KEY (addressId)

);

CREATE TABLE members (
    memberId INT NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(20) NOT NULL,
    lastName VARCHAR(20) NOT NULL,
    addressId INT NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone VARCHAR(15),
    dateOfBirth DATE,
    PRIMARY KEY (memberId),
    FOREIGN KEY (addressId) REFERENCES address(addressId)
);

INSERT INTO address(addressId, street, postalCode, city)
VALUES ('1', 'Kungsgatan 20', '412 56', 'Gothenburg'),
       ('2', 'Drottninggatan 8', '412 56', 'Gothenburg'),
       ('3', 'Prinsgatan 488', '412 56', 'Gothenburg'),
       ('4', 'Kyrkogatan 172', '412 56', 'Gothenburg');


INSERT INTO members (firstName, LastName, addressId, email, phone, dateOfBirth)
VALUES ('Sandra','Svensson','1','s.svensson@gmail.com','0754321456','1980-11-02'),
    ('Niklas','Olofsson','2','nik.olofsson@hotmail.com','0707666777','1988-01-05'),
	('Stella','Strand','2','stella.strand@yahoo.com','0766555444','1990-12-15'),
	('Nils','Dahl','3','nilsdahl@hotmail.com','0722333111','1977-08-02'),
	('Anna','Carlsson','4','anna.s.carlsson@one.com','0727888999','1989-12-20');



