import java.util.Scanner;
public class StudenGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME to student grade calculator.");
        System.out.println("Enter each subject marks out of 100.");
        System.out.print("Enter number of subjects: ");
        int num = scanner.nextInt();
        int marks[] = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Enter marks of subject"+(i+1)+": ");
            marks[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int mark : marks){
            sum += mark;
        }
        System.out.println("Total marks: "+sum);
        int avgPcent = sum/num;
        System.out.println("Average Percentage of student is: "+avgPcent);
        if(avgPcent >90 && avgPcent <=100){
            System.out.println("Excellent, you got 'A' Grade.");
        }
        else if(avgPcent >80 && avgPcent <=90){
            System.out.println("Good, you got 'B' Grade.");
        }
        else if(avgPcent >70 && avgPcent <=80){
            System.out.println("Can do better, you got 'C' Grade.");
        }
        else{
            System.out.println("Work hard, you got 'D' Grade.");
        }
    }
}