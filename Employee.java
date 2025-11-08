public class Employee {
    protected int id;
    protected  int age;
    protected String name;
    protected boolean isPermanent;
    public static void main(String args[]){
        Employee emp=new Employee();
        emp.id=001;
        //emp.age=35.5;// error
        emp.age=(int)35.5;
        emp.name="Divyanshu Kumar";
        emp.isPermanent=true;
        System.out.println("Successfully Started");
    }
    
}
