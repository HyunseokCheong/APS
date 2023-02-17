import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             lengthOfField, numberOfQuery, directionOfQuery, distanceOfQuery, nextRow, nextColumn, answer;
    static Queue<Cloud> clouds;
    static int[]        directionRowOfMove = {0, -1, -1, -1, 0, 1, 1, 1}, directionColumnOfMove = {-1, -1, 0, 1, 1, 1,
            0, -1};
    static int[][]     field;
    static boolean[][] visited;
    
    static class Cloud {
        
        int row;
        int column;
        
        public Cloud(int row, int column) {
            this.row    = row;
            this.column = column;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st            = new StringTokenizer(br.readLine());
        lengthOfField = Integer.parseInt(st.nextToken());
        numberOfQuery = Integer.parseInt(st.nextToken());
        field         = new int[lengthOfField][lengthOfField];
        for (int i = 0; i < lengthOfField; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < lengthOfField; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        visited = new boolean[lengthOfField][lengthOfField];
        clouds  = new LinkedList<>();
        initCloud();
        for (int i = 0; i < numberOfQuery; i++) {
            st               = new StringTokenizer(br.readLine());
            directionOfQuery = Integer.parseInt(st.nextToken());
            distanceOfQuery  = Integer.parseInt(st.nextToken());
            
            moveCloud(directionOfQuery, distanceOfQuery);
            removeCloudAndCopyBug();
            initCloudAndRemoveWater();
        }
        answer = 0;
        for (int row = 0; row < lengthOfField; row++) {
            for (int colum = 0; colum < lengthOfField; colum++) {
                answer += field[row][colum];
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
    
    static void initCloud() {
        clouds.add(new Cloud(lengthOfField - 1, 0));
        clouds.add(new Cloud(lengthOfField - 1, 1));
        clouds.add(new Cloud(lengthOfField - 2, 0));
        clouds.add(new Cloud(lengthOfField - 2, 1));
    }
    
    static void moveCloud(int directionOfQuery, int distanceOfQuery) {
        for (Cloud cloud : clouds) {
            cloud.row    = (lengthOfField + cloud.row + directionRowOfMove[directionOfQuery - 1] * (distanceOfQuery
                    % lengthOfField)) % lengthOfField;
            cloud.column =
                    (lengthOfField + cloud.column + directionColumnOfMove[directionOfQuery - 1] * (distanceOfQuery
                            % lengthOfField)) % lengthOfField;
            field[cloud.row][cloud.column]++;
        }
    }
    
    static void removeCloudAndCopyBug() {
        while (!clouds.isEmpty()) {
            Cloud cloud = clouds.poll();
            int   count = 0;
            visited[cloud.row][cloud.column] = true;
            for (int i = 1; i <= 7; i += 2) {
                nextRow    = cloud.row + directionRowOfMove[i];
                nextColumn = cloud.column + directionColumnOfMove[i];
                if (nextRow >= 0 && nextRow < lengthOfField && nextColumn >= 0 && nextColumn < lengthOfField) {
                    if (field[nextRow][nextColumn] >= 1) {
                        count++;
                    }
                }
            }
            field[cloud.row][cloud.column] += count;
        }
    }
    
    static void initCloudAndRemoveWater() {
        for (int i = 0; i < lengthOfField; i++) {
            for (int j = 0; j < lengthOfField; j++) {
                if (!visited[i][j] && field[i][j] >= 2) {
                    field[i][j] -= 2;
                    clouds.add(new Cloud(i, j));
                }
            }
        }
        visited = new boolean[lengthOfField][lengthOfField];
    }
}