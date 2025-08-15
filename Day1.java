public class Day1 {
    static void sortArray(int arr[]){
        int n= arr.length;

        //1. array is empty
        if(n==0){
            System.out.println("array is empty");
        }

        //sorting array using dultch national flag algorithm
        int left=0;
        int right=n-1;
        int mid=0;
        while(mid<=right){
            if(arr[mid]==0){
                int tmp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=tmp;

                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int tmp=arr[right];
                arr[right]=arr[mid];
                arr[mid]=tmp;

                right--;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,0,2,2,1,0};
        //int arr[]={};
        //int arr[]={1,1,1,1};
        //int arr[]={2,0,1};
        sortArray(arr);

        System.out.println("after sorting ");
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        
    }
}
