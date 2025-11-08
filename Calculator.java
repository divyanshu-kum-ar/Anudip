public class Calculator {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println("Sum of two integer :" +obj.add(1,2));
        System.out.println("Sum of three interger :" +obj.add(1,3,5));
        System.out.print("Sum of two dobules :" +obj.add(2.5,6.5));
    }
    int add(int a,int b){
        return a+b;

    }
     int add(int a,int b,int c){
        return a+b+c;
        
    }
     double add(double a,double b){
        return a+b;
    }
}
