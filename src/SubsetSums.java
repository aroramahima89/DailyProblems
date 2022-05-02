import java.util.*;
public class SubsetSums {
    ArrayList<Integer> a=new ArrayList<Integer>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        int sum=0;
        int i=0;
        a.add(0);
        KnapSack(arr,N,sum,i);
        return a;
    }
    void KnapSack(ArrayList<Integer> arr, int N,int sum,int i){
        if(i==N){
            return;
        }
        KnapSack(arr,N,sum,i+1);
        sum+=arr.get(i);
        a.add(sum);
        KnapSack(arr,N,sum,i+1);
    }
}