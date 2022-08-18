/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatorsmp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of MakeFormula method, of class Operations.
     */
    //Test para ver si make formula tiene la longitud correcta
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "yes";
        String result = Operations.MakeFormula();
        int resultado2= result.length();
        if (resultado2>= 5 && resultado2<=11){
            result ="yes";
        }
        assertEquals(expResult,result);
    }


    /**
     * Test of Solve method, of class Operations.
     */
    /*@Test
    public void testSolve() {
        System.out.println("Solve");
        String formula = "";
        String expResult = "";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
       
    }*/
    
}
