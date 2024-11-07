enum Size {
    SMALL(30), MEDIUM(50), LARGE(70);

    private int sizeValue;

    // Constructor for the enum
    private Size(int sizeValue) {
        this.sizeValue = sizeValue;
    }

    // Method to get the size value
    public int getSizeValue() {
        return sizeValue;
    }
}
public class A46_enumPart2 {
    public static void main(String[] args) {
        Size size = Size.MEDIUM;

        // Accessing enum values and methods
        System.out.println("Selected size: " + size);
        System.out.println("Size value: " + size.getSizeValue());
    }
}
