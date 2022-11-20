package Product;
import java.util.Scanner;


 public class Product{
    private int id;
    private String name;
    private String producer;
    private double price;
    private double expiration_date;
    private int number;


    public Product() {
    }

    public Product(int id_, String name_, String producer_, double price_, double expiration_date_, int number_){
        id = id_;
        name = name_;
        producer = producer_;
        price = price_;
        expiration_date = expiration_date_;
        number = number_;
    }
     public void Substitute(int id_, String name_, String producer_, double price_, double expiration_date_, int number_){
         id = id_;
         name = name_;
         producer = producer_;
         price = price_;
         expiration_date = expiration_date_;
         number = number_;
     }

    public void setValue(){

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("ID:");
        this.id = scanner.nextInt();
        System.out.println("Найменування");
        this.name = scanner1.nextLine();
        System.out.println("Власник");
        this.producer = scanner2.nextLine();
        System.out.println("Ціна");
        this.price = scanner3.nextDouble();
        System.out.println("Термін зберігання");
        this.expiration_date = scanner4.nextDouble();
        System.out.println("Кількість");
        this.number = scanner5.nextInt();



    }
    public int getId(){
        return id;
    }
     public String getName(){
         return name;
     }
     public String getProducer(){
         return producer;
     }
     public double getPrice(){
         return price;
     }
     public double getExpiration_date(){
         return expiration_date;
     }
     public int getNumber(){
         return number;
     }

     public String toString(){
         return "id: " + id +
                 "; Ім'я: " + name +
                 "; Виробник: " + producer +
                 "; Ціна: " + price +
                 "; Термін зберігання: " + expiration_date +
                 "; Кількість:  " + number;
     }

}