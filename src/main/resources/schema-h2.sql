CREATE TABLE users(
    id INT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    phone VARCHAR(25),
    email VARCHAR(100)
);

CREATE TABLE juices(
    id INT PRIMARY KEY,
    name VARCHAR(255),
    description VARCHAR(255),
    price NUMBER
);

CREATE TABLE juice_stores(
    id INT PRIMARY KEY,
    name VARCHAR(255),
    phone_1 VARCHAR(25),
    phone_2 VARCHAR(25),
    email_1 VARCHAR(100),
    email_2 VARCHAR(100),
    location VARCHAR(255),
)