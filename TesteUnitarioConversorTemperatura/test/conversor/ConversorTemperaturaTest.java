package conversor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTemperaturaTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testSomeMethod() {
        
    }

    /**
     * Test of converteCelciusParaFahrenheit method, of class ConversorTemperatura.
     */
    @Test
    public void testConverteCelciusParaFahrenheit() {
        System.out.println("converteCelciusParaFahrenheit");
        double celsius = 16.0;
        double expResult = 60.8;
        double result = ConversorTemperatura.converteCelciusParaFahrenheit(celsius);
        assertEquals(expResult, result, 60.8);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of converteFahrenheitParaCelsius method, of class ConversorTemperatura.
     */
    @Test
    public void testConverteFahrenheitParaCelsius() {
        System.out.println("converteFahrenheitParaCelsius");
        double fahrenheit = 60.;
        double expResult = 16.0;
        double result = ConversorTemperatura.converteFahrenheitParaCelsius(fahrenheit);
        assertEquals(expResult, result, 16.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
