import java.util.Scanner;
public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int countFans = Integer.parseInt(scanner.nextLine());

        int countFansSectorA = 0;
        int countFansSectorB = 0;
        int countFansSectorG = 0;
        int countFansSectorV = 0;

        for (int i = 0; i < countFans; i++) {
            String sector = scanner.nextLine();

            if ("A".equals(sector)){
            countFansSectorA++;
            }
            else if ("B".equals(sector)){
                countFansSectorB++;
            }
            else if ("V".equals(sector)){
                countFansSectorV++;
            }
            else if ("G".equals(sector)){
                countFansSectorG++;
            }
        }
        System.out.printf("%.2f%%\n",(countFansSectorA * 1.0 / countFans) * 100);
        System.out.printf("%.2f%%\n",(countFansSectorB * 1.0 / countFans) * 100);
        System.out.printf("%.2f%%\n",(countFansSectorV * 1.0 / countFans) * 100);
        System.out.printf("%.2f%%\n",(countFansSectorG * 1.0 / countFans) * 100);
        System.out.printf("%.2f%%",(countFans * 1.0 / stadiumCapacity) * 100);
    }
}