import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Grading {
    //SOLUTION 1 using for-each loop:
    //This is the solution that passed all tests on hackerank
    public static List<Integer> gradingStudents(List<Integer> grades) {
          List<Integer> roundedGrades = new ArrayList<Integer>();

        //loop through each grades
        for(int marks:grades){

            //check of grade is less than 38 or grade modulo is less than or equal to 2
            if(marks < 38 || marks % 5 <= 2){
                roundedGrades.add(marks);
            }else if(marks % 5 > 2){
                int add = 5 -(marks % 5);
                roundedGrades.add(marks + add);
            }
        }
        System.out.println("GRADED MARKS: "+roundedGrades);
        return roundedGrades;
    }
    //SOLUTION 2 using for loop
    public static List<Integer> gradingStudents2(List<Integer> grades) {
        List<Integer> finalGrade= new ArrayList<Integer>();
         for(int marks=0; marks < grades.size(); marks++){
            if(marks < 38 || marks % 5 <= 2){
                finalGrade.add(marks);
             }else if(marks % 5 > 2){
                int add = 5 -(marks % 5);
                finalGrade.add(marks + add);
            }
        }
        System.out.println("GRADED MARKS: "+finalGrade);
        return  finalGrade;
    }

    //SOLUTION 3
    public static List<Integer> gradingStudents3(List<Integer> grades) {
         List<Integer> ans = new ArrayList<Integer>();

        //loop through each grades
        for(int marks:grades){

            //check of grade is less than 38 or grade modulo is less than or equal to 2
            if(  marks % 5 < 3){
                marks = marks + marks % 5;
                ans.add(marks);
            }else if(marks < 38){
                marks = marks;
                ans.add(marks );
            }
        }
        System.out.println("GRADED MARKS: "+ans);
        return ans;
    }

    //Runner method
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73,67,38,33);
        gradingStudents(grades);
        System.out.println("INPUT: "+grades);
    }
}
