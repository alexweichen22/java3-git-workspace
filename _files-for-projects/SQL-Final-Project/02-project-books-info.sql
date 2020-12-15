CREATE DATABASE IF NOT EXISTS `project_books_info` ;
USE `project_books_info`;

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `book_title` varchar(100) NOT NULL,
  `author` varchar(45) DEFAULT NULL,
  `publisher` varchar(45) DEFAULT NULL,
  `publish_date` date DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

LOCK TABLES `book` WRITE;
INSERT INTO `book` VALUES 
(1,'Visual C# How to Program','Paul J. Deitel','Prentice Hall','2005-06-17'),
(2,'Python How to Program','Harvey M. Deitel','Prentice Hall','2002-10-03'),
(3,'Java How to Program','Harvey M. Deitel','Prentice Hall','2001-11-17'),
(4,'Head First Java','Kathy Sierra','O Reilly Media','2005-08-03'),
(5,'Head First Kotlin','Dawn Griffiths','O Reilly Media','2019-03-07');
UNLOCK TABLES;

