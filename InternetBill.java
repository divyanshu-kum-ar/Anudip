import java.util.Scanner;
public class InternetBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total data consumed in GB : ");
        double data = sc.nextDouble();
        double bill;

        if (data < 10) {
            bill = 300; // Basic charge
        } else if (data <= 30) {
            bill = 300 + 5 * (data - 10);
        } else {
            bill = 400 + 3 * (data - 30);
        }

        System.out.println("Total Bill Amount: Rs " + bill);
    
    }
}

    

