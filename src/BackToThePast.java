import java.util.Scanner;
public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int theYearHasToLive = Integer.parseInt(scanner.nextLine());

        double neededMoneyToLiveInEvenYear = 0;
        double neededMoneyToLiveInOddYear = 0;
        int IvanYearsOld = 18;


        for (int i = 1800; i <= theYearHasToLive; i++) {

            if (i % 2 == 0){
                neededMoneyToLiveInEvenYear = 12000;
            inheritedMoney -= neededMoneyToLiveInEvenYear;
            }
            else {
                neededMoneyToLiveInOddYear = 12000 + (IvanYearsOld * 50);
                inheritedMoney -= neededMoneyToLiveInOddYear;
            }
            IvanYearsOld++;
        }
        if (inheritedMoney >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",inheritedMoney);
        }
        else {
            System.out.printf("He will need %.2f dollars to survive.",Math.abs(inheritedMoney));
        }
    }
}