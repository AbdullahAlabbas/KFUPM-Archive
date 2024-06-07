#include <stdio.h>

int main()
{
    double totalWidth, tileWidth , gapAtEachEnd;
    
    int numberOfPairs ,
    numberOfTiles , 
    numberOfBlackTiles ,
    numberOfWhiteTiles;
    
    printf("Enter total width: ");
    scanf("%lf", &totalWidth);

    printf("Enter Tile width: ");
    scanf("%lf", &tileWidth);

    numberOfPairs = (int) ((totalWidth - tileWidth)/(2*tileWidth));
    numberOfTiles = 2*numberOfPairs + 1;
    gapAtEachEnd = (totalWidth - numberOfTiles*tileWidth)/2.0;
    numberOfBlackTiles = numberOfPairs + 1;
    numberOfWhiteTiles = numberOfPairs;

    printf("Number of tiles = %d\nGap on each side = %.2f\n", numberOfTiles, gapAtEachEnd);
    printf("Number of black tiles = %d\nNumber of White Tiles = %d", numberOfBlackTiles, numberOfWhiteTiles);

    return 0;
}