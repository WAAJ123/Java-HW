/* 
    Aaron Johnson
    CS 142 Week 8
    11/22/2024
    This program creates a Die object and tests all of the methods in the Die class

    Testa Data:
    I created 3 Die objects that all call the 3 different contructors from the Die class, 
    and then print the results of each object's rolls (apart from the one that doesn't roll)
    I ran it quite a few times as well to make sure the rolls were working properly.
*/

public class DieTester 
{
    public static void main(String[] args) 
    {
        //tests default constructor
        Die dieTest1 = new Die();
        System.out.println(dieTest1.toString());

        //tests user inputted sides
        Die dieTest2 = new Die(8);
        System.out.println(dieTest2.toString());

        //tests user inputted sides and the side it starts on
        Die dieTest3 = new Die(20, 1);
        System.out.println(dieTest3.toString());
    }

    /* 
        Post Assignment Questions:
        1. I learned how to actually apply using multiple class files in one project with VSCode 
        (and some of the hiccups that come along with coding Java in VSCode)
        2. For some reason I thought the toString() method had a print method inside (it does not)
        so I was stuck wondering why the code wasn't printing for quite a while.
        #3. I'm doing quite well! I'm excited to learn more about Java and see what cool stuff we do in CS 143!
    */
}
