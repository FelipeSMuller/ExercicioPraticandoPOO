package treinandoOOP;

import javax.swing.JOptionPane;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, int id, Double salario, int bonus) {
		super(nome, id, salario, bonus);

	}

	@Override
	public void mostrarDados() {

		Double bonus1 = (bonus * salario) / 100;

		Double salarioComBonus = bonus1 + salario;

		JOptionPane.showMessageDialog(null,
				"Cargo: DESENVOLVEDOR" + "\nNome:  " + nome + "\nID:  " + id + "\nSalário:  " + formatarSalario(salario)
						+ "\nBônus:  " + formatarSalario(bonus1) + "\nSalário com bônus:  "
						+ formatarSalario(salarioComBonus));
	}

}
