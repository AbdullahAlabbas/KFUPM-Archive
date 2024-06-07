TotalWidth = 23
TileWidth = 2 

### BEGIN SOLUTION FOR THE FIRST TASK <3
WidthWithoutBlackTile = TotalWidth - TileWidth

NumberOfPairs = int(WidthWithoutBlackTile // (2*TileWidth) )

NumberOfTiles = 1 + (2 * NumberOfPairs)

LengthOfUsedTiles = NumberOfTiles * TileWidth

TotalGap = TotalWidth - LengthOfUsedTiles

GapAtEachEnd = TotalGap / 2

NumberOfBlackTiles = NumberOfPairs + 1

NumberOfWhiteTiles = NumberOfPairs
# The outputs
print("The Number Of Tiles : ", NumberOfTiles )
print("The Gap At Each End : ", GapAtEachEnd )
print(NumberOfBlackTiles)
print(NumberOfWhiteTiles)

### END SOLUTION