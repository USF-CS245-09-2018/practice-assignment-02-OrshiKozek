# CS 245 (Fall, 2018) PracticeAssignment02

See assignment details on Canvas.

Practice2Test.java does not run in terminal. I couldn't get it to work, even though I used the command given on the assignment sheet: java Practice2Test 100000 5000 linear

Terminal displays this message on the console: Could not find or load main class Practice2Tests

The only way I was able to get the program to run with different inputs, was through the configuration of the run method of Intellij. I manually changed the parameters, so I was able to get different outputs.

Trends I noticed:
* The larger the array, the longer the run time.
* The runtime was often higher for binary recursive when compared to binary iterative. However, occasionally the recursice search was faster, but that was due to chance, since the elements of teh array are randomly generated and some searches are simply shorter than others.
* The runtime for linear searching was of course much higher than that of either binary method.
