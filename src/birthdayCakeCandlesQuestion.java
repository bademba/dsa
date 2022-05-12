import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class birthdayCakeCandlesQuestion {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        //sort the collection
        Collections.sort(candles);
        int i;
        int counter=0;
        System.out.println("SORTED CANDLES:"+candles);

        //loop through the list
        for (i=0;i<candles.size()-1;i++){

            //identify duplicate elements
             if(candles.get(i)==candles.get(i+1)){

                 //create counter for duplicate elements
                 counter=Collections.frequency(candles,candles.get(i));
                  System.out.println("Duplicate element is "+candles.get(i) +" at position "+(i+1) +" count "+counter);
             }
        }

         return counter;

    }
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3,2,1,3);
        birthdayCakeCandles(candles);
        System.out.println(candles);
     }




}
