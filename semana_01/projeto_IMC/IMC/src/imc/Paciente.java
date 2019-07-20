package imc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Paciente {

	double altura, peso;

	/**
	 * Descrição: O construtor recebe o peso em quilos e a altura em metros do
	 * Paciente, ambos utilizando o tipo double.
	 * 
	 * Input: Peso em quilos e a altura em metros do Paciente. 
	 * Output: Objeto do tipo Paciente criado com sucesso.
	 */
	Paciente(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}

	/**
	 * Descrição: Calcula o Índice de Massa Corporal do Paciente de acordo com a
	 * fórmula IMC = peso (quilos) / (altura * altura (metros)).
	 * 
	 * Input: Não possui. 
	 * Output: Retorna o valor do IMC do Paciente no formato double com 02 casas decimais.
	 */
	public double calcularIMC() {
		double IMC = peso / (altura * altura);
		//Arredondando valor para 02 casas decimais usando a classe BigDecimal
		BigDecimal imcArredondar = new BigDecimal(IMC);
		imcArredondar = imcArredondar.setScale(2, RoundingMode.HALF_UP);
		return imcArredondar.doubleValue();
	}

	/**
	 * Descrição:  Utiliza o método calcularIMC() para calcular o IMC do paciente
	 * e retorna uma String de acordo com as seguintes faixas de valores:
	 * 
	 * Baixo peso muito grave = IMC abaixo de 16 kg/m²
	 * Baixo peso grave = IMC entre 16 e 16,99 kg/m²
	 * Baixo peso = IMC entre 17 e 18,49 kg/m²
	 * Peso normal = IMC entre 18,50 e 24,99 kg/m²
	 * Sobrepeso = IMC entre 25 e 29,99 kg/m²
	 * Obesidade grau I = IMC entre 30 e 34,99 kg/m²
	 * Obesidade grau II = IMC entre 35 e 39,99 kg/m²
	 * Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²
	 * 
	 * Input: Não possui.
	 * Output: Retorna uma string contendo a classificação da situação do IMC do paciente.
	 */
	public String diagnostico() {

		double imc_paciente = calcularIMC();

		if(imc_paciente >= 0.0 && imc_paciente < 16.00){
			return "Baixo peso muito grave";
		}else if(imc_paciente >= 16.00 && imc_paciente <= 16.99){
			return "Baixo peso grave";
		}else if(imc_paciente >= 17.00 && imc_paciente <= 18.49){
			return "Baixo peso";
		}else if(imc_paciente >=  18.50 && imc_paciente <= 24.99){
			return "Peso normal";
		}else if(imc_paciente >= 25.00  && imc_paciente <= 29.99){
			return "Sobrepeso";
		}else if(imc_paciente >= 30.00  && imc_paciente <= 34.99){
			return "Obesidade grau I";
		}else if(imc_paciente >= 35.00  && imc_paciente <= 39.99){
			return "Obesidade grau II";
		}else if(imc_paciente >= 40.00){
			return "Obesidade grau III (obesidade mórbida)";
		}else {
			//caso retorne valor negativo
			return "IMC inválido";
		}

	}

}
