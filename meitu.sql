/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : meitu

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2015-01-29 22:02:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT,
  `publisher_id` int(11) DEFAULT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `praise_count` int(11) DEFAULT '0',
  `last_update_time` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('6', '41', '空军建军节', '2015-01-27 14:38', '0', '2015-01-27 14:38', 'ADD');
INSERT INTO `article` VALUES ('7', '41', '哈哈哈太累了', '2015-01-27 14:54', '0', '2015-01-27 14:54', 'ADD');
INSERT INTO `article` VALUES ('8', '41', '看OK了了啦咯啦咯啦咯考虑考虑记录考虑考虑啦啦啦', '2015-01-27 15:37', '0', '2015-01-27 15:37', 'ADD');
INSERT INTO `article` VALUES ('9', '41', '我以为我可以图图哦了啦咯考虑兔兔图图图吐了考虑考虑', '2015-01-27 15:38', '0', '2015-01-27 15:38', 'ADD');
INSERT INTO `article` VALUES ('10', '41', '痛苦啦啦啦考虑考虑吐了', '2015-01-27 15:39', '0', '2015-01-27 15:39', 'ADD');
INSERT INTO `article` VALUES ('11', '41', '提墨迹老K来咯哦哦陆续太危险了旅途考虑考虑', '2015-01-27 15:59', '0', '2015-01-27 15:59', 'ADD');
INSERT INTO `article` VALUES ('12', '41', '', '2015-01-27 16:02', '0', '2015-01-27 16:02', 'ADD');
INSERT INTO `article` VALUES ('13', '41', 'yyyy', '2015-01-27 16:04', '0', '2015-01-27 16:04', 'ADD');
INSERT INTO `article` VALUES ('14', '41', '', '2015-01-27 16:06', '0', '2015-01-27 16:06', 'ADD');
INSERT INTO `article` VALUES ('15', '41', 'ggghvvgg想我咯啦咯了掏空了快乐', '2015-01-27 16:08', '0', '2015-01-27 16:08', 'ADD');
INSERT INTO `article` VALUES ('16', '41', '啊咯Mook摸摸弄来咯哦得得默默地的考虑考虑啦啦啦考虑考虑啦啦啦考虑考虑啦啦啦阿拉巴all安咯cfd考虑考虑饿了就', '2015-01-27 21:10', '0', '2015-01-27 21:10', 'ADD');
INSERT INTO `article` VALUES ('17', '41', '流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生命的尽头,你将什么也带不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而 的尽头,你将什么也 流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生 生命的尽头,你将什么也带不走,除了那份美好而温馨的 流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温 忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生命的尽头,你将什么也带不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而 的尽头,你将什么也带不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 那份美好而温馨的回忆. 的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 那份美好而温馨的回忆. 的尽头,你将什么也带不走,除了那份美好而温馨的回忆.', '2015-01-27 21:15', '0', '2015-01-27 21:15', null);
INSERT INTO `article` VALUES ('18', '41', '流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生命的尽头,你将什么也带不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而 的尽头,你将什么也 流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那 当岁月流逝,到了生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 美好而温馨的回忆. 当岁月流逝,到了生 当岁月流逝,到了生命的尽头,你将什么也带不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而 的尽头,你将什么也带不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 那份美好而温馨的回忆. 的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 不走,除 当岁月流逝,到 不 生命的尽头,你将什么也带不走,除了那份美好而温馨的回忆. 那份美好而温馨的回忆. 的尽头,你将什么也带不走,除了那份美好而温馨的回忆.', '2015-01-27 21:16', '0', '2015-01-27 21:16', null);
INSERT INTO `article` VALUES ('19', '41', '啦啦啦', '2015-01-27 21:22', '0', '2015-01-27 21:22', null);
INSERT INTO `article` VALUES ('20', '41', '', '2015-01-27 21:22', '0', '2015-01-27 21:22', null);
INSERT INTO `article` VALUES ('21', '41', '', '2015-01-27 21:22', '0', '2015-01-27 21:22', null);
INSERT INTO `article` VALUES ('22', '41', '', '2015-01-27 21:23', '0', '2015-01-27 21:23', null);
INSERT INTO `article` VALUES ('23', '41', '', '2015-01-27 21:23', '0', '2015-01-27 21:23', null);
INSERT INTO `article` VALUES ('24', '41', '', '2015-01-27 21:23', '0', '2015-01-27 21:23', null);
INSERT INTO `article` VALUES ('25', '41', '', '2015-01-27 21:23', '0', '2015-01-27 21:23', null);
INSERT INTO `article` VALUES ('26', '41', '', '2015-01-27 21:24', '0', '2015-01-27 21:24', null);
INSERT INTO `article` VALUES ('27', '41', '', '2015-01-27 21:24', '0', '2015-01-27 21:24', null);
INSERT INTO `article` VALUES ('28', '41', '', '2015-01-27 21:24', '0', '2015-01-27 21:24', null);
INSERT INTO `article` VALUES ('29', '41', '', '2015-01-28 21:06', '0', '2015-01-28 21:06', 'ADD');
INSERT INTO `article` VALUES ('30', '41', '', '2015-01-28 21:06', '0', '2015-01-28 21:06', 'ADD');
INSERT INTO `article` VALUES ('31', '41', '', '2015-01-29 20:34', '0', '2015-01-29 20:34', 'ADD');
INSERT INTO `article` VALUES ('32', '41', '', '2015-01-29 20:36', '0', '2015-01-29 20:36', 'ADD');

