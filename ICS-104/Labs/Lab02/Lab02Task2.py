TotalWidth = 28
TileWidth = 2
### BEGIN SOLUTION FOR THE SECOND TASK 8>
WidthWithoutBlackTile = TotalWidth - TileWidth

NumberOfTileGroups = int(WidthWithoutBlackTile // (4 * TileWidth) )

NumberOfTiles = 1 + (4 * NumberOfTileGroups)

LengthOfUsedTiles = NumberOfTiles * TileWidth

TotalGap = TotalWidth - LengthOfUsedTiles

GapAtEachEnd = TotalGap / 2


NumberOfBlackTiles = NumberOfTileGroups + 1
NumberOfWhiteTiles = NumberOfTileGroups
NumberOfGrayTiles = NumberOfTileGroups * 2

### END SOLUTION