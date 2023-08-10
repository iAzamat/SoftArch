CREATE TABLE `Server` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`remark` VARCHAR(255) NOT NULL,
	`RAM` INT NOT NULL,
	`CPU` INT NOT NULL,
	`SSD` INT NOT NULL,
	`OS` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Server_pool` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`server_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Order` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`customer_id` INT NOT NULL,
	`pool_id` INT NOT NULL,
	`startData` DATETIME NOT NULL,
	`endData` DATETIME NOT NULL,
	`RAM` INT NOT NULL,
	`CPU` INT NOT NULL,
	`SSD` INT NOT NULL,
	`OS` INT NOT NULL,
	`price` FLOAT NOT NULL,
	`IP_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Customer` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`fullName` VARCHAR(255) NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	`hash` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `ip_address` (
	`id` INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Server_pool` ADD CONSTRAINT `Server_pool_fk0` FOREIGN KEY (`server_id`) REFERENCES `Server`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk0` FOREIGN KEY (`customer_id`) REFERENCES `Customer`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk1` FOREIGN KEY (`pool_id`) REFERENCES `Server_pool`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk2` FOREIGN KEY (`IP_id`) REFERENCES `ip_address`(`id`);






