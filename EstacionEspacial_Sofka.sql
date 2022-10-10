-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.24-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.0.0.6468
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para naveespacialsofka
CREATE DATABASE IF NOT EXISTS `naveespacialsofka` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `naveespacialsofka`;

-- Volcando estructura para tabla naveespacialsofka.naves_espaciales
CREATE TABLE IF NOT EXISTS `naves_espaciales` (
  `Nombre` varchar(255) NOT NULL,
  `Descripcion` text NOT NULL,
  `Potencia` int(20) NOT NULL,
  PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla naveespacialsofka.naves_espaciales: ~10 rows (aproximadamente)
INSERT INTO `naves_espaciales` (`Nombre`, `Descripcion`, `Potencia`) VALUES
	('nave1', 'asd', 1),
	('nave2', 'qwe', 2),
	('nave3', 'asd', 6),
	('nave4', 'asd', 2),
	('nave5', 'asd', 2),
	('naverobot', 'hola', 3000),
	('naverobotica', 'sd', 2),
	('NaveRobotica2', 'Muy resistente\n', 1000),
	('navetripulada', 'mm', 10),
	('robot', 'asd', 12);

-- Volcando estructura para tabla naveespacialsofka.nave_lanzadera
CREATE TABLE IF NOT EXISTS `nave_lanzadera` (
  `Nombre_Nave` varchar(255) NOT NULL,
  `Nom_Carga` varchar(255) NOT NULL,
  `Tipo_Combustible` varchar(255) NOT NULL,
  PRIMARY KEY (`Nombre_Nave`),
  CONSTRAINT `FK_lanzadera_tiposdenaves` FOREIGN KEY (`Nombre_Nave`) REFERENCES `naves_espaciales` (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla naveespacialsofka.nave_lanzadera: ~1 rows (aproximadamente)
INSERT INTO `nave_lanzadera` (`Nombre_Nave`, `Nom_Carga`, `Tipo_Combustible`) VALUES
	('nave4', 'satelite', 'aire');

-- Volcando estructura para tabla naveespacialsofka.nave_robotica
CREATE TABLE IF NOT EXISTS `nave_robotica` (
  `Nombre_Nave` varchar(50) NOT NULL,
  `Planeta_a_Estudiar` varchar(50) NOT NULL,
  `Tipo_Combustible` varchar(50) NOT NULL,
  PRIMARY KEY (`Nombre_Nave`),
  CONSTRAINT `FK_robotica_tiposdenaves` FOREIGN KEY (`Nombre_Nave`) REFERENCES `naves_espaciales` (`Nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla naveespacialsofka.nave_robotica: ~4 rows (aproximadamente)
INSERT INTO `nave_robotica` (`Nombre_Nave`, `Planeta_a_Estudiar`, `Tipo_Combustible`) VALUES
	('naverobot', 'tierra', 'luna'),
	('naverobotica', 'jupitera', 'jupiter'),
	('NaveRobotica2', 'Plutón', 'nafta'),
	('robot', 'Martes', 'satruno');

-- Volcando estructura para tabla naveespacialsofka.nave_tripulada
CREATE TABLE IF NOT EXISTS `nave_tripulada` (
  `Mision` varchar(50) NOT NULL,
  `Nombre_Nave` varchar(50) NOT NULL,
  PRIMARY KEY (`Nombre_Nave`) USING BTREE,
  CONSTRAINT `FK_tripulada_tiposdenaves` FOREIGN KEY (`Nombre_Nave`) REFERENCES `naves_espaciales` (`Nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla naveespacialsofka.nave_tripulada: ~2 rows (aproximadamente)
INSERT INTO `nave_tripulada` (`Mision`, `Nombre_Nave`) VALUES
	('reparar nave', 'nave5'),
	('lunar', 'navetripulada');

-- Volcando estructura para tabla naveespacialsofka.nave_viajera
CREATE TABLE IF NOT EXISTS `nave_viajera` (
  `Nombre_Nave` varchar(255) NOT NULL,
  `Personas_Max` int(20) NOT NULL,
  `Destino` varchar(255) NOT NULL,
  `Costo` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`Nombre_Nave`),
  CONSTRAINT `FK_viajera_tiposdenaves` FOREIGN KEY (`Nombre_Nave`) REFERENCES `naves_espaciales` (`Nombre`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla naveespacialsofka.nave_viajera: ~3 rows (aproximadamente)
INSERT INTO `nave_viajera` (`Nombre_Nave`, `Personas_Max`, `Destino`, `Costo`) VALUES
	('nave1', 2, 'neptuno', 1),
	('nave2', 2, 'naptuno2', 2),
	('nave3', 3, 'asd', 3);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
