import java.util.Scanner;

class Faculty {
    private String name;
    private double salary;

    public Faculty(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double bonus(float percent){
        return (percent/100.0) * salary;
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public void getDetails(float percent){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus(percent));
    }
}

class Hod extends Faculty {
    private String personalAssistant;

    public Hod(String name, double salary, String pa){
        super(name, salary);
        this.personalAssistant = pa;
    }

    // Override bonus (50% less)
    @Override
    public double bonus(float percent){
        return super.bonus(percent) * 0.5;
    }

    // Override getDetails()
    @Override
    public void getDetails(){
        super.getDetails();
        System.out.println("PA: " + personalAssistant);
    }

    // Override getDetails(percent)
    @Override
    public void getDetails(float percent){
        super.getDetails();
        System.out.println("PA: " + personalAssistant);
        System.out.println("Bonus: " + bonus(percent));
    }
}

public class InheritanceTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Faculty f = new Faculty(sc.next(), sc.nextDouble());
        Hod h = new Hod(sc.next(), sc.nextDouble(), sc.next());

        float percent = sc.nextFloat();

        f.getDetails();
        f.getDetails(percent);

        h.getDetails();
        h.getDetails(percent);
    }
}