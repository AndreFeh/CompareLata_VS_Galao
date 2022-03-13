package git;
import java.util.Scanner;

public class LojasTintas {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Tamanho Do Espaço A Ser Pintado Em Metros²: ");
		float tamanhoArea = scan.nextFloat();
		
		double lataTinta = 18;
		int coberturaTinta = 3;
		int valorLata = 80;
		
			double metrosPorLitro = tamanhoArea / coberturaTinta;
			double qtdLatas = metrosPorLitro / lataTinta;	
			
			// CONVERTER PARA INTEIRO A QUANTIDADE DE LATAS 
			// EXEMPLO - int roundNumA = (int)Math.ceil(a/100);
				
			int qtdLatasInt = (int)Math.ceil(qtdLatas);
				double valorTotal = qtdLatasInt * valorLata;
				
				System.out.println("Total De " + metrosPorLitro + " Litros! Para " + tamanhoArea + " m²");
				System.out.println("Total Exato De " + qtdLatas + " Latas Para Pintura!");
				System.out.println("Total De " + qtdLatasInt + " Lata(s) Para Pintura!");
				System.out.println("Valor Total: R$ " + valorTotal);
	}

}
