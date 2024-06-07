#include <stdio.h>

int main()
{
    int thousandNumber , beforeComma;
    double reminder;
    printf("Please enter a number between 1,100 and 999,999: ");
    scanf("%d",&thousandNumber);
    beforeComma = thousandNumber / 1000;
    reminder = thousandNumber % 1000;
    printf("%d,%.0f", beforeComma,reminder);
}