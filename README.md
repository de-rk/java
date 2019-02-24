# Java
## 2018年12月11号开始的培训机构学习文档
`第一天参加培训时出现的一个错误，编码格式问题`
**错误：编码GDK不可映射字符**

>javac -encoding UTF-8 Test.java
-----------

### Java JDBC连接数据库
`ResultSet rs` `Coonection conn` `PreparedStatement ps`
```java
//加载驱动类
Class.forName(driver);

//连接数据库
conn=DriverManager.getConnection(url,user,password);

//预编译sql语句
ps=conn.preparedStatement(sql)

//设置查询条件
for (int i=0;i<oj.length;i++)				
    ps.setString(i+1, oj[i].toString())

//执行查询并返还结果集
rs=ps.executeQurey
return rs
```
```sql
Oracle plsql
--select--
select * from dbuser

--update--
update dbuser set password='admin' where userid=1

--insert--
insert into dbuser(userid,uname,password) values(1,'Jerry','admin')

--alter--
alter table dbuser add(hiredate varchar(20))

--delete--
不准delete，只能把isdelete的值修改为1
```

[github franch](https://github.com/Kunena/Kunena-Forum/wiki/Create-a-new-branch-with-git-and-manage-branches)
