#include<iostream>
using namespace std;
void Palindrome()
{
	int no;
	cout<<"enter the no:";
	cin>>no;
	int org=no;
	int res=0;
	while(no>0)
	{
		int rem=no%10;
		res=(res*10)+rem;
		no=no/10;
	}
	if(org==res)
	{
		cout<<"true";
	}
	else{
		cout<<"false";
	}
}
int main()
{
	Palindrome();
}
