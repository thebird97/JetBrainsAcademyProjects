import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String man = sc1.nextLine();

        if (man.equals("gryffindor")) {
            System.out.println("bravery");
        } else if (man.equals("hufflepuff")) {
            System.out.println("loyalty");
        } else if (man.equals("slytherin")) {
            System.out.println("cunning");
        } else if (man.equals("ravenclaw")) {
            System.out.println("intellect");
        } else {
            System.out.println("not a valid house");
        }

    }
}