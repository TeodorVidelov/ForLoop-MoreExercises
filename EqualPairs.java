import java.util.Scanner;
public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPairs = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int diff = 0;
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 0; i < countOfPairs; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());
            int currentSum = num1 + num2;

            if (i == 0){
                sum = currentSum;
            }
            else {
                diff = Math.abs(sum - currentSum);
                sum = currentSum;
            }
            if (diff > maxDiff){
                maxDiff = diff;
            }
        }
        if (maxDiff == 0){
            System.out.printf("Yes, value=%d",sum);
        }
        else {
            System.out.printf("No, maxdiff=%d",maxDiff);
        }
    }
}