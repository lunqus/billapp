package Data;

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

        item = "Mercedes Benz";
        service = "Financial Services";


        System.out.println( "Preke: " + item);
        System.out.println( "Paslauga: " + service);

    }
}
