package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Info
{

    public static void main(String[] args)
    {
        String firstName = "Белялов";
        String middleName = "Февзи";
        String lastName = "Рустемович";
        String teacherFirstName = "Татьаяна";
        String teacherMiddleName = "Викторовна";
        String teacherLastName = "Волкова";
        String groupCode = "ИВТ/б-11-о";

        String pattern = "dd.mm.yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String currentDate = simpleDateFormat.format(new Date());

        int variant = 4;
        int numberofseatsinthecinema = 3455;
        int numberofrooms= 3;
        int thenumberofseatsinthehall = numberofseatsinthecinema / numberofrooms;

        String fullName = fullName(firstName, middleName, lastName);
        String fullTeacherName = fullName(teacherFirstName, teacherMiddleName, teacherLastName);

        System.out.println("Прогрумму выполнил: \n" + fullName);
        System.out.println("Дата: " + currentDate);
        System.out.println("Вариант: " + variant);
        System.out.println("Шифр группы: " + groupCode);
        System.out.println("Количество мест в кинотеатре: " + numberofseatsinthecinema );
        System.out.println("Количество залов: " + numberofrooms);
        System.out.println("Количество мест в зале: " + thenumberofseatsinthehall);
        System.out.println("Проверил: \n" + fullTeacherName);
    }

    public static String fullName(String a, String b, String c)
    {
        return a + " " + b + " " + c;
    }
}