/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.windsor.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    

    public static long getFactorial(int n) {
        int product = 1;
        if(n<0 || n>20 )
            throw new IllegalArgumentException("Invalid n. n must between 0..20, plz");
        if (n == 0 || n == 1) 
            return 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        return product;
    }

}
