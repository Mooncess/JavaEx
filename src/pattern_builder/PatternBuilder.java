package pattern_builder;

public class PatternBuilder {
    public static void main(String[] args) {
        GameConsole myGameConsole = new GameConsoleBuilderImplXBOX().setBrand().setPortable(true).setRelease(2004).setModel("ONE").build();
        myGameConsole.info();
        GameConsole myGameConsole2 = new GameConsoleBuilderImplPS().setBrand().setPortable(false).setRelease(2016).setModel("4").build();
        myGameConsole2.info();
    }
}

class GameConsole {
    private String brand;
    private String model;
    private boolean portable;
    private int release;

    public void info() {
        System.out.println(brand + " | " + model + " | " + " | Portable: " + portable + " | " + release);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public void setRelease(int release) {
        this.release = release;
    }
}

interface GameConsoleBuilder {
    public GameConsoleBuilder setBrand();
    public GameConsoleBuilder setModel(String model);
    public GameConsoleBuilder setPortable(boolean portable);
    public GameConsoleBuilder setRelease(int release);
    GameConsole build();
}

class GameConsoleBuilderImplXBOX implements GameConsoleBuilder {
    private GameConsole gc = new GameConsole();

    @Override
    public GameConsoleBuilder setBrand() {
        gc.setBrand("XBOX");
        return this;
    }
    @Override
    public GameConsoleBuilder setModel(String model) {
        gc.setModel(model);
        return this;
    }

    @Override
    public GameConsoleBuilder setPortable(boolean portable) {
        gc.setPortable(portable);
        return this;
    }

    @Override
    public GameConsoleBuilder setRelease(int release) {
        gc.setRelease(release);
        return this;
    }

    @Override
    public GameConsole build() {
        return gc;
    }
}

class GameConsoleBuilderImplPS implements GameConsoleBuilder {
    private GameConsole gc = new GameConsole();

    @Override
    public GameConsoleBuilder setBrand() {
        gc.setBrand("PS");
        return this;
    }
    @Override
    public GameConsoleBuilder setModel(String model) {
        gc.setModel(model);
        return this;
    }

    @Override
    public GameConsoleBuilder setPortable(boolean portable) {
        gc.setPortable(portable);
        return this;
    }

    @Override
    public GameConsoleBuilder setRelease(int release) {
        gc.setRelease(release);
        return this;
    }

    @Override
    public GameConsole build() {
        return gc;
    }
}
