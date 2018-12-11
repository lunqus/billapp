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
            inv.setInvoiceNum("First_1237"); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti
            inv.getItems().add(new Item("Kojines"));
            inv.getItems().add(new Item("Kojines"));
            com.getInvoices().add(inv);

            inv = new Invoice();
            inv.setSeller(new Partner());
            inv.setCustomer(new Partner());
            inv.setInvoiceNum("Second_S9787"); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti
            inv.getItems().add(new Item("Pirstines"));
            inv.getItems().add(new Item("Marskiniai"));
            com.getInvoices().add(inv);

            inv = new Invoice();
            inv.setSeller(new Partner());
            inv.setCustomer(new Partner());
            inv.setInvoiceNum("Third_87675"); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti
            inv.getItems().add(new Item("Kojines"));
            inv.getItems().add(new Item("Megztinis"));
            com.getInvoices().add(inv);

            InvoiceSearch search = new InvoiceSearch();

            List<Invoice> searchResult = search.searchByItem(com, "Megztinis");

            for (Invoice invoice: searchResult) {
                System.out.println( invoice.getInvoiceNum());
            }


        }

    }

