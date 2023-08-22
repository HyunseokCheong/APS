class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        // 1. 네 주사위 모두 같음: 1111 * a
        if (a == b && b == c && c == d) {
            answer = 1111 * a;
        }
        
        // 2. 세 주사위 p로 같음, 나머지 주사위 q: (10 * p + q) ^ 2
        else if (a == b && b == c) {
            answer = (10 * a + d) * (10 * a + d);
        }
        else if (a == b && b == d) {
            answer = (10 * a + c) * (10 * a + c);
        }
        else if (a == c && c == d) {
            answer = (10 * a + b) * (10 * a + b);
        }
        else if (b == c && c == d) {
            answer = (10 * b + a) * (10 * b + a);
        }
        
        // 3. 같은 주사위가 두쌍, 각각 q, p: (p + q) * Math.max(p - q)
        else if (a == b && b != c && c == d) {
            answer = (a + c) * Math.max(a - c, c - a);
        }
        else if (a == c && c != b && b == d) {
            answer = (a + b) * Math.max(a - b, b - a);
        }
        else if (a == d && d != b && b == c) {
            answer = (a + b) * Math.max(a - b, b - a);
        }
        else if (b == c && c != a && a == d) {
            answer = (b + a) * Math.max(b - a, a - b);
        }
        else if (b == d && d != a && a == c) {
            answer = (b + a) * Math.max(b - a, a - b);
        }
        else if (c == d && d != a && a == b) {
            answer = (c + a) * Math.max(c - a, a - c);
        }
        
        // 4. 같은 주사위가 한쌍 q, 나머지 두 주사위가 각각 q, r: q * r
        else if (a == b) {
            answer =  c * d;
        } 
        else if (a == c) {
            answer =  b * d;
        }
        else if (a == d) {
            answer =  b * c;
        }
        else if (b == c) {
            answer =  a * d;
        }
        else if (b == d) {
            answer =  a * c;
        }
        else if (c == d) {
            answer =  a * b;
        }
        
        // 5. 주사위가 모두 다름: min(a, b, c, d)
        else {
            answer = Math.min(a, Math.min(b, Math.min(c, d)));
        }
        
        return answer;
    }
}
