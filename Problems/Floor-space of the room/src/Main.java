import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String shape = sc1.nextLine();
        if (shape.equals("triangle")) {
            double a = sc1.nextInt();
            double b = sc1.nextInt();
            double c = sc1.nextInt();
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(area);
        } else if (shape.equals("rectangle")) {
            double a = sc1.nextInt();
            double b = sc1.nextInt();
            double area = a * b;
            System.out.println(area);
        } else if (shape.equals("circle")) {
            double r = sc1.nextInt();

            double area = r * r * 3.14;
            System.out.println(area);
        }
    }
}