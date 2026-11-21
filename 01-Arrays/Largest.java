import java.util.*;
public class LargestElement {

    public static void main(String[] args) {
        int a[]={4,85,2,3,5};
        int largest=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(a[i]>largest){
                largest=a[i];
            }
        }
        System.out.println(largest);

    }
}
