package com.billapp;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Partner seller;
    private Partner customer;

    private String invoiceNum;

    private long invoiceIssueDate;
    private long invoicePayDate;

    private char operationName;
    private char operationCode;

    private List<Item> items = new ArrayList<>();

    private float unitPrice;
    private float vat;
    private float discount;
    private String amountInWords;

    public Partner getSeller() {
        return seller;
    }
    public void setSeller(Partner seller) {
        this.seller = seller;
    }

    public Partner getCustomer() { return customer; }
    public void setCustomer(Partner customer) {
        this.customer = customer;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public long getInvoiceIssueDate() {
        return invoiceIssueDate;
    }
    public void setInvoiceIssueDate(long invoiceIssueDate) {
        this.invoiceIssueDate = invoiceIssueDate;
    }

    public long getInvoicePayDate() {
        return invoicePayDate;
    }
    public void setInvoicePayDate(long invoicePayDate) {
        this.invoicePayDate = invoicePayDate;
    }

    public char getOperationName() {
        return operationName;
    }
    public void setOperationName(char operationName) {
        this.operationName = operationName;
    }

    public char getOperationCode() {
        return operationCode;
    }
    public void setOperationCode(char operationCode) {
        this.operationCode = operationCode;
    }

    public List<Item> getItems() { return items; }
    public void setItems(List<Item> items) { this.items = items; }

    public float getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getVat() {
        return vat;
    }
    public void setVat(float vat) {
        this.vat = vat;
    }

    public float getDiscount() {
        return discount;
    }
    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getAmountInWords() {
        return amountInWords;
    }
    public void setAmountInWords(String amountInWords) {
        this.amountInWords = amountInWords;
    }

}
