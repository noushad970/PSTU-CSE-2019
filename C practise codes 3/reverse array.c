#include<iostream>
using namespace std;
int reverseArr(int arr[],int siz)
{
    cout<<"Original Array: "<<endl;
    for(int i=0;i<siz;i++)
    {
      cout<<arr[i]<<endl<<endl;
    }
    cout<<"Reverse Array: "<<endl;
    for(int j=siz-1;j>=0;i--)
    {

      cout<<arr[j]<<endl<<endl;
    }
}
main()
{
int i,j,n,arr[10000];
cout<<"The number of array: "<<endl;
cin>>n;
cout<<"Arrays Value: "<<endl;
for(i=0;i<n;i++)
{
    cin>>arr[i];
}
cout<<reverseArr(arr,n);



}
