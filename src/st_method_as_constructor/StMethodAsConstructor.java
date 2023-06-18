package st_method_as_constructor;

public class StMethodAsConstructor {
    public static void main(String[] args) {
        ColorWithConstructor colorWithConstructor = new ColorWithConstructor(16);
        System.out.println(colorWithConstructor.getHex());

        Color color = Color.makeFromHex(16);
        System.out.println(color.getHex());
    }

}

class ColorWithConstructor {
    private final int hex;
    ColorWithConstructor(String rgb) {
        this(Integer.parseInt(rgb, 16));
    }
    ColorWithConstructor(int red, int green, int blue) {
        this(red << 16 + green << 8 + blue);
    }
    ColorWithConstructor(int h) {
        this.hex = h;
    }

    public int getHex() {
        return hex;
    }
}

class Color {
    private final int hex;
    static Color makeFromRGB(String rgb) {
        return new Color(Integer.parseInt(rgb, 16));
    }
    static Color makeFromPalette(int red, int green, int blue) {
        return new Color(red << 16 + green << 8 + blue);
    }
    static Color makeFromHex(int h) {
        return new Color(h);
    }
    private Color(int h) {
        this.hex = h;
    }

    public int getHex() {
        return hex;
    }
}