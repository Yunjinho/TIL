#include <iostream>
#include <string>
using namespace std;
int main()
{
	//1316번

	int num,cnt=0;
	cin >> num;
	string str;
	int alpa[26] = { 0, };
	while (num!=0)
	{
		cin >> str;
		for (int i = 0; i < str.length(); i++){
			if (i == 0){ 
				alpa[((int)str[i]-97)] = 1; 
			}
			else if (str[i] != str[i - 1]){
				if (alpa[((int)str[i] - 97)] == 0){
					alpa[((int)str[i] - 97)] = 1;
				}
				else{
					break;
				}
			}
			else if (str[i] == str[i - 1]){
				 
			}
			if (i == (str.length()-1)){
				cnt++;
			}
		}
		for (int i = 0; i < 26; i++){ alpa[i] = 0; }
		num--;
	}
	cout << cnt;


}