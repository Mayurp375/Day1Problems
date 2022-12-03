package Day1Problem;

public class staticBlock {
    static int age = 22;//static veriable

    static void myAge() {//static method
        System.out.println(age);
    }

    static {//static block
        System.out.println("this is mayur.and my age is " + age);
    }

    public static void main(String[] args) {
        System.out.println(staticBlock.age);
        staticBlock.myAge();
    }
}
