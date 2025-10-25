#include<iostream>
using namespace std;
void SumOfDigit()
{
	int no;
	cout<<"enter the no:";
	cin>>no;
	int sum=0;
	while(no>0)
	{
		int rem=no%10;
		sum=rem+sum;
		no=no/10;
	}
	cout<<sum;
}
int main()
{
	SumOfDigit();
}
