/* @author Caroline Calixto Colares dos Santos
 * Date: 18/10/2021
 * Copyright notice: Classe que realiza um teste de alimentação e indica uma dieta conforme resultado
 */

package br.com.generation.projeto;

import javax.swing.JOptionPane;

public class Dieta {
	
	public static int[] perguntas() {

		int resp[] = new int[11];

		// ------------- BANCO DE QUESTÕES --------------------
		
		resp[0] = Integer.parseInt(
				JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
						+ "\n\n1 -Quando faço pequenos lanches ao longo do dia, costumo comer frutas ou castanhas"
						+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[0] < 0 || resp[0] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[0] = Integer.parseInt(
					JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
							+ "\n\n1 -Quando faço pequenos lanches ao longo do dia, costumo comer frutas ou castanhas"
							+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[1] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia."
				+ "\n\n2 - Quando escolho frutas, verduras e legumes, dou preferência para aqueles que são de produção local"
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[1] < 0 || resp[1] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[1] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia."
					+ "\n\n2 - Quando escolho frutas, verduras e legumes, dou preferência para aqueles que são de produção local"
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[2] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia."
				+ "\n\n3 - Quando escolho frutas, legumes e verduras, dou preferência para aqueles que são orgânicos"
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[2] < 0 || resp[2] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[2] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia."
					+ "\n\n3 - Quando escolho frutas, legumes e verduras, dou preferência para aqueles que são orgânicos"
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[3] = Integer.parseInt(
				JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
						+ "\n\n4 - Costumo levar algum alimento comigo em caso de sentir fome ao longo do dia"
						+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[3] < 0 || resp[3] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[3] = Integer.parseInt(
					JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
							+ "\n\n4 - Costumo levar algum alimento comigo em caso de sentir fome ao longo do dia"
							+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[4] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia." + "\n\n5 - Costumo planejar as refeições que farei no dia"
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[4] < 0 || resp[4] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[4] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia." + "\n\n5 - Costumo planejar as refeições que farei no dia"
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[5] = Integer.parseInt(
				JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
						+ "\n\n6 - Costumo variar o consumo de feijão por ervilha, lentilha ou grão de bico"
						+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[5] < 0 || resp[5] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[5] = Integer.parseInt(
					JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
							+ "\n\n6 - Costumo variar o consumo de feijão por ervilha, lentilha ou grão de bico"
							+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[6] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia." + "\n\n7 - Na minha casa é comum usarmos farinha de trigo integral "
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[6] < 0 || resp[6] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[6] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia." + "\n\n7 - Na minha casa é comum usarmos farinha de trigo integral "
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[7] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia." + "\n\n8 - Costumo comer fruta no café da manhã"
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[7] < 0 || resp[7] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[7] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia." + "\n\n8 - Costumo comer fruta no café da manhã"
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[8] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia." + "\n\n9 - Costumo fazer minhas refeições sentado(a) à mesa."
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[8] < 0 || resp[8] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[8] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia." + "\n\n9 - Costumo fazer minhas refeições sentado(a) à mesa."
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[9] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
				+ " acordo com seu dia a dia." + "\n\n10 - Procuro realizar as refeições com calma. "
				+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[9] < 0 || resp[9] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[9] = Integer.parseInt(JOptionPane.showInputDialog("Responda as perguntas a seguir de"
					+ " acordo com seu dia a dia." + "\n\n10 - Procuro realizar as refeições com calma. "
					+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		resp[10] = Integer.parseInt(
				JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
						+ "\n\n11 - Costumo participars do preparo dos alimentos na minha casa"
						+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		
		while(resp[10] < 0 || resp[10] > 3) {
			JOptionPane.showMessageDialog(null, "Resposta inválida.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
			resp[10] = Integer.parseInt(
					JOptionPane.showInputDialog("Responda as perguntas a seguir de" + " acordo com seu dia a dia."
							+ "\n\n11 - Costumo participars do preparo dos alimentos na minha casa"
							+ "\n[0] Nunca [1] Raramente [2] Muitas vezes [3] Sempre"));
		}
		
		return resp;

		// ------------- FIM BANCO DE QUESTÕES -------------
	}

	public static int somaPontos(int[] resp) {

		// ------------- FUNÇÃO SOMAR PONTUAÇÃO -------------

		int c, pontos = 0, soma = 0;

		for (c = 0; c < 11; c++) {

			if (resp[c] == 0) {
				pontos += 0;
				soma = pontos;

			}

			else if (resp[c] == 1) {
				pontos += 1;
				soma = pontos;
			}

			else if (resp[c] == 2) {
				pontos += 2;
				soma = pontos;
			}

			else if (resp[c] == 3) {
				pontos += 3;
				soma = pontos;
			}

		}
		return soma; // ------------- FIM SOMA DA PONTUAÇÃO -------------
	}

	public static void resultado(int soma) {

		// ------------- EXIBIÇÃO DOS RESULTADOS -------------

		JOptionPane.showMessageDialog(null, "O resultado do seu teste retornou o total de " + soma + " pontos.");

		if (soma < 12) {

			JOptionPane.showMessageDialog(null, "Sua alimentação requer atenção! \n"
					+ "Para ter uma alimentação saudável e prazerosa, você precisa mudar.");

		}

		else if (soma >= 13 && soma < 18) {

			JOptionPane.showMessageDialog(null,
					"Siga em frente!  \n" + "Você está no meio do caminho para uma alimentação saudável");
		}

		else if (soma > 18) {

			JOptionPane.showMessageDialog(null,
					"Excelente! \n" + "Parece que você tem uma alimentação saudável, em diversos aspectos.");
		}

		// ------------- FIM EXIBIÇÃO DOS RESULTADOS -------------

	}

}
