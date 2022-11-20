
import java.util.Scanner;
import Product.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Продукти:");
        int N = 5;

        Product[] products = new Product[N];

        for (int i  =0;i<N;i++){
            Product add = new Product();
            add.setValue();
            products[i]= add;

        }

        System.out.println("\nВведіть назву товару:");
            String name_ = scanner.nextLine();
            int a = 0;
            System.out.println("\n Товари з ім'ям " + "\"" + name_ + "\"" + ":");
            for (int i = 0; i < N; i++) {
                if (products[i].getName().equals(name_)) {
                    System.out.println(products[i].toString());
                    a = 1;
                }

            }
            if (a == 0) {
                System.out.println(" відсутні");
            }
            System.out.println("---------------------------------------");
            System.out.println("\nВведіть назву товару:");
            String name_2 = scanner.nextLine();
            System.out.println("\nВведіть ціну, яку не має перевищувати заданий товар:");
            double price_ = scanner.nextDouble();
            a = 0;
            System.out.println("\n Товари з ім'ям " + "\"" + name_2 + "\"" + "та з ціною, що не перевищує" + "\"" + price_ + "\"" + ":");
            for (int i = 0; i < N; i++) {
                if ((products[i].getName().equals(name_) && (price_ >= products[i].getPrice()))) {
                    System.out.println(products[i].toString());
                    a = 1;
                }

            }
            if (a == 0) {
                System.out.println(" відсутні");
            }
            System.out.println("---------------------------------------");
            System.out.println("\nВведіть термін зберігання, який більший заданого:");
            double expiration_date_ = scanner.nextDouble();
            System.out.println("\nТовари термін зберігання яких більший за " + "\"" + expiration_date_ + "\"" + ": ");
            a = 0;
            for (int i = 0; i < N; i++) {

                if (products[i].getExpiration_date() > expiration_date_) {
                    System.out.println(products[i].toString());
                    a = 1;
                }

            }
            if (a == 0) {
                System.out.println(" відсутні");
            }


        }
    }
