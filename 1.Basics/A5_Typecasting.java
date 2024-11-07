public class A5_Typecasting {
    /* 
    Type casting and conversion will not be possible always eg char cannot be converted into boolean.   
    */
    public static void main(String[] args) {
        int val=10;
        long value=val; // Directly converting is called Implicit type conversion/automatic conversion/widening. Convert lower data type to higher datatype.
        System.out.println("Orginal val "+val+"\nChanged val "+value);
        double doubleValue=98.98;
        float floatVal=(float)doubleValue; //Explicitly converting is called type casting/Explicit type conversion/ narrowing 'datatype variable=(datatype) variable of other type'. Convert higher data type to lower datatype.
        int intValue=(int) doubleValue;
        System.out.println("Double value= "+doubleValue+"\nInt value= "+intValue);
        System.out.println("Double value= "+doubleValue+"\nFloat value= "+floatVal);

        byte a=2;
        int b=a; //byte can be directly stored in int 
        System.out.println(b);
        int c=3;
        // byte d=c; This will not work for type casing this statement. follow the below one to make it work.
        byte d=(byte)c;
        System.out.println(d);
        c=383;
        d=(byte)c;
        System.out.println("258 in int is converted into "+d); 
        /*
        Why so? this is because 258 is out of range for byte datatype 
        Why we are getting 2. The answer is the integer value that is 258(result) is applied to the below formula:
        byte val = result - 256  
        But what if the modulus value is more than the range of byte Eg 511-256 =255 which is out of range for byte. In that case we have to update the result value as 255 and apply the formula till it comes to the byte range.
        So instead of doing this we take result % 256(size of byte) and if the modulus value is within the range of byte then print it else substitute it in the above fromula.
        */
        // Type promotion 
        byte a1=10;
        byte a2=50;
        int res=a1*a2; // Can directly convert from byte to int without type casting.
        System.out.println(res);
    
    }
    
}
