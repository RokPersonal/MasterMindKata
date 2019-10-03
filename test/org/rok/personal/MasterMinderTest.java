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
//        evaluate([blue], [red]) should return [0, 0]
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue"},new String[] {"red"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 0, "0 well placed");
        assertEquals(evaluateResult[1], 0, "0 misplaced");
    }

    @Test
    void evaluateTest_OnePegDoesMatch() {
//        evaluate([blue], [blue]) should return [1, 0]
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue"},new String[] {"blue"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 1, "1 well placed");
        assertEquals(evaluateResult[1], 0, "0 misplaced");
    }

    @Test
    void evaluateTest_TwoPegsBothMatch_DifferentColor() {
//        evaluate([red, yellow], [blue, red]) should return [0, 1]
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue", "red"},new String[] {"blue", "red"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 2, "2 well placed");
        assertEquals(evaluateResult[1], 0, "0 misplaced");
    }

    @Test
    void evaluateTest_TwoPegsBothMatch_SameColor() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue", "blue"},new String[] {"blue", "blue"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 2, "2 well placed");
        assertEquals(evaluateResult[1], 0, "0 misplaced");
    }

    @Test
    void evaluateTest_ThreePegsMatch_SameColor() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue", "blue", "blue"},new String[] {"blue", "blue", "blue"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 3, "3 well placed");
        assertEquals(evaluateResult[1], 0, "0 misplaced");
    }

    @Test
    void evaluateTest_ThreePegsMatch_AllDifferentColors() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"blue", "red", "green"},new String[] {"blue", "red", "green"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 3, "3 well placed");
        assertEquals(evaluateResult[1], 0, "0 misplaced");
    }

    @Test
    void evaluateTest_TwoPegsOneMisplaced() {
        int[] evaluateResult = MasterMinder.evaluate(new String[] {"red", "yellow"},new String[] {"blue", "red"});
        assertNotNull(evaluateResult, "Return Something");
        assertEquals(evaluateResult.length, 2, "Returns two numbers");
        assertEquals(evaluateResult[0], 0, "0 well placed");
        assertEquals(evaluateResult[1], 1, "1 misplaced");
    }
// TODO: Add in more tests

}