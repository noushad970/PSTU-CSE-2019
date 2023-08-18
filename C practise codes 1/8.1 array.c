#include<stdio.h>
int main()

{
   int x[1000],y[10000],n,sumA=0,sumB=0,sumAB=0,sumA2=0,sumB2=0;
   float m,c;
   scanf("%d",&n);
   printf("Enter the values (Xi,Yi): \n");
   for(int i=0;i<n;i++)
   {
       scanf("%d %d",&x[i],&y[i]);


   }
   for(int i=0;i<n;i++)
   {
       sumA=sumA+x[i];
       sumB=sumB+y[i];
       sumAB=sumAB+((x[i])*(y[i]));
       sumA2=sumA2+(x[i])*(x[i]);
       sumB2=sumB2+(y[i])*(y[i]);
       //printf("sumA=%d\nsumB= %d\nsumAB= %d\nsumA2= %d\nsumB2 %d\n",sumA,sumB,sumAB,sumA2,sumB2);
   }
   m=(sumAB-(sumA)*(sumB))/((sumA2)-(sumB2));
   c=((sumA2)-m*(sumA))/n;
   printf("The value of M in Y = MX + C is : %0.2f\n",m);
   printf("The value of C in Y = MX + C is : %0.2f\n",c);

}
