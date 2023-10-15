import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Time cur, target;
    
    static class Time {
        int hour, minute, second;
        
        Time(String line) {
            String[] tokens = line.split(":");
            hour = Integer.parseInt(tokens[0]);
            minute = Integer.parseInt(tokens[1]);
            second = Integer.parseInt(tokens[2]);
        }
        
        public Time(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        
        Time calculate(Time cur, Time target) {
            int hour = target.hour - cur.hour;
            int minute = target.minute - cur.minute;
            int second = target.second - cur.second;
            if (hour == 0 && minute == 0 && second == 0) {
                return new Time(24, 0, 0);
            }
            if (second < 0) {
                second += 60;
                minute--;
            }
            if (minute < 0) {
                minute += 60;
                hour--;
            }
            if (hour < 0) {
                hour += 24;
            }
            return new Time(hour, minute, second);
        }
        
        String toString(Time time) {
            return String.format("%02d:%02d:%02d", time.hour, time.minute, time.second);
        }
    }
    
    static void input() throws IOException {
        cur = new Time(br.readLine());
        target = new Time(br.readLine());
    }
    
    static void process() throws IOException {
        bw.write(cur.toString(cur.calculate(cur, target)));
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}