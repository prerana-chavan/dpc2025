public class Day4 {

    static void merge(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int i = 0;  
        while (i < n) {
            if (a[i] > b[0]) {
                
                int temp = a[i];
                a[i] = b[0];
                b[0] = temp;

                
                int first = b[0];
                int k = 1;
                while (k < m && b[k] < first) {
                    b[k - 1] = b[k];
                    k++;
                }
                b[k - 1] = first;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 7, 10};
        int b[] = {2, 3};
        merge(a, b);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
