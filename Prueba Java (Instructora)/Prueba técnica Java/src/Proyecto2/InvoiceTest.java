package Proyecto2;
import junit.framework.TestCase;

public class InvoiceTest extends TestCase {
    public void factura(Proyecto2.MainTotalInvoice MainTotalInvoice){
        MainTotalInvoice = new MainTotalInvoice();
    }
    public void MainTotalInvoice(){
        assertTrue(Factura.MainTotalInvoice(54, 456)==(54 + 456));
    }
}
