# Dubbo学习

## 一、架构

![dubbo结构图](http://dubbo.apache.org/books/dubbo-user-book/sources/images/dubbo-architecture.jpg)


1.   服务容器(Container）负责启动、加载及运行服务提供者（Provider）
2.   服务提供者在启动时,告诉注册中心(Registry)自己的服务
3.   服务消费者(Consumer)在启动时，向注册中心d明月自己需要的服务
4.   注册中心将返回提供者地址列表给消费者，如果有变更，注册中心将基于长连接推送b变更数据给消费者
5.   消费者从提供者地址列表中基于软负载均衡算法,选择一台提供者进行调用,如果调用失败，则选择另一台调用
6.   x消费者和提供者，在内存中累计调用次数和时间,定时每分钟发送一次统计数据到监控中心(Monitor)

## 二、XML配置重要标签

| 标签  |   标签描述    |   特殊说明    |
| -------------------------------------- |-------------------------------------- |-------------------------------------- |
|\<dubbo:application />| 用于配置当前应用信息，不管该应用是提供者还是消费者 | 应用配置  |
|\<dubbo:service/>| 用于暴露一个服务，定义服务的元信息，一个服务可以用多个协议暴露，一个服务也可以注册到多个注册中心  |  服务配置 |
|\<dubbo:reference/>|   用于创建一个远程服务代理，一个引用可以指向多个注册中心| 引用配置 |
|\<dubbo:protocol/>|  用于配置提供服务的协议信息，协议由提供方指定，消费方被动接受| 协议配置 |
|\<dubbo:module/>|  用于配置当前模块信息，可选| 模块配置 |
|\<dubbo:registry/>|    用于配置连接注册中心相关信息| 注册中心配置  |
|\<dubbo:monitor/>|用于配置连接监控中心相关信息，可选| 监控中心配置  |
|\<dubbo:provider/>|当 ProtocolConfig 和 ServiceConfig 某属性没有配置时，采用此缺省值，可选| 提供方配置 |
|\<dubbo:consumer/>| 当 ReferenceConfig 某属性没有配置时，采用此缺省值，可选| 消费方配置 |
|\<dubbo:method/>|用于 ServiceConfig 和 ReferenceConfig 指定方法级的配置信息| 方法配置|
|\<dubbo:argument/>|用于指定方法参数配置|参数配置|

