CREATE TABLE `Robot` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`model` VARCHAR(255) NOT NULL,
	`serial_number` INT NOT NULL,
	`firmware_version` INT NOT NULL,
	`IPv6` INT NOT NULL,
	`charge` INT NOT NULL,
	`garbage` INT NOT NULL,
	`robot_pollution` INT NOT NULL,
	`next_service` INT NOT NULL,
	`group_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Schema` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`pool_points` INT NOT NULL,
	`image_URL` VARCHAR(255) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `User` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`fullname` VARCHAR(255) NOT NULL,
	`login` VARCHAR(255) NOT NULL,
	`email` VARCHAR(255) NOT NULL,
	`password_hash` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Group` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(255) NOT NULL,
	`user_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Schedule` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`data` DATETIME NOT NULL,
	`robot_id` INT NOT NULL,
	`schema_id` INT NOT NULL,
	`mode` INT NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Robot` ADD CONSTRAINT `Robot_fk0` FOREIGN KEY (`group_id`) REFERENCES `Group`(`id`);

ALTER TABLE `Group` ADD CONSTRAINT `Group_fk0` FOREIGN KEY (`user_id`) REFERENCES `User`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk0` FOREIGN KEY (`robot_id`) REFERENCES `Robot`(`id`);

ALTER TABLE `Schedule` ADD CONSTRAINT `Schedule_fk1` FOREIGN KEY (`schema_id`) REFERENCES `Schema`(`id`);






