#include<stdio.h>
 int main()
 {
     int a,b,c,max,max2,min;
     printf("ENter three numbers: ");
     scanf("%d %d %d",&a,&b,&c);
     if(a>b && a>c&&b>c)
     {
          max=a;
          max2=b;
          min=c;
     }
     if(a>b && a>c&&b<c)
     {
          max=a;
          max2=c;
          min=b;
     }
     if(b>a && b>c&&a>c)
     {
          max=b;
          max2=a;
          min=c;
     }

     if(b>a && b>c&&a<c)
     {
          max=b;
          max2=c;
          min=a;
     }
     if(c>b && c>a&&b>a)
     {
          max=c;
          max2=b;
          min=a;
     }
     if(c>b && c>a&&b<a)
     {
          max=c;
          max2=a;
          min=b;
     }
     printf("The ascending form is : %d, %d, %d",min,max2,max);

 }
