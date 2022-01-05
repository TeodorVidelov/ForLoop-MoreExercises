import java.util.Scanner;
public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMonths = Integer.parseInt(scanner.nextLine());

        double sumElectricityBill = 0;
        double waterBill = 20;
        double internetBill = 15;
        double otherBills = 0;

        for (int i = 0; i < countMonths; i++) {
           double electricityBill = Double.parseDouble(scanner.nextLine());

           sumElectricityBill += electricityBill;
           otherBills += (electricityBill + waterBill + internetBill) * 1.20;
        }
        waterBill *= countMonths;
        internetBill *= countMonths;
        double averageExpenses = (otherBills + waterBill + internetBill + sumElectricityBill) / countMonths;

        System.out.printf("Electricity: %.2f lv\n",sumElectricityBill);
        System.out.printf("Water: %.2f lv\n",waterBill);
        System.out.printf("Internet: %.2f lv\n",internetBill);
        System.out.printf("Other: %.2f lv\n",otherBills);
        System.out.printf("Average: %.2f lv",averageExpenses);
    }
}