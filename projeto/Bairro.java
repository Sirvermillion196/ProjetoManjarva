package br.com.generation.projeto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Bairro {
	
	
   

	private Map<String, List<String>> end = new HashMap<String, List<String>>();

	public Bairro(){
	List<String> tatuapeList = new ArrayList<String>();
	tatuapeList.add("Nutriclin|| Endereço: Rua Apucarana, 326. Telefone: (11) 3798-2829");
	tatuapeList.add("Clínica Equilíbrio Nutricional || Endereço: Praça Sílvio Romero, 55 - sala 67. Telefone: (11) 2672-7300");
	tatuapeList.add("SF Nutrição || Endereço: R. Itapura, 300 - Conjunto 1302. Telefone: (11) 3713-2023");
	tatuapeList.add("CliNutri || Endereço: Rua Doutor Corinto Baldoino Costa, 74. Telefone: (11) 98224-6063");
	tatuapeList.add("NutreClínica || Endereço: R. Restinga, 113 - conjunto 305. Telefone: (11) 4114-9305");
	end.put("Tatuape", tatuapeList);
	List<String> vilaCarraoList = new ArrayList<String>();
	vilaCarraoList.add("Nutricionista Dra. Brenda Berlla || Endereço: Av. Conselheiro Carrão, 2620 - sala 1203. Telefone: (11) 98420-1266");
	vilaCarraoList.add("Clinica Bio Ser || Endereço: Av. Conselheiro Carrão, 2939. Telefone: (11)2098-2971");
	vilaCarraoList.add("Nutricionista Dra. Renata Giudice || Endereço: Av. Guilherme Giorgi, 374. Telefone: (11) 99246-3632");
	vilaCarraoList.add("Evs - Espaço Vida Saudável || Endereço: Av. Conselheiro Carrão, 1857 - Sala 2. Telefone: (11) 97404-2367");
	end.put("Vila Carrão", vilaCarraoList);
	List<String> belemList = new ArrayList<String>();
	belemList.add("Phillipe Rios - Nutricionista Esporte e Estética || Endereço: Rua Serra da Bocaina, 570 - Cj 41. Telefone: (11) 95892-8819");
	belemList.add("Herba Saúde Nutricional || Endereço: Av. Celso Garcia, 1907. Telefone: (11) 97952-8499");
	end.put("Belém", belemList);
	List<String> moocaList = new ArrayList<String>();
	moocaList.add("Espaço Saúde À Vida || Endereço: R. Canuto Saraiva, 59. Telefone: (11) 98707-8323");
	moocaList.add("NutriMente Psicologia, Neuropsicologia e Nutrição || Endereço: R. da Mooca, 2343 - Sala 1. Telefone: (11) 99515-3854");
	moocaList.add("Andréia Rodrigues - Nutrição Esportiva || Endereço: Rua Camé, 532. Telefone: (11) 98876-3513");
	moocaList.add("Thaís Pereira - Nutricionista Esportiva || Endereço: Rua Celso de Azevedo Marques, 395. Telefone: (11) 98488-0651");
	moocaList.add("Bella Nutri - Nutrição & Estética || Endereço: Edifício Atrio Giorno - R. Borges de Figueiredo, 303 - Sala 609. Telefone: (11) 97457-4199");
	end.put("Mooca", moocaList);
	}
	 public Map<String, List<String>> getEnd() {
			return end;
		}
	 public static void GetBairro(String[] args, Object[] Categories) {
			boolean terminar = false;
				while (!terminar) {
				Object endereco;
				Scanner scanner = new Scanner(System.in);
				Bairro bairros = new Bairro();
				endereco = JOptionPane.showInputDialog(null, "Digite aqui um dos Bairros cobertos pelo MANJARVA: \n[Tatuapé]\n[Belém]\n[Mooca]\n[Vila Carrão]", "AVISO", JOptionPane.INFORMATION_MESSAGE);
				List<String> resultado = bairros.getEnd().get(endereco);
				
				if (resultado == null) {
					
					JOptionPane.showMessageDialog(null, "O resultado não foi encontrado, por favor digite um dos bairros cobertos pelo aplicativo: ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
					}
				else {
					for (String obj: resultado) {
					JOptionPane.showMessageDialog(null, obj, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
					}
					terminar = true;
				
				
				scanner.close();
				}
				}
			}


	
	/*Map<String, List<String>> hm = new HashMap<String, List<String>>();
	List<String> values = new ArrayList<String>();
	values.add("Value 1");
	values.add("Value 2");
	hm.put("Key1", values);*/

}
