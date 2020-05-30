package task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;


public class slovoNaA {
    public static void main(String[] args) {
        System.out.println("Введите символ начинающеся на А ");
        while (true) {
            String str = new Scanner(System.in).nextLine();
            char[] ch = str.toCharArray();
            if (check(ch)) {
                System.out.println("Cпасибо! Информация введена верно");
                break;
            } else {
                System.out.println("Некорректно, попробуйте еще раз: ");
            }
        }
    }

    public static boolean check(char[] ch) {
        if (ch[ch.length - 1] == 'A' || ch[ch.length - 1] == 'a') {
            for (int i = 0; i < ch.length - 1; i++) {
                if (!Character.isDigit(ch[i])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}