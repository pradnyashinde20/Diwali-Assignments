#include<iostream>
using namespace std;
void Armstrong()
{
	int no;
	cout<<"enter the no:";
	cin>>no;
	int res=0;
	int org=no;
	while(no>0)
	{
		int rem=no%10;
		res=rem*rem*rem+res;
		no=no/10;
	}
	if(org==res)
	{
		cout<<"true";
	}
	else
	{
		cout<<"false";
	}
	
}
int main()
{
	Armstrong();
}
