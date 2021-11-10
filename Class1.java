//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//class Class1 {
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a String:");
//        String in = s.nextLine();
//
//        for (int i = 0; i < in.length(); i++) {
//            char c = in.charAt(i);
//
//            if (i % 2 == 0) {
//                System.out.print(c);
//                System.out.println();
//
//                class Class {
//                    public static String lastThree(String s) {
//                        if (s.length() > 3) {
//                            return s.substring(s.length() - 3);
//                        } else {
//                            return s;
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//public class StringMethod {
//    public static String longestWord(String[] words) {
//        int index = 0;
//        int maxSize = 0;
//        for (int i = 0; i < words.length; i++) {
//            words[i].length();
//            if (words[i].length() > maxSize) {
//                maxSize = words[i].length();
//                index = i;
//            }
//        }
//        return words[index];
//    }
//}
//
//public class StringMethod_ {
//    public static boolean isPalindrome(String word) {
//        //TODO: Complete this method
//        String wordBackwards = "";
//        for (int i = 0; i < word.length(); i++) {
//             wordBackwards = word.charAt(i) + wordBackwards;
//        }
//        if (wordBackwards.equals(word)) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//}