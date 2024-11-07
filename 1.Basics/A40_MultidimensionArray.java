public class A40_MultidimensionArray {
    public static void main(String[] args) {
        int a[][]=new int[3][4];
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<4;j++)
            {
                a[i][j]=i+j+1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int b[][]=new int[3][]; // Jagged Array
        b[0]=new int[4];
        b[1]=new int[2];
        b[2]=new int[3];
        for (int i = 0; i < b.length; i++) {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=i+j;
            }
        }
        for(int n[]:b)
        {
            for(int j:n){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
