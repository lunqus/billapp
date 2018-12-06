package com.billapp;

/**
 *
 * @author Sigitas Lunkus
 *
 */

public class Invoice {

    public void records() {

        // picture logo;

        char invoiceNum;

        long invoiceIssueDate;
        long invoicePayDate;

        char operationName;
        char operationCode;
        String item;
        String service;

        float unitPrice;
        float vat;
        float discount;
        String amountInWords;

        item = "Java Super Package";
        service = "Delivery Services";


        System.out.println( "Preke: " + item);
        System.out.println( "Paslauga: " + service);

    }
}
