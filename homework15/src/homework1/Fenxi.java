package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class Fenxi {
    public static double getTotalScore(String s) {
        Scanner scanner=new Scanner(s);
        scanner.useDelimiter("[^0123456789.]+");
        double totalScore=0;
        while(scanner.hasNext()){
            try{
                double score=scanner.nextDouble();
                totalScore=totalScore+score;
            }
            catch(InputMismatchException exp){
                String t=scanner.next();
            }
        }
        return totalScore;
    }

}
