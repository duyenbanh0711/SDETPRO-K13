package lab_02;

import java.util.Scanner;

public class lab_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kỳ: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.printf("%d là số chẵn", number);
        } else {
            System.out.printf("%d là số lẻ", number);
        }
    }
}
