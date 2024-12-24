package com.xworkz.myairtel.bill;

public class Bill {
    private String billNo;
    private double billAmount;
    private String billIssueDate;
    private String billDueDate;
    private boolean isBillPaid;

    public Bill(){

    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getBillIssueDate() {
        return billIssueDate;
    }

    public void setBillIssueDate(String billIssueDate) {
        this.billIssueDate = billIssueDate;
    }

    public String getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(String billDueDate) {
        this.billDueDate = billDueDate;
    }



}
