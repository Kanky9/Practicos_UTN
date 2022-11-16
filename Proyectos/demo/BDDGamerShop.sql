DROP DATABASE IF EXISTS `gamer`;
CREATE DATABASE IF NOT EXISTS `gamer` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
DROP USER IF EXISTS `springuser`@localhost;
CREATE USER `springuser` @localhost IDENTIFIED BY 'ThePassword';
GRANT USAGE ON *.* TO `springuser` @localhost;
GRANT ALL PRIVILEGES ON `gamer`.* TO `springuser` @localhost;
USE `gamer`;
DROP TABLE IF EXISTS `productos`;
CREATE TABLE IF NOT EXISTS `productos` (
    `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
    `componente` varchar (255) DEFAULT NULL,
    `precio` double DEFAULT NULL,
    `stock` int(10) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 10 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
INSERT INTO
    `productos` (`id`, `componente`, `precio`, `stock`)
VALUES
    (1, 'intel i5 11900K', 43720, 20),
    (2, 'intel i9 12900K', 169700, 10),
    (3, 'Ryzen 5 5400G', 42500, 24),
    (4, 'Ryzen 7 6800X', 85250, 12 ),
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
    (16, 'HiperX DDR4 32GB 4800mhz', 64999, 14);