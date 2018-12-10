package com.billapp;


import java.util.ArrayList;
import java.util.List;

public class InvoiceMain {

        public static void main(String[] args) {
            // Prints Customer, Seller and Item or Service to the terminal window.

            Company com = new Company();
            // com.setInvoices(new ArrayList<>());
           // com.getInvoices().add(new Invoice());

            Invoice inv = new Invoice();
            inv.setSeller(new Partner());
            inv.setCustomer(new Partner());
            inv.setInvoiceNum("hgfhgf76547645"); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti
            inv.getItems().add(new Item("kojines"));
            inv.getItems().add(new Item("kojines"));
            com.getInvoices().add(inv);

            inv = new Invoice();
            inv.setSeller(new Partner());
            inv.setCustomer(new Partner());
            inv.setInvoiceNum("ėįšėį"); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti
            inv.getItems().add(new Item("asd"));
            inv.getItems().add(new Item("asdč"));
            com.getInvoices().add(inv);

            inv = new Invoice();
            inv.setSeller(new Partner());
            inv.setCustomer(new Partner());
            inv.setInvoiceNum("retetert"); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti
            inv.getItems().add(new Item("kojimnes"));
            inv.getItems().add(new Item("asdč"));
            com.getInvoices().add(inv);

            InvoiceSearch search = new InvoiceSearch();

            List<Invoice> searchResult = search.searchByItem(com, "kojnes");

            for (Invoice invoice: searchResult
                 ) {
                System.out.println( invoice.getInvoiceNum());
            }


        }

    }

