//Exercise 2 code
#include <stdio.h>

int main()
{
    int min,max;
    do {
        printf("Enter min and max of an interval: ");
        scanf("%d",&min);
        scanf("%d",&max);
        if (min>=max)
           printf("min must be less than max\n");
     
    }
    while(min>max || min == max);
    printf("Numbers divisible by 3 inside the interval [%d,%d] are:\n",min,max);
    while(min<=max)
    {
           if (min%3==0)
           printf("%d ",min);
           min++;
     }
    
     return 0;
    

}