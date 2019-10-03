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

    public static int[] evaluate(String[] secret, String [] guess) throws InvalidParameterException{
        if (secret == null){
            throw new InvalidParameterException("No secret provided");
        }
        if (guess == null){
            throw new InvalidParameterException("No guess Provided");
        }
        if (secret.length != guess.length){
            throw new InvalidParameterException("Secret and guess must be the same length");
        }

        boolean[] used = new boolean[guess.length];
        int[] result = new int[]{0,0};
        // check for well placed matches
        for (int i = 0; i < guess.length; i++){
            used[i] = guess[i].compareToIgnoreCase(secret[i]) == 0;
            result[0]++;
        }

        return result;
    }

}
