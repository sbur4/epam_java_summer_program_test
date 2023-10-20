/**
 * !(A || B) means "not (A or B)." This is equivalent to "not A and not B" using De Morgan's Laws.
 * <p>
 * So, !(A || B) simplifies to !A && !B.
 * <p>
 * Now, you have !A && !B and (!A && B).
 * <p>
 * You want to perform a logical AND operation between these two expressions.
 * <p>
 * Let's evaluate it:
 * <p>
 * !A && !B means "not A and not B," and (!A && B) means "not A and B."
 * When you perform a logical AND between "not A and not B" and "not A and B," the result is always false. This is
 * because the two expressions are mutually exclusive; they cannot both be true at the same time.
 * <p>
 * So, the final result of the expression !(A || B) && (!A && B) is false.
 */

public class Test20 {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = true;
        System.out.println(!(A || B) && (!A && B));
        // (!A or !B) and (!A and B)
        // (true or false) and (true and true)
        // true and true
        // false
    }
}

// false