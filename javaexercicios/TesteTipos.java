  
    public class TesteTipos {
/*       incompatibilidades
 *       Numeros <-> String 
 *      
 *      Whapper  classes envoloco Integer.toString(_)
 *                                Integer.parseInt(_)
 *                                Float.parseFloat(_)
 *
 *    php typecast  int idade=(int)valor;
 */      
        public static void main (String[]args){

            /*  int idade = 30;
                String valor = Integer.toString(idade);
        	   System.out.println(valor); 
            */
                String valor = "30.5";
                float idade = Float.parseFloat(valor);
            System.out.printf(" %.2f\n", idade);
            
            
        }



    }