# Java Practice Notes

##### Types of constructors
1. No-Arg Constructor
1. Parameterized Constructor
1. Default Constructor

In Java, inheritance is an is-a relationship.

##### Abstract Class
1. Can not be instantiated. 
1. Can have both regular and abstract methods. 
1. If a class contains an abstract method then it should be declared as abstract otherwise there'll be a compilation error `Class is not abstract and does not override abstract method method() in Class`.
1. Abstract methods must be implemented by class extending abstract class. Otherwise that class also should be marked as abstract.

##### Interface
1. Interface is a fully abstract class. it includes group of abstract methods.
1. All methods in an interface are `public` and all fields are `public static final`. 
1. With Java 8, we can provide implementation for `default` methods.
1. java 8, introduced static and private methods as well. Private methods can be used as helper methods.

##### Polymorphism
1. Method overloading is compile-time polymorphism
1. Method overriding is run-time polymorphism 

##### Access Specifiers
1. In Java, outer class can not be private/protected

##### Nested class
1. Non-Static Inner Class: It is class within another class (outer class). It has access to members of outer class.
1. Static nested Class: It does not have access to members of outer class as static class does not need you to create instance of outer class. In Java, only nested classed allowed to be static. It can access static fields and methods of outer class.

##### Anonymous class
1. It does not have name.
1. Should be defined inside another class. 
1. Extends another class or implements another interface.
1. Objects of anonymous class created when needed i.e they are created to perform specific task.

##### Singleton class
1. Create `no-arg private` constructor that'll restrict instance creation from outside.
1. Create `private` that refers to singleton object.
1. Create static method that'll allow to create and access created singleton object. We'll restrict creation of instance in this method.

##### Enum
1. It's considered special type of class
1. When create enum class, compiler will create objects of enum constants. All enum constants are `public static final`.

##### Reflection
1. In Java, reflection allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time.
1. There's class in java named `Class` that keeps information about objects and classes runtime.