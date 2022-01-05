import java.util.Scanner;
public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfMoves = Integer.parseInt(scanner.nextLine());

        double points = 0;
        int between0And9 = 0;
        int between10And19 = 0;
        int between20And29 = 0;
        int between30And39 = 0;
        int between40And50 = 0;
        int invalidNumber = 0;

        for (int i = 0; i < countOfMoves; i++) {
            int checkedNumbers = Integer.parseInt(scanner.nextLine());

            if (checkedNumbers >= 0 && checkedNumbers <= 9){
                between0And9++;
                points += checkedNumbers * 0.20;
            }
            else if (checkedNumbers >= 10 && checkedNumbers <= 19){
                between10And19++;
                points += checkedNumbers * 0.30;
            }
            else if (checkedNumbers >= 20 && checkedNumbers <= 29){
                between20And29++;
                points += checkedNumbers * 0.40;
            }
            else if (checkedNumbers >= 30 && checkedNumbers <= 39){
                between30And39++;
                points += 50;
            }
            else if (checkedNumbers >= 40 && checkedNumbers <= 50){
                between40And50++;
                points += 100;
            }
            else if (checkedNumbers < 0 || checkedNumbers > 50){
                invalidNumber++;
                points /= 2;
            }
        }
        System.out.printf("%.2f\n",points);
        System.out.printf("From 0 to 9: %.2f%%\n",(between0And9 * 1.0 / countOfMoves) * 100);
        System.out.printf("From 10 to 19: %.2f%%\n",(between10And19 * 1.0 / countOfMoves) * 100);
        System.out.printf("From 20 to 29: %.2f%%\n",(between20And29 * 1.0 / countOfMoves) * 100);
        System.out.printf("From 30 to 39: %.2f%%\n",(between30And39 * 1.0 / countOfMoves) * 100);
        System.out.printf("From 40 to 50: %.2f%%\n",(between40And50 * 1.0 / countOfMoves) * 100);
        System.out.printf("Invalid numbers: %.2f%%",(invalidNumber * 1.0 / countOfMoves) * 100);
    }
}