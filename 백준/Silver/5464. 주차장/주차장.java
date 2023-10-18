import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, totalPrice, carNumber;
    static ParkingLot parkingLot;
    static Car[] cars;
    
    static class Car {
        int number;
        int weight;
        
        public Car(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }
    }
    
    static class ParkingLot {
        int size;
        int[] prices, isPark;
        Queue<Car> waitingCars;
        
        public ParkingLot(int size) {
            this.size = size;
            this.prices = new int[size + 1];
            this.isPark = new int[size + 1];
            this.waitingCars = new LinkedList<>();
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        parkingLot = new ParkingLot(n);
        for (int i = 1; i < parkingLot.size + 1; i++) {
            parkingLot.prices[i] = Integer.parseInt(br.readLine());
        }
        cars = new Car[m + 1];
        for (int i = 1; i < m + 1; i++) {
            cars[i] = new Car(i, Integer.parseInt(br.readLine()));
        }
    }
    
    static void process() throws IOException {
        totalPrice = 0;
        for (int i = 0; i < m * 2; i++) {
            carNumber = Integer.parseInt(br.readLine());
            if (carNumber > 0) {
                in(carNumber);
                continue;
            }
            out(carNumber);
        }
    }
    
    static void in(int carNumber) {
        for (int i = 1; i < parkingLot.size + 1; i++) {
            if (parkingLot.isPark[i] == 0) {
                parkingLot.isPark[i] = carNumber;
                totalPrice += parkingLot.prices[i] * cars[carNumber].weight;
                return;
            }
        }
        parkingLot.waitingCars.add(cars[carNumber]);
    }
    
    static void out(int carNumber) {
        carNumber = -carNumber;
        for (int i = 1; i < parkingLot.size + 1; i++) {
            if (parkingLot.isPark[i] == carNumber) {
                parkingLot.isPark[i] = 0;
                
                if (!parkingLot.waitingCars.isEmpty()) {
                    in(parkingLot.waitingCars.poll().number);
                }
                return;
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(totalPrice + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}