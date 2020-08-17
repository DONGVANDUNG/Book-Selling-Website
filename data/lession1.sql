CREATE SCHEMA db_student_cms_plusplus DEFAULT CHARACTER SET utf8mb4;
USE db_student_cms_plusplus;
CREATE TABLE table_student(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(50) NOT NULL,
mssv varchar(8) NULL,
password varchar(20) NOT NULL,
phone varchar(10) NULL,
address varchar(100) NULL,
age INT NOT NULL,
email varchar(30) NOT NULL,
created_timstamp timestamp DEFAULT current_timestamp,
last_updated_timestamp timestamp 
);
CREATE TABLE table_class (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(20) NOT NULL,
major varchar(30) NULL,
total_student INT NOT NULL,
teacher_name varchar(30) NOT NULL,
teacher_phone varchar(10) NULL,
created_timestamp timestamp default current_timestamp,
last_updated_timestamp timestamp
);
CREATE TABLE table_student_class(
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
student_id varchar(10),
class_id varchar(10) 
)