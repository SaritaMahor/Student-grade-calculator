import java.util.Scanner;

public class SGradeCalculate {
    static int []subjects = new int[5];

    public static int getMarks(){
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Enter marks of subject " + (i+1) +" : ");
            int mark = sc.nextInt();
            while(mark < 0 || mark > 100){
                System.out.println("marks must be between 0 to 100");
                System.out.println("Enter again: ");
                mark = sc.nextInt();
            }
            subjects[i] = mark; 
        }
        int total = 0;

        for (int i : subjects) {
            total+=i;
        }
        return total;

    }

    public static char getGrade(int totalMarks){
        float percent = totalMarks/5;

        if (percent>=60) {
            return 'A';
        }
        else if (percent>=40) {
            return 'B';
        }
        else if (percent>=33) {
            return 'C';
        }
        else 
            return 'F';
    }

    public static void main(String[] args) {
        int totalMarks = getMarks();
        char grade = getGrade(totalMarks);

        if (grade == 'F') {
            System.out.println("You are fail");
            
        }
        else
            System.out.println("Your grade is: " + grade);
    }
}
