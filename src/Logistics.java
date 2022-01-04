import java.util.Scanner;
public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfBaggage = Integer.parseInt(scanner.nextLine());

        int totalTons = 0;
        int under3TonsBus = 0;
        int between4And11TonsTruck = 0;
        int over12TonsTrain = 0;
        double totalCostOfTransport = 0;

        for (int i = 0; i < countOfBaggage; i++) {
            int tonsOfBaggage = Integer.parseInt(scanner.nextLine());
            totalTons += tonsOfBaggage;
            if (tonsOfBaggage <= 3){
                under3TonsBus += tonsOfBaggage;
                totalCostOfTransport += 200 * tonsOfBaggage;
            }
            else if (tonsOfBaggage >= 4 && tonsOfBaggage <= 11){
                between4And11TonsTruck += tonsOfBaggage;
                totalCostOfTransport += 175 * tonsOfBaggage;
            }
            else if (tonsOfBaggage >= 12){
                over12TonsTrain += tonsOfBaggage;
                totalCostOfTransport += 120 * tonsOfBaggage;
            }
        }
        double averageCostOfTransport = totalCostOfTransport / totalTons;
        System.out.printf("%.2f\n",averageCostOfTransport);
        System.out.printf("%.2f%%\n",(under3TonsBus * 1.0 / totalTons) * 100);
        System.out.printf("%.2f%%\n",(between4And11TonsTruck * 1.0 / totalTons) * 100);
        System.out.printf("%.2f%%",(over12TonsTrain * 1.0 / totalTons) * 100);

    }
}