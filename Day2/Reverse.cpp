#include<iostream>
using namespace std;
void Reverse()
{
	int no;
	cout<<"enter the no:";
	cin>>no;
	int res=0;
	while(no>0)
	{
		int rem=no%10;
		res=res*10+rem;
		no=no/10;
}
cout<<"reverse no is:"<<res;
}
int main()
{
	Reverse();
}
