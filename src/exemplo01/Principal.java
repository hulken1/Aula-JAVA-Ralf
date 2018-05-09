package exemplo01;

import javax.swing.JOptionPane;

public class Principal {
public static void main(String[] args) {
	
	//Instanciar 
	Pessoa p1 = new Pessoa();
	p1.nome = "Andressa";
	p1.idade = 25;
	p1.peso = 60.2;
	p1.altura = 1.73;
	
	//Instanciar outro objeto
	Pessoa p2 = new Pessoa();
	p2.nome = "Eu";
	p2.idade = 24;
	p2.peso = 110;
	p2.altura = 1.86;
	
	//Invocar metodos
	p2.apresentacao();
	p2.exibirimc();
}
}
