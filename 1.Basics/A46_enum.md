# Enum

In Java, an enum (short for "enumeration") is a special data type that represents a collection of constants (fixed set of related values). Enums are useful when you need to define a group of named constants, such as days of the week, directions, or status codes. They improve code readability, type safety, and maintainability.

Key Features of Enums:
Constant Values: Each enum constant is implicitly public static final, meaning they are constants that do not change once defined.
Type-Safe: Enums provide compile-time type safety. You can't assign an invalid value that isn't part of the enum, preventing logical errors.
Can Have Methods and Fields: Enums can have their own methods, fields, and constructors.
Switch Statements: Enums work very well with switch statements, making code more readable.

# Advantages of Enums:
Improved Code Readability: Since the values are given meaningful names, it’s clear what each constant represents.
Type-Safe: You can’t assign any value that isn’t defined within the enum, reducing bugs.
Organized Group of Constants: Enums provide a way to define a group of constants that belong together logically.
Prevent Invalid Values: Enums restrict the values that can be assigned, ensuring that only predefined values can be used.

# Enum with Fields and Methods:
Enums in Java are more powerful than traditional enums in other languages. They can have fields, constructors, and methods, making them highly flexible.

# Enum in Switch Statement
Enums work seamlessly with switch statements, which makes them ideal for scenarios like control flows.

# Some common methods in enum
In Java, enums come with several useful methods, many of which are implicitly available to all enums since they are subclasses of java.lang.Enum. Here's a list of some common methods you can use with enums:

1. values()
This method returns an array of all the enum constants in the order they are declared.

Example:
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class TestEnum {
    public static void main(String[] args) {
        // Iterate over enum constants
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
Output:

SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY
2. valueOf(String name)
This method returns the enum constant with the specified name. If the constant with the given name is not found, it throws an IllegalArgumentException.

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.valueOf("MONDAY");
        System.out.println("Day: " + day);
    }
}
Output:

makefile
Day: MONDAY


3. ordinal()
This method returns the ordinal (or position) of the enum constant, starting from 0 for the first constant.

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println("Ordinal of FRIDAY: " + day.ordinal());
    }
}
Output:

yaml
Ordinal of FRIDAY: 5


4. name()
This method returns the name of the enum constant, exactly as declared in the enum declaration.

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;
        System.out.println("Enum name: " + day.name());
    }
}
Output:

graphql
Enum name: SATURDAY


5. compareTo(Enum e)
This method compares two enum constants based on their ordinal values. It returns a negative value if the current enum constant comes before the specified constant, zero if they are the same, and a positive value if it comes after.

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.WEDNESDAY;

        System.out.println(day1.compareTo(day2)); // Output will be negative since MONDAY comes before WEDNESDAY
    }
}
Output:

diff
-2

6. toString()
This method returns the string representation of the enum constant, which by default is the same as the name() method (the enum constant’s name).

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.SUNDAY;
        System.out.println(day.toString());  // Same as day.name()
    }
}
Output:

SUNDAY


7. getDeclaringClass()
This method returns the Class object representing the enum type of the current instance.

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day.getDeclaringClass());
    }
}
Output:

kotlin
class Day

8. equals(Object obj)
This method checks if the given object is equal to the current enum constant (compares based on reference).

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day1 = Day.MONDAY;
        Day day2 = Day.MONDAY;
        
        System.out.println(day1.equals(day2));  // Output will be true
    }
}
Output:

arduino
true

9. hashCode()
This method returns the hash code of the enum constant, useful when storing enums in hashed data structures like HashMap or HashSet.

Example:


public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(day.hashCode());
    }
}
Output:

bash
Some integer (hash code value)

# Custom Methods:
In addition to the built-in methods, you can define your own methods inside an enum.

Example with a custom method:

public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Custom method
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class TestEnum {
    public static void main(String[] args) {
        Day day = Day.SATURDAY;
        System.out.println("Is it a weekend? " + day.isWeekend());
    }
}
Output:

vbnet
Is it a weekend? true


# Summary of Common Enum Methods:
values(): Returns an array of all constants in the enum.
valueOf(String name): Returns the enum constant with the specified name.
ordinal(): Returns the position of the constant in the enum declaration.
name(): Returns the name of the constant as declared.
compareTo(Enum e): Compares this constant with the specified enum constant.
toString(): Returns the string representation of the constant.
getDeclaringClass(): Returns the enum class object.
equals(Object obj): Checks if the given object is equal to the current constant.
hashCode(): Returns the hash code of the constant.
