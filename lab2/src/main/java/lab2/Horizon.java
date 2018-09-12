package lab2;

public class Horizon
{
    public static void main(String[] args)
    {
        String lastName = "Белялов";
        String group = "ИВТ/б-11-о";
        String str = str(lastName, group);

        int a = 25; //шестнадцатиричка
        short b = 67;//восмиричка
        byte c = -3;//Дисетиричка, наличие ведущих нулей, ширина 8(мин кол-во цифр)
        float f = 23.122f;//Наличие ведущих нулей, Ширина 9, точность 4
        double d = 124.21412151212124;//Ширина 7, Точность 3( кол-во цифр после запятой, обязательный вывод знака, отсутствие ведущих нулей

        System.out.printf("str=%s, a= %x, b=%o, c=%08d, f=%09.4f, d=%7.3f \n", str, a, b, c, f, d);

    }
    public static String str(String a, String b)
    {
        return a + " " + b;
    }
}
