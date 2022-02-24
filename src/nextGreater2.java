import java.util.*;
public class nextGreater2 {
    public int[] nextGreaterElements(int[] nums2) {
        int[] ans=new int[nums2.length];
        Stack<Integer> s=new Stack<Integer>();
        for(int i=nums2.length-2;i>=0;i--){
            s.push(nums2[i]);
        }
        for(int i=ans.length-1;i>=0;i--){
            while(!s.isEmpty()){
                int x=s.pop();
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
        return ans;
    }
}