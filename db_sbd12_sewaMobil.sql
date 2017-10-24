/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 10.1.22-MariaDB : Database - db_sbd12_sewa_mobil
*********************************************************************
*/
/**/
/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_sbd12_sewa_mobil` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_sbd12_sewa_mobil`;

/*Table structure for table `tbl_data_mobil` */

DROP TABLE IF EXISTS `tbl_data_mobil`;

CREATE TABLE `tbl_data_mobil` (
  `no_pol` char(9) NOT NULL,
  `id_merk_mobil` char(8) NOT NULL,
  `id_owner` char(8) NOT NULL,
  PRIMARY KEY (`no_pol`),
  KEY `id_owner` (`id_owner`),
  KEY `id_merk_mobil` (`id_merk_mobil`),
  CONSTRAINT `tbl_data_mobil_ibfk_1` FOREIGN KEY (`id_owner`) REFERENCES `tbl_owner_mobil` (`id_owner`),
  CONSTRAINT `tbl_data_mobil_ibfk_2` FOREIGN KEY (`id_merk_mobil`) REFERENCES `tbl_merk_mobil` (`id_merk_mobil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_data_mobil` */

insert  into `tbl_data_mobil`(`no_pol`,`id_merk_mobil`,`id_owner`) values 
('D4021TZ','TYF1','ow1'),
('D4025FS','TYF1','ow1'),
('D4053RS','HDS1','ow2'),
('D4222FZ','TYF1','ow2'),
('D4652TZ','HDS2','ow1'),
('D4666AS','HDS2','ow2');

/*Table structure for table `tbl_data_transaksi` */

DROP TABLE IF EXISTS `tbl_data_transaksi`;

CREATE TABLE `tbl_data_transaksi` (
  `no_transaksi` char(9) NOT NULL,
  `id_kostumer` char(8) NOT NULL,
  `no_pol` char(8) NOT NULL,
  `id_pegawai` char(9) NOT NULL,
  `tglpinjam` date NOT NULL,
  `tglkembali` date NOT NULL,
  `harga_total` double DEFAULT NULL,
  PRIMARY KEY (`no_transaksi`),
  KEY `id_kostumer` (`id_kostumer`),
  KEY `no_pol` (`no_pol`),
  KEY `id_pegawai` (`id_pegawai`),
  CONSTRAINT `tbl_data_transaksi_ibfk_1` FOREIGN KEY (`id_kostumer`) REFERENCES `tbl_kostumer` (`id_kostumer`),
  CONSTRAINT `tbl_data_transaksi_ibfk_2` FOREIGN KEY (`no_pol`) REFERENCES `tbl_data_mobil` (`no_pol`),
  CONSTRAINT `tbl_data_transaksi_ibfk_3` FOREIGN KEY (`id_pegawai`) REFERENCES `tbl_pegawai` (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_data_transaksi` */

insert  into `tbl_data_transaksi`(`no_transaksi`,`id_kostumer`,`no_pol`,`id_pegawai`,`tglpinjam`,`tglkembali`,`harga_total`) values 
('TRX001','KZ1','D4025FS','PG1','2017-10-07','2017-10-09',750000),
('TRX002','KZ2','D4652TZ','PG1','2017-10-16','2017-10-17',800000),
('TRX003','KZ3','D4666AS','PG1','2017-10-13','2017-10-19',2800000);

/*Table structure for table `tbl_jenis_mobil` */

DROP TABLE IF EXISTS `tbl_jenis_mobil`;

CREATE TABLE `tbl_jenis_mobil` (
  `id_jenis_mobil` char(8) NOT NULL,
  `nama_jenis` varchar(20) DEFAULT NULL,
  `harga` double DEFAULT NULL,
  PRIMARY KEY (`id_jenis_mobil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_jenis_mobil` */

insert  into `tbl_jenis_mobil`(`id_jenis_mobil`,`nama_jenis`,`harga`) values 
('BUS1','BUS AC',2000000),
('FMY1','Family Ekonomi',250000),
('FMY2','Family Eksekutif',350000),
('FMY3','Family Premium',450000),
('MBS1','Mini Bus',900000),
('SDN1','Sedan Ekonomi',300000),
('SDN2','Sedan Eksekutif',400000),
('SDN3','Sedan Premium',600000);

/*Table structure for table `tbl_kostumer` */

DROP TABLE IF EXISTS `tbl_kostumer`;

CREATE TABLE `tbl_kostumer` (
  `id_kostumer` char(9) NOT NULL,
  `no_ktp` char(128) NOT NULL,
  `nama_k` varchar(30) NOT NULL,
  `jenis_kelamin_k` enum('L','P') DEFAULT NULL,
  `alamat_k` varchar(30) DEFAULT NULL,
  `no_telepon_k` varchar(13) DEFAULT NULL,
  PRIMARY KEY (`id_kostumer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_kostumer` */

insert  into `tbl_kostumer`(`id_kostumer`,`no_ktp`,`nama_k`,`jenis_kelamin_k`,`alamat_k`,`no_telepon_k`) values 
('kz1','101020201223','Hesti',NULL,'Jalan Dipatiukur','021234532'),
('kz2','101020201266','Angga',NULL,'Jalan Dipatiukur','081256347823'),
('kz3','101020201298','Rendy',NULL,'Jalan Dago','081256347888');

/*Table structure for table `tbl_merk_mobil` */

DROP TABLE IF EXISTS `tbl_merk_mobil`;

CREATE TABLE `tbl_merk_mobil` (
  `id_merk_mobil` char(8) NOT NULL,
  `id_produsen_mobil` char(8) NOT NULL,
  `id_jenis_mobil` char(8) NOT NULL,
  `nama_mobil` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_merk_mobil`),
  KEY `id_produsen_mobil` (`id_produsen_mobil`),
  KEY `id_jenis_moobil_ibfk_1` (`id_jenis_mobil`),
  CONSTRAINT `id_jenis_moobil_ibfk_1` FOREIGN KEY (`id_jenis_mobil`) REFERENCES `tbl_jenis_mobil` (`id_jenis_mobil`),
  CONSTRAINT `tbl_merk_mobil_ibfk_1` FOREIGN KEY (`id_produsen_mobil`) REFERENCES `tbl_produsen_mobil` (`id_produsen_mobil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_merk_mobil` */

insert  into `tbl_merk_mobil`(`id_merk_mobil`,`id_produsen_mobil`,`id_jenis_mobil`,`nama_mobil`) values 
('HDS1','HND','SDN1','Accord'),
('HDS2','HND','SDN2','Civic'),
('TYF1','TYT','FMY1','Avanza');

/*Table structure for table `tbl_owner_mobil` */

DROP TABLE IF EXISTS `tbl_owner_mobil`;

CREATE TABLE `tbl_owner_mobil` (
  `id_owner` char(9) NOT NULL,
  `no_ktp_ow` char(128) NOT NULL,
  `nama_ow` varchar(30) NOT NULL,
  `jenis_kelamin_ow` enum('L','P') DEFAULT NULL,
  `alamat_ow` varchar(30) NOT NULL,
  `no_telepon_ow` varchar(13) NOT NULL,
  PRIMARY KEY (`id_owner`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_owner_mobil` */

insert  into `tbl_owner_mobil`(`id_owner`,`no_ktp_ow`,`nama_ow`,`jenis_kelamin_ow`,`alamat_ow`,`no_telepon_ow`) values 
('ow1','101020201234','Afrizal',NULL,'Jalan Setiabudi','081256123434'),
('ow2','101020201235','Risa',NULL,'Jalan Geger Kalong','089656123443');

/*Table structure for table `tbl_pegawai` */

DROP TABLE IF EXISTS `tbl_pegawai`;

CREATE TABLE `tbl_pegawai` (
  `id_pegawai` char(9) NOT NULL,
  `no_ktp_p` char(128) NOT NULL,
  `nama_p` varchar(30) NOT NULL,
  `jenis_kelamin_p` enum('L','P') DEFAULT NULL,
  `alamat_p` varchar(30) DEFAULT NULL,
  `no_telepon_p` varchar(13) NOT NULL,
  PRIMARY KEY (`id_pegawai`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_pegawai` */

insert  into `tbl_pegawai`(`id_pegawai`,`no_ktp_p`,`nama_p`,`jenis_kelamin_p`,`alamat_p`,`no_telepon_p`) values 
('PG1','101020201277','Mira',NULL,'Jalan Jakarta','081257592325'),
('PG2','101020201288','Dira',NULL,'Jalan Bogor','081257592325');

/*Table structure for table `tbl_produsen_mobil` */

DROP TABLE IF EXISTS `tbl_produsen_mobil`;

CREATE TABLE `tbl_produsen_mobil` (
  `id_produsen_mobil` char(8) NOT NULL,
  `nama_produsen` varchar(20) NOT NULL,
  PRIMARY KEY (`id_produsen_mobil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_produsen_mobil` */

insert  into `tbl_produsen_mobil`(`id_produsen_mobil`,`nama_produsen`) values 
('HND','Honda'),
('MTS','Mitsubishi'),
('SZI','Suzuki'),
('TYT','TOYOTA');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
