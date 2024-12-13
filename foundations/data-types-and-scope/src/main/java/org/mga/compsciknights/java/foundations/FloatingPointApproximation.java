package org.mga.compsciknights.java.foundations;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class FloatingPointApproximation {

    private static final Logger log = LoggerFactory.getLogger(FloatingPointApproximation.class);

    public static void main (String[] args) {

        // Primitive data type calculations can have floating-point approximation errors
        double a = 20.0D;
        double b = 20.2D;
        double c = 0.1D;
        log.info("a == {}, b == {}", a, b);

        a += c;
        b -= c;
        log.info("now, a == {}, b == {}", a, b);
        assert(a != b);
    }

}
