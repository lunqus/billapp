package com.billapp.Model;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Invoice> invoices = new ArrayList<>();
    private List<Partner> customers = new ArrayList<>();
    private List<Partner> sellers = new ArrayList<>();

    public List<Invoice> getInvoices() { return invoices; }
    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Partner> getCustomers() {
        return customers;
    }
    public void setCustomers(List<Partner> customers) {
        this.customers = customers;
    }

    public List<Partner> getSellers() {
        return sellers;
    }
    public void setSellers(List<Partner> sellers) {
        this.sellers = sellers;
    }


//    public String void items() {
//
//        for (int i = 1; i < length.itemName ; i++ ) {
//
//        }
//    }

}
