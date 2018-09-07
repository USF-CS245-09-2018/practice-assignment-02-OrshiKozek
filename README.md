# CS 245 (Fall, 2018) PracticeAssignment02

See assignment details on Canvas.

Practice2Test.java does not run in terminal. I used the command given on the assignment sheet: java Practice2Test 100000 5000 linear
Terminal displays this message on the console: Could not find or load main class Practice2Tests.java

The only way I was able to get the program to run with different initial inputs, was through the configuration of the run method of intellij.
I manually changed the parameters, so I was able to get different outputs.

Trends I noticed:

-Naturally, the runtime was much higher for binary recursive when compared to binary iterative. The runtime for linear searching was of course very much higher
than that of either binary method.
-The bigger the size of the array, the bigger the difference between the runtimes of binary recursive and binary iterative (iterative being lower)
-The smaller the size of the array, the closer the difference between the two runtimes was.
-However, even with a small number of elements in the array, the higher the number of searches, the bigger the difference between the two runtimes
-(Naturally, the higher both the length of the array and the number of searches, the bigger the difference between the runtimes)

50000000 500000 recursive- 208 iterative- 273?????
high of both, recursive is faster...
it 291 127 rec
74
it 5 6 558
5 6 6 smaller array size= similar runtimes 10
4 5 9 100
4 11 18 1000
6
6
6 11
13 20

I am still trying to understand the different trends that i see...