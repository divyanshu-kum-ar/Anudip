import java.util.*;
public class Car{
    String make;
    String model;
    short year;
    int price;
    Car(String make,String model,short year,int price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    void display(){
      System.out.println("Car details: Maker - " + make + 
                   ", Model - " + model + 
                   ", Year - " + year + 
                   ", Price - " + price);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Car make");
        String make=sc.nextLine();
        System.out.println("Enter the model");
        String model=sc.nextLine();
        System.out.println("Enter the Car year");
        short year =sc.nextShort();
        System.out.println("Enter the Car price");
        int price=sc.nextInt();
        Car obj=new Car(make,model,year,price);
        obj.display();
    }
}