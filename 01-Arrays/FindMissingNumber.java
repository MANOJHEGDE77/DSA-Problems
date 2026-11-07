import java.util.*;
public class FindMissingNumberinArray {
    public static void main(String[] args) {
        int nums[]={4, 3, 2, 7, 8, 2, 3, 1};
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean found=false;
        for(int num:nums){
            if(num==i){
                found=true;
                break;
            }
            }
            if(!found){
                res.add(i);

        }
        }
        System.out.println(res);

    }
}
