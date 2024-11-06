/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Abdul Khaliq
 */
public class Invoice {
    String partnum;
    String partdis;
    int qua;
    double pri;
    public  Invoice(String pnum, String pdis, int q, double p){
        if(pnum != null) partnum=pnum; else partnum="Retry";
        if(pdis != null) partdis=pdis; else partdis="Retry";
        if(q>0) qua=q; else qua=0;
        if(p>0) pri=p; else pri=0;}

   
        
        
         public String getPN(){
            return partnum;}
         public String getPD(){
             return partdis;}
         public int getQ(){
             return qua;}
         public double getP(){
             return pri;}
         public void setPN(String pnum){
            if(pnum != null){ partnum=pnum;} else {partnum="Retry";} }
        public void setPD(String pdis){
           if(pdis != null) {partdis=pdis;} else {partdis="Retry";}}
        public void setQ(int q){
             if(q>0) {qua=q;} else {qua=0;}}
        public void setP(double p){
          if(p>0) {pri=p;} else {pri=0;}}
        public double getInvoiceamount(){
            return (double)qua*pri;}
             
        }
    