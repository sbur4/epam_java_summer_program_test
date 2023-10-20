public class Test6 {
    public static void main(String[] args) {
        int m = 9, n = 1, x = 0;
        while (m > n) {
            m--;
            n += 2;
            x += m + n;
            // 1. m=8 n=3 => 0 + 11 = 11
            // 2. m=7 n=5 => 11 + 12 = 23
            // 3. m=6 n=7 => 23 + 13 = 36
        }
        System.out.println(x);
    }
}

// 36