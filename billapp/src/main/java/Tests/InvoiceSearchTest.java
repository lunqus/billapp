import java.util.List;

import org.junit.Test;

import com.billapp.Controller.InvoiceSearch;
import com.billapp.Model.Company;
import com.billapp.Model.Invoice;
import com.billapp.Model.Item;
import com.billapp.Model.Partner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceSearchTest {

    Invoice inv = new Invoice();
    Company com = new Company();
    Partner part = new Partner();

    @Test
    public void searchByItem() {
        Company com = new Company();
        // com.setInvoices(new ArrayList<>());
        // com.getInvoices().add(new Invoice());

        Partner part = new Partner();
        part.setName("Akropolis");

        Invoice inv = new Invoice();
        inv.setSeller(part);
        // ---
        part = new Partner();
        inv.setCustomer(part);
        part.setName("Antanas");
        // ---
        inv.setInvoiceNum("First_1237");
        inv.getItems().add(new Item("Kojines"));
        inv.getItems().add(new Item("Kojines"));
        com.getInvoices().add(inv);
        // com.getSellers().add(part); // -----------

        inv = new Invoice();
        part = new Partner();
        part.setName("Rimi");
        inv.setSeller(part);
        // ---
        part = new Partner();
        inv.setCustomer(part);
        part.setName("Petras");
        // ---
        // inv.setCustomer(new Partner());
        inv.setInvoiceNum("Second_563253");
        inv.getItems().add(new Item("Pirstines"));
        inv.getItems().add(new Item("Liemene"));
        inv.getItems().add(new Item("Kelnes"));
        com.getInvoices().add(inv);
        // com.getSellers().add(part); // -----------

        inv = new Invoice();
        part = new Partner();
        part.setName("Maxima");
        inv.setSeller(part);
        // ---
        part = new Partner();
        inv.setCustomer(part);
        part.setName("Antanas");
        // ---
        // inv.setCustomer(new Partner());
        inv.setInvoiceNum("Third_87675");
        inv.getItems().add(new Item("Kojines"));
        inv.getItems().add(new Item("Megztinis"));
        com.getInvoices().add(inv);
        // com.getSellers().add(part); // -----------

        InvoiceSearch search = new InvoiceSearch();

        List<Invoice> searchItem = search.searchByItem(com, "Kojines");

        assertEquals(2, searchItem.size());
    }

}