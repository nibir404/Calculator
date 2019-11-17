public class Real {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Calculator c = new Calculator();
        c.Div();
        c.Mul();
        c.Sub();
        c.Sum();
        System.out.println(c.result1);
        System.out.println(c.result2);
        System.out.println(c.result3);
        System.out.println(c.result4);
    }
}
