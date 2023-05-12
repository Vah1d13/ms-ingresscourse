package factoryDesignPattern;
public class Software {
    public static void main(String[] args) {
        var developerFactory = createDeveloper(ProgrammingLanguage.JAVA);
        var developer = developerFactory.createDeveloper();
        developer.writeCode();


    }

    private static DeveloperFactory createDeveloper (ProgrammingLanguage programmingLanguage){
        return switch (programmingLanguage){
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
        };
    }
}
