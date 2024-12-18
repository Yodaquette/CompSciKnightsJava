package org.mga.compsciknights.java.foundations;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class PassByValuePassByReference {

    private static final Logger log = LoggerFactory.getLogger(PassByValuePassByReference.class);

    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8};
        int[] odd = {1, 3, 5, 7, 9};
        int[] fib = {0, 1, 1, 2, 3, 5};
        int index = 0;

        // Example of Pass by Value
        addTo(even[index], odd[index]);
        log.info("value of even[{}] after running addTo(): {}", index, even[index]);
        log.info("value of odd[{}] after running addTo(): {}", index, odd[index]);

        // Example of Pass by Reference
        addTo(even, odd, index);
        log.info("value of even[{}] after running addTo(): {}", index, even[index]);
        log.info("value of odd[{}] after running addTo(): {}", index, odd[index]);
    }

    public static void addTo(int even, int odd) {
        int two = 2;
        even += two;
        odd += two;
        log.info("value of \"even\" after addition: {}", even);
        log.info("value of \"odd\" after addition: {}", odd);
    }

    public static void addTo(int[] even, int[] odd, int index) {
        int two = 2;
        even[index] += two;
        odd[index] += two;
    }

}
