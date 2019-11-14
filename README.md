# spring-boot分支

# 分支简介
[spring-anything](https://github.com/chloneda/spring-anything)项目的[spring boot](https://github.com/chloneda/spring-anything/tree/spring-boot)分支，使用Spring Boot框架，并结合当前热门、实用的技术进行集成，即Spring Boot集成druid数据库连接池，Spring Boot实现druid的动态数据源，实现定时任务schedule，并集成mybatis、hibernate等，如有错误，欢迎大家指正！


# modules说明

**注意：大部分module均依赖[spring-boot-with-common](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-common)，是该[spring boot](https://github.com/chloneda/spring-anything/tree/spring-boot)分支的公共基础类，包含实体类、DTO等，请先看该module**。

- [spring-boot](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot)：使用Spring Boot技术的实现的简单示例。

- [spring-boot-with-common](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-common)：spring-anything项目的公共基础类，如实体类、DTO等。

- [spring-boot-with-aop](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-aop)：Spring Boot使用AOP。

- [spring-boot-with-async](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-async)：Spring Boot使用异步线程池。

- [spring-boot-with-banner](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-banner)：修改Spring Boot项目启动图标示例。

- -[spring-boot-with-batch](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-batch)：Spring Boot使用批处理。

- [spring-boot-with-cache](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-cache)：Spring Boot项目使用cache缓存技术，提高查询效率。

- [spring-boot-with-docker](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-docker)：Spring Boot项目集成docker的示例。

- [spring-boot-with-druid](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-druid)：Spring Boot集成Druid数据库连接池。

- [spring-boot-with-dubbo](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-dubbo)：Spring Boot集成Dubbo示例。

- [spring-boot-with-dubbo-plugin](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-dubbo-plugin)：Spring Boot集成Dubbo示例。

- [spring-boot-with-dynamic-db](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-dynamic-db)：Spring Boot实现Druid的动态数据源。

- [spring-boot-with-echarts](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-echarts)：Spring Boot集成Echarts导出图片。

- [spring-boot-with-elasticsearch](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-elasticsearch)：Spring Boot集成Elasticsearch，并分别以Spring Data、Spring Data Elasticsearch Repositories的方式进行查询。

- [spring-boot-with-freemarker](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-freemarker)：Spring Boot集成Freemarker示例。

- [spring-boot-with-hello](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-hello)：Spring Boot第一个Hello World示例。

- [spring-boot-with-hibernate](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-hibernate)：Spring Boot集成Hibernate示例。

- [spring-boot-with-jdbcTemplate](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-jdbcTemplate)：Spring Boot使用原生的JdbcTemplate进行常见的增删改查操作。

- [spring-boot-with-jpa](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-jpa)：Spring Boot的JPA示例，并集成Swagger，便于调试。

- -[spring-boot-with-jwt](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-jwt)：Spring Boot集成JWT实现接口权限认证。

- -[spring-boot-with-kafka](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-kafka)：Spring Boot集成Kafka示例。

- [spring-boot-with-mongodb](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-mongodb)：Spring Boot集成MongodDB示例。

- [spring-boot-with-mybatis](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-mybatis)：Spring Boot集成Mybatis(全注解整合集成)示例。

- [spring-boot-with-mybatis-annotation](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-mybatis-annotation)：Spring Boot集成Mybatis示例。

- [spring-boot-with-quickstart](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-quickstart)：快速搭建Spring Boot的示例。

- -[spring-boot-with-rabbitmq](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-rabbitmq)：Spring Boot集成Rabbitmq示例。

- -[spring-boot-with-redis](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-redis)：Spring Boot集成Redis示例。

- [spring-boot-with-restful](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-restful)：Spring Boot实现Restful接口，实现CRUD基本功能。

- -[spring-boot-with-shiro](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-shiro)：Spring Boot集成Shiro权限管理。

- -[spring-boot-with-socketio](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-socketio)：Spring Boot集成SocketIO进行实时通讯。

- [spring-boot-with-schedule](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-schedule)：Spring Boot实现定时任务schedule。

- [spring-boot-with-swagger](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-swagger)：Spring Boot集成Swagger自动生成API文档，为我们提供了一套通过代码和注解自动生成文档的方法。

- -[spring-boot-with-thymeleaf](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-thymeleaf)：Spring Boot集成Thymeleaf构建web应用。

- [spring-boot-with-transaction](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-transaction)：Spring Boot使用Transaction事务。

- [spring-boot-with-websocket](https://github.com/chloneda/spring-anything/tree/spring-boot/spring-boot-with-websocket)：Spring Boot集成WebSocket进行实时通讯，它是 HTML5 开始提供的一种浏览器与服务器间进行全双工通讯的网络技术。


# 下载地址

[spring-anything](https://github.com/chloneda/spring-anything)项目下载地址有:

GitHub: [https://github.com/chloneda/spring-anything](https://github.com/chloneda/spring-anything)

Gitee: [https://gitee.com/chloneda/spring-anything](https://gitee.com/chloneda/spring-anything)


# 使用说明

## 下载

下载[spring-anything](https://github.com/chloneda/spring-anything)项目
```
git clone git@github.com:chloneda/spring-anything.git
```

下载指定分支
```
git clone -b 分支名 仓库地址

比如下载 spring-boot 分支，使用如下命令。
git clone -b spring-boot git@github.com:chloneda/spring-anything.git
```

## 使用

[spring-anything](https://github.com/chloneda/spring-anything)项目追求简单快捷、开箱即用的原则，下载工程之后，只需更改相应的配置如MySQL等，启动Spring Boot的main方法，即可运行！同时也会结合Spring Boot相关知识帮助大家快速吸收，快速上手！


# 专题文章


# 维护者
[Chloneda](https://github.com/chloneda/)

[Personal Blog](https://chloneda.github.io/)


# 相关书籍
[Java Persistence with MyBatis 3](https://github.com/chloneda/spring-anything/blob/master/resources/Java%20Persistence%20with%20MyBatis%203.pdf)

[阿里巴巴JAVA开发手册](https://github.com/chloneda/spring-anything/blob/master/resources/%E9%98%BF%E9%87%8C%E5%B7%B4%E5%B7%B4JAVA%E5%BC%80%E5%8F%91%E6%89%8B%E5%86%8C.pdf)


