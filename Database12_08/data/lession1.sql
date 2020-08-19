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
INSERT INTO `db_student_cms_plusplus`.`table_student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`) VALUES ('dung', '423423', '123', '043543535', 'khe khau', '19', 'vandung@gmail.com');
INSERT INTO `db_student_cms_plusplus`.`table_student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`) VALUES ('hoang', '5343534', '3345', '0645366345', 'vinh dai', '19', 'phanhoang@gmail.com');
INSERT INTO `db_student_cms_plusplus`.`table_student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`) VALUES ('manh ', '534534', 'abc', '0634665465', 'sao do', '19', 'bamanh@gmail.com');
INSERT INTO `db_student_cms_plusplus`.`table_student` (`name`, `mssv`, `password`, `phone`, `address`, `age`, `email`) VALUES ('vuong', '65', '546', '064564564', 'vinh long', '19', 'bavuong@gmail.com');
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
INSERT INTO `db_student_cms_plusplus`.`table_class` (`name`, `major`, `total_student`, `teacher_name`, `teacher_phone`) VALUES ('12D', 'CNTT', '43', 'Thao', '055454334');
INSERT INTO `db_student_cms_plusplus`.`table_class` (`name`, `major`, `total_student`, `teacher_name`, `teacher_phone`) VALUES ('12C', 'Dien', '40', 'Quyen', '04565465');
CREATE TABLE table_student_class(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
student_id varchar(10),
class_id varchar(10) 
);
INSERT INTO `db_student_cms_plusplus`.`table_student_class` (`student_id`, `class_id`) VALUES ('1508964', '8386');
INSERT INTO `db_student_cms_plusplus`.`table_student_class` (`student_id`, `class_id`) VALUES ('5523', '4953');


