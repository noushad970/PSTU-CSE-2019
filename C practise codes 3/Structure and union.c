#include<stdio.h>

int main()
{
   FILE *file;
   char a[10]={"Noushad"};
   file=fopen("file.txt","w");
   if(file=NULL)
    printf("File doesnot exist");
   else
    {printf("File is opened succesfully");
   printf("\n");
   for(int i=0;i<strlen(a);i++)
   {
       fputc(a[i],file);
   }fclose(file);
   }
}

