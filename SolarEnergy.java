import java.util.Scanner;
public class SolarEnergy {
    static double calculateTotalEnergy(double morningEnergy,double eveningEnergy) {
        return morningEnergy+eveningEnergy;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter morning energy: ");
        double morningEnergy=sc.nextDouble();
        System.out.println("Enter evening energy: ");
        double eveningEnergy=sc.nextDouble();
        double totalEnergy=calculateTotalEnergy(morningEnergy,eveningEnergy);
        System.out.println("Total Energy Generated: " + totalEnergy+" kWh");
        sc.close();
    }
}