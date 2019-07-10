-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 10, 2019 at 05:36 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `academia_soft`
--

--
-- Dumping data for table `horario`
--

INSERT INTO `horario` (`ID_HORARIO`, `HORA_INICIO`, `HORA_FIN`) VALUES
(1, '08:00', '09:00'),
(2, '09:00', '10:00'),
(3, '10:00', '11:00');

--
-- Dumping data for table `plan`
--

INSERT INTO `plan` (`ID_PLAN`, `DESCRIPCION`) VALUES
(1, 'Plan Medico 1'),
(2, 'Plan Medico 2'),
(3, 'Plan Medico 3');

--
-- Dumping data for table `practica`
--

INSERT INTO `practica` (`ID_PRACTICA`, `CODIGO_PRACTICA`, `DESCRIPCION`) VALUES
(1, 233, '342'),
(2, 2, 'Practica 2'),
(3, 3, 'Practica 3');

--
-- Dumping data for table `prestador`
--

INSERT INTO `prestador` (`ID_PRESTADOR`, `NOMBRE`, `APELLIDO`, `TELEFONO`, `EMAIL`) VALUES
(1, '456', '345', 45, '45'),
(2, '456', '345', 45, '45'),
(3, '456', '345', 45, '45'),
(4, '456', '345', 45, '45');

--
-- Dumping data for table `prestador_horario`
--

INSERT INTO `prestador_horario` (`ID_HORARIO`, `ID_PRESTADOR`) VALUES
(1, 4);

--
-- Dumping data for table `prestador_practica`
--

INSERT INTO `prestador_practica` (`ID_PRACTICA`, `ID_PRESTADOR`) VALUES
(1, 4);

--
-- Dumping data for table `socio`
--

INSERT INTO `socio` (`ID_SOCIO`, `NUMERO_SOCIO`, `NOMBRE`, `APELLIDO`, `SEXO`, `ESTADO_CIVIL`, `NOMBRE_CONYUGUE`, `CANTIDAD_HIJOS`, `DNI`, `TELEFONO`, `DIRECCION`, `EMAIL`, `PASSWORD`, `ID_PLAN`) VALUES
(2, 432, '234', '234', 'm', '234', '342', 432, '234', '423', '234', '432', '123', 1),
(4, 432, '444', '444', 'm', '234', '342', 432, '234', '423', '234', '444', '32', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
