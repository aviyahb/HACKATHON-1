import java.util.Scanner;
class Student {
    String name,roll,course;
    double marks;
    int credits;
    Student(String n,String r,double m,String c,int cr) {
        name=n;
        roll=r;
        marks=m;
        course=c;
        credits=cr;
    }
    double CalculateFee() {
        return credits*1500;
    }
    boolean checkEligibility() {
        return marks >= 50;
    }
    double calculateScholarship() {
        if (marks>=85) return calculateFee()*0.20;
        if (marks>=70) return calculateFee()*0.10;
        return 0;   
    }
    double calculatFinalFee() {
        return calculateFee()-calculateScholarship();
    }
    void displayDetails() {
        System.out.println("\nName: "+name+
        "\nRoll: "+roll+
        "\nMarks: "+marks+
        "\nCourse: "+course+
        "\nCredits: "+credits+
        "\nFee: Rs."+calculateFee()+
        "\nScholarship: Rs."+calculateScholarship()+
        "\nFinal Fee: Rs. "+calculateFinalFee());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name,Roll,Marks,Course,Credits: \n");
        String name=sc.nextLine();
        String roll=sc.nextLine();
        double marks=sc.nextDouble();
        sc.nextLine();
        String course=sc.nextLine();
        int credits=sc.nextInt();
        Student s=new Student(name,roll,marks,course,credits);
        if (s.checkEligibility()) {
            s.displayDetails();
        }else{
            System.out.println("Not eligible for registeration. ");
        }
        sc.close();
    }
}