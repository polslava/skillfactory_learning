import java.util.Arrays;
import java.util.Scanner;


public class core_m3 {

    public static void main(String[] args) {
        //3.2.1
        String t1 = "Sometimes";
        System.out.println(t1.substring(2,3));
        //3.2.2
        String user1 = "Иван Иванов";
        String user2 ="иван иванов";
        System.out.println(user1.equals(user2));
        //3.2.3
        System.out.println(user1.equalsIgnoreCase(user2));
//3.2.4
        if (user1.equalsIgnoreCase(user2))
        {
            System.out.println("Выберите другое имя пользователя");
        } else
        {
            System.out.println("Отличное имя!");
        }
//3.2.5
        checkUserName(user1,user2);
        //3.2.6
        checkUserName_6(user1,user2+"_1");
        //3.2.7
        checkUserName_7(user1,user2+"_1");
        //3.2.8.1
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
        //3.2.8.2
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName =  checkName_8_2(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!"); //3.2.8.2

            }
            else {
                System.out.println(formatName_8_3(name)); //3.2.8.3
            }
        }
    }
    //3.2.5
    public static void checkUserName(String t1, String t2)
    {
        if (t1.equalsIgnoreCase(t2))
        {
            System.out.println("Выберите другое имя пользователя");
        } else
        {
            System.out.println("Отличное имя!");
        }
    }

    //3.2.6
    public static void checkUserName_6(String t1, String t2)
    {
        if (t1.equalsIgnoreCase(t2))
        {
            System.out.println("Выберите другое имя пользователя");
        } else
        {
            System.out.println("Отличное имя!");
            int i1 = t2.length();
            System.out.println("Ваше имя имеет длину "+i1+" символов");
        }
    }
    //3.2.7
    public static void checkUserName_7(String t1, String t2)
    {
        if (t1.equalsIgnoreCase(t2))
        {
            System.out.println("Выберите другое имя пользователя");
        } else
        {
            System.out.println("Отличное имя!");
            int i1 = t2.length();
            System.out.println("Ваше имя имеет длину "+i1+" символов");

            int i2 = t2.replaceAll(" ", "").length();
            System.out.println("А без пробелов ваше имя занимает "+i2+" символов");
        }
    }
    //3.2.8.1
    private static String removeWhiteSpaces(String str) {
        //Написать код здесь
        String str1 = str.replaceAll(" ", "");
        return str1;
    }
    //3.2.8.2
    private static boolean checkName_8_2(String name) {
        //Написать код здесь
        String name0 = name.replaceAll("-",""); //при наличии дефиса два слова = одному слову
        String name1 = name0.trim(); //отсекаем пробелы слева и справа
        int i0 = name1.length() - name1.replaceAll(" ","").length(); //узнаём количество пробелов для определения количества слов
        boolean ll=false;
        if (i0>2||i0<2)
        {ll= false;
        } //если пробелов <> 2
        else if (i0==2) {//если пробелов =2
            int i1 = name1.indexOf(" "); //ищем 1й пробел
            String name1_1 = name1.substring(0, i1 - 1); //берём строку до первого пробела
            String name2 = name1.substring(i1 + 1); //берём строку от первого пробела
            int i2 = name2.indexOf(" "); //ищем 2й пробел
            String name2_1 = name2.substring(0, i2 - 1); //берём строку до второго пробела
            String name3 = name2.substring(i2 + 1); //берём строку от второго пробела
            ll= true;
        }
        return ll;
    }
    //3.2.8.3
    private static String formatName_8_3(String name) {
        //Написать код здесь
        String name1 = name.trim();
        int i1 = name1.indexOf(" "); //ищем 1й пробел
        String name1_1 = name1.substring(0, i1 ); //берём строку до первого пробела
        String name1_2 = name1_1.substring(0,1).toUpperCase()+name1_1.substring(1);
        String name2 = name1.substring(i1 + 1); //берём строку от первого пробела
        int i2 = name2.indexOf(" "); //ищем 2й пробел
        String name2_1 = name2.substring(0, i2 ); //берём строку до второго пробела
        String name2_2 = name2_1.substring(0,1).toUpperCase()+name2_1.substring(1);
        String name3 = name2.substring(i2 + 1); //берём строку от второго пробела
        String name3_2 = name3.substring(0,1).toUpperCase()+name3.substring(1);
        String[] arr1 = {name1_2,name2_2,name3_2};
        sortByLength_8_3(arr1);

        return name1_2+" "+name2_2+" "+name3_2;

    }
    private static void sortByLength_8_3(String[] words) {
        //Написать код здесь
        int[] arr2 = {0,0,0};
        for (int j=0;j<3;j=j+1)
        {
            arr2[j]= words[j].length();
        }
        Arrays.sort(arr2);
    }

}
