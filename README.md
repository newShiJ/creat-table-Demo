# creat-table-Demo

### 这个是我之前写的自动建表工具的使用demo

我这里将打包的自动建表工具放在了lib目录下，pom.xml也写了如何导入本地jar的方法   
https://github.com/newShiJ/table-create 是我写的工具地址 其中master 分支是最初版本带有实体以及控制层代码，jar分支是真正进行打包的代码


### 不足之处
*	目前只支持 Mysql 数据库
* 	Mysql 数据库中仅支持 varchar，bigint ，int ，double，float 等常用类型对应的java类型
*  需要与 Spring 进行集成，因为使用的初衷就是为了项目启动时自动建表，所以使用了 Spring 的一些 API
