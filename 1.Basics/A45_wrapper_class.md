## What is wrapper class in java?
A wrapper class in Java is a class that encapsulates (or "wraps") a primitive data type into an object. Each primitive type in Java has a corresponding wrapper class, which allows primitive values to be treated as objects. This is useful because Java provides various features (such as collections) that work only with objects, not primitive types.

Here’s a list of the primitive types and their corresponding wrapper classes:

int → Integer
char → Character
float → Float
double → Double
boolean → Boolean
byte → Byte
short → Short
long → Long
## Key Features of Wrapper Classes:
Autoboxing and Unboxing: Java automatically converts between primitive types and their corresponding wrapper classes.
Autoboxing: Converting a primitive type into its wrapper object (e.g., int to Integer).
  

int num = 5;
Integer obj = num; // Autoboxing
Unboxing: Converting a wrapper object back into its primitive type (e.g., Integer to int).


Integer obj = 5;
int num = obj; // Unboxing
Nullability: Unlike primitive types, wrapper classes can be assigned null, making them useful in scenarios where a value might be absent.

Methods: Wrapper classes provide useful methods, such as Integer.parseInt() to convert a string to an int.

Example:

Integer num = 10;   // Autoboxing from int to Integer
int n = num + 5;    // Unboxing to int for arithmetic operation
System.out.println(n);  // Output: 15

Use Cases:

Collections: Java collections (e.g., ArrayList, HashSet) can only store objects, so wrapper classes are used when you want to store primitive types in collections.
Type conversion: Wrapper classes provide utility methods for converting between types (e.g., Integer.parseInt(String))

## What is the use of wrapper class?

The use of wrapper classes in Java is primarily to allow primitive data types to be treated as objects. Here are the key reasons why wrapper classes are useful:

1. Using Primitives in Collections
Java collections, such as ArrayList, HashSet, and HashMap, can only work with objects, not primitive data types. Wrapper classes allow you to store primitive types in collections by converting them into objects.

Example:

ArrayList<Integer> list = new ArrayList<>(); // Integer is the wrapper class for int
list.add(10);  // Autoboxing: int to Integer
list.add(20);
Without wrapper classes, you cannot store int, float, or other primitives directly in these collections.

2. Autoboxing and Unboxing
Java allows for the automatic conversion between primitives and their corresponding wrapper objects through autoboxing (primitive → wrapper) and unboxing (wrapper → primitive). This makes it easier to work with both types interchangeably.

Example:

Integer obj = 5;  // Autoboxing from int to Integer
int num = obj;    // Unboxing from Integer to int
This feature reduces the complexity of manual conversions and makes code easier to read.

3. Handling null Values
Primitive types like int and double cannot be null. However, there are scenarios where a null value is needed to represent the absence of a value (e.g., when dealing with databases or frameworks). Wrapper classes, being objects, can be assigned null.

Example:

Integer x = null;  // Valid
int y = null;      // Compile-time error
This makes wrapper classes useful in scenarios where you need to express the possibility of "no value."

4. Type Conversion
Wrapper classes provide utility methods for converting between strings and primitives, or performing operations on primitives.

Examples:

String to int:

String s = "123";
int num = Integer.parseInt(s);  // Converts String to int

Converting double to int:
  
Double d = 10.5;
int x = d.intValue();  // Converts Double to int

5. Immutable Objects
Wrapper class objects are immutable, meaning once you create them, their value cannot be changed. This makes them useful in scenarios where immutability is needed for safety, such as multi-threaded programming.

6. Utility Methods
Wrapper classes offer utility methods that simplify various operations, like comparisons, parsing, and mathematical functions.

Example:

compareTo() method for comparing values:


Integer x = 5;
Integer y = 10;
int result = x.compareTo(y);  // Compares two Integer objects

Summary:
Wrapper classes allow primitives to be used as objects.
They are necessary for using primitives in collections.
They provide helpful methods for type conversion and comparison.
They allow handling null values for primitives.
They enable autoboxing/unboxing, simplifying coding.

## Can you tell me where it can be used in real world scenario

Wrapper classes in Java have several real-world applications across different scenarios where working with objects instead of primitive types is necessary. Below are some common examples:

1. Storing Primitive Data in Java Collections
In real-world applications, Java collections like ArrayList, HashSet, and HashMap are frequently used to store and manipulate groups of data. Collections cannot store primitive types directly, so wrapper classes are required to store primitive values.

