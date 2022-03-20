#include <iostream>
using namespace std;
int main() {
	int flip, c;
	string str, second_str;
    cin >> flip >> str;

	string new_str = "";
	
	if(flip%2 == 0){
		 new_str = str;
		
	}
	else{
		for(int i = 0; i<str.length(); i++){
			
			if(str[i] == '0')
				 c = (int)str[i] + 1;
			
			else
				 c = ((int)str[i]) - 1;
			
			new_str += (char)c;
		}
	}

	cin>>second_str;

	if(second_str == new_str)
		cout<<"Deletion succeeded"<<endl;
	else
		cout<<"Deletion failed"<<endl;

		
	}
