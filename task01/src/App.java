import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double num1;
        double num2;
        double value = 0;
        String operator;
        String userInput = "";

        System.out.println("Welcome");
        Scanner scan = new Scanner(System.in);

        while (!(userInput.equals("exit"))) {

            userInput = scan.nextLine();

            String[] equation = userInput.split(" ");

            operator = equation[1];



            if (equation[0].equals("$last")) {

                num1 = value;
            } else {
                num1 = Double.valueOf(equation[0]);
            }

            if (equation[2].equals("$last")) {

                num2 = value;
            } else {

                num2 = Double.valueOf(equation[2]);
            }

            if (operator.equals("+")) {

                value = num1 + num2;
                System.out.println(value);

            }
            if (operator.equals("-")) {

                value = num1 - num2;
                System.out.println(value);

            }
            if (operator.equals("/")) {

                value = num1 / num2;
                System.out.println(value);
            }
            if (operator.equals("*")) {

                value = num1 * num2;
                System.out.println(value);
            }

        }

    }
}

