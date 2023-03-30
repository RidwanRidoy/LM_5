public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(15.0, 30.0));
        System.out.println(calc.sub(30.0, 20.0));
        System.out.println(calc.mul(15.0, 25.0));
        System.out.println(calc.div(45.0, 15.0));
    }
}
