/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package masgrande;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }

    @Test
    public void testCardinalidad() {
        assertEquals(0, MasGrande.max(new int [] {}));
        assertEquals(2, MasGrande.max(new int [] {2}));
        assertEquals(6, MasGrande.max(new int [] {2, 4, 6}));
        
    }
    
    @Test
    public void testOrden() {
        assertEquals(6, MasGrande.max(new int [] {6, 2, 4}));
        assertEquals(6, MasGrande.max(new int [] {4, 6, 2}));
        assertEquals(6, MasGrande.max(new int [] {4, 2, 6}));
        
    }
    
    @Test
    public void testRango() {
        assertEquals(2147483647, MasGrande.max(new int [] {0, 2147483647}));
        //assertEquals(6, MasGrande.max(new int [] {0, 2147483648}));
        assertEquals(0, MasGrande.max(new int [] {0, -2147483648}));
        //assertEquals(6, MasGrande.max(new int [] {0, -2147483649}));
        
    }
    
    @Test
    public void testOtros() {
        assertEquals(-2, MasGrande.max(new int [] {-2, -4, -6}));
        assertEquals(4, MasGrande.max(new int [] {4, -2, 2}));
        //assertEquals(0, MasGrande.max(new int [] {null}));
        //assertEquals(6, MasGrande.max(new int [] {2, null, 6}));
        
    }
    
}
