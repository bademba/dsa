import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class birthdayCakeCandlesQuestion {
    // SOLUTION  1: using collections
    // https://stackoverflow.com/questions/44367203/how-to-count-duplicate-elements-in-arraylist

    public static int birthdayCakeCandles(List<Integer> candles) {

        //sort the collection
        Collections.sort(candles);
        int i;
        int counter=0;
        System.out.println(candles.size()+" SORTED CANDLES: "+candles);

        //loop through the list
        for (i=0;i<candles.size()-1;i++){

            //identify duplicate elements
             if(candles.get(i)==candles.get(i+1)){
                    counter++;
                 //create counter for duplicate elements
                 counter=Collections.frequency(candles,candles.get(candles.size()-1));
                 System.out.println("Duplicate element is "+candles.get(i) +" count "+counter);

             }
        }
        System.out.println("Duplicate element is "+candles.get(i) +" count "+counter);
         return counter;
    }


    // SOLUTION 2: Using java 8 API
    public static int birthdayCakeCandles2(List<Integer> candles)  {
        //InputStreamReader read=new InputStreamReader(System.in);
        //BufferedReader in=new BufferedReader(read);
        //int number=Integer.parseInt(in.readLine());
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(  "INPUT: "+num);


        //sort the collection
        //Collections.sort(candles);
        long count = candles.stream().filter(i->candles.get(i).equals(i)).count();
        System.out.println("COUNT: "+count);
        return (int) count;
    }


    //SOULTION 3
    public static int birthdayCakeCandles3(List<Integer> candles) {


        int maxCandleHeight = Integer.MIN_VALUE;
        int maxCandleFreqCount = 0;

        for (int i = 0; i < candles.size(); i++) {

            //find maximum element
            if (candles.get(i) == maxCandleHeight) {
                maxCandleFreqCount++;
            }

            //find count of maximum element
            if (candles.get(i) > maxCandleHeight) {
                maxCandleHeight = candles.get(i);
                maxCandleFreqCount = 1;
            }

        }
        System.out.println(" COUNT: "+maxCandleFreqCount);
        return maxCandleFreqCount;
    }

    //solutrion 4: Solution that was accepted by hackerank
    public static int birthdayCakeCandles4(List<Integer> candles)  {
        Collections.sort(candles);
        System.out.println(Collections.frequency(candles,candles.get(candles.size()-1)));
        return Collections.frequency(candles,candles.get(candles.size()-1));
    }



    public static void main(String[] args)  {

        //List<Integer> candles = Arrays.asList(3,2,1,3);
        //List<Integer> candles = Arrays.asList(18, 90, 90, 13, 90, 75, 90, 8, 90, 43);
        List<Integer> candles = Arrays.asList(9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999 ,9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999 ,9999999, 9999999, 9999999, 9999999, 9999999, 9999999, 9999999 ,9999999);
         birthdayCakeCandles4(candles);
        //System.out.println(candles);
     }




}
