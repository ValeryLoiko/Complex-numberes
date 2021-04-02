package les10.homeWork.kompleksNumber.logic;

import les10.homeWork.kompleksNumber.entity.Numbers;

import java.util.Scanner;

public class Logic {

    public int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int number;

//        System.out.println("Введите число :");
        while (!sc.hasNextInt()) {
            System.out.println("Вы ввели ересь");
            sc.nextLine();
        }
        number = sc.nextInt();
        System.out.println("Вы ввели число : " + number);
        return number;
    }

    public void operationSum(Numbers numberZ1, Numbers numberZ2) {

        int rezult1 = (numberZ1.getA() + numberZ2.getA());
        int rezult2 = (numberZ1.getB() + numberZ2.getB());

        System.out.println("Сумма Z1 + Z2 = " + rezult1 + " + " + rezult2 + "i");

    }
    public void operationSubtract(Numbers numnerZ1, Numbers numberZ2){
        int rezult1 = numnerZ1.getA() - numberZ2.getA();
        int rezult2 = numnerZ1.getB() - numberZ2.getB();

        System.out.println("Разность Z1 - Z2 = " + rezult1 + " - " + rezult2 + "i");
    }
}
