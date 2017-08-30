package com.ibeesaas.riskmgm.demo.bean;

import java.util.List;

/**
 * 淘宝报告
 */
public class TBReport {
    private String crawlerTime; // 数据获取时间
    private BindAlipay bindAlipay; //	绑定的支付宝账号信息
    private List<Address> address;	 //	收货地址
    private List<Order> orders;	 //	订单详情
    private Account account; //	淘宝账号信息
    private Shop shop;	 //	卖家店铺信息
    private Jiebei jiebei;	 //	借呗信息
    private AplipayBalance aplipayBalance;	 //	支付宝余额信息
    private Huabei huabei;	 //	花呗信息

    @Override
    public String toString() {
        return "TaobaoReport{" +
                "crawlerTime='" + crawlerTime + '\'' +
                ", bindAlipay=" + bindAlipay +
                ", address=" + address +
                ", orders=" + orders +
                ", account=" + account +
                ", shop=" + shop +
                ", jiebei=" + jiebei +
                ", aplipayBalance=" + aplipayBalance +
                ", huabei=" + huabei +
                '}';
    }

    public String getCrawlerTime() {
        return crawlerTime;
    }

    public void setCrawlerTime(String crawlerTime) {
        this.crawlerTime = crawlerTime;
    }

    public BindAlipay getBindAlipay() {
        return bindAlipay;
    }

