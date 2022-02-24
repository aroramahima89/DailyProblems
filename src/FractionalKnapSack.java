// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new FractionalKnapSack().fractionalKnapsack(w, arr, n)));
        }
    }
}// } Driver Code Ends

public class FractionalKnapSack
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n)
    {
        double[] val=new double[n];
        for(int i=0;i<n;i++){
            val[i]=arr[i].value/arr[i].weight;
        }
        int wt=W;
        double x=0;
        int index=0;

        while(wt>0){
            double max=0;
            for(int i=0;i<n;i++){
                if(val[i]>max){
                    index=i;
                    max=val[i];
                    //  max=(arr[i].value/arr[i].weight);
                }
            }
            System.out.println(max);
            if(wt>=arr[index].weight){
                x+=arr[index].value;
                //   System.out.println(index+"hii"+x);
                val[index]=0;
                arr[index].value=0;
                wt-=arr[index].weight;
            }
            else{
                x+=(val[index]*wt);
                //   System.out.println("hlw"+x);
                wt=0;
            }

        }
        return x;
    }
}