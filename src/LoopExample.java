import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LoopExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =  new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);

        int len =  arrayList.size();
        Collections.sort(arrayList);
        System.out.println("SORTED LIST: "+ arrayList);
        System.out.println("LENGTH is : "+len+" elements");
         long sumMin=0;long sumMax=0;
        System.out.println("FIRST ELEMENT: "+arrayList.get(0));

        System.out.println("LAST ELEMENT:  "+arrayList.get(len-1));

        // sum of all elements except the last
        for(int x =0; x<len-1; x++){
            sumMin +=arrayList.get(x);
        }

        //sum of all elements except first
        for (int i = 1; i < len; i++){
            sumMax +=arrayList.get(i);
        }
        //print minimum sum and maximum sum
         System.out.println(sumMin+" "+sumMax);
    }
}
