public class AdderBuilder {

    int a;
    int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Adder build() {
        return new Adder(a, b);
    }
}
