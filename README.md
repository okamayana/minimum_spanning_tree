# Minimum Spanning Tree

Simple program that takes in a weighted, connected, and bi-directional [graph](http://en.wikipedia.org/wiki/Graph_theory) and outputs its (or one of) corresponding [minimum spanning tree](http://en.wikipedia.org/wiki/Minimum_spanning_tree) (MST).

## Input

The program takes its input in the form of a text file. The text file's first line is an integer, ranging from 1 to 26 inclusive, which denotes the number of vertices in the graph. The following lines would be rows of comma separated values which makes up a distance matrix how the vertices in the graph are connected.

For the sake of simplicity, the vertices in the graph are assumed to be named A, B, C, D and so on, with the matrix representing them in that order, left-to-right and top-to-bottom (like in the distance matrix example shown previously).

For example (the following input represents [this graph](http://i.imgur.com/ef5kdbx.png)):

```
10
-1,29,-1,-1,18,39,-1,-1,-1,-1
29,-1,37,-1,-1,20,-1,-1,-1,-1
-1,37,-1,28,-1,43,47,-1,-1,-1
-1,-1,28,-1,-1,-1,35,-1,-1,-1
18,-1,-1,-1,-1,31,-1,36,-1,-1
39,20,43,-1,31,-1,34,-1,33,-1
-1,-1,47,35,-1,34,-1,-1,-1,22
-1,-1,-1,-1,36,-1,-1,-1,14,-1
-1,-1,-1,-1,-1,33,-1,14,-1,23
-1,-1,-1,-1,-1,-1,22,-1,23,-1
```

## Output

The program outputs the MST in the form of an `Graph` object, and it also prints out the MST's total weight, and the edges that make up the MST in the form of pairs of vertices (i.e. AB, CD, etc).

For example (the following output corresponds to the input above):

```
222
AB, AE, BF, CD, DG, FI, GJ, HI, IJ
```
