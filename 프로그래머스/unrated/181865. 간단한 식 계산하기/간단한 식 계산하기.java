class Solution {
    public int solution(String binomial) {
        String[] divide = binomial.split(" ");
        int a = Integer.parseInt(divide[0]);
        int b = Integer.parseInt(divide[2]);
        String o = divide[1];
        return switch (o) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> 0;
        };
    }
}
