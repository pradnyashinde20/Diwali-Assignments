#include<iostream>
using namespace std;
void Table(int n)
{
	int table;
	cout<<"table of given "<< n <<"is: ";
	for(int i=1;i<=10;i++)
	{
		table=n*i;
		cout<<"\t"<<table;
	}
	
}
int main()
{
	int no;
	cout<<"enter the no to print table:";
	cin>>no;
	Table(no);
}
