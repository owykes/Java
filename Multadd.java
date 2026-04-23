public class Multadd {
    public static double multadd(double a, double b, double c) {
        return (a * b + c);
    }

    public static double expSum(double x) {
        double exp = Math.exp(-x);
        return multadd(x, exp, Math.sqrt(1 - exp));
    }

    public static void main(String[] args) {
        // test
        System.out.println(multadd(1.0, 2.0, 3.0));
        
        double equation1 = multadd(1.0, Math.sin(Math.PI / 4), Math.cos(Math.PI / 4) / 2);
        double equation2 = multadd(1.0, Math.log(10), Math.log(20));
        
        System.out.println(equation1);
        System.out.println(equation2);
    }
}
