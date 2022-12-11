package lab_02;

import java.util.Scanner;

public class lab_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Please enter a weight (kg): ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height*2);

        if (BMI < 18.5){
            System.out.println("Underweight");
            float expect = 18.5f * (height*2);
            System.out.printf("You need to gain %f kg",expect-weight);
        }else if(BMI <= 24.9){
            System.out.println("Normal weight");
        } else if (BMI <= 29.9) {
            System.out.println("Overweight ");
            float expect = 24.9f * (height*2);
            System.out.printf("You need to lose %f kg",weight - expect);
        }else {
            System.out.println("Obesity");
            float expect = 24.9f * (height*2);
            System.out.printf("You need to lose %f kg",weight - expect);
        }
    }
}
