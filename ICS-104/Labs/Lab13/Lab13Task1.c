// Exercise 1 code

#include <stdio.h>

int main()
{
    int x,y,z ;
    scanf("%d",&x);
    scanf("%d",&y);
    scanf("%d",&z);
    if (x>y && y>z)
       printf("%d %d %d decreasing order" ,x,y,z);
    else if (x<y && y<z || y == z)
        printf("%d %d %d increasing order" ,x,y,z);
    else 
        printf("%d %d %d not in order" ,x,y,z);
    return 0;
}

