-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema agencia
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema agencia
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `agencia` DEFAULT CHARACTER SET utf8 ;
USE `agencia` ;

-- -----------------------------------------------------
-- Table `agencia`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agencia`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `contraseña` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `agencia`.`Productos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agencia`.`Productos` (
  `idProductos` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `img` VARCHAR(200) NOT NULL,
  `precio` INT NOT NULL,
  `lugares` VARCHAR(200) NOT NULL,
  `dias` VARCHAR(2) NOT NULL,
  `noches` VARCHAR(2) NOT NULL,
  `incluye` VARCHAR(200) NOT NULL,
  `noIncluye` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idProductos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `agencia`.`Cotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agencia`.`Cotizacion` (
  `idCotizacion` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATE NOT NULL,
  `fkIdUsuario` INT NOT NULL,
  PRIMARY KEY (`idCotizacion`),
  INDEX `fk_Cotizacion_Usuario_idx` (`fkIdUsuario` ASC) VISIBLE,
  CONSTRAINT `fk_Cotizacion_Usuario`
    FOREIGN KEY (`fkIdUsuario`)
    REFERENCES `agencia`.`Usuario` (`idUsuario`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `agencia`.`Productos_has_Cotizacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `agencia`.`Productos_has_Cotizacion` (
  `fkIdProductos` INT NOT NULL,
  `fkIdCotizacion` INT NOT NULL,
  `Id` INT NOT NULL AUTO_INCREMENT,
  INDEX `fk_Productos_has_Cotizacion_Cotizacion1_idx` (`fkIdCotizacion` ASC) VISIBLE,
  INDEX `fk_Productos_has_Cotizacion_Productos1_idx` (`fkIdProductos` ASC) VISIBLE,
  PRIMARY KEY (`Id`),
  CONSTRAINT `fk_Productos_has_Cotizacion_Productos1`
    FOREIGN KEY (`fkIdProductos`)
    REFERENCES `agencia`.`Productos` (`idProductos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Productos_has_Cotizacion_Cotizacion1`
    FOREIGN KEY (`fkIdCotizacion`)
    REFERENCES `agencia`.`Cotizacion` (`idCotizacion`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
