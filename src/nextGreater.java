import java.util.*;
class nextGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums2.length];
        Stack<Integer> s=new Stack<Integer>();
        ans[ans.length-1]=-1;
        s.push(nums2[nums2.length-1]);
        for(int i=ans.length-2;i>=0;i--){
           while(!s.isEmpty()){
               int x=s.pop();
            //   System.out.println(x+" "+nums2[i]);
               if(x>nums2[i]){
                   ans[i]=x;
                   s.push(x);
                   s.push(nums2[i]);
                   break;
               }
           }
           if(s.isEmpty()){
              ans[i]=-1;
              s.push(nums2[i]);
            } 
        }
    /*    for(int i=0;i<ans.length;i++){
            System.out.print(" "+ans[i]+" ");
        } */
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    res[i]=ans[j];
                }
            }
        }
        return res;
    }
}
