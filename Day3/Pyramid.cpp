#include<iostream>
using namespace std;
int main()
{
	int no;
	cout<<"enter the no of rows: ";
	cin>>no;
	for(int i=1;i<=no;i++)
	{
		for(int j=1;j<=no-1;j++)
		{
			cout<<" ";
		}
		for(int k=1;k<=i;k++)
		{
			cout<<k<<" ";
		}
		for(int k=i-1;k>=1;k--)
		{
			cout<<k<<" ";
		}
		cout<<endl;
	}
}
