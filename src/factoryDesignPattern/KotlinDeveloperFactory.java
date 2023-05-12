package factoryDesignPattern;

public class KotlinDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
