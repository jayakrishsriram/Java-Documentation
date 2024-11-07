public class A13_Switch_update {
    // Switch can be a statement as well as an expression
    public static void main(String[] args) {
        String dayname;
        int daysofweek=7;
        switch (daysofweek) {
            case 1,7:
                dayname="Weekend";
                break;
            case 2:
                dayname="Monday";
                break;
            case 3:
                dayname="Tuesday";
                break;
            case 4:
                dayname="Wednesday";
                break;
            case 5:
                dayname="Thursday";
                break;
            case 6:
                dayname="Friday";
                break;

            default:
            dayname="Invalid Day";
                break;
        }
        System.out.println(dayname);
    switch (daysofweek) { //This type is used as a result we don't need to explicitly define the break statement
        case 1->dayname="Sunday";
        case 2->dayname="Monday";
        case 3->dayname="Tuesday";
        case 4->dayname="Wednesday";
        case 5->dayname="Thursday";
        case 6->dayname="Friday";
        case 7->dayname="Saturday";
        default->dayname="Invalid Day";
    }
    System.out.println(dayname);
    dayname=switch (daysofweek) { //This type is used store a value based on case using ->
        case 1->"Sunday";
        case 2->"Monday";
        case 3->"Tuesday";
        case 4->"Wednesday";
        case 5->"Thursday";
        case 6->"Friday";
        case 7->"Saturday";
        default->"Invalid Day";
    };
    System.out.println(dayname);
    dayname=switch (daysofweek) { //This type is used store a value based on case without using break and also without using ->
        case 1: yield "Sunday";
        case 2: yield "Monday";
        case 3: yield "Tuesday";
        case 4: yield "Wednesday";
        case 5: yield "Thursday";
        case 6: yield "Friday";
        case 7: yield "Saturday";
        default: yield "Invalid Day";
    };
    System.out.println(dayname);
    }
}
