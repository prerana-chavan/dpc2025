import java.util.*;
public class Day5 {

    static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int n=arr.length;

        ans.add(arr[n-1]);
        int max=arr[n-1];

        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                ans.add(arr[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    
    public static void main(String[] args) {
        //int arr[]={16,17,4,3,5,2};
        //int arr[]={5};
        //int arr[]={100,50,20,10};
        int arr[]={1,2,3,4,5};
        System.out.println(leaders(arr));
    }
}
