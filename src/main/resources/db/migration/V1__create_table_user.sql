CREATE TABLE user (
    id BIGINT PRIMARY KEY UNIQUE NOT NULL AUTO_INCREMENT,
	name varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255)  NOT NULL,
	photo varchar(500),
	type varchar(255)
);