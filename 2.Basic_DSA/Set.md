# Set (Interface)
Methods:

add(E e)

remove(Object o)

contains(Object o)

size()

isEmpty()

clear()

iterator()

toArray()

## 2.1. HashSet

Inherits all Set methods.

### Additional Behavior:

Backed by a HashMap, so unordered and allows null.

## 2.2. LinkedHashSet

Inherits all HashSet methods.

### Additional Behavior:

Maintains insertion order.

## 2.3. TreeSet

Inherits all Set methods.

### Additional methods:

ceiling(E e)

floor(E e)

higher(E e)

lower(E e)

pollFirst()

pollLast()