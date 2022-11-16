-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 10-11-2022 a las 23:40:32
-- Versión del servidor: 8.0.27
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gamer`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `componente` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stock` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `componente`, `precio`, `stock`) VALUES
(1, 'intel i5 11900K', 43720, 20),
(2, 'intel i9 12900K', 169700, 10),
(3, 'Ryzen 5 5400G', 42500, 24),
(4, 'Ryzen 7 6800X', 85250, 12),
(5, 'GTX 1660ti gamingX', 103839, 69),
(6, 'RTX 2060 super', 100971, 24),
(7, 'RTX 4090ti 24gb', 1267209, 12),
(8, 'RX 5700xt 12gb', 381755, 34),
(9, 'Asus Strix b-450', 48900, 48),
(10, 'Asrock A320-m', 13500, 80),
(11, 'Aorus A560-m', 29900, 6),
(12, 'MSI MEG Z590 ACE', 154169, 95),
(13, 'Geil ddr4 16GB 3200mhz', 24225, 48),
(14, 'Corsair black 3600mhz 8gb', 15099, 80),
(15, 'Team DDR4 8GB 3600MHz T-Force', 14327, 6),
(16, 'HiperX DDR4 32GB 4800mhz', 64999, 14),
(17, 'm.2 2TB Western Digital', 60000, 9),
(18, 'SSD Kingston 980GB ', 17975, 21),
(19, 'HDD Western Digital 1TB', 9500, 30);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
