package com.ibeesaas.riskmgm.demo.bean;

import java.util.List;

/**
 * 运营商报告
 */
public class CarrierReport {
    private CarrierReport.UserInfo userInfo;
    private List<CallHistory> callHistory;
    private List<SmsHistory> smsHistory;

    @Override
    public String toString() {
        return "CarrierReport{" +
                "userInfo=" + userInfo +
                ", callHistory=" + callHistory +
                ", smsHistory=" + smsHistory +
                '}';
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List<CallHistory> getCallHistory() {
        return callHistory;
    }

    public void setCallHistory(List<CallHistory> callHistory) {
        this.callHistory = callHistory;
    }

    public List<SmsHistory> getSmsHistory() {
        return smsHistory;
    }

    public void setSmsHistory(List<SmsHistory> smsHistory) {
        this.smsHistory = smsHistory;
    }

    /**
     * 用户信息
     */
    public static class UserInfo {
        private String phoneNo; // 手机号
        private String name; //机主姓名
        private String identity; //机主身份证号码
        private String address; //机主注册地址
        private String openDate; //电话号码激活日期

        @Override
        public String toString() {
            return "UserInfo{" +
                    "phoneNo='" + phoneNo + '\'' +
                    ", name='" + name + '\'' +
                    ", identity='" + identity + '\'' +
                    ", address='" + address + '\'' +
                    ", openDate='" + openDate + '\'' +
                    '}';
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIdentity() {
            return identity;
        }

        public void setIdentity(String identity) {
            this.identity = identity;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getOpenDate() {
            return openDate;
        }

        public void setOpenDate(String openDate) {
            this.openDate = openDate;
        }
    }

    /**
     * 通话记录
     */
    public static class CallHistory {
        private String month;	//爬取月份
        private List<Detail> details;	//通话详单数组

        @Override
        public String toString() {
            return "CallHistory{" +
                    "month='" + month + '\'' +
                    ", details=" + details +
                    '}';
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public List<Detail> getDetails() {
            return details;
        }

        public void setDetails(List<Detail> details) {
            this.details = details;
        }

        /**
         * 通话详单
         */
        public static class Detail {
            private String otherPhone; //	对方号码
            private int callType;	// 0：主叫 1：被叫
            private String startTime; //	通话开始时间
            private String callLocation; //	通话地点
            private String commType; //	呼叫类型，本地通话， 漫游，等
            private int duration; // 通话时长，单位：秒
            private int fee; // 本次通话话费

            public String getOtherPhone() {
                return otherPhone;
            }

            public void setOtherPhone(String otherPhone) {
                this.otherPhone = otherPhone;
            }

            public int getCallType() {
                return callType;
            }

            public void setCallType(int callType) {
                this.callType = callType;
            }

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public String getCallLocation() {
                return callLocation;
            }

            public void setCallLocation(String callLocation) {
                this.callLocation = callLocation;
            }

            public String getCommType() {
                return commType;
            }

            public void setCommType(String commType) {
                this.commType = commType;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }
        }
    }

    /**
     * 短息记录
     */
    public static class SmsHistory {
        private String month; // 爬取月份
        private List<Detail> details; // 短息详单数组

        @Override
        public String toString() {
            return "SmsHistory{" +
                    "month='" + month + '\'' +
                    ", details=" + details +
                    '}';
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public List<Detail> getDetails() {
            return details;
        }

        public void setDetails(List<Detail> details) {
            this.details = details;
        }

        /**
         * 短息详单
         */
        public static class Detail {
            private String otherPhone;
            private int smsType;
            private String date;
            private int fee;

            @Override
            public String toString() {
                return "Detail{" +
                        "otherPhone='" + otherPhone + '\'' +
                        ", smsType=" + smsType +
                        ", date='" + date + '\'' +
                        ", fee=" + fee +
                        '}';
            }

            public String getOtherPhone() {
                return otherPhone;
            }

            public void setOtherPhone(String otherPhone) {
                this.otherPhone = otherPhone;
            }

            public int getSmsType() {
                return smsType;
            }

            public void setSmsType(int smsType) {
                this.smsType = smsType;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }
        }
    }
}
