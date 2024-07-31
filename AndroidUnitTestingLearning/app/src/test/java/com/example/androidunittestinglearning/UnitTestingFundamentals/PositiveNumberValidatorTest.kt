package com.example.androidunittestinglearning.UnitTestingFundamentals

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PositiveNumberValidatorTest{

    private lateinit var positiveNumberValidator: PositiveNumberValidator
    @Before
    fun positiveNumberClass(){
        positiveNumberValidator = PositiveNumberValidator()
    }

    @Test
    fun testingNegativeValues(){
        val result = positiveNumberValidator.isPostive(-1)
       Assert.assertEquals(false,result)
    }
}