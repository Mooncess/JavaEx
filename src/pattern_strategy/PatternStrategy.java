package pattern_strategy;

public class PatternStrategy {
    public static void main(String[] args) {
        Student student = new Student();

        student.setActivity(new Sleep());
        student.executeActivity();

        student.setActivity(new Study());
        student.executeActivity();

        student.setActivity(new Chill());
        student.executeActivity();
    }
}

interface Activity {
    void justDoIt();
}

class Sleep implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Сплю...");
    }
}

class Study implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Учусь...");
    }
}

class Chill implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Отдыхаю...");
    }
}

class Student {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
