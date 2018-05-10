package exercicio2;

import javax.swing.JOptionPane;

public class Ex02 {

	String nome, nomemaioraltura="",nomemaioridade="",nomemaiorpeso="";
	int idade,qtdJogadores=0 ;
	double peso,altura,maiorPeso,maiorAltura,maiorIdade,somaAltura=0;

	public void perguntas(){
		 
		nome = JOptionPane.showInputDialog("Informe nome do jogador");
		qtdJogadores++;
		if(!nome.equals("sair")){
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade : "));			
			peso = Double.parseDouble(JOptionPane.showInputDialog("Peso : "));			
			altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		}
	}
	public void laco(){
		
		int continuar = 0;
		
		do{
			perguntas();
			resultados();
			mediaAltura();			
			continuar = JOptionPane.showConfirmDialog(null,"Deseja continuar a cadastrar ? ","", 0);			
		}while(continuar == 0);
		exibir();
		
	}
	
	public void resultados(){
				
		if(idade > maiorIdade){
			maiorIdade = idade;
			nomemaioridade = nome;
		}		
		if(peso > maiorPeso){
			maiorPeso = peso;
			nomemaiorpeso = nome;
		}	
		somaAltura += altura;
		if(altura > maiorAltura){
			maiorAltura = altura;
			nomemaioraltura = nome;
		}
	}
	public double mediaAltura(){
		
		double media = somaAltura / qtdJogadores;
			
		return media;
		
	}
	public void exibir(){
		
		String msg = "***** Informacoes *****\n\n";
			   msg+= "Quantidade Jogadores " +qtdJogadores;
			   msg+= "\nMaior jogador: " +nomemaioraltura;
			   msg+= "\nJogador mais velho: " +nomemaioridade;
			   msg+= "\nJogador mais pesado: " +nomemaiorpeso;
			   msg+= "\nMedia de alturas "+String.format("%.2f", mediaAltura());
			   
			   JOptionPane.showMessageDialog(null, msg);
	}
}
















