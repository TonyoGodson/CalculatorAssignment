package com.example.classwork

import org.junit.Assert.*

import org.junit.Test

class TestingcalculatorTest {

    //testing Sums=======
    //test--1
    @Test
    fun testSumWhen_NumbersArePositive() {
        //given
        var num1:Int = 4
        var num2:Int = 7

        //when
        var output:Int = Testingcalculator().testSum(num1,num2)

        assertEquals(11, output)

    }
    //test--2
    @Test
    fun testSumWhen_aNegativeResultIsExpected_inAnAdditionOperation() {
        //given
        var num1:Int = -4
        var num2:Int = -7

        //when
        var output:Int = Testingcalculator().testSum(num1,num2)

        assertEquals(-11, output)

    }
    //test--3
    @Test
    fun testSumFor_positiveAndNegative_numbers() {
        //given
        var num1:Int = -3
        var num2:Int = 8

        //when
        var output:Int = Testingcalculator().testSum(num1,num2)

        assertEquals(5, output)

    }
    //test--4
    @Test
    fun testSum_toReturn_False() {
        //given
        var num1:Int = -3
        var num2:Int = 8

        //when
        var output:Int = Testingcalculator().testSum(num1,num2)

        assertEquals(2, output)

    }
    //test--5
    @Test
    fun testSum_toReturn_False2() {
        //given
        var num1:Int = -3
        var num2:Int = -6

        //when
        var output:Int = Testingcalculator().testSum(num1,num2)

        assertEquals(2, output)

    }

    //Testing Subtractions

    //Test--1
    @Test
    fun testSubWhen_NumbersArePositive() {
        //given
        var num1:Int = 12
        var num2:Int = 19

        //when
        var output:Int = Testingcalculator().testSub(num1,num2)

        //assert
        assertEquals(7, output)
    }
    //Test--2
    @Test
    fun testSubWhen_aPositiveResultIsExpected_inASubtractionOperation() {
        //given
        var num1:Int = -15
        var num2:Int = -9

        //when
        var output:Int = Testingcalculator().testSub(num1,num2)

        //assert
        assertEquals(6, output)
    }

    //test--3
    @Test
    fun testSubFor_positiveAndNegative_numbers() {
        //given
        var num1:Int = -3
        var num2:Int = 8

        //when
        var output:Int = Testingcalculator().testSub(num1,num2)

        assertEquals(11, output)
    }

    //test--4
    @Test
    fun testSub_toReturn_False() {
        //given
        var num1:Int = -3
        var num2:Int = 8

        //when
        var output:Int = Testingcalculator().testSub(num1,num2)

        assertEquals(9, output)
    }

    //test--4
    @Test
    fun testSub_toReturn_False2() {
        //given
        var num1:Int = -3
        var num2:Int = 12

        //when
        var output:Int = Testingcalculator().testSub(num1,num2)

        assertEquals(6, output)
    }


    //Testing Multiplication
    //Test--1
    @Test
    fun testMulWhen_theNumbersAre_positive() {
        //given
        var num1:Int = 12
        var num2:Int = 3

        //when
        var output:Int = Testingcalculator().testMul(num1,num2)

        //assert
        assertEquals(36, output)
    }
    //Test--2
    @Test
    fun testMulWhen_theNumbersAre_negative() {
        //given
        var num1:Int = -9
        var num2:Int = -5

        //when
        var output:Int = Testingcalculator().testMul(num1,num2)

        //assert
        assertEquals(45, output)
    }

    //Test--3
    @Test
    fun testMulWhen_theNumbersAre_negativeAndPositive() {
        //given
        var num1:Int = -7
        var num2:Int = 4

        //when
        var output:Int = Testingcalculator().testMul(num1,num2)

        //assert
        assertEquals(-28, output)
    }
    //Test--4
    @Test
    fun testMulWhen_itReturns_false() {
        //given
        var num1:Int = -9
        var num2:Int = -5

        //when
        var output:Int = Testingcalculator().testMul(num1,num2)

        //assert
        assertEquals(13, output)
    }
    //Test--5
    @Test
    fun testMulWhen_itReturns_false2() {
        //given
        var num1:Int = 9
        var num2:Int = -3

        //when
        var output:Int = Testingcalculator().testMul(num1,num2)

        //assert
        assertEquals(10, output)
    }

    //Testing Division
    //Test--1
    @Test
    fun testDivWhen_NumbersArePositive() {
        //given
        var num1:Float = 12.0F
        var num2:Float = 6.0F

        //when
        var output:Float = Testingcalculator().testDiv(num1,num2)

        //assert
        assertEquals(2.0F, output)
    }
    //Test--2
    @Test
    fun testDivWhen_aNegativeResultIsExpected_inAnAdditionOperation() {
        //given
        var num1:Float = -12.0F
        var num2:Float = 6.0F

        //when
        var output:Float = Testingcalculator().testDiv(num1,num2)

        //assert
        assertEquals(-2.0F, output)
    }
    //Test--3
    @Test
    fun testDivFor_positiveAndNegative_numbers() {
        //given
        var num1:Float = -18.0F
        var num2:Float = 6.0F

        //when
        var output:Float = Testingcalculator().testDiv(num1,num2)

        //assert
        assertEquals(-3.0F, output)
    }
    //Test--4
    @Test
    fun testDiv_toReturn_False() {
        //given
        var num1:Float = 35.0F
        var num2:Float = 7.0F

        //when
        var output:Float = Testingcalculator().testDiv(num1,num2)

        //assert
        assertEquals(8.0F, output)
    }
    //Test--5
    @Test
    fun testDiv_toReturn_False2() {
        //given
        var num1:Float = 50.0F
        var num2:Float = 10.0F

        //when
        var output:Float = Testingcalculator().testDiv(num1,num2)

        //assert
        assertEquals(8.0F, output)
    }
}