import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());

        int under300 = 0;
        int between3And399 = 0;
        int between4And499 = 0;
        int over5 = 0;
        double averageGrade = 0;

        for (int i = 0; i < countOfStudents; i++) {
            double eachStudentGrade = Double.parseDouble(scanner.nextLine());
            averageGrade += eachStudentGrade;

            if (eachStudentGrade < 3.00){
                under300++;
            }
            else if (eachStudentGrade >= 3.00 && eachStudentGrade <= 3.99){
                between3And399++;
            }
            else if (eachStudentGrade >= 4.00 && eachStudentGrade <= 4.99){
                between4And499++;
            }
            else if (eachStudentGrade >= 5.00){
                over5++;
            }
        }
        System.out.printf("Top students: %.2f%%\n",(over5 * 1.0 / countOfStudents) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n",(between4And499 * 1.0 / countOfStudents) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n",(between3And399 * 1.0 / countOfStudents) * 100);
        System.out.printf("Fail: %.2f%%\n",(under300 * 1.0 / countOfStudents) * 100);
        System.out.printf("Average: %.2f",averageGrade / countOfStudents);
    }
}