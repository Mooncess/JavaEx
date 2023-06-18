package pure_function;

public class PureFunction {
    public static void main(String[] args) {
        System.out.println(add(15, 25));
        MutableClass mutableClass1 = new MutableClass(15);
        MutableClass mutableClass2 = mutableClass1.valAdd(15);
        System.out.println(mutableClass2.getVal());
    }

    // Чистая функция
    private static int add(int x, int y) {
        return x + y;
    }
}

