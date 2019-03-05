
package javaexercicios;

public class TesteVariavel {
    public static void main (String[]args){
        byte b = 10;
        System.out.println("Um byte:"+b);
        char c = 64;
        System.out.println("O char:"+c);
        short s = 1067;
        System.out.println("O short:"+s);
        int i = 10 * (b+c+s);
        System.out.println("Um int:"+i);
        long l= i*i;
        System.out.println("Um long:"+l);
        float f =l*5/2;
        System.out.println("Um float:"+f);
        double d =l*l;
        System.out.println("Um double:"+d);
            }
    
}