    public void setBindAlipay(BindAlipay bindAlipay) {
        this.bindAlipay = bindAlipay;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Jiebei getJiebei() {
        return jiebei;
    }

    public void setJiebei(Jiebei jiebei) {
        this.jiebei = jiebei;
    }

    public AplipayBalance getAplipayBalance() {
        return aplipayBalance;
    }

    public void setAplipayBalance(AplipayBalance aplipayBalance) {
        this.aplipayBalance = aplipayBalance;
    }

    public Huabei getHuabei() {
        return huabei;
    }

    public void setHuabei(Huabei huabei) {
        this.huabei = huabei;
    }

    /**
     * 绑定的支付宝账号信息
     */
    public static class BindAlipay {
        private String phoneNo ; // 	手机号
        private String verifyInfo ; // 	支付宝实名认证信息
        private String accountType ; // 	账户类型
        private String email; //	支付宝绑定的邮箱

        @Override
        public String toString() {
            return "BindAlipay{" +
                    "phoneNo='" + phoneNo + '\'' +
                    ", verifyInfo='" + verifyInfo + '\'' +
                    ", accountType='" + accountType + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getVerifyInfo() {
            return verifyInfo;
        }

        public void setVerifyInfo(String verifyInfo) {
            this.verifyInfo = verifyInfo;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    /**
     * 收货地址
     */
    public static class Address {
        private String area ; // 	收货区域
        private String address ; // 	详细街道
        private String tel ; // 	收货人号码
        private String zipCode ; // 	邮政编码
        private String receiver ; // 	收货人姓名

        @Override
        public String toString() {
            return "Address{" +
                    "area='" + area + '\'' +
                    ", address='" + address + '\'' +
                    ", tel='" + tel + '\'' +
                    ", zipCode='" + zipCode + '\'' +
                    ", receiver='" + receiver + '\'' +
                    '}';
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }
    }

    /**
     * 订单详情
     */
    public static class Order {
       private String orderId; // 	订单编号
       private List<SubList> subList; //	商品详情
       private String transport; // 	运送方式
       private String name; // 	收货人姓名
       private String address; // 	收货地址
       private String alipayOrderId; // 	支付宝交易流水号
       private String payTime; // 	付款时间
       private String mobilePhone; // 	收货人联系电话
       private String actualFee; // 	订单实付总价格
       private String shopName; // 	商家名称
       private String createTime; // 	创建时间
       private String port; // 	邮政编码
       private String nick; // 	商家昵称
       private String endTime; // 	成交时间
       private String tradestatus; // 	订单状态

        @Override
        public String toString() {
            return "Order{" +
                    "orderId='" + orderId + '\'' +
                    ", subList=" + subList +
                    ", transport='" + transport + '\'' +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", alipayOrderId='" + alipayOrderId + '\'' +
                    ", payTime='" + payTime + '\'' +
                    ", mobilePhone='" + mobilePhone + '\'' +
                    ", actualFee='" + actualFee + '\'' +
                    ", shopName='" + shopName + '\'' +
                    ", createTime='" + createTime + '\'' +
                    ", port='" + port + '\'' +
                    ", nick='" + nick + '\'' +
                    ", endTime='" + endTime + '\'' +
                    ", tradestatus='" + tradestatus + '\'' +
                    '}';
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public List<SubList> getSubLists() {
            return subList;
        }

        public void setSubLists(List<SubList> subList) {
            this.subList = subList;
        }

        public String getTransport() {
            return transport;
        }

        public void setTransport(String transport) {
            this.transport = transport;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getAlipayOrderId() {
            return alipayOrderId;
        }

        public void setAlipayOrderId(String alipayOrderId) {
            this.alipayOrderId = alipayOrderId;
        }

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getActualFee() {
            return actualFee;
        }

        public void setActualFee(String actualFee) {
            this.actualFee = actualFee;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public String getTradestatus() {
            return tradestatus;
        }

        public void setTradestatus(String tradestatus) {
            this.tradestatus = tradestatus;
        }

        public static class SubList {
            private String skuText; // 	商品型号
            private String promotion; // 	商品折后价
            private String qty; // 	商品数量
            private String original; // 	商品原价
            private String productName; // 	商品名称

            @Override
            public String toString() {
                return "SubList{" +
                        "skuText='" + skuText + '\'' +
                        ", promotion='" + promotion + '\'' +
                        ", qty='" + qty + '\'' +
                        ", original='" + original + '\'' +
                        ", productName='" + productName + '\'' +
                        '}';
            }

            public String getSkuText() {
                return skuText;
            }

            public void setSkuText(String skuText) {
                this.skuText = skuText;
            }

            public String getPromotion() {
                return promotion;
            }

            public void setPromotion(String promotion) {
                this.promotion = promotion;
            }

            public String getQty() {
                return qty;
            }

            public void setQty(String qty) {
                this.qty = qty;
            }

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }
        }
    }

    /**
     * 淘宝账号信息
     */
    public static class Account {
        private String userName; // 账户

        @Override
        public String toString() {
            return "Account{" +
                    "userName='" + userName + '\'' +
                    '}';
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    /**
     * 卖家店铺信息
     */
    public static class Shop {
        private String open_time; // 	开店时长(年)
        private String shop_url; // 	店铺链接
        private String shop_rank; // 	卖家信用评分
        private String shop_name; // 	店铺名称
        private ShopRate shop_rate;	// 店铺评分（描述、服务、物流）
        private List<String> qualifications_list;	// 店铺资质认证信息
        private String shop_id; // 	店铺id
        private int shop_state; //	0-未开过店、1-店铺被关闭，2-正在运营
        private String alipay_auth_time; // 	支付宝个人认证时间
        private String shopkeeper_nick; // 	掌柜昵称

        @Override
        public String toString() {
            return "Shop{" +
                    "open_time='" + open_time + '\'' +
                    ", shop_url='" + shop_url + '\'' +
                    ", shop_rank='" + shop_rank + '\'' +
                    ", shop_name='" + shop_name + '\'' +
                    ", shop_rate=" + shop_rate +
                    ", qualifications_list=" + qualifications_list +
                    ", shop_id='" + shop_id + '\'' +
                    ", shop_state=" + shop_state +
                    ", alipay_auth_time='" + alipay_auth_time + '\'' +
                    ", shopkeeper_nick='" + shopkeeper_nick + '\'' +
                    '}';
        }

        public String getOpen_time() {
            return open_time;
        }

        public void setOpen_time(String open_time) {
            this.open_time = open_time;
        }

        public String getShop_url() {
            return shop_url;
        }

        public void setShop_url(String shop_url) {
            this.shop_url = shop_url;
        }

        public String getShop_rank() {
            return shop_rank;
        }

        public void setShop_rank(String shop_rank) {
            this.shop_rank = shop_rank;
        }

        public String getShop_name() {
            return shop_name;
        }

        public void setShop_name(String shop_name) {
            this.shop_name = shop_name;
        }

        public ShopRate getShop_rate() {
            return shop_rate;
        }

        public void setShop_rate(ShopRate shop_rate) {
            this.shop_rate = shop_rate;
        }

        public List<String> getQualifications_list() {
            return qualifications_list;
        }

        public void setQualifications_list(List<String> qualifications_list) {
            this.qualifications_list = qualifications_list;
        }

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public int getShop_state() {
            return shop_state;
        }

        public void setShop_state(int shop_state) {
            this.shop_state = shop_state;
        }

        public String getAlipay_auth_time() {
            return alipay_auth_time;
        }

        public void setAlipay_auth_time(String alipay_auth_time) {
            this.alipay_auth_time = alipay_auth_time;
        }

        public String getShopkeeper_nick() {
            return shopkeeper_nick;
        }

        public void setShopkeeper_nick(String shopkeeper_nick) {
            this.shopkeeper_nick = shopkeeper_nick;
        }

        public static class ShopRate {
            private String logistics_rate;
            private String describe_rate;
            private String service_rate;

            @Override
            public String toString() {
                return "ShopRate{" +
                        "logistics_rate='" + logistics_rate + '\'' +
                        ", describe_rate='" + describe_rate + '\'' +
                        ", service_rate='" + service_rate + '\'' +
                        '}';
            }

            public String getLogistics_rate() {
                return logistics_rate;
            }

            public void setLogistics_rate(String logistics_rate) {
                this.logistics_rate = logistics_rate;
            }

            public String getDescribe_rate() {
                return describe_rate;
            }

            public void setDescribe_rate(String describe_rate) {
                this.describe_rate = describe_rate;
            }

            public String getService_rate() {
                return service_rate;
            }

            public void setService_rate(String service_rate) {
                this.service_rate = service_rate;
            }
        }
    }

    /**
     * 借呗信息
     */
    public static class Jiebei {
       private int has_jiebei; //	0-未开通借呗 1-开通了借呗
       private String credit_amount; //	借呗额度
       private String loanable_amount; //	借呗可用额度

        @Override
        public String toString() {
            return "Jiebei{" +
                    "has_jiebei=" + has_jiebei +
                    ", credit_amount='" + credit_amount + '\'' +
                    ", loanable_amount='" + loanable_amount + '\'' +
                    '}';
        }

        public int getHas_jiebei() {
            return has_jiebei;
        }

        public void setHas_jiebei(int has_jiebei) {
            this.has_jiebei = has_jiebei;
        }

        public String getCredit_amount() {
            return credit_amount;
        }

        public void setCredit_amount(String credit_amount) {
            this.credit_amount = credit_amount;
        }

        public String getLoanable_amount() {
            return loanable_amount;
        }

        public void setLoanable_amount(String loanable_amount) {
            this.loanable_amount = loanable_amount;
        }
    }

    /**
     * 支付宝余额信息
     */
    public static class AplipayBalance {
        private int get_balance; //1：获取余额成功
        private String total_quotient; //	余额宝余额
        private String balance; //支付宝账号余额

        @Override
        public String toString() {
            return "AplipayBalance{" +
                    "get_balance=" + get_balance +
                    ", total_quotient='" + total_quotient + '\'' +
                    ", balance='" + balance + '\'' +
                    '}';
        }

        public int getGet_balance() {
            return get_balance;
        }

        public void setGet_balance(int get_balance) {
            this.get_balance = get_balance;
        }

        public String getTotal_quotient() {
            return total_quotient;
        }

        public void setTotal_quotient(String total_quotient) {
            this.total_quotient = total_quotient;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }
    }

    /**
     * 花呗信息
     */
    public static class Huabei {
        private List<MonthBill> month_bill; // 月度账单
        private String credit_amout; //	花呗额度
        private int has_huabei; //	0-未开通花呗 1-开通了花呗
        private String loanable_amount; //	花呗可用额度

        @Override
        public String toString() {
            return "Huabei{" +
                    "month_bill=" + month_bill +
                    ", credit_amout='" + credit_amout + '\'' +
                    ", has_huabei=" + has_huabei +
                    ", loanable_amount='" + loanable_amount + '\'' +
                    '}';
        }

        public List<MonthBill> getMonth_bill() {
            return month_bill;
        }

        public void setMonth_bill(List<MonthBill> month_bill) {
            this.month_bill = month_bill;
        }

        public String getCredit_amout() {
            return credit_amout;
        }

        public void setCredit_amout(String credit_amout) {
            this.credit_amout = credit_amout;
        }

        public int getHas_huabei() {
            return has_huabei;
        }

        public void setHas_huabei(int has_huabei) {
            this.has_huabei = has_huabei;
        }

        public String getLoanable_amount() {
            return loanable_amount;
        }

        public void setLoanable_amount(String loanable_amount) {
            this.loanable_amount = loanable_amount;
        }

        public static class MonthBill {
            private String total_amount; // 账单总额
            private String repayed_amount; // 已还款金额
            private boolean has_bill; // 是否有账单
            private String month; // 月份
            private int bill_num; // 账单条数
            private String year; // 年份

            @Override
            public String toString() {
                return "MonthBill{" +
                        "total_amount='" + total_amount + '\'' +
                        ", repayed_amount='" + repayed_amount + '\'' +
                        ", has_bill=" + has_bill +
                        ", month='" + month + '\'' +
                        ", bill_num=" + bill_num +
                        ", year='" + year + '\'' +
                        '}';
            }

            public String getTotal_amount() {
                return total_amount;
            }

            public void setTotal_amount(String total_amount) {
                this.total_amount = total_amount;
            }

            public String getRepayed_amount() {
                return repayed_amount;
            }

            public void setRepayed_amount(String repayed_amount) {
                this.repayed_amount = repayed_amount;
            }

            public boolean isHas_bill() {
                return has_bill;
            }

            public void setHas_bill(boolean has_bill) {
                this.has_bill = has_bill;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            public int getBill_num() {
                return bill_num;
            }

            public void setBill_num(int bill_num) {
                this.bill_num = bill_num;
            }

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }
        }
    }
}
