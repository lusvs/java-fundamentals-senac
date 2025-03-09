/******************************************************************************

Calcular a conta de consumo de energia elétrica de um consumidor, dado
o kWh consumido, de acordo com a tabela abaixo:

KW Consumido           Valor do kWh
< 150 kWh                R$ 0,20
> 150 e < 500            R$ 0,25
> 500                    R$ 0,30
Valor mínimo da conta    R$ 11,90

*******************************************************************************/
import java.util.Scanner;

public class exr4
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double valor = 0.00;
        double valorMinimo = 11.90;
        
        System.out.println("Digite os kw consumidos: ");
		double kwConsumido = entrada.nextDouble();
		
		if (kwConsumido < 150) 
		    valor = 0.20;
		else if (kwConsumido < 500)
		    valor = 0.25;
		else 
		     valor = 0.30;
		     
		double conta = kwConsumido * valor;
		     
		if (conta < valorMinimo)
		    System.out.println("O valor a pagar é de " + valorMinimo);
		else 
		    System.out.println("O valor a pagar é de " + conta);
    }
}

