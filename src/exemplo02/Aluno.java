package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovados = 0,reprovados =0;
	
	//Metodo para realizar as perguntas
	public void perguntas() {
		
		nome = JOptionPane.showInputDialog("Informe o nome do aluno");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1° Nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2° Nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3° Nota"));
		
	}
	//Metodo de repeticao
	public void laco(){
		
		//Variavel boolean
		int sair = 0;
		
		//Laco
		do{
			perguntas();	
			exibirsituacao();
			contarAprovadosReprovados();
			sair = JOptionPane.showConfirmDialog(null,"Deseja continuar?","",0);
			
		}while(sair == 0);
		exibirAprovadosReprovados();
		
	}
	
	//Metodo para retornar o calculo de media
	public double calculomedia(){
		
		double media = (nota1+nota2+nota3)/3;
		
		return media;
	}
	
	//Metodo para retornar a situacao do aluno
	public String situacaoAluno(){
		
		String situacao = calculomedia() >= 7 ? "Aprovado" : "Reprovado";
		
		return situacao;
		
	}
	
	//Exibir media e situacao
	public void exibirsituacao(){
		
		//Mensagem
		String msg = "******** Informacao ********";
			   msg+= "\nSua média é "+String.format("%.2f", calculomedia());
			   msg+= "\nSua situacao é "+situacaoAluno();
			   
			   //Exibir mensagem
			   JOptionPane.showMessageDialog(null,msg);
			   
	}
	//Contar aprovados e reprovados
	public void contarAprovadosReprovados(){
		
		if(calculomedia() >= 7){
			aprovados++;
		}else{
			reprovados++;
		}
				
	}
	//Exibir a quantidade de aprovados e reprovados
	public void exibirAprovadosReprovados(){
		
		String msg = "Aprovados X Reprovados";
			   msg+= "\nAlunos aprovados: "+aprovados;
			   msg+= "\nAlunos reprovados: "+reprovados;
			   
			   JOptionPane.showMessageDialog(null,msg);
	}
}
