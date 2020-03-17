package idade;
import java.util.Scanner;
public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     idade Calculo = new idade();
     Scanner in=new Scanner (System.in);
     String nome,sobrenome;
     int DataA,DataN;
     
     System.out.println("Digite seu nome: ");
     nome=in.next();
     
     System.out.println("Digite seu sobrenome: ");
     sobrenome=in.next();
     System.out.println("Digite o ano de nascimento: ");
     DataN=in.nextInt();
     
     System.out.println("Digite o ano atual: ");
     DataA=in.nextInt();
     
     Calculo.nome = nome;
     Calculo.sobrenome = sobrenome;
     Calculo.DataA = DataA;
     Calculo.DataN = DataN;
     Calculo.idade();
     
     System.out.println(Calculo.nome+" " +Calculo.sobrenome+" voce tem "+Calculo.idade+" anos.");
	}

}
