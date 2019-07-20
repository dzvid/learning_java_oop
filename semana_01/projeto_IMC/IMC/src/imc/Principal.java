package imc;

public class Principal {

	public static void main(String[] args) {
		
		/**
		 * Descrição: Criação das 03 instâncias da classe Paciente.
		 * O construtor recebe o peso em quilos e a altura em metros do Paciente.
		 */
		Paciente paciente01 = new Paciente( 1.67, 70);
		Paciente paciente02 = new Paciente( 1.80, 84.5);
		Paciente paciente03 = new Paciente( 1.20, 48);
		
		/**
		 * Descrição: Resultado dos dois métodos criados, imprimindo no console o IMC e o diagnóstico de
		 * cada paciente.
		 */
		System.out.println("Paciente 01: \n\tValor do IMC: " + paciente01.calcularIMC()
				 + "\n\tDiagnóstico: " + paciente01.diagnostico());
		System.out.println("Paciente 02: \n\tValor do IMC: " + paciente02.calcularIMC()
				 + "\n\tDiagnóstico: " + paciente02.diagnostico());
		System.out.println("Paciente 03: \n\tvalor do IMC: " + paciente03.calcularIMC()
				 + "\n\tDiagnóstico: " + paciente03.diagnostico());

	}

}
