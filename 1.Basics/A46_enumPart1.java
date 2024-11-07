enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class A46_enumPart1 {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        // Using switch with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case WEDNESDAY:
                System.out.println("Midweek day");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            default:
                System.out.println("It's just another day.");
        }
    }
}
