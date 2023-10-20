public class Test18 {
    public static void main(String[] args) {
        int x = 1;
        Integer y = new Integer(x);
        int[] z = { x };
        m(x, y, z);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z[0]);
    }

    static void m(int x, Integer y, int[] z) {
        x++;
        y++;
        z[0]++;
    }
}

// 1 1 2