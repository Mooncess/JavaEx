package pure_function;

// Неизменяемый класс
public final class MutableClass {
    private final int val;

    public MutableClass(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public MutableClass valAdd(int delta) {
        return new MutableClass(val + delta);
    }
}
