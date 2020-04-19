import java.util.*;

class Anagram {

    static boolean areAnagram(String str1, String str2){

        HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2 = new HashMap<Character, Integer>();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
//        System.out.println(arr2);

        // Map first string
        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            }
            else {
                Integer c = (int)hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }

        // Map second String
        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = (int)hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        if (hmap1.equals(hmap2))
            return true;
        else
            return false;
    }

    // Test function
    public static void test(String str1, String str2)
    {


        // Find the result
        if (areAnagram(str1, str2))
            System.out.println("True!     The two strings are anagrams of each other\n");
        else
            System.out.println("False!     The two strings are not anagrams of each other\n");
    }


    public static void main(String args[])
    {
        // Example 1
//        String str1 = "fairy tales";
//        String str2 = "rail safety";

        // Example 2
        String str1 = "fairy tales";
        String str2 = "Rail safety";

        // Example 3
//        String str1 = "hi there";
//        String str2 = "bye there";

        System.out.println("Strings being tested are :\n"
                + str1 + "\n" + str2 + "\n");

        // Convert entire string to lower case
        String lc_str1 = str1.toLowerCase();
        String lc_str2 = str2.toLowerCase();
//        System.out.println(lc_str2);

        // Test the Strings
        test(lc_str1, lc_str2);
    }


}

