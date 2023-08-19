class Solution {
    public int solution(int n, int k) {
        int price = 0;

        price += n * 12000;
        price += k * 2000;

        int discount = 0;
        discount = n / 10;

        price -= discount * 2000;
        
        return price;
    }
}
