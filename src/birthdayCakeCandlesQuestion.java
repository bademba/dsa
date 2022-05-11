import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class birthdayCakeCandlesQuestion {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Collections.sort(candles);
        int i;int sum=0;
        System.out.println("SORTED CANDLES:"+candles);
        for (i=0;i<candles.size();i++){
            sum =sum +i;
            System.out.println("SUM"+sum);
        }
        return sum;

    }
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3,2,1,3);
        birthdayCakeCandles(candles);
        System.out.println(candles);
     }




}
