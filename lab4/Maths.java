package lab4;

public class Maths
{
    public static void main(String[] args)
    {
        int var = 4%14;
        System.out.printf("Вариант: %d\n", var);
        double m;
        int r;
        m = 716.2;
        r = 2;
        double pow_r = (Math.pow(r, 3));
        double p = Math.log((pow_r + Math.pow(10, 3))/((pow_r - 1)));
        double n = Math.exp(-Math.sin(m)+Math.tan((Math.PI*r)/p));
        System.out.println("Ответ " + n);
    }
}
