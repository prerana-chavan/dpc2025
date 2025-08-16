public class Day2 {
    static int missing(int arr[]){
        int n=arr.length +1 ;
        int s1=(n*(n+1))/2;

        int s2=0;
        for(int i=0;i<n-1;i++){
            s2+=arr[i];
        }
        return s1-s2;
    }
    
    public static void main(String[] args) {
        int arr[]={1,4,2,5};
        //int arr[]={1};
        System.out.println("missing no is "+missing(arr));

    }
}
