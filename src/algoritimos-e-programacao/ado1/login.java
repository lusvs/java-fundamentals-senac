/******************************************************************************

Desenvolva um programa que simule um sistema de login.
Solicite um nome de usuário e senha, e verifique
se as informações estão corretas.
Caso positivo, exiba uma mensagem de boas-vindas;
caso contrário, exiba uma mensagem de erro.

*******************************************************************************/
import java.util.Scanner;

public class login
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    
	        String usuarioCorreto = "lucas";
	    	String senhaCorreta = "123";
	    
	    	System.out.println("Digite o usuario: ");
	    	String testeUsuario = entrada.nextLine();
	    	
	    	System.out.println("Digite o senha: ");
	    	String testeSenha = entrada.nextLine();
	    	
	    	if (testeUsuario.equals(usuarioCorreto) && testeSenha.equals(senhaCorreta)) 
	    	        System.out.println("Acesso LIBERADO");
	        else 
	    	    System.out.println("Acesso NEGADO");
	}
}
