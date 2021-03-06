/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Shreshta
 */
public class testFoodOrdering {
    CustomerDetails cd;
    ItemProcessing I[];
    public testFoodOrdering() {
        CustomerDetails cd;
        ItemProcessing I[];
    }
    
    @BeforeClass
    public static void setUpClass() {
       CustomerDetails cd=new CustomerDetails();
       ItemProcessing I[] =new ItemProcessing[10];
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testGetCustomerName() {
         assertEquals("aditi",cd.getCustomerName("aditi"));
    }
     
     public void testGetCustomerPhone() {
         try{
            assertEquals("9449605448",cd.getCustomerPhone("9449605448"));
            assertEquals(0,cd.getCustomerPhone("94496058"));
            fail();
         }
 catch (CustomerDetails.invalidStringLengthException ex) {
            Logger.getLogger(testFoodOrdering.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
     
     public void testPrintCode(){
         assertEquals(0,I[0].printCode(0));
     }
     
     public void testPrintItemName(){
         assertEquals("Lemon Coriander",I[0].printItemName(0));
     }
     
     public void testPrintUnitPrice(){
         assertEquals(70,I[0].printUnitPrice(0));
     }
     
     public void testPrintSubTotal(){
         assertEquals(140,(I[0].printSubTotal(0,I[0].getQuantity(0,2),I[0].printUnitPrice(0))));
     }
}
