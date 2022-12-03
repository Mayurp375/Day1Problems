package Day1Problem;

public class displayDefoultValue {
    int integer;
    String string;
    char charector;
    boolean bool;
    double aDouble;

    void toPrint() {
        System.out.println("displayDefoultValue{" +
                "integer=" + integer +
                ", string='" + string + '\'' +
                ", charectr=" + charector +
                ", bool=" + bool +
                ", aDouble=" + aDouble +
                '}');
    }

    public static void main(String[] args) {
        displayDefoultValue displayDefoultValue = new displayDefoultValue();

        System.out.println("the defoult values are below");
        displayDefoultValue.toPrint();

    }
}
