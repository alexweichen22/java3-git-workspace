CREATE DATABASE IF NOT EXISTS hb_student_tracker;
USE hb_student_tracker;

DROP TABLE IF EXISTS student;

CREATE TABLE student(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(45) DEFAULT NULL,
    last_name VARCHAR(45) DEFAULT NULL,
    email VARCHAR(45) DEFAULT NULL
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;