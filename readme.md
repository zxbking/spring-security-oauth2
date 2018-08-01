# spring security oauth2

张锡斌 2018/8/1

## 1 前言

### 1.1 spring security

### 1.2 oauth2

## 2 鉴权方式

### 2.1 password 账号密码

#### 2.1.1 流程图解

#### 2.1.2 例子

http://localhost:8080/oauth/token?username=user_1&password=123456&grant_type=password&scope=select&client_id=client_2&client_secret=123456 

### 2.2 client 客户端鉴权

#### 2.2.1 流程图解

#### 2.2.2 例子

http://localhost:8080/oauth/token?grant_type=client_credentials&scope=select&client_id=client_3&client_secret=123456 

### 2.3 authorization code 鉴权码鉴权

#### 2.3.1 流程图解

#### 2.3.2 例子

http://localhost:8080/oauth/authorize?response_type=code&client_id=client_1&redirect_uri=http://baidu.com 



http://localhost:8080/oauth/token?grant_type=authorization_code&code=xlKOFE&client_id=client_3&client_secret=123456&redirect_uri=http://baidu.com     (post)



http://localhost:8080/oauth/check_token?token=f94c04d6-1029-41cb-b6ff-7b70c5d05c92 

## 3 项目搭建介绍

### 3.1 依赖

### 3.2 关键类

## 4 参考资料

https://www.jianshu.com/p/e6655328b211

https://segmentfault.com/a/1190000010540911?utm_source=tag-newest

http://wiki.open.qq.com/wiki/website/%E4%BD%BF%E7%94%A8Authorization_Code%E8%8E%B7%E5%8F%96Access_Token

http://www.ruanyifeng.com/blog/2014/05/oauth_2_0.html

https://blog.csdn.net/u011537073/article/details/52108369

https://blog.csdn.net/u013887008/article/details/80616422

https://segmentfault.com/a/1190000012275317

https://www.jianshu.com/p/e6655328b211