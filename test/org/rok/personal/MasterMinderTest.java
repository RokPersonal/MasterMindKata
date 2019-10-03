package org.rok.personal;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class MasterMinderTest {
    protected MasterMinder victim;

    void initVictim(){
        victim = new MasterMinder();
    }

//    @Test
//    void assignSecret_NoParameters() {
//        initVictim();
//        try{
//            victim.assignSecret();
//            fail("You need at least one peg");
//
//        } catch (InvalidParameterException invalidPara){
//            assertNotNull(invalidPara);
//            assertEquals(invalidPara.getMessage(), "Some Message");
//        }
//    }
//
//    @Test
//    void assignSecret_OnePeg() {
//        initVictim();
//        try{
//            victim.assignSecret("Red");
//            assertTrue(false);
////            assertTrue(victim.hasSecret());
//
//        } catch (InvalidParameterException invalidPara){
//            fail("Did not recognize a valid secret");
//        }
//    }
//
//    @Test
//    void assignSecret_MorePegs() {
//        initVictim();
//        try{
//            victim.assignSecret("Red", "Blue");
//            assertTrue(false);
////            assertTrue(victim.hasSecret());
//
//        } catch (InvalidParameterException invalidPara){
//            fail("Did not recognize a valid secret");
//        }
//    }

    @Test
    void evaluateTest_GettingStarted() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"D", "F"},new String[] {"F", "G"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
//        evaluate([blue], [red]) should return [0, 0]
//        evaluate([blue], [blue]) should return [1, 0]
//        evaluate([red, yellow], [blue, red]) should return [0, 1]

    }

    @Test
    void evaluateTest_TestOnePegDoesNotMatch() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue"},new String[] {"red"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 0, "Nothing well placed");
        assertEquals(evaluateResult[1], 0, "Nothing well misplaced");
    }

    @Test
    void evaluateTest_OnePegDoesMatch() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue"},new String[] {"blue"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 1, "everything well placed");
        assertEquals(evaluateResult[1], 0, "Nothing well misplaced");
    }

    @Test
    void evaluateTest_TwoPegsOneMisplaced() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"red", "yellow"},new String[] {"blue", "red"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 1, "everything well placed");
        assertEquals(evaluateResult[1], 0, "Nothing well misplaced");
    }

    @Test
    void evaluateTest_ProvidedTests() {
//        evaluate([blue], [red]) should return [0, 0]
//        evaluate([blue], [blue]) should return [1, 0]
//        evaluate([red, yellow], [blue, red]) should return [0, 1]
        fail("We have not done anything yet");
    }


}