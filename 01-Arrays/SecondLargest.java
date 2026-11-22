import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        int a[]={4,9,2,3,5};
        int secondLargest=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }else if(a[i]>secondLargest&&a[i]!=largest){
                secondLargest=a[i];
            }
        }
        System.out.println(secondLargest);
    }

}
