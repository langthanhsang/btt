package bt;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerCandy {
    ArrayList<Candy> candies = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addCandy() {
//        System.out.println("nhập id : ");
//        int id = scanner.nextInt();
        System.out.println("nhập màu sắc");
        String color = scanner.nextLine();
        System.out.println("nhập tính chất : ");
        String property = scanner.nextLine();
        System.out.println("nhập số lương : ");
        int amout = scanner.nextInt();
        System.out.println("nhập đơn giá");
        int price = scanner.nextInt();
        Candy candys = new Candy(color, property, amout, price);

        candies.add(candys);
    }

    public void delete() {
        int id = scanner.nextInt();
        for (Candy candy : candies) {
            if (id == candy.getId()) {
                candies.remove(candy);
            }
        }
    }

    public void edit(int id, Scanner scanner) {
        Candy candyeidt = null;
        for (Candy candy : candies) {
            if (id == candy.getId()) {
                candyeidt = candy;
                System.out.println("nhập màu sắc");
                candyeidt.setColor(scanner.nextLine());
                System.out.println("nhập tính chất :");
                candyeidt.setProperty(scanner.nextLine());
                System.out.println("nhập số lương :");
                candyeidt.setAmount(scanner.nextInt());
                System.out.println("nhập giá");
                candyeidt.setPrice(scanner.nextInt());
                System.out.println(candies);
            }
        }

    }

    public void display() {
        System.out.println(candies);
    }

    public void deleteAllCandy() {


    }

    public void displayCandyByColor() {
        int id = scanner.nextInt();
        for (Candy candy : candies) {
            if (id == candy.getId()) {
                System.out.println(candy);
            }
        }

    }

    public void findMaxPriceCandy() {
        int max = candies.get(0).getPrice();
        for (int i = 0; i < candies.size(); i++) {
            if (max < candies.get(0).getPrice()) {
                max = candies.get(0).getPrice();
                System.out.println(max);
            }
        }

    }

    public void priceCandybyiID() {
        int id = scanner.nextInt();
        for (Candy candy : candies) {
            if (id == candy.getId()) {
                System.out.println(candy);
            }
        }

    }
}
