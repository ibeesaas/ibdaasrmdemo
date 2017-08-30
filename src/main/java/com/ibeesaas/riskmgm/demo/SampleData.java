package com.ibeesaas.riskmgm.demo;

import com.ibeesaas.riskmgm.demo.bean.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 风控模型数据组装实例
 */
public class SampleData {
    public static String getDataString() {
        RskMgmentEntity entity = new RskMgmentEntity();
        DebitCardInfo bank = new DebitCardInfo();
        entity.setBankCardInfo(bank);
        bank.setBankCardNo("6225880***25258");
        bank.setCardHolderName("***");
        bank.setCardMobile("18630**016");
        bank.setIdCardNo("1301811****253337");
        entity.setBankCardInfo(bank);


        // carrierReport
        CarrierReport carrierReport = new CarrierReport();
        entity.setCarrierReport(carrierReport);
        List<CarrierReport.CallHistory> calls = new ArrayList<CarrierReport.CallHistory>();

        // callHistory
        CarrierReport.CallHistory callTmp = new CarrierReport.CallHistory();
        CarrierReport.CallHistory.Detail callDetailTmp = new CarrierReport.CallHistory.Detail();
        callDetailTmp.setCallLocation("山东德州");
        callDetailTmp.setCallType(0);
        callDetailTmp.setCommType("012002001");
        callDetailTmp.setDuration(13);
        callDetailTmp.setFee(0);
        callDetailTmp.setOtherPhone("1372****834");
        callDetailTmp.setStartTime("2017-01-31 17:36:03");
        List<CarrierReport.CallHistory.Detail> callDetails = new ArrayList<CarrierReport.CallHistory.Detail>();
        callDetails.add(callDetailTmp);
        callTmp.setDetails(callDetails);
        callTmp.setMonth("201701");
        calls.add(callTmp);
        carrierReport.setCallHistory(calls);

        // smsHistory
        List<CarrierReport.SmsHistory> smsHistories = new ArrayList<CarrierReport.SmsHistory>();
        carrierReport.setSmsHistory(smsHistories);
        CarrierReport.SmsHistory smsHistory = new CarrierReport.SmsHistory();
        smsHistory.setMonth("201611");
        smsHistories.add(smsHistory);
        List<CarrierReport.SmsHistory.Detail> smsHistoryDetails = new ArrayList<CarrierReport.SmsHistory.Detail>();
        CarrierReport.SmsHistory.Detail smsHistoryDetail = new CarrierReport.SmsHistory.Detail();
        smsHistoryDetail.setDate("2016-11-27 12:58:48");
        smsHistoryDetail.setFee(0);
        smsHistoryDetail.setOtherPhone("1380****295");
        smsHistoryDetail.setSmsType(1);
        smsHistoryDetails.add(smsHistoryDetail);
        smsHistory.setDetails(smsHistoryDetails);

        // userInfo
        CarrierReport.UserInfo userInfo = new CarrierReport.UserInfo();
        carrierReport.setUserInfo(userInfo);
        userInfo.setAddress("河北**");
        userInfo.setIdentity("1301811****253337");
        userInfo.setName("王**");
        userInfo.setOpenDate("2011-04-03 00:00:00");
        userInfo.setPhoneNo("18630**016");

        // taobaoReport
        TBReport taobaoReport = new TBReport();
        entity.setTaobaoReport(taobaoReport);
        taobaoReport.setCrawlerTime("2017-03-01 12:00:15");

        // bindAlipay
        TBReport.BindAlipay bindAlipay = new TBReport.BindAlipay();
        taobaoReport.setBindAlipay(bindAlipay);
        bindAlipay.setAccountType("个人账户");
        bindAlipay.setEmail("phw****10@163.com");
        bindAlipay.setPhoneNo("183*****595");
        bindAlipay.setVerifyInfo("潘** | 4****************9 已认证");

        // address
        List<TBReport.Address> taobaoAdds = new ArrayList<TBReport.Address>();
        taobaoReport.setAddress(taobaoAdds);
        TBReport.Address taobaoAdd = new TBReport.Address();
        taobaoAdds.add(taobaoAdd);
        taobaoAdd.setAddress("育才街道*****");
        taobaoAdd.setArea("河北省 *****");
        taobaoAdd.setReceiver("潘**");
        taobaoAdd.setTel("1833****8595");
        taobaoAdd.setZipCode("050011");

        // orders
        List<TBReport.Order> taobaoOrds = new ArrayList<TBReport.Order>();
        taobaoReport.setOrders(taobaoOrds);
        TBReport.Order taobaoOrd = new TBReport.Order();
        taobaoOrds.add(taobaoOrd);
        taobaoOrd.setActualFee("19.90");
        taobaoOrd.setAddress("河北省 **** ");
        taobaoOrd.setAlipayOrderId("2016092321001001050205064189");
        taobaoOrd.setCreateTime("2016-09-23 20:13:27");
        taobaoOrd.setEndTime("2016-09-28 21:03:18");
        taobaoOrd.setMobilePhone("183****8595");
        taobaoOrd.setName("潘**");
        taobaoOrd.setNick("奥义健与美专卖店");
        taobaoOrd.setOrderId("2211257767941755");
        taobaoOrd.setPayTime("2016-09-23 20:14:20");
        taobaoOrd.setPort("050011");
        taobaoOrd.setShopName("奥义健与美专卖店");
        taobaoOrd.setTradestatus("交易成功");
        taobaoOrd.setTransport("");
        List<TBReport.Order.SubList> subLists = new ArrayList<TBReport.Order.SubList>();
        TBReport.Order.SubList sublist = new TBReport.Order.SubList();
        subLists.add(sublist);
        sublist.setOriginal("64.70");
        sublist.setProductName("奥义瑜伽垫健身垫初学者加长加厚加宽愈加防滑运动垫子瑜珈正品邮");
        sublist.setPromotion("19.90");
        sublist.setQty("1");
        sublist.setSkuText("颜色分类:【水蓝瑜伽垫】=捆绑带+下载视频教程;厚度:10mm(初学者)");
        taobaoOrd.setSubLists(subLists);

        // account
        TBReport.Account account = new TBReport.Account();
        account.setUserName("****");
        taobaoReport.setAccount(account);

        // shop
        TBReport.Shop taobaoShop = new TBReport.Shop();
        taobaoReport.setShop(taobaoShop);
        taobaoShop.setOpen_time("8"); // 	开店时长(年)
        taobaoShop.setShop_url("https://shop58010050.taobao.com"); // 	店铺链接
        taobaoShop.setShop_rank("245"); // 	卖家信用评分
        taobaoShop.setShop_name("遇见原创品牌"); // 	店铺名称
        TBReport.Shop.ShopRate taobaoShopRate = new TBReport.Shop.ShopRate();
        taobaoShopRate.setDescribe_rate("5.0");
        taobaoShopRate.setLogistics_rate("5.0");
        taobaoShopRate.setService_rate("5.0");
        taobaoShop.setShop_rate(taobaoShopRate);	// 店铺评分（描述、服务、物流）
        List<String> qualifications_list = new ArrayList<String>();
        qualifications_list.add("该店铺中实物商品交易由保险公司保障交易钱款安全");
        qualifications_list.add("该店铺已签署消费者保障协议已缴纳xxxx元保证金");
        taobaoShop.setQualifications_list(qualifications_list);	// 店铺资质认证信息
        taobaoShop.setShop_id("58010**0"); // 	店铺id
        taobaoShop.setShop_state(2); //	0-未开过店、1-店铺被关闭，2-正在运营
        taobaoShop.setAlipay_auth_time("2009-04-27"); // 	支付宝个人认证时间
        taobaoShop.setShopkeeper_nick("peiyniwg88"); // 	掌柜昵称

        // jiebei
        TBReport.Jiebei jiebei = new TBReport.Jiebei();
        jiebei.setCredit_amount("12000.00");
        jiebei.setHas_jiebei(1);
        jiebei.setLoanable_amount("0.00");

        // alipay_balance
        TBReport.AplipayBalance aplipayBalance = new TBReport.AplipayBalance();
        aplipayBalance.setBalance("1200.29");
        aplipayBalance.setGet_balance(1);
        aplipayBalance.setTotal_quotient("0.00");
        taobaoReport.setAplipayBalance(aplipayBalance);

        // huabei
        TBReport.Huabei huabei = new TBReport.Huabei();
        huabei.setCredit_amout("2000");
        huabei.setHas_huabei(1);
        huabei.setLoanable_amount("1622.44");
        List<TBReport.Huabei.MonthBill> bills = new ArrayList<TBReport.Huabei.MonthBill>();
        huabei.setMonth_bill(bills);
        TBReport.Huabei.MonthBill bill = new TBReport.Huabei.MonthBill();
        bill.setBill_num(0);
        bill.setHas_bill(false);
        bill.setMonth("12");
        bill.setRepayed_amount("0.00");
        bill.setTotal_amount("0.00");
        bill.setYear("2016");
        bills.add(bill);


        // jingdongReport
        JDReport jingdongReport = new JDReport();

        //account
        JDReport.Account jdAccount = new JDReport.Account();
        jdAccount.setUsername("1801*****");
        jingdongReport.setAccount(jdAccount);

        // address
        List<JDReport.Address> jdAddrs = new ArrayList<JDReport.Address>();
        jingdongReport.setAddress(jdAddrs);
        JDReport.Address jdAddr = new JDReport.Address();
        jdAddrs.add(jdAddr);
        jdAddr.setAddress("江苏*****");
        jdAddr.setArea("");
        jdAddr.setEmail("");
        jdAddr.setPhone("180*******");
        jdAddr.setReceiver("张*");
        jdAddr.setTel("");

        // orders
        List<JDReport.Order> jdOrds = new ArrayList<JDReport.Order>();
        jingdongReport.setOrders(jdOrds);
        JDReport.Order jdOrd = new JDReport.Order();
        jdOrd.setOrderId("1642525838");
        List<JDReport.Order.SubList> jsSubs = new ArrayList<JDReport.Order.SubList>();
        jdOrd.setSub_list(jsSubs);
        JDReport.Order.SubList jdSub = new JDReport.Order.SubList();
        jsSubs.add(jdSub);
        jdSub.setAddress("江苏****");
        jdSub.setBillContent("");
        jdSub.setBillTitle("");
        jdSub.setBillType("不开发票");
        jdSub.setEmail("");
        jdSub.setOrderDate("2014-07-14 15:54:34");
        jdSub.setOrderPrice("60.00");
        jdSub.setPayWay("在线支付");
        jdSub.setPhone("180*******");
        jdSub.setProductName("《TERA》客户端实体纪念礼包");
        jdSub.setQty("1");
        jdSub.setReceiver("张*");
        jdSub.setSendDate("");
        jdSub.setState("已取消");
        jdSub.setTransportPrice("");
        jdOrds.add(jdOrd);
        entity.setJingdongReport(jingdongReport);

        // creditCardInfo
        CreditCardInfo creditCardInfo = new CreditCardInfo();
        creditCardInfo.setBankCardNo("62220201******23311");
        creditCardInfo.setCardHolderName("张**");
        creditCardInfo.setCardMobile("13******026");
        creditCardInfo.setCardPeriod("2007");
        creditCardInfo.setCvn2("123");
        creditCardInfo.setIdCardNo("320************628");
        entity.setCreditCardInfo(creditCardInfo);

        System.out.println(entity.parseToString());

        return entity.parseToString();
    }

}
