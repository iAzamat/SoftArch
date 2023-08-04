CREATE TABLE `Customer` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`phone` VARCHAR(255) NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	`hashPassword` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Order` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`customer_id` INT NOT NULL,
	`table_id` INT NOT NULL,
	`data` DATE NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Table` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`id_internal` INT NOT NULL,
	`remark` VARCHAR(255) NOT NULL,
	`places` INT NOT NULL,
	`price` INT NOT NULL,
	`image_id` INT NOT NULL,
	`hall_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Hall` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`remark` VARCHAR(255) NOT NULL,
	`smoke` BOOLEAN NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Images` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`URL_address` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk0` FOREIGN KEY (`customer_id`) REFERENCES `Customer`(`id`);

ALTER TABLE `Order` ADD CONSTRAINT `Order_fk1` FOREIGN KEY (`table_id`) REFERENCES `Table`(`id`);

ALTER TABLE `Table` ADD CONSTRAINT `Table_fk0` FOREIGN KEY (`image_id`) REFERENCES `Images`(`id`);

ALTER TABLE `Table` ADD CONSTRAINT `Table_fk1` FOREIGN KEY (`hall_id`) REFERENCES `Hall`(`id`);






