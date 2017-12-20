/* Create Database Schema */
CREATE SCHEMA `cookoff_red917` ;

/* Create User Table */
CREATE TABLE `cookoff_red917`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(25) NOT NULL,
  `user_pass` VARCHAR(45) NOT NULL,
  `user_email` VARCHAR(45) NOT NULL,
  `user_age` INT NOT NULL,
  `user_location` VARCHAR(15) NOT NULL,
  `user_isadmin` BIT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `user_id_UNIQUE` (`user_id` ASC),
  UNIQUE INDEX `user_name_UNIQUE` (`user_name` ASC),
  UNIQUE INDEX `user_email_UNIQUE` (`user_email` ASC));

/* Create Recipe Table*/
CREATE TABLE `cookoff_red917`.`recipe` (
  `rec_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `rec_name` VARCHAR(45) NOT NULL,
  `rec_desc` LONGTEXT NOT NULL,
  `rec_type` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`rec_id`),
  UNIQUE INDEX `rec_id_UNIQUE` (`rec_id` ASC),
  INDEX `rec_user_id_idx` (`user_id` ASC),
  CONSTRAINT `rec_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `cookoff_red917`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
