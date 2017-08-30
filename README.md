# ibdaasdemo
本项目用于演示如何对接云蜂科技的风控api接口。

项目采用maven工程构建。

## 本项目有以下功能：

- 风控模型数据的组装
- 风控模型计算接口的调用

> 注：借记卡，运营商是必填数据，其他为选填。确保借记卡，运营商，信用卡（如果有）三者对应的是同一个人，即：手机号在三个地方保持一致。

## 使用步骤如下：

1. 打开RMDemo.java文件，修改测试用到的变量appKey、ak、sk、url、以及回调URL。
2. 打开SampleData.java文件，参照实例组装真实的模型数据。
3. 执行RMDemo.java类，执行风控接口测试。

## 目录结构及文件说明：

- com.ibeesaas.riskmgm.demo
    - SampleData：风控模型数据组装实例
    - RMDemo：风控模型接口调用实例
- com.ibeesaas.riskmgm.demo.util
    - Base64Util Base64编码解码工具类
    - ZipUtil 解压缩工具类
- com.ibeesaas.riskmgm.demo.bean
    - CarrierReport 风控模型运营商报告实体类
    - CreditCardInfo 风控模型信用卡信息实体类
    - DebitCardInfo 风控模型储蓄卡信息实体类
    - JDReport 风控模型京东报告实体类
    - TBReport 风控模型运营商数据实体类
    - RskMgmentEntity 风控模型淘宝报告实体类

## API Doc URL:

https://doc.ibeesaas.com/daas
> 登录密码，请联系云蜂商务：bd@ibeesaas.com
