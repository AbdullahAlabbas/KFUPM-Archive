// Exercise 3 code
#include <stdio.h>
int isPrime(int n){

    printf("prime number less than %d are:\n",n);
    for (int i=2 ;i<n;i++)
    {
        (i> 7 ||i ==6){
        if(i % 2 == 0 || i %3 == 0 || i %5 == 0 || i %7 == 0){

    }
    else{
        printf("%d ",i);
    }

    }
    else{
        printf("%d ",i);
        }
    }   

}
int main()
{
 int min,max;
 int n = 100;

 isPrime(n);


 return 0;
}