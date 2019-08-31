# -Fall-2017---CPSC-1302-Computer-Science-II-ASSIGNMENT-Polymorphism-and-Recursion
Fall 2017 - CPSC 1302 – Computer Science II

ASSIGNMENT 3: Polymorphism and Recursion.

This assignment is due by 8:45 p.m. EST on Wednesday, Nov. 8, 2017. Late submissions will be graded as described in the syllabus. Assignments submitted at or after 12:01 a.m. EST, Nov 12, will not be accepted. Please start working on your assignment early. Please work individually.  

Code that does not compile will receive a grade of 0.

Problem Statement: Script Generator. A script writer would like an app that generates random scripts. Each script must be a conversation among cartoon characters and characters from a Shakespeare play.  
Hints:
- Your superclass is an abstract class called Character with the following instance variables: String characterName and String actorName. Your superclass has an abstract method called speak().
abstract void speak();

- One subclass called CartoonCharacter that has a concrete definition of the speak() method. This speak() method prints a random line that a cartoon character would say.

- One subclass called ShakespeareCharacter. This speak() method prints a random line that a Shakespeare character would say.

- The Tester class sets up an array of about 6 characters. The array must be composed of a combination of CartoonCharacter objects and ShakespeareCharacter objects.

- The Tester class has a method called generateScript() that takes as argument an array of type Character[]. The method picks a random object from the array and calls the speak method on the object. The generateScript() method does this 10 times (i.e., pick an object from the array and make it speak)

public static void generateScript(Character[] arr){
      ///..
     ///...arr[i].speak(); //Polymorphic; arr[i] could be from a cartoon or from Shakespeare
    ///...
}
When the app is run, it prints a 10-line random script that might look like this.
CLEOPATRA (Michelle Pfeiffer): If it be love indeed, tell me how much.
MARK ANTONY (Brad Pitt): There's beggary in the love that can be reckon'd.
MIN (Joe Pesci): They let him go, didn’t they?
CRABBY (Matt Damon): What? What is it? What’s wrong?
CLEOPATRA (Michelle Pfeiffer): I'll set a bourn how far to be beloved.
DR. SHELL (Scarlett Johansson): I doubt that, Herman. They’re probably just curious scientists, like me.
MARK ANTONY (Brad Pitt): Then must thou needs find out new heaven, new earth.
DEMETRIUS (Al Pacino): Is Caesar with Antonius prized so slight?
CONNIE (Lady Gaga): Why would the aliens want to know how we move?
Lab
1) Polish your superclass to meet the following requirements:
(1 point) The class is abstract
(0.5 points) The class’ name is a singular noun that starts with an upper case letter
(0.5 points) 2 private instance variables (e.g., charaterName and actorName).
(0.5 points) a default constructor that is composed of a sequence of calls to the set() methods.
(0.5 points) a custom constructor that is composed of a sequence of calls to the set() methods.
(0.5 points) a get() method for each instance variable 
(0.5 points) a set() method for each instance variable. Each set() method uses the this keyword.
(0.5 points) a toString() method that returns the character's name followed by the actor's name.
(1 point) An abstract speak() method.

2) Polish each of your subclasses to meet the following requirements:
(1 point) The subclass’ name is a singular noun that starts with an upper case letter.
(2 points) a concrete implementation of the speak() method that prints a random line from the character's style (i.e., cartoon line for a cartoon character; Shakespeare line for a Shakespeare character).

3) Write a Tester for your class that sets up a data set each of whose elements is of your superclass’ type. Your tester must meet the following requirements

(0.5 points) Instantiates and populates an array of a certain size – e.g, 6 elements
(1 point) Half the array should be composed of your CartoonCharacter objects. The other half should be composed of your ShakespeareCharacter objects.

(5 points) Has a generateScript() method that functions as described above. Visits the array ten times to pick a random object from the array and make it speak as required by the kind of character it is. Shows a 10-line random script every time we call it.

We are free to add extra functionality to the tester.
