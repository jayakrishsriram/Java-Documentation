public class A12_switch {
    public static void main(String[] args) {
        int daysofweek=2;
        String dayname;
        switch (daysofweek) {
            case 1:
                dayname="Sunday";
                System.out.println(dayname);
            case 2:
                dayname="Monday";
                System.out.println(dayname);
            case 3:
                dayname="Tuesday";
                System.out.println(dayname);
            case 4:
                dayname="Wednesday";
                System.out.println(dayname);
            case 5:
                dayname="Thursday";
                System.out.println(dayname);
            case 6:
                dayname="Friday";
                System.out.println(dayname);
            case 7:
                dayname="Saturday";
                System.out.println(dayname);
            default:
            dayname="Invalid Day";
            System.out.println(dayname);
        } //In the first case when the case value and switch value matches it starts returning all the value. To get only the specific case we need to break the switch case once it is done.
        System.out.println("\nSwitch case2 \n"); 
        switch (daysofweek) {
            case 1:
                dayname="Sunday";
                System.out.println(dayname);
                break;
            case 2:
                dayname="Monday";
                System.out.println(dayname);
                break;
            case 3:
                dayname="Tuesday";
                System.out.println(dayname);
                break;
            case 4:
                dayname="Wednesday";
                System.out.println(dayname);
                break;
            case 5:
                dayname="Thursday";
                System.out.println(dayname);
                break;
            case 6:
                dayname="Friday";
                System.out.println(dayname);
                break;
            case 7:
                dayname="Saturday";
                System.out.println(dayname);
                break;
            default:
                dayname="Invalid Day";
                System.out.println(dayname);
                break;
        }
    }
}
