package com.ibeesaas.riskmgm.demo.bean;

/**
 * 信用卡信息
 */
public class CreditCardInfo {
    private String idCardNo; // 信用卡持卡人身份证号码(需要与储蓄卡身份证号码一致)
    private String cardHolderName; // 信用卡持卡人姓名(需要与储蓄卡姓名一致)
    private String cardMobile; // 信用卡预留手机号
    private String bankCardNo; // 信用卡卡号
    private String cardPeriod; // 信用卡有效期
    private String cvn2; // 安全码

    @Override
    public String toString() {
        return "CreditCardInfo{" +
                "idCardNo='" + idCardNo + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", cardMobile='" + cardMobile + '\'' +
                ", bankCardNo='" + bankCardNo + '\'' +
                ", cardPeriod='" + cardPeriod + '\'' +
                ", cvn2='" + cvn2 + '\'' +
                '}';
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardMobile() {
        return cardMobile;
    }

    public void setCardMobile(String cardMobile) {
        this.cardMobile = cardMobile;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getCardPeriod() {
        return cardPeriod;
    }

    public void setCardPeriod(String cardPeriod) {
        this.cardPeriod = cardPeriod;
    }

    public String getCvn2() {
        return cvn2;
    }

    public void setCvn2(String cvn2) {
        this.cvn2 = cvn2;
    }
}
