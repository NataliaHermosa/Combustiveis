import java.io.IOException;
import java.util.Scanner;
public class gasolina {

	public static void main(String[] args) throws IOException {
	Scanner scan = new Scanner(System.in);
	
	char combustivel;
	double Gasolina = 3.3;
	double Alcool = 2.9;
	double litros;
	double total = 0;
	double totald = 0;
	double percentual = 0;
	double pagamento;
	
	
	System.out.printf("Informe quantos litros de combustível foram comprados: ");
	litros = scan.nextDouble();
	
	System.out.printf("Qual o tipo de combustível escolhido? Digite 'A' para Álcool e 'G' para Gasolina: ");
	combustivel = (char)System.in.read();
	
	
	if (combustivel == 'G' || combustivel == 'g'){ 
	if (litros <= 20) {
		percentual = 0.04;
	} else {
		percentual = 0.06;
	}

	total = litros * Gasolina;	
	
	} else if (combustivel == 'A' || combustivel == 'a'){
		if (litros <= 20) {
			percentual = 0.03;
		} else {
			percentual = 0.05;
		}
		
	total = litros * Alcool;
	
	}
	
	totald = total * percentual;
	
	pagamento = total - totald;
	
	System.out.println("Preço a pagar: R$ " + pagamento);
	}
	
}


	


