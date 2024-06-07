#include <stdio.h>
#define kilo 1.609344 
#define feet 5280
#define inches 12

int main(void)
{
    double distance , resultInInches;
    int resultInMiles , resultInFeet;
    
    printf("Enter distance in kilometers: ");
    scanf("%lf", &distance);
    resultInMiles= distance / kilo;
    resultInFeet = (distance / kilo - resultInMiles)*feet;
    resultInInches = (((distance / kilo - resultInMiles)*feet)-resultInFeet) * inches;
    printf("%.2f kilometers equals %d miles, %d feet, and %.2f inches",distance ,resultInMiles , resultInFeet , resultInInches);

    return (0);
}