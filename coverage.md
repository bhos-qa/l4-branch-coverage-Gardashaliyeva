## Code Coverage

Code coverage is a measure which describes the degree of which the source code of the program has been tested. It is one form of white box testing which finds the areas of the program not exercised by a set of test cases. It also creates some test cases to increase coverage and determining a quantitative measure of code coverage.

Code Coverage is important for a variety of reasons, some of which are stated below:

* When compared to software that does not have a good Code Coverage, it helps to ensure that the software has fewer errors.
* It indirectly aids in the delivery of better ‘quality software by assisting in the improvement of code quality.
* It is a metric that can be used to determine the effectiveness of a test (effectiveness of the unit tests that are written to test the code).
* It assists in identifying areas of the source code that might otherwise go unexplored.
* It aids in determining whether present testing (unit testing) is adequate and whether additional tests are required.

Statement coverage, Predicate coverage, and Branch coverage have been described briefly in this report. 

### Statement Coverage
This methodology is a measure that tells if all possible executable statements of code in source code have been executed at least once. It is a method to ensure that each line of the source code is covered at least once by the tests.
This might sound simple but caution needs to be exercised while measuring the Statement Coverage. The reason being, in a source code there could be a certain condition that might not get executed depending on the input values.
This would mean that all the lines of code would not be covered in testing. Thus, we may have to use different input value sets to cover all such conditions in the source code.

To provide an exmaple, a code snippet has been provided below:

func Add (int a, int b) {
        
        If (b > a) {
    
    b = b - a
    
    Print b
             
             }
        
        If (a > b) {
        
        b = a – b
        
        Print b

  }
     
     Else Print ‘0’

  }

For example, in the above source code if input values are taken as 2 & 3 then, the ‘Else’ part of the code would not get executed. However, if the input values are of type 3 & 2 then the ‘If’ part of the code would not get executed.
This means that with either set of values of our Statement Coverage would not be 100%. In such a case, we may have to execute the tests with all three [(2, 3), (3, 2), (0, 0)] set of values to ensure 100% Statement Coverage.

### Predicate (Condition) Coverage
In a source code wherever we have a condition, the result would be a Boolean value of either true or false. Condition Coverage aims at establishing if the tests cover both the values i.e. true, false.
In the source code, when each occurring condition is evaluated for both true and false states, then the Condition Coverage for the code is said to be complete.

For example, in the above code if value sets (2, 3) and (4, 2) are used then Condition Coverage would be 100%. When data set (2, 3) is used then (b > a) evaluates to true and (a > b) evaluates to false. Similarly, when data set (4, 2) is used then (b > a) evaluates to false and (a > b) evaluates to true.
Thus both the conditions have both the values i.e true and false covered. Hence the Condition Coverage would be 100%.

### Branch Coverage
This methodology aims at ensuring that every branch appearing in each conditional structure gets executed in source code. For instance, in the above code, all the ‘If’ statements and any accompanying ‘Else’ statement should all be covered by the test for a 100% Branch Coverage.

Branch Coverage is often confused with Condition Coverage; however, the two are different.

A simple example to understand the difference between them:

If (a >0) & (b >0)

Then Print “Hello”

Else Print “Bye”

The data set needed for complete Branch Coverage:

(1, 1) – In this case, ‘a’ and ‘b’ both are true, so the If condition gets executed.

(1, 0) – In this case, ‘a’ is true and ‘b’ would be false, so the Else part of the code is executed.

As we know the purpose of Branch Coverage is to get every branch executed at least once and this purpose is achieved.

Condition Coverage:

(1, 0) – In this case, ‘a’ is true and ‘b’ would be false.

(0, 1) – In this case, ‘a’ is false and ‘b’ would be true.

The purpose of condition Coverage is to get each of true and false for every condition executed and this purpose is achieved here.
The else part does not get executed in condition coverage. This is where Condition Coverage differs from Branch Coverage.

### References:
https://www.guru99.com/code-coverage.html

https://www.softwaretestinghelp.com/code-coverage-tutorial/#Methodologies

https://www.tutorialspoint.com/code-coverage-tutorial-branch-statement-decision-fsm

