/*
Navicat MySQL Data Transfer

Source Server         : zhongruan
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : duangduang

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2015-09-02 12:44:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for d_book
-- ----------------------------
DROP TABLE IF EXISTS `d_book`;
CREATE TABLE `d_book` (
  `book_id` int(6) NOT NULL,
  `type_num` char(6) NOT NULL,
  `book_name` varchar(20) DEFAULT NULL,
  `book_price` float(6,2) DEFAULT NULL,
  `book_explain` varchar(100) DEFAULT NULL,
  `book_author` varchar(30) DEFAULT NULL,
  `book_press` varchar(20) DEFAULT NULL,
  `book_time` date DEFAULT NULL,
  `book_isbn` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `book_edit` varchar(11) DEFAULT NULL,
  `book_page` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `book_wordnum` int(11) DEFAULT NULL,
  `book_presstime` date DEFAULT NULL,
  `book_presscount` int(11) DEFAULT NULL,
  `book_size` varchar(10) CHARACTER SET latin1 DEFAULT NULL,
  `book_capacitor` varchar(14) CHARACTER SET latin1 DEFAULT NULL,
  `book_package` varchar(10) DEFAULT NULL,
  `book_synopsis` longtext CHARACTER SET latin1,
  `book_catalogue` text,
  `book_src` varchar(30) DEFAULT NULL,
  `book_category` varchar(255) DEFAULT NULL,
  `book_buynum` int(11) DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_book
-- ----------------------------
INSERT INTO `d_book` VALUES ('1', '001', '喜洋洋', '66.00', '一群羊和一只狼的故事', '唐骁', '清华大学出版社', '2014-10-01', '978265382', '1', '300', '500000', '2015-04-01', '5', null, null, '平装', null, null, 'xiyangyang.png', '电子书', null);
INSERT INTO `d_book` VALUES ('2', '001', '皮卡丘', '77.00', '一个小东西', '白辉东', '中南大学出版社', '2014-11-01', '452798102', '1', '256', '234567', '2015-05-01', '8', null, null, '平装', null, null, 'pikaqiu.png', '电子书', null);
INSERT INTO `d_book` VALUES ('3', '001', '功夫熊猫', '22.00', '一个会功夫的熊猫', '骆秀娟', '湖南大学出版社', '2014-11-01', '000962541', '1', '456', '342315', '2015-04-15', '9', null, null, '平装', null, null, 'gongfuxiongmao.png', '电子书', null);
INSERT INTO `d_book` VALUES ('4', '001', '大头儿子', '35.00', '长着一个大头的儿子', '朱思文', '湘潭大学出版社', '2014-11-26', '098765432', '1', '388', '237654', '2015-04-15', '7', null, null, '平装', null, null, 'datouerzi.png', '电子书', null);
INSERT INTO `d_book` VALUES ('5', '001', '小头爸爸', '44.00', '长着小头的爸爸', '科比', '洛杉矶大学出版社', '2014-11-11', '123464567', '1', '666', '543267', '2015-04-16', '4', null, null, '平装', null, null, 'xiaotoubaba.png', '电子书', null);
INSERT INTO `d_book` VALUES ('6', '001', '蜡笔小新', '54.00', '一个淘气的孩子', '韦德', '迈阿密大学出版社', '2014-11-10', '123421245', '1', '455', '453423', '2015-03-24', '3', null, null, '平装', null, null, 'labixiaoxin.png', '电子书', null);
INSERT INTO `d_book` VALUES ('7', '001', '四驱车', '66.00', '一群喜欢四驱车的孩子', '詹姆斯', '克利夫兰大学出版社', '2015-01-06', '23432189', '1', '555', '675432', '2015-06-23', '2', null, null, '平装', null, null, 'siquche.png', '电子书', null);
INSERT INTO `d_book` VALUES ('8', '001', '鹿鼎记', '77.00', '皇上和假太监', '库里', '金州大学出版社', '2015-02-03', '23645709', '1', '345', '345678', '2015-07-02', '5', null, null, '平装', null, null, 'ludingji.png', '电子书', null);

-- ----------------------------
-- Table structure for d_bookadmin
-- ----------------------------
DROP TABLE IF EXISTS `d_bookadmin`;
CREATE TABLE `d_bookadmin` (
  `bookAdmin_id` int(11) NOT NULL AUTO_INCREMENT,
  `bookAdmin_account` varchar(30) NOT NULL,
  `bookAdmin_pwd` varchar(20) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  PRIMARY KEY (`bookAdmin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_bookadmin
-- ----------------------------

-- ----------------------------
-- Table structure for d_booktype
-- ----------------------------
DROP TABLE IF EXISTS `d_booktype`;
CREATE TABLE `d_booktype` (
  `type_num` char(6) NOT NULL,
  `type_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`type_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of d_booktype
-- ----------------------------
INSERT INTO `d_booktype` VALUES ('001', '电子书');

-- ----------------------------
-- Table structure for d_buyed
-- ----------------------------
DROP TABLE IF EXISTS `d_buyed`;
CREATE TABLE `d_buyed` (
  `user_account` varchar(30) NOT NULL,
  `order_no` char(10) DEFAULT NULL,
  PRIMARY KEY (`user_account`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_buyed
-- ----------------------------

-- ----------------------------
-- Table structure for d_order
-- ----------------------------
DROP TABLE IF EXISTS `d_order`;
CREATE TABLE `d_order` (
  `user_account` varchar(30) NOT NULL,
  `order_num` varchar(11) NOT NULL,
  `totalprice` double(7,2) DEFAULT NULL,
  `order_date` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `order_status` char(6) CHARACTER SET utf8 DEFAULT NULL,
  `order_name` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `order_addr` varchar(50) CHARACTER SET utf8 DEFAULT NULL,
  `book_num` int(11) DEFAULT NULL,
  `book_src` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `book_name` varchar(255) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`order_num`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_order
-- ----------------------------
INSERT INTO `d_order` VALUES ('00000001', '0kBcJF28', '77.00', null, '交易成功', null, '...', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000001', '1bmi2M6H', '77.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'ludingji.png', '鹿鼎记');
INSERT INTO `d_order` VALUES ('00000001', '1P9ivaV5', '132.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'siquche.png', '四驱车');
INSERT INTO `d_order` VALUES ('00000030', '27pn4Cs4', '154.00', null, '交易成功', null, 'chansgah', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000006', '2l1HKLVb', '44.00', null, '交易成功', null, '', null, 'xiaotoubaba.png', '小头爸爸');
INSERT INTO `d_order` VALUES ('00000011', '3d2R6csM', '154.00', null, '交易成功', null, 'shanghai', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000011', '3d9Tl5sb', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000013', '3qmts3uh', '154.00', null, '交易成功', null, 'shanghai', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000001', '46pgVHIz', '54.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000016', '4zd7Ndnk', '132.00', null, '交易成功', null, '....', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', '56ijx4B8', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000013', '5XM02BaE', '44.00', null, '交易成功', null, 'guangzhou', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000001', '6l26w4g1', '54.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000013', '6rixe1zo', '44.00', null, '交易成功', null, '111', null, 'xiaotoubaba.png', '小头爸爸');
INSERT INTO `d_order` VALUES ('00000030', '6Wnqq6vI', '132.00', null, '交易成功', null, 'chansgah', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000013', '711LRrqR', '22.00', null, '交易成功', null, '111', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000001', '788w2Q5Y', '22.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000006', '7aQ3vRir', '132.00', null, '交易成功', null, '', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', '7DimeHVS', '198.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', '8DA2IM05', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000015', '9B1TieY3', '154.00', null, '交易成功', null, 'changsha', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000006', '9LyDaf3P', '66.00', null, '交易成功', null, '', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000015', '9zFm6F95', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'A1052wrP', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000006', 'AN7rBsER', '154.00', null, '交易成功', null, '', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000013', 'bGGe9O4n', '54.00', null, '交易成功', null, 'beijing', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000006', 'Bng2Xhkb', '88.00', null, '交易成功', null, '', null, 'xiaotoubaba.png', '小头爸爸');
INSERT INTO `d_order` VALUES ('00000001', 'C4l7aKAG', '77.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'ludingji.png', '鹿鼎记');
INSERT INTO `d_order` VALUES ('00000010', 'D1Fp1h9T', '77.00', null, '交易成功', null, '', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000013', 'dBhc5L2k', '77.00', null, '交易成功', null, 'leshan', null, 'ludingji.png', '鹿鼎记');
INSERT INTO `d_order` VALUES ('00000015', 'DTxcCOKB', '132.00', null, '交易成功', null, 'shanghai', null, 'siquche.png', '四驱车');
INSERT INTO `d_order` VALUES ('00000001', 'e8mcNGp7', '132.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'siquche.png', '四驱车');
INSERT INTO `d_order` VALUES ('00000010', 'F4e6GIv6', '22.00', null, '交易成功', null, '', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000010', 'fH1OcQWm', '132.00', null, '交易成功', null, '', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000006', 'flMQy7sf', '54.00', null, '交易成功', null, '', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000006', 'Fq8L14Wu', '132.00', null, '交易成功', null, '', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'G1mgjKa5', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000013', 'g9nHCXo6', '66.00', null, '交易成功', null, '111', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000012', 'GjL3qmr0', '154.00', null, '交易成功', null, 'shanghai', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000006', 'hJ5J9W48', '108.00', null, '交易成功', null, '', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000013', 'Hm9N0D0L', '154.00', null, '交易成功', null, '111', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000013', 'Ics1jtDX', '54.00', null, '交易成功', null, '111', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000015', 'IFb6743Y', '132.00', null, '交易成功', null, 'changsha ', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000006', 'IqKcbUX1', '44.00', null, '交易成功', null, '', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000013', 'J432a9l3', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'j9M75qX5', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000015', 'K3111loS', '44.00', null, '交易成功', null, 'changsha', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000001', 'k7bl9zd6', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'lm1ioMF1', '77.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000001', 'LrE37XvR', '88.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000001', 'MAD5W3Vp', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000012', 'ponSB8Wf', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'q4uPuGr9', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000006', 'qNp9NLF9', '105.00', null, '交易成功', null, '', null, 'datouerzi.png', '大头儿子');
INSERT INTO `d_order` VALUES ('00000006', 'r10sRBFA', '44.00', null, '交易成功', null, 'ä¸­è½¯å½é', null, 'gongfuxiongmao.png', '功夫熊猫');
INSERT INTO `d_order` VALUES ('00000013', 'sXuE42Ql', '66.00', null, '交易成功', null, '111', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'TO0wKB49', '154.00', null, '交易成功', null, '...', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000001', 'Tx8bTC8D', '54.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'labixiaoxin.png', '蜡笔小新');
INSERT INTO `d_order` VALUES ('00000006', 'VadHiwUU', '198.00', null, '交易成功', null, '', null, 'siquche.png', '四驱车');
INSERT INTO `d_order` VALUES ('00000006', 'VJ1zfmD0', '35.00', null, '交易成功', null, '', null, 'datouerzi.png', '大头儿子');
INSERT INTO `d_order` VALUES ('00000006', 'VzmUff6U', '132.00', null, '交易成功', null, '', null, 'siquche.png', '四驱车');
INSERT INTO `d_order` VALUES ('00000006', 'W5AHm74U', '44.00', null, '交易成功', null, '', null, 'xiaotoubaba.png', '小头爸爸');
INSERT INTO `d_order` VALUES ('00000010', 'wJt1yIYr', '231.00', null, '交易成功', null, '', null, 'pikaqiu.png', '皮卡丘');
INSERT INTO `d_order` VALUES ('00000001', 'XjNHW9Yu', '66.00', null, '交易成功', null, 'æ¹åçé¿æ²å¸', null, 'xiyangyang.png', '喜洋洋');
INSERT INTO `d_order` VALUES ('00000001', 'y4aMYGnW', '66.00', null, '交易成功', null, 'changsha', null, 'xiyangyang.png', '喜洋洋');

-- ----------------------------
-- Table structure for d_orderts
-- ----------------------------
DROP TABLE IF EXISTS `d_orderts`;
CREATE TABLE `d_orderts` (
  `shop_no` int(10) NOT NULL AUTO_INCREMENT,
  `book_id` int(6) NOT NULL,
  `user_account` varchar(30) NOT NULL,
  `order_num` int(11) DEFAULT NULL,
  `order_buy` char(4) DEFAULT NULL,
  PRIMARY KEY (`shop_no`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_orderts
-- ----------------------------
INSERT INTO `d_orderts` VALUES ('6', '3', '00000016', '2', '0');

-- ----------------------------
-- Table structure for d_stock
-- ----------------------------
DROP TABLE IF EXISTS `d_stock`;
CREATE TABLE `d_stock` (
  `book_id` char(6) NOT NULL,
  `book_stock` int(11) DEFAULT NULL,
  `book_sell` int(11) DEFAULT NULL,
  `book_uploadtime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_stock
-- ----------------------------

-- ----------------------------
-- Table structure for d_sysadmin
-- ----------------------------
DROP TABLE IF EXISTS `d_sysadmin`;
CREATE TABLE `d_sysadmin` (
  `sysAdmin_id` int(11) NOT NULL AUTO_INCREMENT,
  `sysAdmin_account` varchar(30) NOT NULL,
  `sysAdmin_pwd` varchar(20) DEFAULT NULL,
  `role` int(11) DEFAULT NULL,
  PRIMARY KEY (`sysAdmin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_sysadmin
-- ----------------------------
INSERT INTO `d_sysadmin` VALUES ('1', '001', '123', '1');
INSERT INTO `d_sysadmin` VALUES ('2', '00000001', '00000001', '1');

-- ----------------------------
-- Table structure for d_users
-- ----------------------------
DROP TABLE IF EXISTS `d_users`;
CREATE TABLE `d_users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(30) DEFAULT NULL,
  `user_pwd` varchar(20) DEFAULT NULL,
  `user_mail` varchar(30) DEFAULT NULL,
  `user_gender` varchar(10) DEFAULT NULL,
  `user_name` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `user_birth` date DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of d_users
-- ----------------------------
INSERT INTO `d_users` VALUES ('1', '00000001', '123456', '', null, 'tangxiao', null);
INSERT INTO `d_users` VALUES ('7', '00000005', '123', '9999999@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('9', '00000006', '12', '5555@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('10', '00000007', '123', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('11', '00000008', '12345', '333333333333@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('12', '00000009', '1234', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('14', '00000010', '123', '333333333333@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('16', '00000011', '123', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('17', '00000012', '123', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('18', '00000013', '123', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('19', '00000014', '12', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('20', '00000015', '123', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('21', '00000016', '1234', '222222@qq.com', null, null, null);
INSERT INTO `d_users` VALUES ('22', '00000030', '123', '222222@qq.com', null, null, null);
