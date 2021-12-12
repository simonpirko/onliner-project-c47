-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: fake_onliner
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `laptop`
--

DROP TABLE IF EXISTS `laptop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `laptop` (
  `id` int NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `video_card` varchar(45) DEFAULT NULL,
  `processor` varchar(45) DEFAULT NULL,
  `OS` varchar(45) DEFAULT NULL,
  `display_size` double DEFAULT NULL,
  `frequency` double DEFAULT NULL,
  `ram` int DEFAULT NULL,
  `rom` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laptop`
--

LOCK TABLES `laptop` WRITE;
/*!40000 ALTER TABLE `laptop` DISABLE KEYS */;
/*!40000 ALTER TABLE `laptop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mobile`
--

DROP TABLE IF EXISTS `mobile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mobile` (
  `id` int NOT NULL,
  `type` varchar(45) DEFAULT NULL,
  `processor` varchar(45) DEFAULT NULL,
  `OS` varchar(45) DEFAULT NULL,
  `display_size` double DEFAULT NULL,
  `frequency` double DEFAULT NULL,
  `ram` int DEFAULT NULL,
  `display_type` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mobile`
--

LOCK TABLES `mobile` WRITE;
/*!40000 ALTER TABLE `mobile` DISABLE KEYS */;
INSERT INTO `mobile` VALUES (1,'smartphone','Qualcomm Snapdragon 888','Android 11',6.7,2840,8,'AMOLED');
/*!40000 ALTER TABLE `mobile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_comment`
--

DROP TABLE IF EXISTS `product_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_comment` (
  `id_user` int NOT NULL,
  `id_product` int DEFAULT NULL,
  `comment` varchar(256) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_comment`
--

LOCK TABLES `product_comment` WRITE;
/*!40000 ALTER TABLE `product_comment` DISABLE KEYS */;
INSERT INTO `product_comment` VALUES (1,1,'test','0000-00-00');
/*!40000 ALTER TABLE `product_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_list`
--

DROP TABLE IF EXISTS `product_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_list` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `model` varchar(80) DEFAULT NULL,
  `market_launch_date` int DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_list`
--

LOCK TABLES `product_list` WRITE;
/*!40000 ALTER TABLE `product_list` DISABLE KEYS */;
INSERT INTO `product_list` VALUES (1,'Samsung',2840,'Смартфон Samsung Galaxy Z Flip3 5G 8GB/256GB (бежевый)',2021,4.5,'mobile'),(2,'Apple',3063,'Смартфон Apple iPhone 13 128GB (темная ночь)',2021,4.9,'mobile'),(3,'Apple',3070,'Смартфон Apple iPhone 13 128GB (синий)',2021,4.8,'mobile');
/*!40000 ALTER TABLE `product_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_comment`
--

DROP TABLE IF EXISTS `shop_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop_comment` (
  `id_user` int NOT NULL,
  `id_shop` int DEFAULT NULL,
  `comment` varchar(256) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_comment`
--

LOCK TABLES `shop_comment` WRITE;
/*!40000 ALTER TABLE `shop_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_list`
--

DROP TABLE IF EXISTS `shop_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop_list` (
  `id` int NOT NULL AUTO_INCREMENT,
  `shop_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `contact_address` varchar(45) DEFAULT NULL,
  `description` varchar(256) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `count_rating` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_list`
--

LOCK TABLES `shop_list` WRITE;
/*!40000 ALTER TABLE `shop_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-12 23:33:13
