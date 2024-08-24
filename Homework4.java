import java.awt.*;
import java.util.ArrayList;

public class Homework4
{
    public static void main(String[] args)
    {

        String test = "Hello from Romario Troianovskii !";
        String test_2 = "Hello world";


        test_2 = StringManipulator.reversWords(test_2);
        test = StringManipulator.reversWords(test);

        System.out.println(test_2);
        System.out.println(test);


        String test2 = "teststeseeqeqeqeqeqeeeeeqqq";
        String test2_2 = "tytytuyutyutyy7";


        test2_2 = StringManipulator.removeDuplicates(test2_2);
        test2 = StringManipulator.removeDuplicates(test2);


        System.out.println(test2_2);
        System.out.println(test2);


        String test3 = "Bob";
        String test3_2 = "not palindrome";


        System.out.println(StringManipulator.isPalindrome(test3));
        System.out.println(StringManipulator.isPalindrome(test3_2));

        String test4 = "I write it at 00:04)))";
        String test4_2 = "I'm very tired!";

        System.out.println(StringManipulator.countWords(test4_2));
        System.out.println(StringManipulator.countWords(test4));
    }
}
class StringManipulator
{
    public static String reversWords(String stringWithWords)
    {
        String temp = "";
        String res = "";
        String[] words = stringWithWords.split(" ");
        for (int i = 0; i < words.length/2; i++) {
            temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
            temp = "";
        }
        for(String _res : words)
        {
            res += _res + " ";
        }
        return res;
    }

    static boolean isPalindrome(String str)
    {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }

    static int countWords(String input)
    {
        return input.split(" ").length;
    }

    public static String  removeDuplicates(String _str)
    {
        StringBuilder stringBuilder = new StringBuilder(_str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if(stringBuilder.charAt(i) == stringBuilder.charAt(j))
                {
                    stringBuilder.delete(j, j + 1);
                    j--;
                }
            }
        }
        return stringBuilder.toString();
    }
}
