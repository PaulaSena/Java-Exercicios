public class CalculoJurosSimples{
 	public static void main (String[]args){
            int prestacoes = 6;
            double jurosMensal = 0.2;
            double valorEmprestado = 1000.0;
            double jurosPeriodo = prestacoes * jurosMensal;
            double valorTotal = valorEmprestado*(1+ jurosPeriodo);
            double valorJuros = valorTotal - valorEmprestado;
            double valorParcela = valorTotal / prestacoes;
            
            System.out.println("Valor total a pagar:"+valorTotal);
            System.out.println("Valor do Juros:"+valorJuros);
            System.out.println("Valor da Parcela:"+valorParcela);

 	} 		
 	}
 