import java.util.*;
public class MoveZerosOptimal {
    public static void main(String[] args) {
        int a[]={2,0,3,4,0,7};
        int id=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[id];
                a[id]=temp;
                id++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
