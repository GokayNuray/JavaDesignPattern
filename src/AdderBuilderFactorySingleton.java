public class AdderBuilderFactorySingleton extends AbstractAdderBuilderFactory {

    private static final AdderBuilderFactorySingleton INSTANCE = new AdderBuilderFactorySingleton();

    public static AdderBuilderFactorySingleton getInstance() {
        return INSTANCE;
    }

    private AdderBuilderFactorySingleton() {
    }

    @Override
    public AdderBuilder createAdderBuilder() {
        return new AdderBuilder();
    }
}
