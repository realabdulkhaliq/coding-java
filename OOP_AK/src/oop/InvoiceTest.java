
import oop.Invoice;


public class InvoiceTest {
public static void main(String args[]){
    Invoice v1=new Invoice("bag","big",6,400);
    Invoice v2=new Invoice("Shirt","red",3,350);
    System.out.println("Invoice 1: "+v1.getPN()+"\n"+v1.getPD()+"\n"+v1.getQ()+"\n"+v1.getP());
    System.out.println("Invoice 1: "+v2.getPN()+"\n"+v2.getPD()+"\n"+v2.getQ()+"\n"+v2.getP());
    System.out.println("Totel of Invoice 1: "+v1.getInvoiceamount());
    System.out.println("Totel of invoice 2: "+v2.getInvoiceamount());
}}