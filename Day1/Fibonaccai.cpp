#include<iostream>
using namespace std;
fibonaccai()
{
	int no;
	cout<<"enter the no do you want to print fibonacci series:";
	cin>>no;
	int a=0,b=1;
	for(int i=0;i<=no;i++)
	{
		cout<<a;
		int fn=(a+b);
		a=b;
		b=fn;
	}
	}
	int main()
	{
		fibonaccai();
		
	}

