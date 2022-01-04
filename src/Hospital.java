import java.util.Scanner;
public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int periodForCalculating = Integer.parseInt(scanner.nextLine());

        int countTreatedPatients = 0;
        int countUnTreatedPatients = 0;
        int countOfDoctors = 7;

        for (int i = 1; i <= periodForCalculating; i++) {
            if (i % 3 == 0 && countTreatedPatients < countUnTreatedPatients){
                countOfDoctors++;
            }
            int countOfPatients = Integer.parseInt(scanner.nextLine());

            if (countOfPatients <= countOfDoctors){
                countTreatedPatients += countOfPatients;
            }
            else {
                countUnTreatedPatients += countOfPatients - countOfDoctors;
                countTreatedPatients += countOfDoctors;
            }
        }
        System.out.printf("Treated patients: %d.\n",countTreatedPatients);
        System.out.printf("Untreated patients: %d.",countUnTreatedPatients);
    }
}