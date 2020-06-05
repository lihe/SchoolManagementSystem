-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 14, 2020 at 04:09 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schoolmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `cid` int(11) NOT NULL,
  `classname` varchar(255) NOT NULL,
  `section` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`cid`, `classname`, `section`) VALUES
(1, '1', 'A'),
(4, '2', 'B'),
(5, '3', 'C'),
(6, '4', 'D'),
(7, '5', 'E'),
(8, '6', 'F'),
(10, '8', 'H'),
(12, '6', 'D'),
(13, '4', 'D'),
(14, '3', 'D');

-- --------------------------------------------------------

--
-- Table structure for table `exam`
--

CREATE TABLE `exam` (
  `eid` int(11) NOT NULL,
  `ename` varchar(255) NOT NULL,
  `term` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `class` varchar(255) NOT NULL,
  `section` varchar(255) NOT NULL,
  `subject` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `exam`
--

INSERT INTO `exam` (`eid`, `ename`, `term`, `date`, `class`, `section`, `subject`) VALUES
(1, 'finaltermexam', '1st Term', '2020-00-13', '1', 'A', 'bee'),
(2, 'MIddleExam', '2nd Term', '2020-11-14', '2', 'B', 'math'),
(3, 'EnglishExam', '3rd Term', '2020-11-14', '3', 'C', 'English'),
(4, 'MathExam', '3rd Term', '2020-50-14', '4', 'D', 'math'),
(5, 'MathMiddle', '4th term', '2020-00-15', '1', 'A', 'math'),
(6, 'Test', '1st Term', '2020-05-15', '1', 'A', 'test1'),
(7, 'Middle', '3rd Term', '2020-51-07', '4', 'B', 'test1');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `id` int(11) NOT NULL,
  `stid` int(11) NOT NULL,
  `class` varchar(255) NOT NULL,
  `subject` varchar(255) NOT NULL,
  `marks` int(11) NOT NULL,
  `term` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`id`, `stid`, `class`, `subject`, `marks`, `term`) VALUES
(1, 2, '1', 'bee', 100, '1st Term'),
(2, 2, '2', 'test1', 100, '2nd Term'),
(3, 2, '1', 'bee', 100, '3rd Term'),
(4, 3, '2', 'math', 99, '2nd Term'),
(5, 3, '4', 'Chinese', 89, '2nd Term');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `stname` varchar(255) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `dob` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `class` varchar(255) NOT NULL,
  `section` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `stname`, `pname`, `dob`, `gender`, `phone`, `address`, `class`, `section`) VALUES
(2, 'Jone', 'Tony', '2009-28-21', 'Male', 123456, 'China', '1', 'A'),
(3, 'Stark', 'Tony', '2016-48-20', 'Male', 123456, 'China', '2', 'B'),
(6, 'weili', 'tony', '2015-04-09', 'Male', 123456, 'China', '1', 'A'),
(7, 'hell', 'lee', '2015-26-14', 'Male', 123456, 'China', '5', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `sid` int(11) NOT NULL,
  `subjectname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`sid`, `subjectname`) VALUES
(1, 'bee'),
(3, 'test1'),
(4, 'math'),
(5, 'English'),
(6, 'Chinese'),
(9, 'test3'),
(10, 'CS');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `qual` varchar(255) NOT NULL,
  `salary` int(11) NOT NULL,
  `phone` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `log_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `name`, `qual`, `salary`, `phone`, `email`, `address`, `log_id`) VALUES
(1, 'leee', 'MBA', 100000, 123456, 'leee@gmail.com', 'China', 5),
(2, 'hee', 'MBA', 10000, 123456, 'hee@gmail.com', 'China', 5),
(4, 'wang', 'MBA', 12000, 12345, 'wang@gmail.com', 'China', 5),
(5, 'chen', 'MBA', 50000, 123456, 'chen@gmail.com', 'China', 5);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` int(11) NOT NULL,
  `address` varchar(255) NOT NULL,
  `uname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `utype` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `phone`, `address`, `uname`, `password`, `utype`) VALUES
(2, 'lihe', 123, 'anhui', 'lihe', '123', 'Admin'),
(3, 'pana', 123, 'anhui', 'pana', '123', 'Teacher'),
(4, 'jone', 123, 'anhui', 'jone', '123', 'Admin'),
(5, 'lee', 123456, 'anhui', 'lee', '123', 'Teacher'),
(7, 'tony', 123456, 'China', 'tony', '123', 'Student'),
(10, 'wang', 123456, 'China', 'wang', '123', 'Teacher'),
(11, 'chen', 123456, 'China', 'chen', '123', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `exam`
--
ALTER TABLE `exam`
  ADD PRIMARY KEY (`eid`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `class`
--
ALTER TABLE `class`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `exam`
--
ALTER TABLE `exam`
  MODIFY `eid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `subject`
--
ALTER TABLE `subject`
  MODIFY `sid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
