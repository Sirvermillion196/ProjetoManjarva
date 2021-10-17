package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		PessoaCaracteristica pc = new PessoaCaracteristica();
		
		pc.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
		pc.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));		
		pc.setSexo(JOptionPane.showInputDialog("Digite seu sexo:\n [M] ou [F]"));
		pc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
		pc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: ")));
		
		JOptionPane.showMessageDialog(null, "***** Dados de " + pc.getNome() + " *****\n\n " +
					"Idade: " + pc.getIdade() + " anos" +
					"\nSexo: " + pc.getSexo() + 
					"\nAltura: " + pc.getAltura() + " m" + 
					"\nPeso: " + pc.getPeso() + " kg");
		
		//Pergunta sobre o c�lculo de IMC
		int imc = JOptionPane.showConfirmDialog(null, "Voc� deseja realizar o c�lculo do IMC?", 
				"Pergunta", JOptionPane.YES_NO_OPTION);
		
		switch(imc) {
		    case 0: 
		    	JOptionPane.showMessageDialog(null, "Vamos l�!"); //Yes option
		    	JOptionPane.showMessageDialog(null, "Aten��o!!!\n\n" + 
						"O c�lculo feito no sistema n�o se\n" + 
						"encaixa no teste para gestantes, nem\n" + 
						"para crian�as abaixo de 10 anos.\n\n ", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		    	Imc.validacaoIdade(pc.getIdade(), pc.getPeso(), pc.getAltura(), pc.getSexo());
		    	break;
		    case 1: 
		    	JOptionPane.showMessageDialog(null, "At� mais!"); //No option
		    	break;
		    case -1: 
		    	JOptionPane.showMessageDialog(null, "At� mais!"); //X option
		    	break;
		}
		
		//Pergunta sobre o question�rio de dieta
		int diet = JOptionPane.showConfirmDialog(null, "Voc� deseja realizar um quiz sobre sua alimenta��o?",
				"Pergunta", JOptionPane.YES_NO_OPTION);
		
		switch(diet) {
		    case 0: 
		    	JOptionPane.showMessageDialog(null, "Vamos l�!"); //Yes option
		    	Dieta.resultado(Dieta.somaPontos(Dieta.perguntas()));
		    	break;
		    case 1: 
		    	JOptionPane.showMessageDialog(null, "At� mais!"); //No option
		    	break;
		    case -1: 
		    	JOptionPane.showMessageDialog(null, "At� mais!"); //X option
		    	break;
		    	
		}
		
		//Informa��es sobre cl�nicas de Nutri��o perto dos bairros cobertos
		int clin = JOptionPane.showConfirmDialog(null, "Voc� deseja informa��es sobre cl�nicas de Nutri��o perto dos bairros cobertos?",
				"Pergunta", JOptionPane.YES_NO_OPTION);
		
		switch(clin) {
		    case 0: 
		    	JOptionPane.showMessageDialog(null, "Vamos l�!"); //Yes option
		    	Bairro.GetBairro(args, args);
		    	break;
		    case 1: 
		    	JOptionPane.showMessageDialog(null, "At� mais!"); //No option
		    	break;
		    case -1: 
		    	JOptionPane.showMessageDialog(null, "At� mais!"); //X option
		    	break;
		    	
		}
	}
}
