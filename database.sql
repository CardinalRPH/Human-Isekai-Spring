-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 25, 2024 at 08:24 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `human_isekai_transfer`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `itemId` int(11) NOT NULL,
  `itemName` varchar(100) NOT NULL,
  `damage` int(11) NOT NULL,
  `type` varchar(100) NOT NULL,
  `jobId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `jobId` int(11) NOT NULL,
  `jobName` varchar(100) NOT NULL,
  `sallary` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `playerId` int(11) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `jobId` int(11) DEFAULT NULL,
  `worldId` int(11) DEFAULT NULL,
  `coin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `su`
--

CREATE TABLE `su` (
  `userName` varchar(50) NOT NULL,
  `superName` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `world`
--

CREATE TABLE `world` (
  `worldId` int(11) NOT NULL,
  `worldName` varchar(100) NOT NULL,
  `location` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`itemId`),
  ADD KEY `Job Constrain Item` (`jobId`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`jobId`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`playerId`),
  ADD KEY `Job Constrain` (`jobId`),
  ADD KEY `World Constarain` (`worldId`);

--
-- Indexes for table `su`
--
ALTER TABLE `su`
  ADD PRIMARY KEY (`userName`);

--
-- Indexes for table `world`
--
ALTER TABLE `world`
  ADD PRIMARY KEY (`worldId`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `item`
--
ALTER TABLE `item`
  ADD CONSTRAINT `Job Constrain Item` FOREIGN KEY (`jobId`) REFERENCES `job` (`jobId`) ON UPDATE NO ACTION;

--
-- Constraints for table `player`
--
ALTER TABLE `player`
  ADD CONSTRAINT `Job Constrain` FOREIGN KEY (`jobId`) REFERENCES `job` (`jobId`) ON DELETE SET NULL ON UPDATE NO ACTION,
  ADD CONSTRAINT `World Constarain` FOREIGN KEY (`worldId`) REFERENCES `world` (`worldId`) ON DELETE SET NULL ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
