package com.billapp;


    public class InvoiceMain {

        public static void main(String[] args) {
            // Prints Customer, Seller and Item or Service to the terminal window.

            Invoice in = new Invoice();
            Foe foe = new Foe();

            foe.seller();
            foe.customer();

            System.out.println();

            in.records();


        }

    }

