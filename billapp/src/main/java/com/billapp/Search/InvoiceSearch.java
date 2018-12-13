package com.billapp.Search;

import com.billapp.Company.Company;
import com.billapp.Invoice.Invoice;
import com.billapp.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class InvoiceSearch {

    List<Invoice> searchByItem(Company company, String itemName) {

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

    List<Invoice> searchBySeller(Company company, String sellerName) {

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

    List<Invoice> searchByCustomer(Company company, String customerName) {

        List<Invoice> searchCustomer = new ArrayList<>();


        return null;

    }
}
