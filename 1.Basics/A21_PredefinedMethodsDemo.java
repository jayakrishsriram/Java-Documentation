public class A21_PredefinedMethodsDemo {
    public static void main(String[] args) {
        // --- String Class Methods ---
        String str = "Hello World";

        // 1. isEmpty()
        System.out.println("Is string empty? " + str.isEmpty());

        // 2. length()
        System.out.println("Length of the string: " + str.length());

        // 3. toString()
        System.out.println("String representation: " + str.toString());

        // 4. equals() and equalsIgnoreCase()
        String str2 = "hello world";
        System.out.println("Strings are equal (case-sensitive): " + str.equals(str2));
        System.out.println("Strings are equal (case-insensitive): " + str.equalsIgnoreCase(str2));

        // 5. contentEquals() with StringBuffer and CharSequence
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("String equals StringBuffer content: " + str.contentEquals(sb));
        CharSequence cs = "Hello World";
        System.out.println("String equals CharSequence content: " + str.contentEquals(cs));

        // 6. compareTo() and compareToIgnoreCase()
        System.out.println("Lexicographical comparison (case-sensitive): " + str.compareTo(str2));
        System.out.println("Lexicographical comparison (case-insensitive): " + str.compareToIgnoreCase(str2));

        // 7. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 8. indexOf() and lastIndexOf()
        System.out.println("First occurrence of 'o': " + str.indexOf('o'));
        System.out.println("First occurrence of 'o' from index 5: " + str.indexOf('o', 5));
        System.out.println("First occurrence of 'World': " + str.indexOf("World"));
        System.out.println("Last occurrence of 'o': " + str.lastIndexOf('o'));

        // 9. contains()
        System.out.println("String contains 'World': " + str.contains("World"));

        // 10. startsWith() and endsWith()
        System.out.println("String starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("String ends with 'World': " + str.endsWith("World"));

        // 11. substring()
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // 12. toCharArray() and getBytes()
        char[] charArray = str.toCharArray();
        System.out.println("Character array: " + String.valueOf(charArray));
        byte[] byteArray = str.getBytes();
        System.out.println("Byte array: " + new String(byteArray));

        // 13. valueOf()
        int number = 123;
        System.out.println("String value of number: " + String.valueOf(number));

        // 14. split()
        String[] tokens = str.split(" ");
        System.out.println("Split string into tokens: ");
        for (String token : tokens) {
            System.out.println(token);
        }

        // 15. concat()
        System.out.println("Concatenated string: " + str.concat("!!!"));

        // 16. join()
        System.out.println("Joined string with delimiter: " + String.join("-", "Hello", "World"));

        // 17. toUpperCase() and toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 18. replace()
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 19. replaceAll() and replaceFirst()
        System.out.println("Replace all 'l' with 'x': " + str.replaceAll("l", "x"));
        System.out.println("Replace first 'l' with 'x': " + str.replaceFirst("l", "x"));

        // 20. trim()
        String str3 = "  Hello World  ";
        System.out.println("Trimmed string: '" + str3.trim() + "'");

        // 21. intern()
        String str4 = new String("Intern Example");
        String str5 = str4.intern();
        System.out.println("String interned: " + str5);

        // --- StringBuffer and StringBuilder Class Methods ---

        // StringBuffer
        StringBuffer buffer = new StringBuffer("Hello");
        
        // 1. append()
        buffer.append(" World");
        System.out.println("After append: " + buffer);

        // 2. insert()
        buffer.insert(5, ",");
        System.out.println("After insert: " + buffer);

        // 3. setCharAt()
        buffer.setCharAt(5, '!');
        System.out.println("After setCharAt: " + buffer);

        // 4. deleteCharAt() and delete()
        buffer.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + buffer);
        buffer.delete(0, 6);
        System.out.println("After delete: " + buffer);

        // 5. reverse()
        buffer.reverse();
        System.out.println("After reverse: " + buffer);

        // StringBuilder
        StringBuilder builder = new StringBuilder("Hello");

        // Similar operations with StringBuilder
        builder.append(" World");
        System.out.println("StringBuilder after append: " + builder);

        builder.insert(5, ",");
        System.out.println("StringBuilder after insert: " + builder);

        builder.setCharAt(5, '!');
        System.out.println("StringBuilder after setCharAt: " + builder);

        builder.deleteCharAt(5);
        System.out.println("StringBuilder after deleteCharAt: " + builder);

        builder.delete(0, 6);
        System.out.println("StringBuilder after delete: " + builder);

        builder.reverse();
        System.out.println("StringBuilder after reverse: " + builder);
    }
}
