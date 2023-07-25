CREATE TABLE `Pacient` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`id_human` INT(15) NOT NULL,
	`direction` varchar(255) NOT NULL,
	`analyzes` INT NOT NULL,
	`oms` INT NOT NULL,
	`id_diagnosis` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Interface_Human` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`firstname` varchar(15) NOT NULL,
	`lastname` varchar(15) NOT NULL,
	`patronymic` varchar(15) NOT NULL,
	`gender` varchar(10) NOT NULL,
	`birthday` DATE NOT NULL,
	`address` varchar(250) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Doctor` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`id_human` INT(15) NOT NULL,
	`id_spec` INT(15) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Analyzes` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`Name` varchar(15) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Name_Clinic` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name_code` INT(15) NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Interface_Clinic` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar(15) NOT NULL,
	`cabinets_value` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Diagnosis` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar NOT NULL,
	`id_code` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `MBR_code` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar NOT NULL,
	`code` varchar NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Med_spec` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` varchar NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Shedule` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`id_doctor` INT NOT NULL,
	`id_pacient` INT NOT NULL,
	`id_clinic` INT NOT NULL,
	`date` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Pacient` ADD CONSTRAINT `Pacient_fk0` FOREIGN KEY (`id_human`) REFERENCES `Interface_Human`(`id`);

ALTER TABLE `Pacient` ADD CONSTRAINT `Pacient_fk1` FOREIGN KEY (`analyzes`) REFERENCES `Analyzes`(`id`);

ALTER TABLE `Pacient` ADD CONSTRAINT `Pacient_fk2` FOREIGN KEY (`id_diagnosis`) REFERENCES `Diagnosis`(`id`);

ALTER TABLE `Doctor` ADD CONSTRAINT `Doctor_fk0` FOREIGN KEY (`id_human`) REFERENCES `Interface_Human`(`id`);

ALTER TABLE `Doctor` ADD CONSTRAINT `Doctor_fk1` FOREIGN KEY (`id_spec`) REFERENCES `Med_spec`(`id`);

ALTER TABLE `Name_Clinic` ADD CONSTRAINT `Name_Clinic_fk0` FOREIGN KEY (`name_code`) REFERENCES `Interface_Clinic`(`id`);

ALTER TABLE `Diagnosis` ADD CONSTRAINT `Diagnosis_fk0` FOREIGN KEY (`id_code`) REFERENCES `MBR_code`(`id`);

ALTER TABLE `Shedule` ADD CONSTRAINT `Shedule_fk0` FOREIGN KEY (`id_doctor`) REFERENCES `Doctor`(`id`);

ALTER TABLE `Shedule` ADD CONSTRAINT `Shedule_fk1` FOREIGN KEY (`id_pacient`) REFERENCES `Pacient`(`id`);

ALTER TABLE `Shedule` ADD CONSTRAINT `Shedule_fk2` FOREIGN KEY (`id_clinic`) REFERENCES `Name_Clinic`(`id`);











