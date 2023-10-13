package treinandoOOP;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Funcionario {

	// Atributos

	protected String nome;

	protected int id;

	protected Double salario;

	protected int bonus;

	// Método construtor;

	public Funcionario(String nome, int id, Double salario, int bonus) {

		this.nome = nome;

		this.id = id;

		this.salario = salario;

		this.bonus = bonus;
	}

	// Getters e setters para acesso aos atributos encapsulados.

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		// Estruturas condicionais nos métodos getters e setters.
		if (nome.isEmpty()) {

			JOptionPane.showMessageDialog(null, "O campo está vazio, é preciso preencher corretamente!!", null,
					JOptionPane.WARNING_MESSAGE);
		}

		else {

			this.nome = nome;

		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		if (id <= 0) {

			JOptionPane.showMessageDialog(null, "Insira apenas números entre positivos maiores do que 0 ", null,
					JOptionPane.WARNING_MESSAGE);
		}

		else {

			this.id = id;

		}
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {

		// Método setters para atuar como um intermediário entre o valor inserido e o
		// método, se o valor for negativo ou igual a zero gera um erro
		if (salario <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um salário menor ou igual a zero", null,

					JOptionPane.ERROR_MESSAGE);
		}

		else {

			// caso contrário atribui ao atributo
			this.salario = salario;

		}
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {

		if (bonus <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um bonus menor ou igual a zero", null,
					JOptionPane.ERROR_MESSAGE);
		}

		else {

			this.bonus = bonus;

		}
	}

	// Método para formatar o salário.

	public String formatarSalario(Double salario) {

		String salarioFormatado;

		// Instanciando um novo objeto
		DecimalFormat df = new DecimalFormat("R$ ####.##");

		// Atribuindo a formatação em uma nova variavel
		salarioFormatado = df.format(salario);

		return salarioFormatado;

	}

	// Método para imprimir os dados de cada funcionário no prompt.

	public void mostrarDados() {

		JOptionPane.showMessageDialog(null,
				"Nome:  " + nome + "\nID:  " + id + "\nSalário:  " + formatarSalario(salario));

	}

}
