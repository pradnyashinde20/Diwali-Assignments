#include<iostream>
using namespace std;
Prime()
{
	int no;
cout<<"enter the no:";
cin>>no;
int count=0;	
for(int i=1;i<=no;i++){
if(no%i==0)
{
	count++;
	
}
}
if(count<=2)
{
	cout<<"true";
}
else{
	cout<<"false";
}
}
int main()
{
	Prime();
}
