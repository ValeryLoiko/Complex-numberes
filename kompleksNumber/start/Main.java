package les10.homeWork.kompleksNumber.start;

import les10.homeWork.kompleksNumber.entity.Numbers;
import les10.homeWork.kompleksNumber.logic.Logic;

public class Main {
    public static void main(String[] args) {
        int numA1, numA2, numB1, numB2;
        Logic logic = new Logic();

        System.out.println("Введите 1 значкние для Z1 : ");
        numA1 = logic.enterNumber();

        System.out.println("Введите 2 значкние для Z1 : ");
        numB1 = logic.enterNumber();

        System.out.println("Введите 1 значкние для Z2 : ");
        numA2 = logic.enterNumber();

        System.out.println("Введите 2 значкние для Z2 : ");
        numB2 = logic.enterNumber();

        Numbers numberZ1 = new Numbers(numA1, numB1);

        Numbers numberZ2 = new Numbers(numA2, numB2);

        logic.operationSum(numberZ1, numberZ2);

        System.out.println();

        logic.operationSubtract(numberZ1, numberZ2);





    }
}
