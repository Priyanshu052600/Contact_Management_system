DROP DATABASE contactservice IF EXISTS;

CREATE DATABASE contactservice;

CREATE TABLE person (
    PERSON_ID 	DECIMAL NOT NULL,
    LAST_NAME varchar(255),
    FIRST_NAME varchar(255),
    EMAIL varchar(255),
    CONTACT varchar(255),
    PRIMARY KEY (PERSON_ID)
);
CREATE TABLE `users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(64) NOT NULL,
  `role` varchar(45) NOT NULL,
  `enabled` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
);

