class Solution {
    /**
     * date1이 date2보다 앞서는 날짜라면 1 반환, 아니면 0 반환
     *
     * @param date1 [year, month, day]
     * @param date2 [year, month, day]
     * @return 1 or 0
     */
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int year1 = date1[0];
        int month1 = date1[1];
        int day1 = date1[2];
        int year2 = date2[0];
        int month2 = date2[1];
        int day2 = date2[2];
        
        if (year1 < year2) {
            answer = 1;
        } else if (year1 == year2) {
            if (month1 < month2) {
                answer = 1;
            } else if (month1 == month2) {
                if (day1 < day2) {
                    answer = 1;
                }
            }
        }
        
        return answer;
    }
}