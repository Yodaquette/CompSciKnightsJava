package org.mga.compsciknights.java.foundations;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
class VariablesTest {

    org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(VariablesTest.class);

    @Test
    void defaultConstructorSetsAllMemberVariables() {
        log.info("START verifying the Variables default constructor");
        Variables variables = new Variables();

        assertThat(
                "Default value for aString", variables.getaString(),
                equalTo("this is a string.")
        );
        assertThat("Default value for anInt", variables.getAnInt(),
            equalTo(0)
        );
        assertThat("Default value for aFloat", variables.getaFloat(),
            equalTo(0F)
        );
        assertThat("Default value for aDouble", variables.getaDouble(),
            equalTo(0D)
        );
        log.info("DONE verifying the Variables default constructor");
    }

    @Test
    void constructorAcceptsAStringValue() {
        log.info("START verifying Variables constructor with a String argument.");
        String testMsg = "this is a test";
        Variables variables = new Variables(testMsg);

        assertThat(
            "Constructor taking a String argument succeeds",
            variables.getaString(),
            equalTo(testMsg)
        );
        log.info("DONE verifying Variables constructor with a String argument.");
    }

    @Test
    void constructorHandlesEmptyString() {
        log.info("START verifying the Variables constructor with an empty String.");
        String testMsg = "";
        Variables variables = new Variables(testMsg);

        assertThat(
            "Constructor handles an empty String argument",
            variables.getaString(),
            equalTo("no string was provided.")
        );
        log.info("DONE verifying the Variables constructor with an empty String.");
    }

    @Test
    void constructorHandlesNull() {
        log.info("START verifying the Variables constructor with a null.");
        Variables variables = new Variables(null);

        assertThat(
            "Constructor handles an empty String argument",
            variables.getaString(),
            equalTo("no string was provided.")
        );
        log.info("DONE verifying the Variables constructor with a null.");
    }

}
