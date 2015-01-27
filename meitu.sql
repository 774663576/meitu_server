/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : meitu

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2015-01-27 17:13:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT,
  `publisher_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `praise_count` int(11) DEFAULT '0',
  `last_update_time` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('6', '41', '空军建军节', '2015-01-27 14:38', '0', '2015-01-27 14:38', null);
INSERT INTO `article` VALUES ('7', '41', '哈哈哈太累了', '2015-01-27 14:54', '0', '2015-01-27 14:54', null);
INSERT INTO `article` VALUES ('8', '41', '看OK了了啦咯啦咯啦咯考虑考虑记录考虑考虑啦啦啦', '2015-01-27 15:37', '0', '2015-01-27 15:37', null);
INSERT INTO `article` VALUES ('9', '41', '我以为我可以图图哦了啦咯考虑兔兔图图图吐了考虑考虑', '2015-01-27 15:38', '0', '2015-01-27 15:38', null);
INSERT INTO `article` VALUES ('10', '41', '痛苦啦啦啦考虑考虑吐了', '2015-01-27 15:39', '0', '2015-01-27 15:39', null);
INSERT INTO `article` VALUES ('11', '41', '提墨迹老K来咯哦哦陆续太危险了旅途考虑考虑', '2015-01-27 15:59', '0', '2015-01-27 15:59', null);
INSERT INTO `article` VALUES ('12', '41', '', '2015-01-27 16:02', '0', '2015-01-27 16:02', null);
INSERT INTO `article` VALUES ('13', '41', 'yyyy', '2015-01-27 16:04', '0', '2015-01-27 16:04', null);
INSERT INTO `article` VALUES ('14', '41', '', '2015-01-27 16:06', '0', '2015-01-27 16:06', null);
INSERT INTO `article` VALUES ('15', '41', 'ggghvvgg想我咯啦咯了掏空了快乐', '2015-01-27 16:08', '0', '2015-01-27 16:08', null);

-- ----------------------------
-- Table structure for article_img
-- ----------------------------
DROP TABLE IF EXISTS `article_img`;
CREATE TABLE `article_img` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`image_id`,`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article_img
-- ----------------------------
INSERT INTO `article_img` VALUES ('1', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_1.jpg');
INSERT INTO `article_img` VALUES ('2', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_2.jpg');
INSERT INTO `article_img` VALUES ('3', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_3.jpg');
INSERT INTO `article_img` VALUES ('4', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_4.jpg');
INSERT INTO `article_img` VALUES ('5', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_5.jpg');
INSERT INTO `article_img` VALUES ('6', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_6.jpg');
INSERT INTO `article_img` VALUES ('7', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_7.jpg');
INSERT INTO `article_img` VALUES ('8', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_8.jpg');
INSERT INTO `article_img` VALUES ('9', '9', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-38-15_9.jpg');
INSERT INTO `article_img` VALUES ('10', '10', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-39-41_1.jpg');
INSERT INTO `article_img` VALUES ('11', '10', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-39-41_2.jpg');
INSERT INTO `article_img` VALUES ('12', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_1.jpg');
INSERT INTO `article_img` VALUES ('13', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_2.jpg');
INSERT INTO `article_img` VALUES ('14', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_3.jpg');
INSERT INTO `article_img` VALUES ('15', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_4.jpg');
INSERT INTO `article_img` VALUES ('16', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_5.jpg');
INSERT INTO `article_img` VALUES ('17', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_6.jpg');
INSERT INTO `article_img` VALUES ('18', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_7.jpg');
INSERT INTO `article_img` VALUES ('19', '11', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-15-59-56_8.jpg');
INSERT INTO `article_img` VALUES ('20', '12', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-02-53_1.jpg');
INSERT INTO `article_img` VALUES ('21', '12', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-02-53_2.jpg');
INSERT INTO `article_img` VALUES ('22', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_1.jpg');
INSERT INTO `article_img` VALUES ('23', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_2.jpg');
INSERT INTO `article_img` VALUES ('24', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_3.jpg');
INSERT INTO `article_img` VALUES ('25', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_4.jpg');
INSERT INTO `article_img` VALUES ('26', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_5.jpg');
INSERT INTO `article_img` VALUES ('27', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_6.jpg');
INSERT INTO `article_img` VALUES ('28', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_7.jpg');
INSERT INTO `article_img` VALUES ('29', '13', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-04-33_8.jpg');
INSERT INTO `article_img` VALUES ('30', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_1.jpg');
INSERT INTO `article_img` VALUES ('31', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_2.jpg');
INSERT INTO `article_img` VALUES ('32', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_3.jpg');
INSERT INTO `article_img` VALUES ('33', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_4.jpg');
INSERT INTO `article_img` VALUES ('34', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_5.jpg');
INSERT INTO `article_img` VALUES ('35', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_6.jpg');
INSERT INTO `article_img` VALUES ('36', '14', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-06-22_7.jpg');
INSERT INTO `article_img` VALUES ('37', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_1.jpg');
INSERT INTO `article_img` VALUES ('38', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_2.jpg');
INSERT INTO `article_img` VALUES ('39', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_3.jpg');
INSERT INTO `article_img` VALUES ('40', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_4.jpg');
INSERT INTO `article_img` VALUES ('41', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_5.jpg');
INSERT INTO `article_img` VALUES ('42', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_6.jpg');
INSERT INTO `article_img` VALUES ('43', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_7.jpg');
INSERT INTO `article_img` VALUES ('44', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_8.jpg');
INSERT INTO `article_img` VALUES ('45', '15', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-16-08-31_9.jpg');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_gender` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_birthday` varchar(255) DEFAULT NULL,
  `user_avatar` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('40', '拉', '12345678985', '男', '123', '2015-1-23', 'http://192.168.1.100:8080/MeiTu/avatar_image/2015-01-23-14-36-04.jpg');
INSERT INTO `user` VALUES ('41', '测', '18560133195', '男', '123456', '2015-1-23', 'http://192.168.1.100:8080/MeiTu/avatar_image/2015-01-23-14-47-15.jpg');
INSERT INTO `user` VALUES ('42', 'ghhhhh', '18569854123', '男', '123', '2015-1-23', 'http://192.168.1.100:8080/MeiTu/avatar_image/2015-01-23-14-52-48.jpg');
