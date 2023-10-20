public class Test13 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a) {
            System.out.println("a");
        } else if (a && b) {
            System.out.println("a && b");
        } else {
            if (!b) {
                System.out.println("!b");
            } else {
                System.out.println("else");
            }
        }
        // a = false b = false > else =====> !b
        // a = true b = true > a && b =====> a
        // a = true b = false > !b =====> a
        // a = false b = true > else +
    }
}