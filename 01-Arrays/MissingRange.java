import java.util.*;
public class Missingrange{
    public static void missingRange(int arr[]) {
        int lower=0;
        int upper=99;
        List<String> result=new ArrayList<>();
        int prev=lower-1;
        for (int i = 0; i <= arr.length; i++) {
            int curr;
            if(i==arr.length){
                curr=upper+1;
            }else{
                curr=arr[i];
            }
            if(curr-prev>=2){
                if(curr-prev==2){
                    result.add(String.valueOf(prev+1));
                }else{
                    result.add((prev+1)+"->"+(curr-1));
                }
            }
            prev=curr;

        }
        System.out.println(result);

    }
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
      }
missingRange(arr);

     }

  }