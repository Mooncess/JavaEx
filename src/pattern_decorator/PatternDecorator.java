package pattern_decorator;

public class PatternDecorator {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaTeamLead(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}

interface Developer {
    String makeJob();
}

class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write java code...";
    }
}

class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}

class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make code review...";
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + makeCodeReview();
    }
}

class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report...";
    }

    @Override
    public String makeJob() {
        return developer.makeJob() + sendWeekReport();
    }
}
