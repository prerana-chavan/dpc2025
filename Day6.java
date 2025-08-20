import java.util.*;

public class Day6 {
    
    static List<List<Integer>> findSubarrays(int arr[]) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int prefixSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            
            if (prefixSum == 0) {
                ans.add(Arrays.asList(0, i));
            }
            
            
            if (map.containsKey(prefixSum)) {
                for (int index : map.get(prefixSum)) {
                    ans.add(Arrays.asList(index + 1, i));
                }
            }
            
            
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, -7, 1, 3, -4, -2, -2};
        List<List<Integer>> result = findSubarrays(arr);
        
        System.out.println("Subarrays with zero sum (startIndex, endIndex):");
        for (List<Integer> sub : result) {
            System.out.println(sub);
        }
    }
}

