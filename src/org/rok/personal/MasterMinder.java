package org.rok.personal;

import java.security.InvalidParameterException;

public class MasterMinder {
    public static String BLUE = "blue";
    public static String RED = "red";
    public static String YELLOW = "yellow";

    public MasterMinder() {

    }

    public void assignSecret(String ... pegs) throws InvalidParameterException {

    }

    public static int[] evaluate(String[] secret, String [] guess){
        int[] result = new int[]{0,0};
        return result;
    }

}
