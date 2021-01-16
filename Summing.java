
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Author : Brian Klein Date : Description :
 */
public class Summing implements SummingInterface {

    /**
     * Sum returns the sum of the integers in the input array. The method must
     * call the thrower.check(value) method for each integer in the input array.
     * Returns Integer.MAX_VALUE if the sum is greater or equal to
     * Integer.MAX_VALUE. Returns Integer.MIN_VALUE if the sum is lesser or
     * equal to Integer.MIN_VALUE. This method should not exit with an error
     * being thrown. For all error conditions, (i.e. null pointer exception),
     * Integer.MIN_VALUE should be returned. Note: For a zero length array, 0
     * should be returned. Returns Integer.
     */
    public int sum(int[] input, PossiblyThrow thrower) {
        int sumValue = 0;
        int value = 0;
        long test = 0;

        try {
        if (input == null) {
            sumValue = Integer.MIN_VALUE;
        } else {

            for (int i = 0; i < input.length; i++) {
                value = input[i];

                try {
                    thrower.check(value);
                
                    test += value;
                    
                    System.out.println(test);
                    if (test > Integer.MAX_VALUE) {
                        sumValue = Integer.MAX_VALUE;
                    } else if (test < Integer.MIN_VALUE) {
                        sumValue = Integer.MIN_VALUE;
                    } else {
                        sumValue = Math.addExact(sumValue, value);
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Overflow was detected");
                } catch (Exception ex) {
                    Logger.getLogger(Summing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }//end for
        }
        } catch (NullPointerException e) {
            sumValue = Integer.MIN_VALUE;
        }
        return sumValue;
    }

}
