import java.util.*;
import java.io.*;

/**
 * Purpose: Will ask the user what grade they want and based on their current grade, program will tell them what they need
 */
public class gradePred{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your current grade in the class? ");
        double currGrade = scanner.nextDouble();

        System.out.print("How much is your final exam worth? ");
        double finalExam = scanner.nextDouble();

        System.out.println("What grade do you want in the class? (e.g, 90, 85, 70)");
        double gradeDesired = scanner.nextDouble();
        
        double scoreNeeded = gradeCalculation(currGrade, finalExam, gradeDesired);
        if(scoreNeeded <= 0.0){
            System.out.println("You have already achieved this grade");
        }
        else{
            System.out.println("You need a " + scoreNeeded + "% on the final exam for a " + gradeDesired + " in the class");
        }

        scanner.close();
    }
    /**
     * Purpose: Will calculate the score needed on a final exam for a desired grade 
     * @params: currGrade - current grade in the class
     * @params: finalExam - weight of the final exam 
     * @params: gradeDesired - grade the user wants for the entire class 
     */
    public static double gradeCalculation(double currGrade, double finalExam, double gradeDesired) {
        // Grabbing the % thats already graded
        double alreadyGraded = 100 - finalExam;
        alreadyGraded = (currGrade/100) * alreadyGraded;

        // Grabbing the finalExam score needed 
        double scoreNeed = gradeDesired - alreadyGraded;
        double examScore = scoreNeed/finalExam;
        
        return examScore;


    }

}
