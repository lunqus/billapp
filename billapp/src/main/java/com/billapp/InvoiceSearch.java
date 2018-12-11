package com.billapp;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class InvoiceSearch {

    List<Invoice> searchByItem(Company company, String itemName) {

        List<Invoice> searchResult = new ArrayList<>();

        for (Invoice invoice : company.getInvoices()) {

            for (Item item : invoice.getItems()) {
                if (item.getName().contains(itemName)) {
                    searchResult.add(invoice);
                    break;
                }
            }
        }
        return searchResult;
    }

    List<Invoice> searchBySeller(Company company, String sellerName) {

        // rasyti paieskos algoritma

        return null;

    }

    List<Invoice> searchByCustomer(Company company, String customerName) {

        // rasyti paieskos algoritma

        return null;

    }
}
