/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package DAL;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author gabriel
 */
public class ZeroMqRequestNGTest {
    
    public ZeroMqRequestNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of sendRequest method, of class ZeroMqRequest.
     */
    @Test
    public void testSendRequest() {
        System.out.println("sendRequest");
        String req = "";
        ZeroMqRequest.sendRequest(req);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of receiveReply method, of class ZeroMqRequest.
     */
    @Test
    public void testReceiveReply() {
        System.out.println("receiveReply");
        String expResult = "";
        String result = ZeroMqRequest.receiveReply();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
