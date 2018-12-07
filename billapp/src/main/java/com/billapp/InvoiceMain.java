package com.billapp;


import java.util.ArrayList;

public class InvoiceMain {

        public static void main(String[] args) {
            // Prints Customer, Seller and Item or Service to the terminal window.

            Company com = new Company();
            // com.setInvoices(new ArrayList<>());
            com.getInvoices().add(new Invoice());

            Invoice inv = new Invoice();

            inv.setSeller();
            inv.setCustomer();

            inv.setInvoiceNum(); // nepaduotas parametras ir todel siulo overloadinta etoda susikurti

            inv.setInvoiceIssueDate();
            inv.setInvoicePayDate();

            inv.setOperationName();
            inv.setOperationCode();

            inv.setItems();

            inv.setUnitPrice();
            inv.setVat();
            inv.setDiscount();
            inv.setAmountInWords();


        }

    }

