* 数据持久层是的目的是在java对象与数据库之间建立映射，也就是说它的作用是将某一个Java类对应到数据库中的一张表。在我们的项目中，就将创建一个实体类User映射到数据库的user表，表中的每个字段对应于实体类的每个属性。而之前配置的JPA的作用就是帮助我们完成类到数据表的映射。
    * repository: 存放一些数据访问类（也就是一些能操纵数据库的类）的包，比如存放能对user表进行增删改查的类
    * domain：存放实体类的包，比如User类，其作为对应数据库user表的一个实体类
* 业务逻辑层的作用是处理业务逻辑。比如在本项目中，我们就在业务逻辑层实现登录注册的逻辑，像是判断是否有用户名重复，密码是否正确等逻辑
    * service: 存放业务逻辑接口的包
    * serviceImpl: 存放业务逻辑实现类的包，其中的类实现service中的接口
* 控制层的作用是接收视图层的请求并调用业务逻辑层的方法。比如视图层请求登录并发来了用户的账号和密码，那么控制层就调用业务逻辑层的登录方法，并将账号密码作为参数传入，在将结果返回给视图层。
    * controller: 存放控制器的包。比如UserController
* 视图层的作用是展现数据，由于本项目写的是纯后端，就不展开解释视图层了

1.@RequestBody主要用来接收前端传递给后端的json字符串中的数据的(请求体中的数据的),在后端的同一个接收方法里，@RequestBody与@RequestParam()可以同时使用，@RequestBody最多只能有一个，而@RequestParam()可以有多个。 注解@RequestBody接收的参数是来自requestBody中，即请求体。一般用于处理非 Content-Type: application/x-www-form-urlencoded编码格式的数据，比如：application/json、application/xml等类型的数据
2.@RequestParam用来处理 Content-Type 为 application/x-www-form-urlencoded 编码的内容，Content-Type默认为该属性。@RequestParam也可用于其它类型的请求，例如：POST、DELETE等请求。

