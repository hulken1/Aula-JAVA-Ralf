//Classe = Molde

package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//Atributos
	String nome;
	int idade;
	double peso, altura;
	
	//Metodo de apresentacao
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Ola ! Meu nome é "+nome);
	}
	
	//Calculo de IMC
	public double calculoimc(){
		double imc = peso / Math.pow(altura, 2);
		return imc;
	}
	
	//Situacao do IMC
	public String situacaoimc(){
		
		//Variavel contendo a situacao
		String situacao;
		
		//Obter o valor do IMC
		double imc = calculoimc();
		
		//Situacao
		if(imc < 17){
			situacao = "Muito abaixo do peso.";
		}else if(imc < 18.5){
			situacao = "Abaixo do peso.";
		}else if(imc < 25){
			situacao = "Peso normal.";
		}else if(imc < 30){
			situacao = "Acima do peso.";
		}else if(imc < 35){
			situacao = "Obesidade I.";
		}else if(imc < 40){
			situacao = "Obesidade II.";
		}else {
			situacao = "Obesidade III.";
		}
		//Retorno 
		return situacao;
	}
	
	//Metodo para exibir o IMC e a situacao
	public void exibirimc(){
		
		//Mensagem
		String msg = "********** IMC **********";
			   msg += "\nSeu IMC é de: "+String.format("%.2f",calculoimc());
			   msg += "\nSua situacao é: "+situacaoimc();
			   
			   //Exibir mensagem
			   JOptionPane.showMessageDialog(null,msg);
		
	}
	
}

