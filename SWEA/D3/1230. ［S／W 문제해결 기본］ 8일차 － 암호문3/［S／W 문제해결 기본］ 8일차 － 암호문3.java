import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int passwordN, commandN;
    static char command;
    static int  commandIndex, commandCount, commandNumber;
    static int[] passwordArr, commandNumberArr;
    
    static class Node {
        
        int  data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class LinkedList {
        
        Node   head;
        Node   tail;
        Node[] nodeArr;
        int    nodeCount;
        
        public LinkedList() {
            this.head      = null;
            this.nodeArr   = new Node[5000];
            this.nodeCount = 0;
        }
        
        Node getNewNode(int data) {
            nodeArr[nodeCount] = new Node(data);
            return nodeArr[nodeCount++];
        }
        
        void insert(int commandIndex, int[] commandNumberArr) {
            int start = 0;
            if (commandIndex == 0) {
                if (head != null) {
                    Node newNode = getNewNode(commandNumberArr[0]);
                    newNode.next = head;
                    head         = newNode;
                } else {
                    head = getNewNode(commandNumberArr[0]);
                }
                
                commandIndex = 1;
                start        = 1;
            }
            
            Node currentNode = head;
            for (int i = 1; i < commandIndex; i++) {
                currentNode = currentNode.next;
            }
            
            for (int i = start; i < commandNumberArr.length; i++) {
                Node newNode = getNewNode(commandNumberArr[i]);
                newNode.next     = currentNode.next;
                currentNode.next = newNode;
                currentNode      = newNode;
            }
            if (currentNode.next == null) {
                tail = currentNode;
            }
        }
        
        void delete(int commandIndex, int commandCount) {
            Node currentNode = head;
            if (commandIndex == 0) {
                for (int i = 0; i < commandCount; i++) {
                    currentNode = currentNode.next;
                }
                head = currentNode;
            }
            
            for (int i = 1; i < commandIndex; i++) {
                currentNode = currentNode.next;
            }
            
            Node temp = currentNode;
            for (int i = 0; i < commandCount; i++) {
                currentNode = currentNode.next;
            }
            temp.next = currentNode.next;
            
            if (temp.next == null) {
                tail = temp;
            }
        }
        
        void add(int commandNumber) {
            Node currentNode = tail;
            Node newNode     = getNewNode(commandNumber);
            currentNode.next = newNode;
            tail             = newNode;
        }
        
        void print() throws IOException {
            Node currentNode = head;
            for (int i = 0; i < 10; i++) {
                bw.write(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        for (int t = 1; t < 11; t++) {
            bw.write("#" + t + " ");
            
            LinkedList linkedList = new LinkedList();
            passwordN   = Integer.parseInt(br.readLine());
            passwordArr = new int[passwordN];
            st          = new StringTokenizer(br.readLine());
            for (int i = 0; i < passwordN; i++) {
                passwordArr[i] = Integer.parseInt(st.nextToken());
            }
            linkedList.insert(0, passwordArr);
            
            commandN = Integer.parseInt(br.readLine());
            st       = new StringTokenizer(br.readLine());
            for (int i = 0; i < commandN; i++) {
                command = st.nextToken().charAt(0);
                
                switch (command) {
                    case 'I':
                        commandIndex = Integer.parseInt(st.nextToken());
                        commandCount = Integer.parseInt(st.nextToken());
                        commandNumberArr = new int[commandCount];
                        for (int j = 0; j < commandCount; j++) {
                            commandNumber       = Integer.parseInt(st.nextToken());
                            commandNumberArr[j] = commandNumber;
                        }
                        linkedList.insert(commandIndex, commandNumberArr);
                        break;
                    case 'D':
                        commandIndex = Integer.parseInt(st.nextToken());
                        commandCount = Integer.parseInt(st.nextToken());
                        linkedList.delete(commandIndex, commandCount);
                        break;
                    case 'A':
                        commandCount = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < commandCount; j++) {
                            commandNumber = Integer.parseInt(st.nextToken());
                            linkedList.add(commandNumber);
                        }
                        break;
                }
            }
            linkedList.print();
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}