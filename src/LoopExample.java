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
        //System.out.println("UNSORTED LIST: "+ arrayList);

        int len =  arrayList.size();
        Collections.sort(arrayList);
        System.out.println("SORTED LIST: "+ arrayList);
        System.out.println("LEN: "+len);
        long min = 0, maxElement = 0;
        long sum=0;long sumMax=0;
        System.out.println("FIRST ELEMENT: "+arrayList.get(0));

        System.out.println("LAST ELEMENT:  "+arrayList.get(len-1));
//        for(int i = 0, j = len - 1; i < len - 1; i++, j--){
////            max = max + arrayList.indexOf(j);
////            min = min + arrayList.indexOf(i);
//            sum = sum + arrayList.indexOf(j);
//            System.out.println("SUM: "+j);
//
//           }

        // sum of all elements except the last
        for(int x =0; x<len-1; x++){
            sum +=arrayList.get(x);
        }
        System.out.println("SUM MIN: "+sum);

        //sum of all elements except first
        for (int i = 1; i < len; i++){
            sumMax +=arrayList.get(i);
        }
        System.out.println("NEW ARRAY LIST"+arrayList);
        System.out.println("SUM MAX: "+sumMax);
    }
}
