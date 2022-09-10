package src.fraz;

/**
 * Example:
 * 4! = 4x3x2x1 = 24
 * <p>
 * Rule: 0! = 1
 */
public class Factorial {
    public int find(int number) {
        // As per the rule.
        if (number == 0) return 1;

        int factorial = 0;
        for (int i = number; i >= 1; i--) {
            // n! = n * (n-1) * (n-2) .... 2, 1, 0
            factorial = number * (number - 1);
        }
        return factorial;
    }
}
