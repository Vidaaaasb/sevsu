package lab3;


public class Dawn
{
    public static  void main(String[] args)
    {
        int a = 986;
        int b = 25;
        int c = a%b*2-b/4;
        int sum = a+b;
        int min = a-b;
        int multi = a*b;
        int devi = a/b;
        int mod = a%b;

        System.out.printf("a = %s (2) = %x (16) = %o (8) = %d (10), b = %s (2) = %x (16) = %o (8) = %d (10), c = %s (2) = %x (16) = %o (8) = %d (10) \n", Integer.toBinaryString(a), a, a, a, Integer.toBinaryString(b), b, b, b, Integer.toBinaryString(c), c, c, c);
        System.out.println(" -" + a + " a+b=" + sum + " a-b=" + min + " a*b=" + multi + " a/b=" + devi + " a%d=" + mod);
        a++;
        b--;
        System.out.println(" a++ =" + a + " b-- =" + b);
    }
}
