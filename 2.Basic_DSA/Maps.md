# Map Methods:

put(K key, V value)

get(Object key)

remove(Object key)

containsKey(Object key)

containsValue(Object value)

keySet()

values()

entrySet()

putAll(Map<? extends K, ? extends V> m)

clear()

size()

isEmpty()

# 3.1. HashMap

Inherits all Map methods.

Additional Behavior:

Unordered key-value pairs. Allows one null key and multiple null values.

# 3.2. LinkedHashMap

Inherits all HashMap methods.

Additional Behavior:

Maintains insertion order.

# 3.3. TreeMap

Inherits all Map methods.

Additional methods:

ceilingKey(K key)

floorKey(K key)

higherKey(K key)

lowerKey(K key)

pollFirstEntry()

pollLastEntry()

## Behavior:

Sorted key-value pairs based on Comparable or Comparator.

# 3.4. Hashtable

Inherits all Map methods.

Additional Behavior:

Synchronized version of a map.

Does not allow null keys or values.
