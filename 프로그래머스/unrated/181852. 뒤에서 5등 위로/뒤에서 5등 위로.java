import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list) {
        Arrays.sort(num_list);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for (int i = 5; i < num_list.length; i++) {
            arrayList.add(num_list[i]);
        }
        return arrayList;
    }
}