package pers.cjw.API;

public class StringPractice6 {
    public static void main(String[] args) {
        String str1 = "8 8 8 8A i i OOl       lllaa";
        String str2 = "A";

        int count = 0;
        for (int i = 0; i < str1.length(); ++i) {
            if (String.valueOf(str1.charAt(i)).equalsIgnoreCase(str2)) {
                ++count;
            }
        }
        System.out.println(count);

    }
}
