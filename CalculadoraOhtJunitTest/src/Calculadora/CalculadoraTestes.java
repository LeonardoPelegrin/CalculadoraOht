package Calculadora;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class CalculadoraTestes {

// Neste codigo fazemos a definição do metodo SomarDoisNumerosPositivos() para fazer seu teste automatizado no JunitTest.
	@Test
	public void SomarDoisNumerosPositivos() {
		calculadora calc = new calculadora();
		int soma = calc.somar(3,7);
		
		Assert.assertEquals(12, soma);
	}
// Neste codigo fazemos a definição do metodo SubtarirDoisNumerosPositivos() para fazer seu teste automatizado no JunitTest.
	@Test
	public void SubtarirDoisNumerosPositivos() {
		calculadora calc = new calculadora();
		int subtrair = calc.subtrair(10,3);
		
		Assert.assertEquals(15, subtrair);
	}
// Neste codigo fazemos a definição do metodo MultiplicarDoisNumerosPositivos() para fazer seu teste automatizado no JunitTest.
	@Test
	public void MultiplicarDoisNumerosPositivos() {
		calculadora calc = new calculadora();
		int multiplicar = calc.multiplicar(10,5);
		
		Assert.assertEquals(5, multiplicar);
	}
// Neste codigo fazemos a definição do metodo DividirDoisNumerosPositivos() para fazer seu teste automatizado no JunitTest.
	@Test
	public void DividirDoisNumerosPositivos() {
		calculadora calc = new calculadora();
		int dividir = calc.dividir(12, 2);
		
		Assert.assertEquals(2, dividir);
	}
}
