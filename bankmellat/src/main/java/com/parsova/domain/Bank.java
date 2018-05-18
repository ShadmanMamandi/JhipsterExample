package com.parsova.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by shiva on 7/3/17.
 */

@Entity
@Table
public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "terminal_id")
    private long terminalId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "order_id")
    private long orderId;

    private long amount;

    @Column(name = "local_date")
    private String localDate;

    @Column(name = "local_time")
    private String localTime;

    @Column(name = "additional_date")
    private String additionalData;

    @Column(name = "callback_url")
    private String callBackUrl;

    @Column(name = "payer_id")
    private long payerId;

    @Column(name = "sub_service_id")
    private long subServiceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(long terminalId) {
        this.terminalId = terminalId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    public long getPayerId() {
        return payerId;
    }

    public void setPayerId(long payerId) {
        this.payerId = payerId;
    }

    public long getSubServiceId() {
        return subServiceId;
    }

    public void setSubServiceId(long subServiceId) {
        this.subServiceId = subServiceId;
    }

    @Override
    public String toString() {
        return "Bank{" +
            "terminalId=" + terminalId +
            ", userName='" + userName + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", orderId=" + orderId +
            ", amount=" + amount +
            ", localDate='" + localDate + '\'' +
            ", localTime='" + localTime + '\'' +
            ", additionalData='" + additionalData + '\'' +
            ", callBackUrl='" + callBackUrl + '\'' +
            ", payerId=" + payerId +
            ", subServiceId=" + subServiceId +
            '}';
    }

}
