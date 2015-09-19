##Game of Life

#Problem Description

The universe of the Game of Life is an infinite two-dimensional orthogonal grid of square cells, each of which is in one of two possible states, live or dead. Every cell interacts with its eight neighbours, which are the cells that are directly horizontally, vertically, or diagonally adjacent.
At each step in time, the following transitions occur:

1.Any live cell with fewer than two live neighbours dies, as if by loneliness.
2.Any live cell with more than three live neighbours dies, as if by overcrowding.
3.Any live cell with two or three live neighbours lives, unchanged, to the next generation.
4.Any dead cell with exactly three live neighbours comes to life.

#Dependencies

1.JDK (version 7)
2.JUnit
3.Apache Ant


#Building the codebase

Run the following command from your terminal in the project root directory :

`````````````
ant
`````````````