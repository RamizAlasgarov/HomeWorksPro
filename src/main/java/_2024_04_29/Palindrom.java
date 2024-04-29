package _2024_04_29;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Palindrom {
    public static void main(String[] args) {
        String s = "maddam1";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String message) {
        List<Character> list = new LinkedList<>();
        char[] character = message.toCharArray();
        for (int i = 0; i < character.length; i++) {
            list.add(character[i]);
        }
        int previousIndex = 0;
        int lastIndex = list.size()-1;
        boolean isPalindrome = true;
        Iterator<Character> iterator = list.listIterator();
        ListIterator<Character> listIterator = list.listIterator(list.size());
        while (iterator.hasNext() && listIterator.hasPrevious() && previousIndex < lastIndex) {
            if (iterator.next() != listIterator.previous()) {
                isPalindrome = false;
                break;
            }
            previousIndex++;
            lastIndex--;
        }
        return isPalindrome;
    }
}
