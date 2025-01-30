package org.mga.compsciknights.java.foundations.oop.impl;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class AndrewTest {

    @Test
    void test() {
        Andrew blah = new Andrew();
        blah.setName("Andrew");
        blah.communicate("test");
        blah.communicate(blah.getName());
    }

}
