public class task1{
    public static void main(String[] args) {
        int a = 48;
        int b = 16;
        int c = 21;
        //arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        //relational operators
        System.out.println("a > b - " + (a > b));
        System.out.println("a < b - " + (a < b));
        System.out.println("a = b - " + (a == b));
        System.out.println("a <= b - " + (a <= b));
        System.out.println("a >= b - " + (a >= b));

        //Logical Operators

        System.out.println((a > b) && (c > a));
        System.out.println((a > b) && (c < a));
        System.out.println((a < b) || (c > a));
        System.out.println((a > b) || (c < a));
        System.out.println((a < b) || (c < a));
        System.out.println(!(a == b));
        System.out.println(!(a > b));

        //bitwice operators

        System.out.println(a >> 2);
        System.out.println(a << 3);
        System.out.println(a ^ b);
        System.out.println(a & b);
        System.out.println(~a);

        //assignment operators

        System.out.println(a += a );
        System.out.println(a *= a );
        System.out.println(a /= a );
        System.out.println(a %= a );


    }
}
