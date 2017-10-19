# design-patterns-episode-1

This is the sample code for Hamburg Coding School's course **Design Patterns Series - Episode 1**.

In this course, we will go throught the following design patterns.

## Composite

### The Problem

You want to create a structure that has recursive properties: parent objects that can have children that are again
parents. You need to build a tree of objects, where objects can be both nodes and leaves.

Necessary e.g. for building composed graphics elements, or for building nested layout components.

### The Pattern

Create either an abstract class or an interface, which defines the methods that both leaf and node have in common.

Create a class for the leaf that implements this abstract class or interface.

Create a class for the node that also implements the abstract class or interface.
The node has a list of your abstract class or interface as member.

If you implement the methods, iterate over the children and call their methods accordingly.

### Your Task

Implement a task list that holds `ToDo` items as leaves, and `Task` items as nodes. Their common interface is `Doable`.

They can be done or not. Write a method to let them print themselves on `System.out`.

Add indentation to the print method so that you can see the tree levels.

Create and print a task list with at least 4 top-level tasks and 3 levels of depth.

## Singleton

### The Problem

You have one very large class that holds many other objects, e.g. a database class. You need exactly one instance of it,
because more would compromise your application's logic, or would be unnecessary waste of memory.

### The Pattern

In the class that you want to make a singleton, create a `private static` member of the same class that you call
`instance`.

Make the constructor private.

Create a `static` method called `getInstance()` that returns your singleton instance. Check if it has been initialized,
and if not, create it.

### Your Task

Create a singleton `TaskListPool` that holds all existing task lists. Create a method for printing all lists.

## Flyweight

### The Problem

You have a large number of big objects, many of which are duplicates. You want to reduce their number and their weight.

### The Pattern

Identify objects or parts of a class that are repeated many times.

Create a pool class that can hold all items that are repeatedly used.

Use these items by getting the same instances from the pool repeatedly.

### Your Task

Create a `PrefixPool` that can hold String objects for indentations and checkboxes.

In the print method of `Task` and `ToDo`, get the right instance from this pool 
instead of creating it over and over again.

## Observer

### The Problem

Objects need to react to some event. Calling each object manually, when you don't know where each instance is, can be 
a hassle. We want each object to know by itself when it needs to update.

### The Pattern

Create a `Subject` class and an `Observer` interface with a `notify()` method. 

The Subject class holds a list of Observers. They are added to it 
by a method `subscribe(Observer observer)` and removed by `unsubscribe(Observer observer)`.

A method `accept()` calls the `notify()` method on each subscribed observer.

All objects that want to be notified to update themselves need to implement the Observer interface, and subscribe to 
the subject.

If all objects should be updated, call the `accept()` method of the Subject.

### Your Task

Create a Subject and Observer for notifying `Task` and `ToDo` for the event that they are done.

Give each `Doable` an index, according to the sequence in which they are printed (you can use this project to see how 
this can be implemented).

Use the user input of the console to read an index. Call the subject and notify all observers to set themselves to 
*done* if the index matches.

### Additional Tasks:

Change the main method to continuously accept user input unless the user types "exit". Handle NumberFormatExceptions.

Let the observing objects also listen to an "undo" event, where they set themselves to *not done*.
