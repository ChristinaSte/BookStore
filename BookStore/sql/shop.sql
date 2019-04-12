CREATE DATABASE shop_repository encoding='UTF8';

CREATE SCHEMA shop_storage;

CREATE TABLE users (
 id BIGSERIAL PRIMARY KEY,
 first_name VARCHAR(64) NOT NULL,
 last_name varchar(64) NOT NULL,
 email varchar(64) NOT NULL UNIQUE,
 password binary(64) not null);

create table administrators (
 id BIGSERIAL PRIMARY KEY,
 user_id int unique not null,
 primary key(id),
   foreign key(user_id) references users(id));

-- create table courses (id INT AUTO_INCREMENT, title varchar(50) unique not null, type varchar(10) not null, start_date date, end_date date, max_number_of_learners int(255), PRIMARY KEY(id));
-- create table registrations (id INT AUTO_INCREMENT, status varchar(10) unique not null, user_id INT NOT NULL, course_id int not null, PRIMARY KEY(id), foreign key(user_id) references users(id), foreign key(course_id) references courses(id));
-- create table learners(user_id INT NOT NULL, course_id INT NOT NULL, FOREIGN KEY(user_id) REFERENCES users(id), FOREIGN KEY(course_id) REFERENCES courses(id));
-- create table teachers(user_id INT NOT NULL, course_id INT NOT NULL, FOREIGN KEY(user_id) REFERENCES users(id), FOREIGN KEY(course_id) REFERENCES courses(id));
-- create table hierarchy (manager_id int not null, subordinate_id int not null, primary key(manager_id, subordinate_id), foreign key(manager_id) references users(id), foreign key(subordinate_id) references users(id));

