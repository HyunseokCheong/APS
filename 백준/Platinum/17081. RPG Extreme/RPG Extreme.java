import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             rowOfGrid;
    static int             colOfGrid;
    static int             numberOfMonster;
    static int             numberOfItem;
    static char[]          command;
    static char[][]        grid;
    static int[][]         monsterPosition;
    static int[][]         itemPosition;
    static Position        startPosition;
    static User            user;
    static Monster[]       monsters;
    static Item[]          items;
    
    static void input() throws IOException {
        stk();
        rowOfGrid       = Integer.parseInt(st.nextToken());
        colOfGrid       = Integer.parseInt(st.nextToken());
        grid            = new char[rowOfGrid][colOfGrid];
        monsterPosition = new int[rowOfGrid][colOfGrid];
        numberOfMonster = 0;
        itemPosition    = new int[rowOfGrid][colOfGrid];
        numberOfItem    = 0;
        
        for (int r = 0; r < rowOfGrid; r++) {
            String line = br.readLine();
            Arrays.fill(monsterPosition[r], -1);
            Arrays.fill(itemPosition[r], -1);
            
            for (int c = 0; c < colOfGrid; c++) {
                char cur = line.charAt(c);
                
                // 유저, 시작점 저장 + 빈칸 처리
                if (cur == '@') {
                    user          = new User(new Position(r, c));
                    startPosition = new Position(r, c);
                    grid[r][c]    = '.';
                } else {
                    
                    // 빈칸
                    grid[r][c] = cur;
                    
                    // 몹
                    if (cur == '&' || cur == 'M') {
                        numberOfMonster++;
                    } else if (cur == 'B') {
                        
                        // 아이템
                        numberOfItem++;
                    }
                }
            }
        }
        
        // 명령어 저장
        command = br.readLine().toCharArray();
        
        // 몹 저장
        monsters = new Monster[numberOfMonster];
        for (int i = 0; i < numberOfMonster; i++) {
            stk();
            int    row  = Integer.parseInt(st.nextToken()) - 1;
            int    col  = Integer.parseInt(st.nextToken()) - 1;
            String name = st.nextToken();
            int    atk  = Integer.parseInt(st.nextToken());
            int    def  = Integer.parseInt(st.nextToken());
            int    hp   = Integer.parseInt(st.nextToken());
            int    exp  = Integer.parseInt(st.nextToken());
            monsterPosition[row][col] = i;
            monsters[i]               = new Monster(name, atk, def, hp, exp);
        }
        
        // 아이템 저장
        items = new Item[numberOfItem];
        
        // 아이템 종류 String -> int
        HashMap<String, Integer> accMap = new HashMap<>();
        accMap.put("HR", 0);
        accMap.put("RE", 1);
        accMap.put("CO", 2);
        accMap.put("EX", 3);
        accMap.put("DX", 4);
        accMap.put("HU", 5);
        accMap.put("CU", 6);
        
        for (int i = 0; i < numberOfItem; i++) {
            stk();
            int  row  = Integer.parseInt(st.nextToken()) - 1;
            int  col  = Integer.parseInt(st.nextToken()) - 1;
            char type = st.nextToken().charAt(0);
            
            // 타입 O : 악세 -> value가 타입이 됨
            // 타입 W, A : value가 스탯이 됨
            int value = type == 'O' ? accMap.get(st.nextToken()) : Integer.parseInt(st.nextToken());
            
            itemPosition[row][col] = i;
            items[i]               = new Item(type, value);
        }
    }
    
    static void process() throws IOException {
        // 현재 턴, 위치
        int      turn     = 0;
        Position position = startPosition;
        
        // 명령어 실행
        for (char c : command) {
            turn++;
            position = user.move(c);
            
            // 이동 후 만난 물체
            char unknown = grid[position.row][position.col];
            
            // 함정
            if (unknown == '^') {
                
                // 함정 처리 + 죽음 ?
                if (user.trapped() && user.isDead()) {
                    output(turn, 1, "SPIKE TRAP");
                }
            } else if (unknown == 'B') {
                
                // 아이템
                Item item = items[itemPosition[position.row][position.col]];
                
                // 무기
                if (item.type == 'W') {
                    user.getWeapon(item.value);
                } else if (item.type == 'A') {
                    
                    // 방어구
                    user.getArmor(item.value);
                } else {
                    
                    // 악세사리
                    user.getAccessory(item.value);
                }
                
                // 빈칸 처리
                grid[position.row][position.col] = '.';
            } else if (unknown == '&') {
                
                // 몹
                Monster monster = monsters[monsterPosition[position.row][position.col]];
                
                // 싸움 + 유저 죽음
                if (user.fight(monster, false)) {
                    
                    // 유저 죽음
                    if (user.isDead()) {
                        output(turn, 1, monster.name);
                    }
                } else {
                    
                    // 몹 죽음
                    grid[position.row][position.col] = '.';
                }
            } else if (unknown == 'M') {
                
                // 보스 몹
                Monster bossMonster = monsters[monsterPosition[position.row][position.col]];
                
                // 싸움 + 유저 죽음
                if (user.fight(bossMonster, true)) {
                    
                    // 유저 죽음
                    if (user.isDead()) {
                        output(turn, 1, bossMonster.name);
                    }
                } else {
                    
                    // 보스 몹 죽음 -> 승리
                    grid[position.row][position.col] = '@';
                    output(turn, 0, null);
                }
            }
        }
        
        // 명령어 끝 -> 종료
        grid[position.row][position.col] = '@';
        output(turn, 2, null);
    }
    
    static void output(int turn, int type, String name) throws IOException {
        
        // 지도 출력
        for (int r = 0; r < rowOfGrid; r++) {
            for (int c = 0; c < colOfGrid; c++) {
                bw.write(grid[r][c] + "");
            }
            bw.write(endl);
        }
        
        // 정보 출력
        bw.write("Passed Turns : " + turn + endl);
        bw.write("LV : " + user.level + endl);
        bw.write("HP : " + user.curHp + "/" + user.maxHp + endl);
        bw.write("ATT : " + user.atk + "+" + user.weaponAtk + endl);
        bw.write("DEF : " + user.def + "+" + user.armorDef + endl);
        bw.write("EXP : " + user.curExp + "/" + user.maxExp + endl);
        
        // 결과 출력
        if (type == 0) {
            bw.write("YOU WIN!" + blank);
        } else if (type == 1) {
            bw.write("YOU HAVE BEEN KILLED BY " + name + ".." + blank);
        } else {
            bw.write("Press any key to continue." + blank);
        }
        
        bw.flush();
        bw.close();
        System.exit(0); // 종료
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
    
    public static class User {
        
        Position position;
        
        // 맨몸
        int level  = 1;
        int curExp = 0;
        int maxExp = 5;
        int atk    = 2;
        int def    = 2;
        int curHp  = 20;
        int maxHp  = 20;
        
        // 장비
        int       weaponAtk   = 0; // 무기 공격력
        int       armorDef    = 0; // 방어구 방어력
        int       numberOfAcc = 0; // 착용 중 악세사리 개수
        boolean[] equippedAcc = new boolean[7]; // HR, RE, CO, EX, DX, HU, CU
        
        // 이동 방향
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        // 명령어 UDLR => 0123
        HashMap<Character, Integer> commandMap = new HashMap<>();
        
        public User(Position position) {
            this.position = position;
            commandMap.put('U', 0);
            commandMap.put('D', 1);
            commandMap.put('L', 2);
            commandMap.put('R', 3);
        }
        
        // 이동
        public Position move(char c) {
            int direction = commandMap.get(c);
            int nextRow   = position.row + dr[direction];
            int nextCol   = position.col + dc[direction];
            
            // 범위 + 벽 체크 => 이동
            if (goodToGO(nextRow, nextCol)) {
                this.position.row = nextRow;
                this.position.col = nextCol;
            }
            return position;
        }
        
        // 죽음
        public boolean isDead() {
            // RE 미착용 -> 죽음
            if (!equippedAcc[1]) {
                this.curHp = 0;
                return true;
            }
            
            // RE 착용 -> 풀피로 부활 + 악세 사라짐
            this.position  = new Position(startPosition.row, startPosition.col);
            this.curHp     = this.maxHp;
            equippedAcc[1] = false;
            return false;
        }
        
        // 싸움 - 유저 선빵
        public boolean fight(Monster monster, boolean isBoss) {
            
            // 몹
            int monsterHp = monster.hp;
            
            // 유저
            int totalAtk     = this.atk + this.weaponAtk;
            int totalDef     = this.def + this.armorDef;
            int dmgToMonster = Math.max(1, totalAtk - monster.def);
            
            // 첫번째 공격
            // 악세 2 : CO, 4 : DX
            if (equippedAcc[2]) {
                monsterHp -= Math.max(1, (totalAtk * (equippedAcc[4] ? 3 : 2)) - monster.def);
            } else {
                monsterHp -= dmgToMonster;
            }
            
            // 몹 죽음
            if (monsterHp <= 0) {
                win(monster.exp);
                return false;
            }
            
            // 첫번째 방어
            int dmgToUser = Math.max(1, monster.atk - totalDef);
            
            // 보스 + 악세 5 : HU -> 풀피되고 공격 무효
            if (isBoss && equippedAcc[5]) {
                this.curHp = this.maxHp;
            } else {
                this.curHp -= dmgToUser;
            }
            
            // 유저 죽음
            if (this.curHp <= 0) {
                return true;
            }
            
            // 둘 중 하나 죽을 때 까지 싸움
            while (true) {
                
                // 유저 공격
                monsterHp -= dmgToMonster;
                
                // 몹 죽음?
                if (monsterHp <= 0) {
                    win(monster.exp);
                    return false;
                }
                
                // 몹 공격
                this.curHp -= dmgToUser;
                
                // 유저 죽음?
                if (this.curHp <= 0) {
                    return true;
                }
            }
        }
        
        // 이김
        public void win(int exp) {
            
            // 악세 0 : HR -> 피 + 3
            if (equippedAcc[0]) {
                this.curHp = Math.min(this.maxHp, this.curHp + 3);
            }
            
            // 악세 3 : EX -> 경험치 1.2배
            this.curExp += equippedAcc[3] ? (int) (exp * 1.2) : exp;
            
            // 레벨업
            if (this.curExp >= this.maxExp) {
                levelUp();
            }
        }
        
        // 레벨업
        public void levelUp() {
            this.level  = this.level + 1;
            this.curExp = 0;
            this.maxExp = this.level * 5;
            this.atk    = this.atk + 2;
            this.def    = this.def + 2;
            this.maxHp  = this.maxHp + 5;
            this.curHp  = this.maxHp;
        }
        
        // 함정
        public boolean trapped() {
            
            // 악세 4 : DX -> 데미지 1
            curHp -= equippedAcc[4] ? 1 : 5;
            return curHp <= 0;
        }
        
        // 무기
        public void getWeapon(int atk) {
            this.weaponAtk = atk;
        }
        
        // 방어구
        public void getArmor(int def) {
            this.armorDef = def;
        }
        
        // 악세사리
        public void getAccessory(int type) {
            
            // 4개 이상 X + 중복 X
            if (numberOfAcc < 4 && !equippedAcc[type]) {
                equippedAcc[type] = true;
                numberOfAcc++;
            }
        }
        
        // 범위 + 벽 체크
        public boolean goodToGO(int row, int col) {
            return row >= 0 && row < rowOfGrid && col >= 0 && col < colOfGrid && grid[row][col] != '#';
        }
    }
    
    public static class Monster {
        
        String name;
        int    atk;
        int    def;
        int    hp;
        int    exp;
        
        public Monster(String name, int atk, int def, int hp, int exp) {
            this.name = name;
            this.atk  = atk;
            this.def  = def;
            this.hp   = hp;
            this.exp  = exp;
        }
    }
    
    public static class Item {
        
        char type; // W, A, O
        int  value;
        
        public Item(char type, int value) {
            this.type  = type;
            this.value = value;
        }
    }
    
    public static class Position {
        
        int row;
        int col;
        
        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
}