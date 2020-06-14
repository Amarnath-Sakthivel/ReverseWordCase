package com.wipro.practice;

public class ReverseWordCase {
    static String reverseWordsCase(String input1, int input2) {
        String output = "";
        if (input2 == 0) {
            for (String split : input1.split(" ")) {
                StringBuilder sb = new StringBuilder(split);
                sb.reverse();
                output += sb.toString() + " ";
            }
            System.out.println(output);
        } else {
            String out = "";
            for (String split : input1.split(" ")) {
                if (split.charAt(split.length() - 1) == ',') {
                    StringBuilder sb = new StringBuilder(split);
                    sb.reverse();
                    out += sb.toString() + " ";
                } else {
                    StringBuilder sb = new StringBuilder(split);
                    sb.reverse();
                    output = sb.toString() + " ";
                    output = output.toLowerCase();
//                    System.out.println("output: "+output);
                    StringBuilder sb1 = new StringBuilder(output);
                    char[] arr = split.toCharArray();
                    char[] arr1 = output.toCharArray();
                    for (int i = 0; i < arr.length; i++) {
                        if (Character.isUpperCase(arr[i])) {
                            int pos = i;
                            char c = Character.toUpperCase(arr1[i]);
                            sb1.setCharAt(pos, c);
                        }
                    }
                    out += sb1.toString();
                }
            }
            System.out.println(out);
        }
//        System.out.println(output);

        return null;
    }

    public static void main(String args[]) {
        String input1 = "Wipro TechNologies BangaLore";

        String input2 = "Wipro Technologies, Bangalore";
        String input3 = "Wipro, TechNologies BangaLore";


        System.out.println("Test Case 1");
        System.out.println(input1);
        reverseWordsCase(input1, 0);

        System.out.println("\n");

        System.out.println("Test Case 2");
        System.out.println(input2);
        reverseWordsCase(input2, 0);

        System.out.println("\n");

        System.out.println("Test Case 3");
        System.out.println(input3);
        reverseWordsCase(input3, 0);

        System.out.println("\n");

        System.out.println("Test Case 4");
        System.out.println(input2);
        reverseWordsCase(input2, 1);

        System.out.println("\n");

        System.out.println("Test Case 5");
        System.out.println(input2);
        reverseWordsCase(input2, 1);

        System.out.println("\n");

        System.out.println("Test Case 6");
        System.out.println(input3);
        reverseWordsCase(input3, 1);
    }
}
