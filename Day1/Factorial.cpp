#include<iostream>
using namespace std;
	factorial(){
	
	int no;
	int fact=1;
	cout<<"enter the no:";
	cin>>no;
	for(int i=1;i<=no;i++)
	{
		fact=fact*i;
	}
	cout<<"factorial of the given no:"<<fact;
}
int main()
{
	factorial();
}

