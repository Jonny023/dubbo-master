# Dubbo入门

### 注意事项
* `Spring`的`xml`配置文件中的头部文件`xsi:schemaLocation`必须成对出现，例如
    ```xml
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd
    ```

* `spring`和`dubbo`扫描注解注意事项
    * 混合使用需要同时添加`spring`和`dubbo`扫描配置
    ```xml
    <dubbo:annotation package="com.jonny.consumer"/>
    <context:component-scan base-package="com.jonny.consumer"/>
    ```
    * 如果只用某一种注解扫描可以只配置一种
    * 通过注解扫描时如果服务提供者有多版本，则消费者需要指定版本号，如：`@Reference(version = "2.0")`