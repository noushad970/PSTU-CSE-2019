#include<stdio.h>
int main()
{
    int subj1[100],subj2[100],subj3[100];
    for(int i=0;i<100;i++)
    {
        printf("Enter %d Number student Marks on three subject: \n",i+1);
        scanf("%d %d %d",&subj1[i],&subj2[i],&subj3[i]);
    }
    for(int i=0;i<100;i++)
    {
        printf("The result of roll number %d in \nSubject1 %d Subject2 %d Subject3 %d\n",i+1,subj1[i],subj2[i],subj3[i]);
    }
    int max1=0,max2=0,max3=0,sum[100];
    for(int i=0;i<100;i++)
    {
        sum[i]=0;
        if(subj1[i]>max1)
            max1=subj1[i];
        if(subj2[i]>max2)
            max2=subj2[i];
        if(subj3[i]>max3)
            max3=subj3[i];
        sum[i]=sum[i]+subj1[i]+subj2[i]+subj3[i];
    }
    int sumMax=0;
    int h;
    for(int i=0;i<100;i++)
    {
        if(sum[i]>sumMax)
        {sumMax=sum[i];

    }
    }
    printf("The highest number in Subject 1 is : %d\nThe highest number in Subject 2 is : %d\nThe highest number in Subject 3 is : %d\n",max1,max2,max3);
    printf("The total highest marks in three subjects are: %d",sumMax);

}

