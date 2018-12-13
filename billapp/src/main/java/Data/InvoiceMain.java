package Data;


import java.util.ArrayList;
import java.util.List;

public class InvoiceMain {

    public static void main(String[] args) {
        // Prints Customer, Seller and Item or Service to the terminal window.

        Company com = new Company();
        // com.setInvoices(new ArrayList<>());
        // com.getInvoices().add(new Invoice());

        Partner part = new Partner();
        part.setName("Akropolis");

        Invoice inv = new Invoice();
        inv.setSeller(part);
        inv.setCustomer(new Partner());
        inv.setInvoiceNum("First_1237");
        inv.getItems().add(new Item("Kojines"));
        inv.getItems().add(new Item("Kojines"));
        com.getInvoices().add(inv);
        com.getSellers().add(part); // -----------

        inv = new Invoice();
        part = new Partner();
        part.setName("Rimi");
        inv.setSeller(part);
        inv.setCustomer(new Partner());
        inv.setInvoiceNum("Second_563253");
        inv.getItems().add(new Item("Pirstines"));
        inv.getItems().add(new Item("Liemene"));
        inv.getItems().add(new Item("Kelnes"));
        com.getInvoices().add(inv);
        com.getSellers().add(part); // -----------

        inv = new Invoice();
        part = new Partner();
        part.setName("Maxima");
        inv.setSeller(part);
        inv.setCustomer(new Partner());
        inv.setInvoiceNum("Third_87675");
        inv.getItems().add(new Item("Kojines"));
        inv.getItems().add(new Item("Megztinis"));
        com.getInvoices().add(inv);
        com.getSellers().add(part); // -----------


        InvoiceSearch search = new InvoiceSearch();

        List<Invoice> searchItem = search.searchByItem(com, "Kojines");
        List<Invoice> searchSeller = search.searchBySeller(com, "Akropolis");
        List<Invoice> searchCustomer = search.searchByCustomer(com, "Antanas");

        for (Invoice invoice : searchItem) {
            System.out.println(invoice.getInvoiceNum());
        }


    }

}
