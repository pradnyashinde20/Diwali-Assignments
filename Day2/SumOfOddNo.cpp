#include<iostream>
using namespace std;
int main()
{
	int no;
	cout<<"enter the no:";
	cin>>no;
	int sum=0;
	for(int i=1;i<=no;i++)
	{
		sum=sum+i*2-1;
	}
	cout<<sum;
}
