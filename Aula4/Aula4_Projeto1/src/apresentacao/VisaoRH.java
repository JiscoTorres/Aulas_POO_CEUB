package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Colaborador;
import negocio.Gerente;



public class VisaoRH { 
	public static void main (String[] args) {//IMPORANTE! "public static void main (String[] args) {" -> Para dizer quee isso não é classe, mas sim um programa!
		
		
		//Declaração de variaveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		Colaborador objColaborador = null;
		String opcao = "";
		
		
		
		
		
		
		
		
		
		
		//Entrada de Dados
		try {
		System.out.print("Digite <C> para colaborador ou <G> para gerente: ");
		
		opcao = leitor.readLine();
		
		
		
		if (opcao.equalsIgnoreCase("C")) { //Importante! "equalsIgnoreCase" -> compara duas strings ignorando se esta em maiusculo ou minusculo
			objColaborador = new Colaborador();
		}
			else {
				objColaborador = new Gerente(); //IMPORANTE! Polimorfismo -> pegar um obj colaborador e TRANSFORMEI em um obj Gerente. Que, tambem, o gerente é um colaborador
			}
		
		
	
		
		
		System.out.print("Digite a Matrícula: ");
		objColaborador.setMatricula(
				Integer.parseInt(leitor.readLine()));
		
		
		System.out.print("Digite o nome: ");
		objColaborador.setNome(leitor.readLine());
		
		
		
		System.out.print("Digite o Salario: ");
		objColaborador.setSalario(Double.parseDouble(leitor.readLine()));
		
		
		if(! opcao.equalsIgnoreCase("C")) {
			System.out.print("Digite o bônus: ");
			((Gerente) objColaborador).setBonus( //IMPORANTE! Pegar um obj colaborador, corverter para um do tipo gerente e para ter acesso ao setBonus
							Double.parseDouble(leitor.readLine()));
			}
		}
		
	
			
		catch (Exception erro) {
			System.out.println("DEU ERRO!!!" + erro);
			
		}
		
		
		
		
		
		
		
		//Saída de Dados
		System.out.println("Matricula: " + objColaborador.getMatricula());
		System.out.println("Nome: " + objColaborador.getNome());
		System.out.println("Salario: " + objColaborador.getSalario());
	}
}
