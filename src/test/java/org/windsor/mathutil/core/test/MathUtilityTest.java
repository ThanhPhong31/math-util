/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.windsor.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.windsor.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(69, 69);
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        //TDD: TEST DRIVEN DEVELOPMENT
        //Kĩ Thuật lập trình mà dân dev viết code đến đâu thì viết bộ test case đến đó (JUnit, NUnit, Mocha) và dùng 2 màu xanh đỏ để đảm bảo chất lượng code và chất lượng hàm
        
        //
    }

}
