public class For_loop2 {
    public static void main(String[] args) {
        String[] data=new String[5];
        data[0]="red";
        data[1]="blue";
        data[2]="green";
        data[3]="yellow";
        data[4]="white";
        for (int i = 0; i < data.length; i++) {
            System.out.println("Color is "+data[i]);
        }
    }
}
