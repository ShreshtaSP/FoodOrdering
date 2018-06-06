/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreshta
 */
class CustomerDetails {

    static String getCustomerName(String i) {
     return i;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getCustomerPhone(String string) throws invalidStringLengthException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(string.length()!=10)
            throw new invalidStringLengthException();
        else 
            return string;
    }

    class invalidStringLengthException extends Exception {

     invalidStringLengthException() {
        super();
    }
    
}
    
}

class ItemProcessing{

    static int printCode(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return i;
    }
    
  
    static String printItemName(int i) {
        String itemName=null;
        if(i==0)
            itemName="Lemon Coriander Soup";
        else if(i==1)
            itemName="Manchow Soup";
        else if(i==2)
            itemName="Paneer Chilly";
        else if(i==3)
            itemName="Paneer Sizzling";
        else if(i==4)
            itemName="Paneer Sautte";
        else if(i==5)
            itemName="Veg Crunchy";
        else if(i==6)
            itemName="Manchurian Noodles";
        else if(i==7)
            itemName="BabyCorn Manchurian";
        else if(i==8)
            itemName="Fried Rice";
        else if(i==9)
            itemName="Schezwan Rice";

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        return itemName;
    }

    int printUnitPrice(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     int unitPrice=0;
        if(i==0)
            unitPrice=70;
        else if(i==1)
            unitPrice=80;
        else if(i==2)
            unitPrice=120;
        else if(i==3)
            unitPrice=130;
        else if(i==4)
            unitPrice=150;
        else if(i==5)
            unitPrice=100;
        else if(i==6)
            unitPrice=110;
        else if(i==7)
            unitPrice=120;
        else if(i==8)
            unitPrice=120;
        else if(i==9)
            unitPrice=200;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
        return unitPrice;   
    }
    
    int getQuantity(int i,int j) {
        return j;
    }
    
    int printSubTotal(int i,int j,int unitPrice){
        return j*unitPrice;
    }
}


