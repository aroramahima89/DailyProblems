// GeeksforGeeks
// TLE
import java.util.*;
class Sol
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
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
    static int findPlatform(int start[], int end[], int n)
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
        int i=0;
        while(!a.isEmpty()){
            if(i==a.size()){
                i=0;
            }
            if(a.get(i).get(0)>e){
                c++;
                e=a.get(i).get(1);
             /*   ArrayList<Integer> x=new ArrayList<Integer>();
                x.add(a.get(i).get(0));
                x.add(a.get(i).get(1));*/
                System.out.println(a.remove(i));
                for(int j=0;j<a.size();j++){
                    System.out.println(a.get(j).get(0)+" "+a.get(j).get(1));
                }
            }
            else{
                i+=1;
            }

        }
        return c;
    }

}

