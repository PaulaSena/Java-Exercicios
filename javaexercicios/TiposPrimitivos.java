/*
 * System.out.printf("A nota é %.2f", nota);  ou 
 * System.out.format("A nota de %s é %.1f \n", nome , nota);
 * System.out.println("A nota é:" + nota);
 */
package javaexercicios;
import java.util.Scanner;

/*   formatado  float %f
 *   utilizar e duas casa decimais  %.2f ou  para chamar o float %f ou String %s
 *   pular linha     \n 
 *   atribuindo entrada de dados Teclado. com nextLine e nextFloat
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do Aluno:");
       	String nome = teclado.nextLine();
        System.out.println("Digite a nota do aluno:");
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome , nota);
       /* if{
           > 10 ;}
        else{
        }
        */
      
    }
    }
    
    

