-- MySQL dump 10.13  Distrib 8.0.13, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: maruf
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `merge_sort`
--

DROP TABLE IF EXISTS `merge_sort`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `merge_sort` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `SortingNumbers` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merge_sort`
--

LOCK TABLES `merge_sort` WRITE;
/*!40000 ALTER TABLE `merge_sort` DISABLE KEYS */;
INSERT INTO `merge_sort` VALUES (1,12),(2,22),(3,29),(4,38),(5,38),(6,41),(7,53),(8,85),(9,93),(10,94),(11,96),(12,103),(13,120),(14,140),(15,153),(16,168),(17,179),(18,219),(19,233),(20,247),(21,253),(22,258),(23,266),(24,267),(25,291),(26,309),(27,315),(28,342),(29,343),(30,346),(31,346),(32,352),(33,376),(34,377),(35,377),(36,397),(37,399),(38,403),(39,430),(40,453),(41,455),(42,459),(43,473),(44,474),(45,480),(46,484),(47,489),(48,499),(49,500),(50,501),(51,509),(52,514),(53,517),(54,527),(55,528),(56,557),(57,592),(58,597),(59,607),(60,612),(61,619),(62,621),(63,628),(64,632),(65,656),(66,658),(67,660),(68,668),(69,700),(70,723),(71,734),(72,739),(73,755),(74,763),(75,768),(76,773),(77,786),(78,790),(79,791),(80,802),(81,804),(82,812),(83,817),(84,821),(85,823),(86,826),(87,830),(88,840),(89,848),(90,882),(91,900),(92,914),(93,919),(94,925),(95,929),(96,954),(97,973),(98,976),(99,997),(100,998);
/*!40000 ALTER TABLE `merge_sort` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-26 14:57:16
