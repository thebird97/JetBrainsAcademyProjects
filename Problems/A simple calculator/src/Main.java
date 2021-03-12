import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        int a = sc1.nextInt();
        String operationString = sc1.next();
        int b = sc1.nextInt();

        int solution = 0;

        if (operationString.equals("+")) {
            solution = a + b;
            System.out.println(solution);
        } else if (operationString.equals("-")) {
            solution = a - b;
            System.out.println(solution);
        } else if (operationString.equals("/")) {
            if (b == 0) {
                System.out.println("Division by 0!");
            } else {
                solution = a / b;
                System.out.println(solution);
            }

        } else if (operationString.equals("*")) {
            solution = a * b;
            System.out.println(solution);
        }
        else{
            System.out.println("Unknown operator");
        }


    }
}