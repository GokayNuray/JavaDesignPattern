public class Main {
    public static void main(String[] args) {
        AbstractAdderBuilderFactory factory = new AdderBuilderFactory();
        AdderBuilder builder = factory.createAdderBuilder();
        builder.setA(5);
        builder.setB(7);
        Adder adder = builder.build();
        int result = adder.result;
        System.out.println(result);
    }
}