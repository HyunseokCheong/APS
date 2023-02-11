#include <iostream>
#include <list>
#define endl "\n";
using namespace std;

/**
 * I : insert S at X by Y
 * D : delete at X by Y
 * A : add S by Y
 * @Author HyunseokCheong
 * @Date 2023/02/11
 */

int       origin_password_n, command_n, input_int;
list<int> password;
char      command;
int       command_position, command_count, command_number;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    
    for (int test_case = 1; test_case <= 10; test_case++) {
        
        password.clear();
        cin >> origin_password_n;
        
        // ���� ��ȣ�� ����
        for (int i = 0; i < origin_password_n; i++) {
            
            cin >> input_int;
            password.push_back(input_int);
        }
        
        cin >> command_n;
        
        for (int i = 0; i < command_n; i++) {
            
            cin >> command;
            
            if (command == 'I') { // I : insert S at X by Y
                
                cin >> command_position >> command_count;
                auto iterator = password.begin();
                
                for (int j = 0; j < command_position; j++) {
                    iterator++;
                }
                
                for (int j = 0; j < command_count; j++) {
                    
                    cin >> command_number;
                    password.insert(iterator, command_number);
                }
                
            } else if (command == 'D') { // D : delete at X by Y
                
                cin >> command_position >> command_count;
                auto iterator = password.begin();
                
                for (int j = 0; j < command_position; j++) {
                    
                    iterator++;
                }
                
                for (int j = 0; j < command_count; j++) {
                    
                    iterator = password.erase(iterator);
                }
                
            } else if (command == 'A') { //  A : add S by Y
                
                cin >> command_count;
                
                for (int j = 0; j < command_count; j++) {
                    
                    cin >> command_number;
                    password.push_back(command_number);
                }
            }
        }
        
        cout << "#" << test_case << " ";
        
        for (int i = 0; i < 10; i++) {
            
            cout << password.front() << " ";
            password.pop_front();
        }
        cout << endl;
    }
    
    return 0;
}