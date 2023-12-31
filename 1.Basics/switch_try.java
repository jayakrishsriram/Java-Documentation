public class switch_try {
    public static void main(String[] args) {
        int daysofweek=2;
        String dayname;
        switch (daysofweek) {
            case 1:
                dayname="Sunday";
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
            case 7:
                dayname="Saturday";
                break;
            default:
            dayname="Invalid Day";
                break;
        }
        System.out.println(dayname);
    }
}
