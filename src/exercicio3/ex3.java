package exercicio3;

import javax.swing.JOptionPane;

public class ex3 {
	int chamarPedido,total,qtdPedido;
	double valorPedido;
	
public void perguntarPedido(){
	
	String pedido = " Selecione seu pedido \n\n";
		   pedido+= "1)Pao com Banha  R$ 1,50";
		   pedido+= "\n2)Peixe Cru com ketchup  R$ 6,00";
		   pedido+= "\n3)File de cobra  R$ 8,50";
		   pedido+= "\n4)X-Salada  R$ 9,50";
		   pedido+= "\n5)Pizza Gigante 4 Sabores  R$ 49,00";
		   pedido+= "\n6)Javali assado  R$ 23,49";
		   pedido+= "\n7)Picanha crua R$ 40,00";

		   chamarPedido = Integer.parseInt(JOptionPane.showInputDialog(pedido));
		   qtdPedido = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do seu pedido"));
}

public void laco(){
	int continuar;
		
	do{
		perguntarPedido();
		qtdPedidos();
		valor();
		continuar = JOptionPane.showConfirmDialog(null,"Deseja fazer mais algum pedido ? ","",0);		
				
	}while(continuar == 0);
	exibir();
	
	
}
	public void qtdPedidos(){
		
		switch (chamarPedido) {
		case 1:
			total += qtdPedido*1.50;
			break;
		case 2:
			total += qtdPedido*6;
			break;
		case 3:
			total += qtdPedido*8.50;
			break;
		case 4:
			total += qtdPedido*9.50;
			break;
		case 5:
			total += qtdPedido*49;
			break;
		case 6:
			total += qtdPedido*23.49;
			break;
		case 7:
			total += qtdPedido*40;
			break;
			
		default:
			break;
		}
		
		
	}
	
	public double valor(){
		
		
		valorPedido = Double.parseDouble(JOptionPane.showInputDialog("Valor pedido R$"+total+"\nInforme o valor pago "));
		if(valorPedido >= total){
			JOptionPane.showMessageDialog(null,"Valor troco R$"+(valorPedido-total));
		}else{
			JOptionPane.showMessageDialog(null,"Valor abaixo do total!");
		}
		
		return valorPedido;
	}
	
	public void exibir(){
		
		String msg = "Troco cliente R$ "+valorPedido;
			   
	}
			
}
