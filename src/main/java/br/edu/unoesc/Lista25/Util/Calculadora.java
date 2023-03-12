package br.edu.unoesc.Lista25.Util;

public class Calculadora {
	
	public Double soma(String numero1, String numero2) {
			return ConversorNumerico.converteParaDouble(numero1) + ConversorNumerico.converteParaDouble(numero2);
			}
	
	public Double subtracao(String numero1, String numero2) {
		return ConversorNumerico.converteParaDouble(numero1) - ConversorNumerico.converteParaDouble(numero2);
		}
	
	public Double divisao(String numero1, String numero2) throws IllegalArgumentException{
		if (ConversorNumerico.converteParaDouble(numero2) == 0D) {
			throw new IllegalArgumentException("Impossível Divisão por Zero!!");
		} else {
			return ConversorNumerico.converteParaDouble(numero1) / ConversorNumerico.converteParaDouble(numero2);
		}
	}
	
	public Double multiplicacao(String numero1, String numero2) {
		return ConversorNumerico.converteParaDouble(numero1) * ConversorNumerico.converteParaDouble(numero2);
		}
	
	public Double media(String numero1, String numero2) {
		return (ConversorNumerico.converteParaDouble(numero1) + ConversorNumerico.converteParaDouble(numero2)) / 2;
		}
	
	public Double potenciacao(String numero1, String numero2) throws IllegalArgumentException{
		return Math.pow(ConversorNumerico.converteParaDouble(numero1), ConversorNumerico.converteParaDouble(numero2));
		}

	public Double radiciacao(String numero1, String numero2) {
		if (ConversorNumerico.converteParaDouble(numero1) < 0D) {
			throw new IllegalArgumentException("Raiz de número negativo é um número imaginário!!");
		}
		return Math.pow(ConversorNumerico.converteParaDouble(numero1), (1D/ConversorNumerico.converteParaDouble(numero2)));
		}
}
