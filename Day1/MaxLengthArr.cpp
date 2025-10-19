#include<iostream>
#include<String>
using namespace std;
int main()
{
	string arr[5]={"one","two","three","four","five"};
	
		int max=0;
	for(int i=0;i<4;i++)
	{
		if(arr[i].length()>max)
		{
			max=arr[i].length();
		}
	}
	cout<<"max length of string is : "<<max;
}
