/* Script that can be used to create SQL schema for redesigned cookoff application 
	Application is native application with no outward connection. At no risk of security issues.
    Created purely for fun. :)
*/

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

/* Create Recipe Table */
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


/* Create Recipe Review Table */
CREATE TABLE `cookoff_red917`.`recipe_review` (
  `user_id` INT NOT NULL,
  `rec_id` INT NOT NULL,
  `rev_rating` INT NOT NULL,
  PRIMARY KEY (`user_id`, `rec_id`),
  INDEX `rr_rec_id_idx` (`rec_id` ASC),
  CONSTRAINT `rr_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `cookoff_red917`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `rr_rec_id`
    FOREIGN KEY (`rec_id`)
    REFERENCES `cookoff_red917`.`recipe` (`rec_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

/* Create MealPlan Table */
CREATE TABLE `cookoff_red917`.`mealplan` (
  `mp_id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `mp_name` VARCHAR(45) NOT NULL,
  `mp_desc` LONGTEXT NOT NULL,
  `mp_type` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`mp_id`),
  UNIQUE INDEX `mp_id_UNIQUE` (`mp_id` ASC),
  INDEX `mp_user_id_idx` (`user_id` ASC),
  CONSTRAINT `mp_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `cookoff_red917`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

/* Create MealPlan Review Table */
CREATE TABLE `cookoff_red917`.`mealplan_review` (
  `user_id` INT NOT NULL,
  `mp_id` INT NOT NULL,
  `rev_rating` INT NOT NULL,
  PRIMARY KEY (`user_id`, `mp_id`),
  INDEX `mpr_mp_id_idx` (`mp_id` ASC),
  CONSTRAINT `mpr_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `cookoff_red917`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `mpr_mp_id`
    FOREIGN KEY (`mp_id`)
    REFERENCES `cookoff_red917`.`mealplan` (`mp_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

/* Create MealPlan Recipe Table */
CREATE TABLE `cookoff_red917`.`mealplan_recipe` (
  `mp_id` INT NOT NULL,
  `rec_id` INT NOT NULL,
  PRIMARY KEY (`mp_id`, `rec_id`),
  INDEX `mprec_rec_id_idx` (`rec_id` ASC),
  CONSTRAINT `mprec_mp_id`
    FOREIGN KEY (`mp_id`)
    REFERENCES `cookoff_red917`.`mealplan` (`mp_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `mprec_rec_id`
    FOREIGN KEY (`rec_id`)
    REFERENCES `cookoff_red917`.`recipe` (`rec_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

/* Create Action Table */
CREATE TABLE `cookoff_red917`.`action` (
  `act_id` INT NOT NULL AUTO_INCREMENT,
  `act_name` VARCHAR(20) NOT NULL,
  `act_desc` LONGTEXT NULL,
  PRIMARY KEY (`act_id`),
  UNIQUE INDEX `act_id_UNIQUE` (`act_id` ASC),
  UNIQUE INDEX `act_name_UNIQUE` (`act_name` ASC));

/* Create Ingredient Table */
CREATE TABLE `cookoff_red917`.`ingredient` (
  `ing_id` INT NOT NULL AUTO_INCREMENT,
  `ing_name` VARCHAR(30) NOT NULL,
  `ing_desc` LONGTEXT NULL,
  PRIMARY KEY (`ing_id`),
  UNIQUE INDEX `ing_id_UNIQUE` (`ing_id` ASC),
  UNIQUE INDEX `ing_name_UNIQUE` (`ing_name` ASC));


/* Create Unit Table */
CREATE TABLE `cookoff_red917`.`unit` (
  `unit_id` INT NOT NULL AUTO_INCREMENT,
  `unit_name` VARCHAR(15) NOT NULL,
  `unit_desc` LONGTEXT NULL,
  PRIMARY KEY (`unit_id`),
  UNIQUE INDEX `unit_id_UNIQUE` (`unit_id` ASC),
  UNIQUE INDEX `unit_name_UNIQUE` (`unit_name` ASC));

/* Create Instruction Table */
CREATE TABLE `cookoff_red917`.`instruction` (
  `rec_id` INT NOT NULL,
  `inst_id` INT NOT NULL AUTO_INCREMENT,
  `inst_num` INT NOT NULL,
  `inst_desc` LONGTEXT NOT NULL,
  `inst_act_id` INT NOT NULL,
  `inst_time` VARCHAR(10) NOT NULL,
  `inst_userreqd` BIT(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`inst_id`),
  UNIQUE INDEX `inst_id_UNIQUE` (`inst_id` ASC),
  INDEX `inst_rec_id_idx` (`rec_id` ASC),
  INDEX `inst_act_id_idx` (`inst_act_id` ASC),
  CONSTRAINT `inst_rec_id`
    FOREIGN KEY (`rec_id`)
    REFERENCES `cookoff_red917`.`recipe` (`rec_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `inst_act_id`
    FOREIGN KEY (`inst_act_id`)
    REFERENCES `cookoff_red917`.`action` (`act_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);


/* Create InstIngUnit Table */
CREATE TABLE `cookoff_red917`.`instingunit` (
  `inst_id` INT NOT NULL,
  `ing_id` INT NOT NULL,
  `unit_id` INT NOT NULL,
  `instingunit_amt` INT NOT NULL,
  PRIMARY KEY (`inst_id`, `ing_id`, `unit_id`),
  INDEX `instingunit_ing_id_idx` (`ing_id` ASC),
  INDEX `instingunit_unit_id_idx` (`unit_id` ASC),
  CONSTRAINT `instingunit_inst_id`
    FOREIGN KEY (`inst_id`)
    REFERENCES `cookoff_red917`.`instruction` (`inst_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `instingunit_ing_id`
    FOREIGN KEY (`ing_id`)
    REFERENCES `cookoff_red917`.`ingredient` (`ing_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `instingunit_unit_id`
    FOREIGN KEY (`unit_id`)
    REFERENCES `cookoff_red917`.`unit` (`unit_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);
