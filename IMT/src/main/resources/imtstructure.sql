-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: imt
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inc_hist_log`
--

DROP TABLE IF EXISTS `inc_hist_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inc_hist_log` (
  `INC_HIST_ID` int(11) NOT NULL AUTO_INCREMENT,
  `INC_ID` int(11) DEFAULT NULL,
  `HC_ID` int(11) DEFAULT NULL,
  `ENVIRONMENT` varchar(20) DEFAULT NULL,
  `APPLICATION` varchar(20) DEFAULT NULL,
  `STATUS` varchar(20) DEFAULT NULL,
  `SEVERIETY` varchar(20) DEFAULT NULL,
  `SUMMARY` varchar(30) DEFAULT NULL,
  `DESCRIPTION` varchar(100) DEFAULT NULL,
  `ASSIGNED_TO` varchar(30) DEFAULT NULL,
  `ASSIGNED_GROUP` varchar(30) DEFAULT NULL,
  `REQUESTED_USER` varchar(40) DEFAULT NULL,
  `REQUESTED_GROUP` varchar(40) DEFAULT NULL,
  `COMMENTS` varchar(100) DEFAULT NULL,
  `CREATE_DT` date DEFAULT NULL,
  PRIMARY KEY (`INC_HIST_ID`),
  KEY `FR_INC_INCH_idx` (`INC_ID`),
  CONSTRAINT `FR_INC_INCH` FOREIGN KEY (`INC_ID`) REFERENCES `incident_log` (`INC_ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `incident_log`
--

DROP TABLE IF EXISTS `incident_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `incident_log` (
  `INC_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_ID` int(11) NOT NULL,
  `CREATE_DT` date DEFAULT NULL,
  `UPDATE_DT` date DEFAULT NULL,
  PRIMARY KEY (`INC_ID`),
  KEY `INC_USER_idx` (`USER_ID`),
  CONSTRAINT `FR_USR_INC` FOREIGN KEY (`USER_ID`) REFERENCES `user_inc` (`USER_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user_inc`
--

DROP TABLE IF EXISTS `user_inc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_inc` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` varchar(20) NOT NULL,
  `LAST_NAME` varchar(20) NOT NULL,
  `USER_NAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(15) NOT NULL,
  `USER_GROUP` varchar(30) NOT NULL,
  `EMAIL_ID` varchar(30) NOT NULL,
  `ROLE` varchar(30) NOT NULL,
  `ISACCESS_GRANTED` varchar(30) NOT NULL,
  `CREATE_DT` date NOT NULL,
  `UPDATE_DT` date DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-22  8:57:01

Insert into User_Inc(
  USER_ID,FIRST_NAME,LAST_NAME,USER_NAME,PASSWORD,USER_GROUP,EMAIL_ID,ROLE,ISACCESS_GRANTED,CREATE_DT,UPDATE_DT)
values(1,'Anees Ahmed','Mohammed','anees','anees','MY GROUP','anees@tm.com','ADMIN','YES', CURTIME() ,CURTIME() );
