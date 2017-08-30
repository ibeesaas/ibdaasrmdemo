package com.ibeesaas.riskmgm.demo.bean;

/**
 * 储蓄卡信息
 */
public class DebitCardInfo {
    private String cardHolderName; // 储蓄卡预留姓名
    private String cardMobile; // 储蓄卡预留号码
    private String bankCardNo; // 储蓄卡卡号码
    private String idCardNo; // 储蓄卡预留身份证号码

    @Override
    public String toString() {
        return "BankCardInfo{" +
                "cardHolderName='" + cardHolderName + '\'' +
                ", cardMobile='" + cardMobile + '\'' +
                ", bankCardNo='" + bankCardNo + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                '}';
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

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }
}
