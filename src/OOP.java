class Employee{
    private final int salary = 100000;
    private boolean Check_eligibility(int age, String Qualification, int Experience){
        return age >= 18 && Qualification.equals("PHD") && Experience >= 2;
    }
    public void admit(int age, String Qualification, int Experience){
        boolean result = Check_eligibility(age, Qualification, Experience);
        if (result) {
            System.out.println("You are admitted");
            boolean employee = true;
        }else {
            System.out.println("Sorry, you are not eligible");
            boolean employee = false;
        }
    }

    public int getSalary() {
        return salary;
    }
}

public class OOP {
    public static void main(String[] args) {
        Employee Himalaya = new Employee();
        Himalaya.admit(23, "PHD", 3);
    }
}
