/*
The locked code in the editor does the following:

Declares an abstract class named Animal with the implementations for getIsMammal() and getIsCarnivorous() methods, as well as an abstract method named getGreeting().
Creates Dog, Cow, and Duck objects.
Calls the getIsMammal(), getIsCarnivorous(), and getGreeting() methods on each of these respective objects.
 

Consider the following UML diagram:
<img width="558" alt="screen shot 2018-02-22 at 10 07 25 pm" src="https://user-images.githubusercontent.com/25470880/36580392-dfc02efe-181c-11e8-8e4f-311e691e2c18.png">

A UML diagram of Animal, Dog, Cow, and Duck classes.
Recall that - denotes private, + denotes public, and # denotes protected.
 

Complete the code in the editor below by writing the following:

Three classes named Dog, Cow, and Duck that inherit from the Animal class.
No-argument constructors for each class that initialize the instance variables inherited from the superclass.
Each class must implement the getGreeting() method:
For a Dog object, this must return the string ruff.
For a Cow object, this must return the string moo.
For a Duck object, this must return the string quack.
 

Input Format

There is no input for this challenge.

 

Output Format

The getGreeting() method must always return a string denoting the appropriate greeting for the implementing class.

 

Sample Output

A dog says 'ruff', is carnivorous, and is a mammal.
A cow says 'moo', is not carnivorous, and is a mammal.
A duck says 'quack', is not carnivorous, and is not a mammal.
*/
