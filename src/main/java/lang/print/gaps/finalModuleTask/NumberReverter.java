package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int num1 = number / 100;
        int num2 = number % 100 / 10;
        int num3 = number % 10;

        System.out.println(num3 +""+num2+""+num1);


    }
}
