#include<iostream>
using namespace std;

int keyFirstPos(int a[],int n,int key)
{
    int firstIndex,LastIndex,MidIndex,Answer1st=-1;
    firstIndex=0;
    LastIndex=n-1;
    MidIndex = (firstIndex+ LastIndex)/2;

    while(firstIndex<=LastIndex)
    {
        if(a[MidIndex]==key)
        {
            Answer1st=MidIndex;
            LastIndex=MidIndex-1;

        }

        else if(key>a[MidIndex])
        {
            firstIndex=MidIndex+1;
        }
        else if(key<a[MidIndex])
        {
            LastIndex= MidIndex-1;
        }
        MidIndex = (firstIndex+ LastIndex)/2;
    }
    return MidIndex;
}
int keyLastPos(int a[],int n,int key)
{
    int firstIndex,LastIndex,MidIndex,Answer2nd=-1;
    firstIndex=0;
    LastIndex=n-1;
    MidIndex = (firstIndex+ LastIndex)/2;
    while(firstIndex<=LastIndex)
    {
        if(a[MidIndex]==key)
        {
            Answer2nd=MidIndex;
            firstIndex=MidIndex+1;

        }

        else if(key>a[MidIndex])
        {
            firstIndex=MidIndex+1;
        }
        else if(key<a[MidIndex])
        {
            LastIndex = MidIndex-1;
        }
        MidIndex = (firstIndex+ LastIndex)/2;
    }
   return MidIndex;
}

int main()
{
    int a[100],b[100];
    int n,s;

    cin>>n;
   for(int i=0;i<n;i++)
   {
    cin>>a[i];
   }
   cout<<"Keyword is: "<<endl;
   cin>>s;

   cout<<"the 1st position of the array is: "<<keyFirstPos(a,n,s)<<endl;
   cout<<"the last position of the array is: "<<keyLastPos(a,n,s)<<endl;

}
