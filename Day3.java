public class Day3 {
    static int duplicate(int arr[]){

        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<1 || arr[i]>n-1){
                System.out.println("invalid input");
                return -1;
            }
        }
        int slow=arr[0];
        int fast=arr[0];

        do{
            slow= arr[slow];
            fast=arr[arr[fast]];

        }while(slow!=fast);

        slow=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr[]={1,4,2,1,3,1};
        //int arr[]={2,2};
        int ans=duplicate(arr);
        if(ans!=-1){
            System.out.println("duplicate:"+duplicate(arr));
        }
    }
}