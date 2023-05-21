package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int num2 = number % 10;

        int num1 = number / 10;
        int num3 = num1 % 10;

        int num4 = num1 / 10;
        int num5 = num4 % 10;

        int num6 = num4 / 10;

        System.out.println(num2 + num3 + num5 + num6);

    }

}

