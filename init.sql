

CREATE DATABASE IF NOT EXISTS test_sharding
    DEFAULT CHARACTER SET utf8
     DEFAULT COLLATE utf8_bin;



USE
test_sharding;

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for t_user_0
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911643464158937089 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_1
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_2
-- ----------------------------
DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_3
-- ----------------------------
DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911621097244327938 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_4
-- ----------------------------
DROP TABLE IF EXISTS `t_user_4`;
CREATE TABLE `t_user_4`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911621097244327938 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_5
-- ----------------------------
DROP TABLE IF EXISTS `t_user_5`;
CREATE TABLE `t_user_5`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911656710223953921 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_6
-- ----------------------------
DROP TABLE IF EXISTS `t_user_6`;
CREATE TABLE `t_user_6`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911656710223953921 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_7
-- ----------------------------
DROP TABLE IF EXISTS `t_user_7`;
CREATE TABLE `t_user_7`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911656710223953921 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_8
-- ----------------------------
DROP TABLE IF EXISTS `t_user_8`;
CREATE TABLE `t_user_8`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911668726116384769 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_9
-- ----------------------------
DROP TABLE IF EXISTS `t_user_9`;
CREATE TABLE `t_user_9`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911668725424324610 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

SET
FOREIGN_KEY_CHECKS = 1;

USE
test-sharding;

SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;


-- ----------------------------
-- Table structure for t_user_0
-- ----------------------------
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911643464158937089 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_1
-- ----------------------------
DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_2
-- ----------------------------
DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_3
-- ----------------------------
DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911621097244327938 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_4
-- ----------------------------
DROP TABLE IF EXISTS `t_user_4`;
CREATE TABLE `t_user_4`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911621097244327938 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_5
-- ----------------------------
DROP TABLE IF EXISTS `t_user_5`;
CREATE TABLE `t_user_5`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911656710223953921 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_6
-- ----------------------------
DROP TABLE IF EXISTS `t_user_6`;
CREATE TABLE `t_user_6`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911656710223953921 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_7
-- ----------------------------
DROP TABLE IF EXISTS `t_user_7`;
CREATE TABLE `t_user_7`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911656710223953921 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_8
-- ----------------------------
DROP TABLE IF EXISTS `t_user_8`;
CREATE TABLE `t_user_8`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911668726116384769 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_user_9
-- ----------------------------
DROP TABLE IF EXISTS `t_user_9`;
CREATE TABLE `t_user_9`
(
    `user_id`  bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
    `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
    `sex`      tinyint(0) NULL DEFAULT NULL COMMENT '性别',
    `remark`   varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 911668725424324610 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户' ROW_FORMAT = Dynamic;

SET
FOREIGN_KEY_CHECKS = 1;
