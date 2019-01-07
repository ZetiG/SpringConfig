# SpringConfig
SpringConfig:高可用服务配置中心

从远程git上读取配置
config-server:将git上的配置文件转换为web接口,并注册到eureka,从而达到高可用

config-client:从eureka上获取config-server服务

refresh: @RefreshScope //使用该注解的类,会在接到SpringCloud配置中心配置刷新的时候,自动更新配置到该类内对应字段上

webhook:WebHook是当某个事件发生时，通过发送http post请求的方式来通知信息接收方,从而达到及时推送
