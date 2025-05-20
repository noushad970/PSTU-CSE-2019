#include<stdio.h>
int main()
{
    int a[1000],n;
    printf("Enter the number of voters: ");
    scanf("%d",&n);
    int f=0,b=0,c=0,d=0,e=0,spl=0;
    printf("Enter votes: \n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]==1)
            f++;
        else if(a[i]==2)
            b++;
        else if(a[i]==3)
            c++;
            else if(a[i]==4)
            d++;
            else if(a[i]==5)
            e++;
            else
                spl++;
    }
    printf("Cand 1|\tCand 2|\tCand 3|\tCand 4|\tCand 5|\tspoiled vote\n");

    printf("%d     |\t%d     |\t%d     |\t%d     |\t%d     |\t%d",f,b,c,d,e,spl);


}
