# 🏠 宿舍管理系统 (Dorm Management System)

> 基于 Spring Boot + MyBatis 的宿舍信息管理系统，提供完整的宿舍管理解决方案。

## ✨ 功能特性

- 🏢 **楼栋管理** - 楼栋信息维护与查询
- 🚪 **房间管理** - 房间分配与状态管理
- 👨‍🎓 **学生管理** - 学生基本信息管理
- 📝 **入住登记** - 学生入住、退宿记录
- 🧹 **卫生检查** - 宿舍卫生评分与记录
- ⚠️ **违纪记录** - 违纪行为登记与查询
- 📊 **数据统计** - 多维度统计分析

## 🛠️ 技术栈

| 类别 | 技术 |
|------|------|
| 后端框架 | Spring Boot |
| ORM 框架 | MyBatis |
| 数据库 | MySQL |
| 构建工具 | Maven |
| 前端 | HTML / CSS / JavaScript |
| 开发语言 | Java |

## 📂 项目结构

```
dorm-system/
├── src/main/java/com/example/dormsystem/
│   ├── DormSystemApplication.java       # 启动类
│   ├── controller/                       # 接口层
│   │   ├── BuildingController.java
│   │   ├── RoomController.java
│   │   ├── StudentController.java
│   │   ├── CheckinController.java
│   │   ├── HygieneController.java
│   │   ├── ViolationController.java
│   │   └── StatsController.java
│   ├── mapper/                           # 数据访问层
│   │   ├── BuildingMapper.java
│   │   ├── RoomMapper.java
│   │   ├── StudentMapper.java
│   │   ├── CheckinMapper.java
│   │   ├── HygieneMapper.java
│   │   └── ViolationMapper.java
│   ├── entity/                           # 实体类
│   │   ├── Building.java
│   │   ├── Room.java
│   │   ├── Student.java
│   │   ├── CheckinRecord.java
│   │   ├── HygieneCheck.java
│   │   └── Violation.java
│   └── common/
│       └── R.java                        # 统一返回封装
├── src/main/resources/
│   ├── application.yml                   # 配置文件
│   ├── static/
│   │   └── index.html                    # 前端页面
│   └── mapper/                           # MyBatis XML
└── pom.xml                               # Maven 依赖
```

## 🚀 快速开始

### 环境要求

- JDK 1.8+
- Maven 3.6+
- MySQL 5.7+

### 安装步骤

#### 1. 克隆项目

```bash
git clone https://github.com/yann1025/dorm-system.git
cd dorm-system
```

#### 2. 创建数据库

```sql
CREATE DATABASE dorm_system DEFAULT CHARACTER SET utf8mb4;
```

#### 3. 修改配置

编辑 `src/main/resources/application.yml`，修改数据库连接信息为你自己的：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/dorm_system
    username: your_username
    password: your_password
```

#### 4. 运行项目

```bash
# Windows
mvnw spring-boot:run

# Mac / Linux
./mvnw spring-boot:run
```

访问：http://localhost:8080

## 📡 主要 API 接口

| 接口路径 | 功能 |
|---------|------|
| `/api/buildings` | 楼栋管理 |
| `/api/rooms` | 房间管理 |
| `/api/students` | 学生管理 |
| `/api/checkins` | 入住登记 |
| `/api/hygiene` | 卫生检查 |
| `/api/violations` | 违纪记录 |
| `/api/stats` | 数据统计 |

## 📸 项目截图
<img width="1647" height="887" alt="image" src="https://github.com/user-attachments/assets/f19859c4-8c87-4ff4-a25b-c8ad9b9d0f01" />
<img width="1647" height="906" alt="image" src="https://github.com/user-attachments/assets/c1eb8a2f-d836-495d-86d8-d7b9c4b77192" />
<img width="1650" height="888" alt="image" src="https://github.com/user-attachments/assets/15d71e24-9f5c-40db-891d-cffbd182f597" />
<img width="1640" height="867" alt="image" src="https://github.com/user-attachments/assets/d95823a0-1330-4a15-baf6-d73583d7a9bb" />
<img width="1648" height="867" alt="image" src="https://github.com/user-attachments/assets/8dd59ee0-e3d4-4a98-98f8-2a45f2b82fa6" />
<img width="1633" height="882" alt="image" src="https://github.com/user-attachments/assets/97c7d375-759e-4619-b7f7-3993f938cd9c" />
<img width="1649" height="902" alt="image" src="https://github.com/user-attachments/assets/117ac390-baed-4464-a9f1-74d2e69446e6" />
<img width="1636" height="875" alt="image" src="https://github.com/user-attachments/assets/2b5c2f64-625e-4764-9e7b-d949910d31dc" />


## 🎯 项目亮点

- ✅ 采用 RESTful API 设计规范
- ✅ 统一返回结果封装（R.java）
- ✅ 清晰的 MVC 三层架构
- ✅ MyBatis 灵活的 SQL 映射
- ✅ Spring Boot 快速开发

## 👤 作者

**胡朝研**

- 🌐 个人主页: [httphuzhaoyan.org](https://httphuzhaoyan.org)
- 💻 GitHub: [@yann1025](https://github.com/yann1025)
- 📧 Email: Hzywlkq@qq.com
- 🏫 学校: 沈阳航空航天大学 · 人工智能学院

## 📄 License

本项目采用 [MIT License](LICENSE) 开源协议。

---

⭐ 如果这个项目对你有帮助，欢迎给个 Star！
