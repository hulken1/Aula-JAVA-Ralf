package exercicio01;

import javax.swing.JOptionPane;

public class Ex01 {

	String nome,sexo,cargo;
	int idade,qtdMasc=0,qtdFem=0,c1,c2,c3,c4,c5,c6,c7;
	int op=0,adult=0,menor=0;
	
	public void nomesIdade(){
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade :"));
		
		if(idade > 18){
			adult++;
		}else{
			menor++;
		}
	}
	
	public void sexo(){
		
		String sexo = "Informe seu sexo\n";
			   sexo+= "1) Masculino\n";
			   sexo+= "2) Feminino";
			op = Integer.parseInt(JOptionPane.showInputDialog(sexo)) ; 
			if(op == 1){
				qtdMasc++;
			}else{
				qtdFem++;
			}
		
	}
	
	public void cargo(){
		
		String cargos = " Informe seu cargo\n";
			   cargos+= "1) Gerente\n";
			   cargos+= "1) Atendente\n";
			   cargos+= "1) Acougueiro\n";
			   cargos+= "1) Secretaria\n";
			   cargos+= "1) Almoxarife\n";
			   cargos+= "1) Padeiro\n";
			   cargos+= "1) Estagiario\n";
			 op = Integer.parseInt(JOptionPane.showInputDialog(cargo));   
			   
			 switch (op) {
			case 1:
				c1++;
				break;
			case 2:
				c2++;
				break;
			case 3:
				c3++;
				break;
			case 4:
				c4++;
				break;
			case 5:
				c5++;
				break;
			case 6:
				c6++;
				break;
			case 7:
				c7++;
				break;
			default:
				break;
			}	   
					   
		
	}
	
	public void exibir(){
		
		String msg = "Informacoes\n\n";
			   msg+= "\nQuantidade Masculino "+qtdMasc;
			   msg+= "\nQuantidade Feminino "+qtdFem;  
			   msg+= "\n\n Cargos \n\n";
			   msg+= "\nGerente "+c1;
			   msg+= "\nAtendente "+c2;
			   msg+= "\nAçougueiro "+c3;
			   msg+= "\nGerente "+c4;
			   msg+= "\nGerente "+c5;
			   msg+= "\nGerente "+c6;
			   msg+= "\nGerente "+c7;
			   
		
		
	}
}
