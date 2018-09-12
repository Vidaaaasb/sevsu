package lab2;

public class Horizon
{
    public static void main(String[] args)
    {
        String lastName = "Белялов";
        String group = "ИВТ/б-11-о";
        String str = str(lastName, group);

        int a = 25;
        short b = 67;
        byte c = -3;
        float f = 23.122f;
        double d = 124.21412151212124;
        System.out.printf("Привет, %s, a= %x, b=%o, c=%08d, d=%7.3f! \n", str, a, b, c, f, d);
    }
    public static String str(String a, String b)
    {
        return a + " " + b;
    }
}
