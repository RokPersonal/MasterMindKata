package org.rok.personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MasterMinderTest {
    protected MasterMinder victim;

    void initVictim(){
        victim = new MasterMinder();
    }

    @Test
    void assignSecret() {
        initVictim();
        victim.assignSecret();
    }
}