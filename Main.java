package bt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandy managerCandy = new ManagerCandy();
        int choice;

        do {
            System.out.println("****menu****");
            System.out.println("1.disAllCandy");
            System.out.println("2. add candy : ");
            System.out.println("3.delete candy ; ");
            System.out.println("4. edit candy");
            System.out.println("5. delete all candy");
            System.out.println("6.displayCandyByColor");
            System.out.println("7.findMaxPriceCandy");
            System.out.println("8.priceCandybyName");System.out.println("7.findMaxPriceCandy");
            System.out.println("0. exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.disAllCandy");
                    managerCandy.display();
                    break;
                case 2:
                    System.out.println("2. add candy : ");
                    managerCandy.addCandy();
                    break;
                case 3:
                    System.out.println("3.delete candy ; ");
                    managerCandy.delete();
                    break;
                case 4:
                    System.out.println("4. edit candy");
                    int id = scanner.nextInt();
                    managerCandy.edit(id,scanner);
                    break;
                case 5:
                    System.out.println("5. delete all candy");
                    break;
                case 6:
                    System.out.println("6.displayCandyByColor");

                    break;
                case 7:
                    System.out.println("7.findMaxPriceCandy");

                    break;
                case 8:
                    System.out.println("7.findMaxPriceCandy");
                    break;
                case 0:
                    System.out.println("0. exit");
                    break;
            }
        }while (choice !=0);

    }
}
