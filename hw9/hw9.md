# 需求变更报告 #
姓名：昝妍 <br>
学号：1601214481 <br>
日期：2017/05/18 <br>
>内容: <br>
重新进行分析和设计, 应对甲方变动的需求。<br>
>任务:
Github课程库中一份补充开发文档, 注明本次开发的原因, 分析模型和设计模型做了何种改动。<br>
提交截止: 2017年5月31日23:55<br>

<br>甲方需求说明书：<br>
[甲方需求说明书]("https://github.com/liberion1994/oo/blob/master/%E4%BD%9C%E4%B8%9A2/%E4%BD%9C%E4%B8%9A2-%E5%9B%BE%E4%B9%A6%E4%BA%A4%E6%98%93%E5%B9%B3%E5%8F%B0%E7%9A%84%E5%8A%9F%E8%83%BD%E9%9C%80%E6%B1%82.md")<br>

[甲方需求变更](https://github.com/liberion1994/oo/blob/master/%E4%BD%9C%E4%B8%9A8/%E5%9B%BE%E4%B9%A6%E4%BA%A4%E6%98%93%E5%B9%B3%E5%8F%B0%EF%BC%88%E9%9C%80%E6%B1%82%E5%8F%98%E6%9B%B4%EF%BC%89.md)<br>

## 甲方需求变更内容 ##

### 买家 ###

- 申请退货：买家在确认收货后，如发现商品存在质量问题，可以发起退货，经卖家同意后开始一次退货，退货的钱款、运费等均由双方协商。为了方便实现，退货以完整订单为最小单位，退货的状态应该反映在订单状态中，包括“买家已发起”、“卖家已通过”、“买家已发货”和“退货完成”状态，退货过程类似于买家卖家呼唤身份的一次“购物”行为。 
- 申请仲裁：买家申请退货被卖家拒绝后，可以向管理员提交仲裁单申请仲裁，仲裁单应包括原订单、退款金额、退货理由、商品照片等（实现中可暂不考虑照片）。 

### 卖家 ###
- 同意退货：对用户发起的退货请求，可以同意或拒绝退货，同时可以修改退货申请中的退款金额，一旦同意退货，将从商家账户扣除相应钱款（实现中可暂不考虑扣款）

- 确认收到退货：确认收到退货后，一次退货订单即完成，同时钱将退回买家账户（实现中可暂不考虑退款）

### 管理员 ###
- 仲裁：管理员接到买家提出的退款仲裁后，可以与卖家沟通后作出仲裁，仲裁的结果有三种：
	1. 沟通成功，卖家同意退款，退货进入“卖家已通过”状态，按正常流程进行退货；
	2. 沟通失败，卖家拒不退货，该次退货关闭，但会对卖家进行信誉、保证金等方面进行惩罚（可暂不实现惩罚机制）
	3. 多次沟通后，仲裁认为买家请求是无理的，驳回申请，关闭该次退货，同时本次买家行为将被记录，对屡次提出无理退货请求的买家，将给予惩罚（可暂不实现惩罚机制） 

## 实现情况： ##
## 买家 ##
 - 申请退货：在确认收货后，若商品发现存在质量问题，相当于再次向卖家提出订单进行退货，可藉由留言方式商讨运费等事宜。 
 - 申请仲裁：买家申请退货被卖家拒绝后，可以向管理员提交仲裁单申请仲裁。
## 卖家 ##
 - 同意退货：可修改退款金额。
 - 确认收到退货：相当于买家"确认收货"功能。
## 管理员 ##
 - 沟通成功：相当于卖家同意退货，进行正常的退货流程。
 - 沟通失败：在订单上标明失败。


## 总结 ##
甲方提出对图书交易系统的总体需求非常完整，但是实现起来比较複杂，因此部分书籍的功能尚未完全，但是整体上有建构出图书交易系统的重点，是个非常宝贵的学习经验。<br>