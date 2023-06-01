import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             lengthOfField;
    static int             sumOfOutSand;
    static int             sand;
    static int             sumOfSpread;
    static int             alphaRow;
    static int             alphaColumn;
    static int             alphaAmount;
    static int[][]         field;
    
    static int[] rowDirectionOfTornado    = {0, 1, 0, -1};
    static int[] columnDirectionOfTornado = {-1, 0, 1, 0};
    static int[] countOfTornadoMove       = {1, 1, 2, 2};
    
    static int[][] rowDirectionOfSand    = {{-1, 1, -2, -1, 1, 2, -1, 1, 0}, {-1, -1, 0, 0, 0, 0, 1, 1, 2},
            {1, -1, 2, 1, -1, -2, 1, -1, 0}, {1, 1, 0, 0, 0, 0, -1, -1, -2}};
    static int[][] columnDirectionOfSand = {{1, 1, 0, 0, 0, 0, -1, -1, -2}, {-1, 1, -2, -1, 1, 2, -1, 1, 0},
            {-1, -1, 0, 0, 0, 0, 1, 1, 2}, {1, -1, 2, 1, -1, -2, 1, -1, 0}};
    static int[]   ratioOfSand           = {1, 1, 2, 7, 7, 2, 10, 10, 5};
    
    public static void main(String[] args) throws Exception {
        lengthOfField = Integer.parseInt(br.readLine().trim());
        field         = new int[lengthOfField][lengthOfField];
        
        for (int r = 0; r < lengthOfField; r++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int c = 0; c < lengthOfField; c++) {
                field[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        
        sumOfOutSand = solve(lengthOfField / 2, lengthOfField / 2);
        bw.write(String.valueOf(sumOfOutSand));
        bw.flush();
    }
    
    static int solve(int x, int y) {
        int totalOutSand = 0;
        int currentX     = x;
        int currentY     = y;
        
        while (true) {
            for (int d = 0; d < 4; d++) {
                for (int moveCount = 0; moveCount < countOfTornadoMove[d]; moveCount++) {
                    int nextX = currentX + rowDirectionOfTornado[d];
                    int nextY = currentY + columnDirectionOfTornado[d];
                    
                    if (nextX < 0 || nextY < 0 || nextX >= lengthOfField || nextY >= lengthOfField) {
                        return totalOutSand;
                    }
                    
                    sand                = field[nextX][nextY];
                    field[nextX][nextY] = 0;
                    sumOfSpread         = 0;
                    
                    for (int spread = 0; spread < 9; spread++) {
                        int sandX        = nextX + rowDirectionOfSand[d][spread];
                        int sandY        = nextY + columnDirectionOfSand[d][spread];
                        int spreadAmount = (sand * ratioOfSand[spread]) / 100;
                        
                        if (sandX < 0 || sandX >= lengthOfField || sandY < 0 || sandY >= lengthOfField) {
                            totalOutSand += spreadAmount;
                        } else {
                            field[sandX][sandY] += spreadAmount;
                        }
                        sumOfSpread += spreadAmount;
                    }
                    
                    alphaRow    = nextX + rowDirectionOfTornado[d];
                    alphaColumn = nextY + columnDirectionOfTornado[d];
                    alphaAmount = sand - sumOfSpread;
                    if (alphaRow < 0 || alphaRow >= lengthOfField || alphaColumn < 0 || alphaColumn >= lengthOfField) {
                        totalOutSand += alphaAmount;
                    } else {
                        field[alphaRow][alphaColumn] += alphaAmount;
                    }
                    
                    currentX = nextX;
                    currentY = nextY;
                }
            }
            
            for (int index = 0; index < 4; index++) {
                countOfTornadoMove[index] += 2;
            }
        }
    }
}