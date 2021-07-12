# @PropertySource 指定 yml 格式的配置文件

@PropertySource 本身 **只** 支持 `.properties` 格式的文件，后缀可以不为 `.properties`，但是内容格式得按照 `.properties` 的格式来的

例如:

```properties
myp.name=lixi
myp.age=8
```

```java
/**
* 当直接指定 .properties 文件的时候，可以正常拿到值
*/
@PropertySource(value = "classpath:my.properties")

/**
* 当直接指定 .yml 文件的时候
* 并不能拿到文件中的属性的值，所有的引用类型为 `null`，基本类型为其默认值
*/
@PropertySource(value = "classpath:my.yml")
```

如果想要 `@PropertySource` 读取 `.yml` 格式的文件需要自定义 `YamlPropertySourceFactory`

yml 文件格式

```yaml
myy:
  name: lixifun
  age: 88
```

```java
@PropertySource(value = "classpath:my.yml", factory = YamlPropertySourceFactory.class)
```

#### 具体内容可以 clone 项目后运行测试



