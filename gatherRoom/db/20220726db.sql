-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: gather_room
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `gr_character`
--

DROP TABLE IF EXISTS `gr_character`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gr_character` (
  `character_id` bigint NOT NULL AUTO_INCREMENT,
  `character_name` varchar(255) DEFAULT NULL,
  `mod_date` datetime DEFAULT NULL,
  `reg_date` datetime DEFAULT NULL,
  `resource_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`character_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gr_character`
--

LOCK TABLES `gr_character` WRITE;
/*!40000 ALTER TABLE `gr_character` DISABLE KEYS */;
/*!40000 ALTER TABLE `gr_character` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gr_food_test`
--

DROP TABLE IF EXISTS `gr_food_test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gr_food_test` (
  `food_id` bigint NOT NULL AUTO_INCREMENT,
  `food_name` varchar(255) DEFAULT NULL,
  `price` int DEFAULT NULL,
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gr_food_test`
--

LOCK TABLES `gr_food_test` WRITE;
/*!40000 ALTER TABLE `gr_food_test` DISABLE KEYS */;
INSERT INTO `gr_food_test` VALUES (1,'asdasdasd',1000);
/*!40000 ALTER TABLE `gr_food_test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gr_user`
--

DROP TABLE IF EXISTS `gr_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gr_user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `character_id` bigint DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `picture` varchar(255) DEFAULT NULL,
  `role` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gr_user`
--

LOCK TABLES `gr_user` WRITE;
/*!40000 ALTER TABLE `gr_user` DISABLE KEYS */;
INSERT INTO `gr_user` VALUES (1,'2022.07.26','2022.07.26',NULL,'kokochikochi@gmail.com','jaewon kim',NULL,'https://lh3.googleusercontent.com/a/AItbvmn08lwBUp_G-g6_gnw_la9dDb84POHM0optHHnK=s96-c','GUEST');
/*!40000 ALTER TABLE `gr_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-26 23:02:46
