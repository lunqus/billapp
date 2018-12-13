package com.billapp.Controller;

import com.billapp.Model.Company;
import com.billapp.Model.Invoice;
import com.billapp.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class InvoiceSearch {

    public List<Invoice> searchByItem(Company company, String itemName) {

        List<Invoice> searchItem = new ArrayList<>();

        for (Invoice invoice : company.getInvoices()) {

            for (Item item : invoice.getItems()) {
                if (item.getName().contains(itemName)) {
                    searchItem.add(invoice);
                    break;
                }
            }
        }
        return searchItem;
    }

    public List<Invoice> searchBySeller(Company company, String sellerName) {

//        List<Invoice> searchSeller = new ArrayList<>();
//
//        for (Invoice invoice : company.getInvoices()) {
//
//            for (Partner seller: invoice.getSeller()) {
//                if (seller.getName().contains(sellerName)) {
//                    searchSeller.add(invoice);
//                    break;
//                }
//            }
//        }

        return null;

    }

    public List<Invoice> searchByCustomer(Company company, String customerName) {

        List<Invoice> searchCustomer = new ArrayList<>();


        return null;

    }
}
