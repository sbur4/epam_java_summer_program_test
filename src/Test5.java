public class Test5 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = o1;
        Object o3 = o1;
    }
}

// So, you have three reference variables (o1, o2, and o3) but only one Object instance, resulting in
// two references pointing to the same object.