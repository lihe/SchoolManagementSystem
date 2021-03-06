# SchoolManagementSystem

## 前言

此项目为《软件工程》课程设计，要求实现一个基本的学生教务系统，项目时间跨度为一个月。

开发环境为Netbeans8.2 + MySql + phpMyadmin + JDK1.8

SchoolManagement为完整程序包

schoolmanagement.sql为数据库文件

SchoolManagement-1.0.exe为安装文件

项目开发报告文件中包含了所有的开发文件

```java
DriverManager.getConnection("jdbc:mysql://localhost/schoolmanagement","root","");
```

为程序源文件中据库连接语句

配置好数据库后并安装程序即可运行

## 基本功能

### 登录功能

* 根据用户不同的身份进入不同的主界面
* 检测用户名密码是否错误

### 学生功能

* 查询考试安排
* 查询成绩

### 教师功能

* 录入学生成绩
* 编辑教师信息
* 创建、编辑学生学籍

### 管理员功能

* 管理员能够创建
* 创建、编辑用户
* 创建课程
* 创建班级
* 创建、编辑学生学籍
* 创建、编辑考试

## 项目文件

### 程序文件

![Snipaste_2020-05-13_16-10-32](https://cdn.jsdelivr.net/gh/lihe/Pic/img/20200605212159.jpg)

| 编号 | 程序文件名称      | 说明                             |
| ---- | ----------------- | -------------------------------- |
| 1    | background.jpg    | 程序的背景图片                   |
| 2    | classes.java      | 实现了管理员创建、编辑课程的功能 |
| 3    | exam.java         | 实现了管理员创建、编辑考试的功能 |
| 4    | login.java        | 实现了软件的登录功能             |
| 5    | main.java         | 实现了软件的管理员功能主界面     |
| 6    | marks.java        | 实现了老师录入学生成绩的功能     |
| 7    | start.java        | 实现了软件的开始界面             |
| 8    | startpic.png      | 开始界面的背景图片               |
| 9    | student.java      | 实现了学生学籍注册、编辑功能     |
| 10   | studentexam.java  | 实现了学生查询考试安排功能       |
| 11   | studentmarks.java | 实现了学生查询成绩功能           |
| 12   | studentmain.java  | 实现了软件学生功能主界面         |
| 13   | subject.java      | 实现了管理员创建、编辑学科功能   |
| 14   | teacher.java      | 实现了注册、编辑教师信息功能     |
| 15   | teachermain.java  | 实现了软件学生功能主界面         |
| 16   | user.java         | 实现了管理员创建、编辑用户功能   |

### 数据文件

![Snipaste_2020-05-14_10-53-12](https://cdn.jsdelivr.net/gh/lihe/Pic/img/20200605223713.jpg)

| 编号 | 数据文件名称 | 说明             |
| ---- | ------------ | ---------------- |
| 1    | class        | 班级相关信息     |
| 2    | exam         | 考试相关信息     |
| 3    | marks        | 学生成绩相关信息 |
| 4    | student      | 学生学籍相关信息 |
| 5    | subject      | 课程相关信息     |
| 6    | teacher      | 教师相关信息     |
| 7    | user         | 软件用户相关信息 |

## P.S

如果觉得不错，记得给个Star⭐

打赏一下，生活更好！🤑

![](https://cdn.jsdelivr.net/gh/lihe/Pic/img/20200606003724.jpg)



