package Test;

import com.billapp.Controller.InvoiceSearch;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvoiceSearchTest {

    private final InvoiceSearch searchTest = new InvoiceSearch();

    @Test
    public void searchByItem() {

        assertArrayEquals(searchTest.searchByItem().contains("Kojines"));

    }
}