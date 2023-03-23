/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masgrande;

/**
 *
 * @author usuario
 */
public class MasGrande {
    public static int max(int[] a) {
        int i, m = 0;
        
        if(a.length > 0)
            m = a[0];
        
        for(i = 0; i < a.length; i++) {
            if(a[i] > m)
                m = a[i];
            
        }
        
        return m;
    }
    
}
