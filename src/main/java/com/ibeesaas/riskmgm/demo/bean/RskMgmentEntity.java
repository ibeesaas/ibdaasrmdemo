package com.ibeesaas.riskmgm.demo.bean;

import com.google.gson.GsonBuilder;

/**
 * 风控模型1数据汇总类
 */
public class RskMgmentEntity {
    /**
     * 储蓄卡信息
     */
    private DebitCardInfo bankCardInfo;

    /**
     * 运营商报告
     */
    private CarrierReport carrierReport;

    /**
     * 淘宝报告
     */
    private TBReport taobaoReport;

    /**
     * 京东报告
     */
    private JDReport jingdongReport;

    /**
     * 信用卡信息
     */
    private CreditCardInfo creditCardInfo;

    public String parseToString() {
        return new GsonBuilder().create().toJson(this);
    }

    @Override
    public String toString() {
        return "RskMgmentEntity{" +
                "bankCardInfo=" + bankCardInfo +
                ", carrierReport=" + carrierReport +
                ", taobaoReport=" + taobaoReport +
                ", jingdongReport=" + jingdongReport +
                ", creditCardInfo=" + creditCardInfo +
                '}';
    }

    public DebitCardInfo getBankCardInfo() {
        return bankCardInfo;
    }

    public void setBankCardInfo(DebitCardInfo bankCardInfo) {
        this.bankCardInfo = bankCardInfo;
    }

    public CarrierReport getCarrierReport() {
        return carrierReport;
    }

    public void setCarrierReport(CarrierReport carrierReport) {
        this.carrierReport = carrierReport;
    }

    public TBReport getTaobaoReport() {
        return taobaoReport;
    }

    public void setTaobaoReport(TBReport taobaoReport) {
        this.taobaoReport = taobaoReport;
    }

    public JDReport getJingdongReport() {
        return jingdongReport;
    }

    public void setJingdongReport(JDReport jingdongReport) {
        this.jingdongReport = jingdongReport;
    }

    public CreditCardInfo getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
}
