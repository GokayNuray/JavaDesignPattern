public class AdderBuilderFactory extends AbstractAdderBuilderFactory {

    @Override
    public AdderBuilder createAdderBuilder() {
        return new AdderBuilder();
    }
}
