package com.springboot.jxsc.entity;


public class Factory {

    private String id;
    private String fullName;
    private String factoryName;
    private String contractor;
    private String phone;
    private String mobile;
    private String fax;
    private String conte;
    private Integer orderNo;
    private Integer state;

    public Factory() {
    }

    public Factory(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Factory(String id, String fullName, String factoryName, String contractor, String phone, String mobile, String fax, String conte, Integer orderNo, Integer state) {
        this.id = id;
        this.fullName = fullName;
        this.factoryName = factoryName;
        this.contractor = contractor;
        this.phone = phone;
        this.mobile = mobile;
        this.fax = fax;
        this.conte = conte;
        this.orderNo = orderNo;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getConte() {
        return conte;
    }

    public void setConte(String conte) {
        this.conte = conte;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