Use Case Example:
Storing product prices in an ArrayList<Double> for an e-commerce application, where you need to keep track of various product prices.

ArrayList<Double> productPrices = new ArrayList<>();
productPrices.add(199.99); // Double is used as the wrapper for double
productPrices.add(299.49);


2. Handling null Values in Databases or APIs
In real-world applications, particularly in database systems or when dealing with APIs, it's common to encounter scenarios where a value might be null (e.g., optional fields in a form). Since primitive types can't hold null values, wrapper classes are used to represent nullable fields.

Use Case Example:

Database records where user age is optional:

Integer userAge = null;  // Possible for fields where age is not provided
When fetching data from a database, sometimes fields might not have values. For instance, the userAge field can be represented as Integer (the wrapper for int) to allow null values.

3. Serialization and Deserialization (e.g., JSON, XML)
When working with data serialization frameworks like JSON or XML, primitives cannot be directly converted into serialized formats. Wrapper classes allow this conversion because they are objects, and objects can be serialized.

Use Case Example:

In a web application, when converting Java objects to JSON format for sending over a network, wrapper classes are necessary for fields that are primitive types:
json
Copy code
{
  "userId": 1001,
  "age": null
}
In this case, using Integer instead of int allows the age to be null, which can be important for certain API designs.

4. Using Primitive Types in Multithreading and Synchronization
In real-world applications involving multithreading, wrapper classes are useful because primitives cannot be synchronized or used in concurrent programming contexts where objects are required.

Use Case Example:

Atomic operations in concurrent environments: In Java, you can use AtomicInteger (a subclass of Integer) for thread-safe operations. This is crucial in financial systems, for example, where consistent calculations (like balance updates) need to be thread-safe.


AtomicInteger counter = new AtomicInteger(0);
counter.incrementAndGet(); // Thread-safe increment

5. Type Conversion in Input/Output Operations
When dealing with user input or external data (e.g., reading from files, command-line arguments, or web forms), data is typically in string format. Wrapper classes provide utility methods to convert these strings into primitive types.

Use Case Example:
Processing user input in a banking application where the user enters their account balance as a string:

String input = "5000";
Integer accountBalance = Integer.parseInt(input); // Converts string to Integer

6. Caching and Memory Optimization
Sometimes, in real-world applications (like game development or performance optimization), frequently used values can be cached. Wrapper classes can be used in caching strategies because they are objects that can be managed, cloned, or shared.

Use Case Example:

Caching user IDs in a large-scale web application to avoid redundant database calls:

Map<Integer, User> userCache = new HashMap<>();
userCache.put(1001, new User("Alice"));

7. Comparing Primitive Values
In many real-world systems (e.g., stock trading systems, inventory management systems), comparing values is important. Wrapper classes have methods that make it easier to compare objects.

Use Case Example:

Comparing prices in an inventory system:

Integer priceA = 100;
Integer priceB = 150;

if (priceA.compareTo(priceB) < 0) {
    System.out.println("Price A is cheaper than Price B");
}

8. Frameworks and Libraries
Many frameworks, including popular Java frameworks like Spring and Hibernate, require working with objects rather than primitive types. For example, Hibernate uses wrapper classes when mapping database fields to Java objects because of their ability to handle null values.

Use Case Example:

Spring MVC form data handling: A form submission might have fields like Integer age instead of int, allowing the framework to correctly map form fields to Java objects and handle missing fields as null.

9. Logging and Monitoring
Wrapper classes can also be used in real-world applications for logging purposes where numeric values need to be converted into objects for logging frameworks that deal with objects.

Use Case Example:

Logging system status in an application:

Integer systemLoad = 75;
logger.info("Current system load: " + systemLoad);  // Uses Integer instead of int for logging

Summary of Real-World Use Cases:
Storing primitive values in collections (e.g., product prices in ArrayList<<Double>>).
Handling nullable values in database fields (e.g., Integer age).
Serialization and deserialization (e.g., JSON or XML).
Concurrency and atomic operations (e.g., using AtomicInteger for thread safety).
Type conversion from user input (e.g., converting form input strings to Integer).
Optimizing memory using caching (e.g., caching frequent user IDs).
Value comparison (e.g., comparing inventory prices).
Framework compatibility (e.g., Hibernate’s ability to handle null values in ORM).
Logging and monitoring numeric data (e.g., system load or performance metrics).
Wrapper classes make it possible to handle scenarios involving collections, frameworks, or operations that require object types instead of primitive types, making them essential in modern Java applications. 