package com.ibeesaas.riskmgm.demo.bean;

import java.util.List;

/**
 * 京东报告
 */
public class JDReport {
    private Account account; //	账户信息
    private List<Address> address; //	地址信息
    private List<Order> orders; // 订单信息

    @Override
    public String toString() {
        return "JingdongReport{" +
                "account=" + account +
                ", address=" + address +
                ", orders=" + orders +
                '}';
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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

    /**
     * 账户信息
     */
    public static class Account {
        private String username;

        @Override
        public String toString() {
            return "Account{" +
                    "username='" + username + '\'' +
                    '}';
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
    }
    /**
     * 地址信息
     */
    public static class Address {
        private String tel; //	收货人固话号码
        private String phone; //	收货人手机号码
        private String address; //	收货地址
        private String area; //	所在地区
        private String receiver; //	收货人姓名
        private String email; //	电子邮箱

        @Override
        public String toString() {
            return "Address{" +
                    "tel='" + tel + '\'' +
                    ", phone='" + phone + '\'' +
                    ", address='" + address + '\'' +
                    ", area='" + area + '\'' +
                    ", receiver='" + receiver + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getReceiver() {
            return receiver;
        }

        public void setReceiver(String receiver) {
            this.receiver = receiver;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    /**
     * 订单信息
     */
    public static class Order {
        private String orderId; //	订单ID
        private List<SubList> sub_list; //子订单列表

        @Override
        public String toString() {
            return "Order{" +
                    "orderId='" + orderId + '\'' +
                    ", sub_list=" + sub_list +
                    '}';
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public List<SubList> getSub_list() {
            return sub_list;
        }

        public void setSub_list(List<SubList> sub_list) {
            this.sub_list = sub_list;
        }

        /**
         * 子订单
         */
        public static class SubList {
            private String billTitle; //	发票抬头
            private String sendDate; //	送货日期
            private String payWay; //	付款方式
            private String receiver; //	收件人
            private String orderPrice; //	订单金额
            private String productName; //	商品名称
            private String transportPrice; //	运费
            private String phone; //	电话号码
            private String state; //	交易状态
            private String email; //	邮箱
            private String billContent; //	发票内容
            private String address; //	收件地址
            private String qty; //	商品数量
            private String orderDate; //	订单时间
            private String billType; //	是否开发票

            @Override
            public String toString() {
                return "SubList{" +
                        "billTitle='" + billTitle + '\'' +
                        ", sendDate='" + sendDate + '\'' +
                        ", payWay='" + payWay + '\'' +
                        ", receiver='" + receiver + '\'' +
                        ", orderPrice='" + orderPrice + '\'' +
                        ", productName='" + productName + '\'' +
                        ", transportPrice='" + transportPrice + '\'' +
                        ", phone='" + phone + '\'' +
                        ", state='" + state + '\'' +
                        ", email='" + email + '\'' +
                        ", billContent='" + billContent + '\'' +
                        ", address='" + address + '\'' +
                        ", qty='" + qty + '\'' +
                        ", orderDate='" + orderDate + '\'' +
                        ", billType='" + billType + '\'' +
                        '}';
            }

            public String getBillTitle() {
                return billTitle;
            }

            public void setBillTitle(String billTitle) {
                this.billTitle = billTitle;
            }

            public String getSendDate() {
                return sendDate;
            }

            public void setSendDate(String sendDate) {
                this.sendDate = sendDate;
            }

            public String getPayWay() {
                return payWay;
            }

            public void setPayWay(String payWay) {
                this.payWay = payWay;
            }

            public String getReceiver() {
                return receiver;
            }

            public void setReceiver(String receiver) {
                this.receiver = receiver;
            }

            public String getOrderPrice() {
                return orderPrice;
            }

            public void setOrderPrice(String orderPrice) {
                this.orderPrice = orderPrice;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getTransportPrice() {
                return transportPrice;
            }

            public void setTransportPrice(String transportPrice) {
                this.transportPrice = transportPrice;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getBillContent() {
                return billContent;
            }

            public void setBillContent(String billContent) {
                this.billContent = billContent;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getQty() {
                return qty;
            }

            public void setQty(String qty) {
                this.qty = qty;
            }

            public String getOrderDate() {
                return orderDate;
            }

            public void setOrderDate(String orderDate) {
                this.orderDate = orderDate;
            }

            public String getBillType() {
                return billType;
            }

            public void setBillType(String billType) {
                this.billType = billType;
            }
        }
    }
}
