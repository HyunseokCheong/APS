class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var li: IntArray = IntArray(end - start + 1)
        for (i in start..end) {
            li[i - start] = i
        }
        return li
    }
}