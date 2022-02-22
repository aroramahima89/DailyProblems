// Geeksforgeeks
// Greedy Approach
import java.util.*;
class Solution
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    static class Cmp implements Comparator<ArrayList<Integer>> {

        // override the compare() method
        public int compare(ArrayList<Integer> s1, ArrayList<Integer> s2)
        {
            if (s1.get(1) == s2.get(1))
                return 0;
            else if (s1.get(1) > s2.get(1))
                return 1;
            else
                return -1;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        int e=0;
        int c=0;
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> x=new ArrayList<Integer>();
            x.add(start[i]);
            x.add(end[i]);
            a.add(x);
        }
        Collections.sort(a,new Cmp());
      /*  for(int i=0;i<n;i++){
            System.out.println(a.get(i).get(0)+" "+a.get(i).get(1));
        } */

        for(int i=0;i<n;i++){
            if(a.get(i).get(0)>e){
                c++;
                e=a.get(i).get(1);
            }
        }
        return c;
    }
}
