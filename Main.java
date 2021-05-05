package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner get_num = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = get_num.nextInt();

        while (num != 1){
            if (num % 2 == 0){
                num = num / 2;
                System.out.println(num);
            }
            else {
                num = num * 3 + 1;
                System.out.println(num);
            }
        }
    }
}
