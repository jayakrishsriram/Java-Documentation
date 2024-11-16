# List 
The List interface in Java, part of the Collections Framework, provides a range of useful methods to handle ordered collections of objects.

## 1. List (Interface)
Methods:

add(E e): Appends an element to the end of the list.

add(int index, E element): Inserts an element at the specified position.

get(int index): Returns the element at the specified index.

remove(int index): Removes the element at the specified index.

remove(Object o): Removes the first occurrence of the specified element.

set(int index, E element): Replaces the element at the specified index with the specified element.

indexOf(Object o): Returns the index of the first occurrence of the specified element.

lastIndexOf(Object o): Returns the index of the last occurrence of the specified element.

subList(int fromIndex, int toIndex): Returns a view of the list between the specified indices.

isEmpty(): Checks if the list is empty.

size(): Returns the number of elements in the list.

contains(Object o): Checks if the list contains the specified element.

clear(): Removes all elements from the list.

iterator(): Returns an iterator for the list.

listIterator(): Returns a list iterator for the list.

### 1.1. ArrayList
Inherits all List methods.
#### Additional methods (specific to behavior):
No specific methods, but optimized for random access and resizing dynamically.

### 1.2. LinkedList
Inherits all List methods.

#### Additional methods (Deque/Queue related):

addFirst(E e)

addLast(E e)

getFirst()

getLast()

removeFirst()

removeLast()

poll()

pollFirst()

pollLast()

### 1.3. Vector
Inherits all List methods.
Additional methods:

addElement(E e)

capacity()

ensureCapacity(int minCapacity)

trimToSize()

elementAt(int index)

### 1.4. Stack
Inherits all Vector methods.
Additional methods:

push(E item)

pop()

peek()

empty()

search(Object o)