-- ----------------------------
-- Table structure for article_img
-- ----------------------------
DROP TABLE IF EXISTS `article_img`;
CREATE TABLE `article_img` (
  `image_id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`image_id`,`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8;

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
INSERT INTO `article_img` VALUES ('46', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_1.jpg');
INSERT INTO `article_img` VALUES ('47', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_2.gif');
INSERT INTO `article_img` VALUES ('48', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_3.jpg');
INSERT INTO `article_img` VALUES ('49', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_4.jpg');
INSERT INTO `article_img` VALUES ('50', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_5.jpg');
INSERT INTO `article_img` VALUES ('51', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_6.gif');
INSERT INTO `article_img` VALUES ('52', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_7.jpg');
INSERT INTO `article_img` VALUES ('53', '16', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-10-39_8.jpg');
INSERT INTO `article_img` VALUES ('54', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_1.jpg');
INSERT INTO `article_img` VALUES ('55', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_2.jpg');
INSERT INTO `article_img` VALUES ('56', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_3.jpg');
INSERT INTO `article_img` VALUES ('57', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_4.jpg');
INSERT INTO `article_img` VALUES ('58', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_5.jpg');
INSERT INTO `article_img` VALUES ('59', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_6.jpg');
INSERT INTO `article_img` VALUES ('60', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_7.jpg');
INSERT INTO `article_img` VALUES ('61', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_8.jpg');
INSERT INTO `article_img` VALUES ('62', '18', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-16-31_9.jpg');
INSERT INTO `article_img` VALUES ('63', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_1.jpg');
INSERT INTO `article_img` VALUES ('64', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_2.jpg');
INSERT INTO `article_img` VALUES ('65', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_3.jpg');
INSERT INTO `article_img` VALUES ('66', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_4.jpg');
INSERT INTO `article_img` VALUES ('67', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_5.jpg');
INSERT INTO `article_img` VALUES ('68', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_6.jpg');
INSERT INTO `article_img` VALUES ('69', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_7.jpg');
INSERT INTO `article_img` VALUES ('70', '19', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-17_8.jpg');
INSERT INTO `article_img` VALUES ('71', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_1.jpg');
INSERT INTO `article_img` VALUES ('72', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_2.gif');
INSERT INTO `article_img` VALUES ('73', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_3.jpg');
INSERT INTO `article_img` VALUES ('74', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_4.jpg');
INSERT INTO `article_img` VALUES ('75', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_5.jpg');
INSERT INTO `article_img` VALUES ('76', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_6.gif');
INSERT INTO `article_img` VALUES ('77', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_7.gif');
INSERT INTO `article_img` VALUES ('78', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_8.jpg');
INSERT INTO `article_img` VALUES ('79', '20', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-44_9.jpg');
INSERT INTO `article_img` VALUES ('80', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_1.jpg');
INSERT INTO `article_img` VALUES ('81', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_2.jpg');
INSERT INTO `article_img` VALUES ('82', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_3.jpg');
INSERT INTO `article_img` VALUES ('83', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_4.jpg');
INSERT INTO `article_img` VALUES ('84', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_5.jpg');
INSERT INTO `article_img` VALUES ('85', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_6.jpg');
INSERT INTO `article_img` VALUES ('86', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_7.jpg');
INSERT INTO `article_img` VALUES ('87', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_8.jpg');
INSERT INTO `article_img` VALUES ('88', '21', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-22-55_9.jpg');
INSERT INTO `article_img` VALUES ('89', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_1.jpg');
INSERT INTO `article_img` VALUES ('90', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_2.jpg');
INSERT INTO `article_img` VALUES ('91', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_3.jpg');
INSERT INTO `article_img` VALUES ('92', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_4.jpg');
INSERT INTO `article_img` VALUES ('93', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_5.jpg');
INSERT INTO `article_img` VALUES ('94', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_6.jpg');
INSERT INTO `article_img` VALUES ('95', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_7.jpg');
INSERT INTO `article_img` VALUES ('96', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_8.jpg');
INSERT INTO `article_img` VALUES ('97', '22', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-08_9.jpg');
INSERT INTO `article_img` VALUES ('98', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_1.jpg');
INSERT INTO `article_img` VALUES ('99', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_2.jpg');
INSERT INTO `article_img` VALUES ('100', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_3.jpg');
INSERT INTO `article_img` VALUES ('101', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_4.jpg');
INSERT INTO `article_img` VALUES ('102', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_5.jpg');
INSERT INTO `article_img` VALUES ('103', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_6.jpg');
INSERT INTO `article_img` VALUES ('104', '23', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-37_7.jpg');
INSERT INTO `article_img` VALUES ('105', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_1.jpg');
INSERT INTO `article_img` VALUES ('106', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_2.gif');
INSERT INTO `article_img` VALUES ('107', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_3.jpg');
INSERT INTO `article_img` VALUES ('108', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_4.jpg');
INSERT INTO `article_img` VALUES ('109', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_5.jpg');
INSERT INTO `article_img` VALUES ('110', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_6.gif');
INSERT INTO `article_img` VALUES ('111', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_7.gif');
INSERT INTO `article_img` VALUES ('112', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_8.jpg');
INSERT INTO `article_img` VALUES ('113', '24', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-49_9.jpg');
INSERT INTO `article_img` VALUES ('114', '25', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-23-54_1.jpg');
INSERT INTO `article_img` VALUES ('115', '26', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-24-00_1.gif');
INSERT INTO `article_img` VALUES ('116', '27', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-24-08_1.jpg');
INSERT INTO `article_img` VALUES ('117', '28', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-27-21-24-15_1.jpg');
INSERT INTO `article_img` VALUES ('118', '29', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-28-21-06-31_1.jpg');
INSERT INTO `article_img` VALUES ('119', '29', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-28-21-06-31_2.jpg');
INSERT INTO `article_img` VALUES ('120', '29', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-28-21-06-31_3.jpg');
INSERT INTO `article_img` VALUES ('121', '30', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-28-21-06-40_1.jpg');
INSERT INTO `article_img` VALUES ('122', '31', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-29-20-34-14_1.jpg');
INSERT INTO `article_img` VALUES ('123', '31', 'http://10.6.4.105:8080/MeiTu/article_image/2015-01-29-20-34-14_2.jpg');
INSERT INTO `article_img` VALUES ('124', '32', 'http://192.168.1.102:8080/MeiTu/article_image/2015-01-29-20-36-48_1.jpg');
INSERT INTO `article_img` VALUES ('125', '32', 'http://192.168.1.102:8080/MeiTu/article_image/2015-01-29-20-36-48_2.jpg');
INSERT INTO `article_img` VALUES ('126', '32', 'http://192.168.1.102:8080/MeiTu/article_image/2015-01-29-20-36-48_3.jpg');
INSERT INTO `article_img` VALUES ('127', '32', 'http://192.168.1.102:8080/MeiTu/article_image/2015-01-29-20-36-48_4.jpg');
INSERT INTO `article_img` VALUES ('128', '32', 'http://192.168.1.102:8080/MeiTu/article_image/2015-01-29-20-36-48_5.jpg');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) DEFAULT NULL,
  `publisher_id` int(11) DEFAULT NULL,
  `comment_content` varchar(255) DEFAULT NULL,
  `comment_time` varchar(255) DEFAULT NULL,
  `reply_someone_id` int(11) DEFAULT NULL,
  `reply_someone_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', '32', '41', 'ggg', '2015-01-29 21:29', '0', '');
INSERT INTO `comment` VALUES ('2', '32', '41', 'vgg', '2015-01-29 21:30', '0', '');
INSERT INTO `comment` VALUES ('3', '32', '41', 'ddd', '2015-01-29 21:32', '0', '');
INSERT INTO `comment` VALUES ('4', '32', '41', 'vgg', '2015-01-29 21:33', '0', '');
INSERT INTO `comment` VALUES ('5', '32', '41', 'vgg', '2015-01-29 21:35', '0', '');
INSERT INTO `comment` VALUES ('6', '32', '41', 'fff', '2015-01-29 21:42', '0', '');
INSERT INTO `comment` VALUES ('7', '32', '41', '图片', '2015-01-29 21:57', '0', '');
INSERT INTO `comment` VALUES ('8', '32', '41', '庄园', '2015-01-29 21:58', '0', '');
INSERT INTO `comment` VALUES ('9', '32', '41', ' 考虑考虑', '2015-01-29 21:58', '41', '测');

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
