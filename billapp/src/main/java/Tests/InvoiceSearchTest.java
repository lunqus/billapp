package Test;

import com.billapp.Controller.InvoiceSearch;
import com.billapp.Model.Company;
import com.billapp.Model.Invoice;
import com.billapp.Model.Item;
import com.billapp.Model.Partner;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InvoiceSearchTest {

    Invoice inv = new Invoice();
    Company com = new Company();
    Partner part = new Partner();

    private final InvoiceSearch searchTest = new InvoiceSearch();
    // String itemName = "Kojines";

    @Test
    public void searchByItem (Company company, String itemName) {

        List<Invoice> searchItem = new ArrayList<>();
        //List<Invoice> searchItems = new ArrayList<>();

        for (Invoice invoice : company.getInvoices()) {

            for (Item item : invoice.getItems()) {

                if (item.getName().contains(itemName)) {
                    searchItem.add(invoice);
                }

            }
        }
        for (Invoice invoice : searchItem) {
            System.out.println("Sąskaitos Nr. " + invoice.getInvoiceNum() + " " + "Prekės: ");
            for (Item item : invoice.getItems()){
                System.out.println(item.getName());
            }

    }


    }

}
