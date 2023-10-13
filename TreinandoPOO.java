package treinandoOOP;

import javax.swing.JOptionPane;

public class TreinandoPOO {

	public static void main(String[] args) {

		int escolha = 0;
		int opcao = 0;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"CÁLCULO DE BÔNUS DOS FUNCIONÁRIOS \n1-Calculo do gerente \n2-Cálculo do desenvolvedor"));

			} catch (NullPointerException | NumberFormatException erro) {

				JOptionPane.showMessageDialog(null,
						"Dados não numéricos foram inseridos ou o programa foi fechado incorretamente!!", null,
						JOptionPane.ERROR_MESSAGE);

				break;
			}

			switch (opcao) {

			case 1:

				// Instânciando um novo objeto do tipo Gerente

				Gerente gerente1 = new Gerente(null, 0, null, 0);

				gerente1.setBonus(90);

				gerente1.setId(123456);

				gerente1.setNome("José");

				gerente1.setSalario(4067.2);

				escolha = JOptionPane.showConfirmDialog(null, "Deseja verificar os dados completodos do funcionário");

				if (escolha == 0) {

					gerente1.mostrarDados();
				}

				else {

					JOptionPane.showMessageDialog(null, "A aplicação foi finalizada!!");
				}

				break;

			case 2:

				// Instanciando um novo objeto do tipo Desenvolvedor.
				Desenvolvedor desenvolvedor1 = new Desenvolvedor(null, 0, null, 0);

				// Método setter atua como um intermediador entre o valor inserido e o atributo,
				// contém a verificação, se o dado insérido não estiver apto gera uma mensagem
				// de erro
				desenvolvedor1.setBonus(20);

				desenvolvedor1.setNome("João");

				desenvolvedor1.setSalario(8569.2);

				desenvolvedor1.setId(12345);

				// Permite que o usuário escolha se deseja ver os dados inseridos
				escolha = JOptionPane.showConfirmDialog(null, "Deseja verificar os dados completos do funcionário??");

				if (escolha == 0) {

					desenvolvedor1.mostrarDados();
				}

				else {

					JOptionPane.showMessageDialog(null, "A aplicação foi finalizada!!");
				}

				break;

			case 3:

				break;

			}

		} while (opcao > 0);

	}

}
