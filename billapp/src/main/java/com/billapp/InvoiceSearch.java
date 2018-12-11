package com.billapp;

import java.util.ArrayList;
import java.util.List;

public class InvoiceSearch {

    List<Invoice> searchByItem (Company company , String itemName) {

        // rasyti paieskos algoritma
        List<Invoice> result = new ArrayList<>();

        for (Invoice invoice : company.getInvoices()) {
            if(invoice.getItems().equals(itemName)) {
                result.add(invoice);
                //return result;
            }
        }

        return result;

    }

    List<Invoice> searchBySeller (Company company , String sellerName) {

        // rasyti paieskos algoritma

        return null;

    }

    List<Invoice> searchByCustomer (Company company , String customerName) {

        // rasyti paieskos algoritma

        return null;

    }
}
