package org.rok.personal;

import java.security.InvalidParameterException;
import java.util.ArrayList;

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

        int[] result = new int[]{0,0};
        boolean[] used = new boolean[guess.length];
        int[] misplaced = new int[guess.length];
        int misplacedLength = 0;

        // check for well placed matches
        for (int i = 0; i < guess.length; i++){
            used[i] = guess[i].compareToIgnoreCase(secret[i]) == 0;
            if (!used[i]){
                misplaced[misplacedLength++] = i;
            } else {
                result[0]++;
            }
        }

        // check for misplaced
        for (int misplacedIndex = 0; misplacedIndex < misplacedLength; misplacedIndex++){
            for (int i = 0; i < used.length; i++){
                if (!used[i]) {
                    if (guess[misplacedIndex].compareToIgnoreCase(secret[i]) == 0){
                        result[1]++;
                        used[i] = true;
                    }
                }
            }
        }

        return result;
    }

}
