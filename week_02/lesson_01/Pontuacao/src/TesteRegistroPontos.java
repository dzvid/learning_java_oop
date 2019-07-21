import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroPontos {

	@Test
	public void testePontosCriarTopicoUsuarioPadrao() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = false;
		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		
		//Verifico se o usuario padrão (não vip) somou 5 pontos ao criar o tópico
		assertEquals(5, u.pontos);	
	}
	
	@Test
	public void testePontosCriarTopicoUsuarioVip() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		
		//Verifico se o usuario padrão (não vip) somou 5 pontos ao criar o tópico
		assertEquals(25, u.pontos);	
	}
	
	@Test
	public void testePontosCriarTopicoBonusDoDiaUsuarioPadrao() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3; //entao pontos devem ser igual a 15
		
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		
		//Verifico se o usuario padrão (não vip) somou 5 pontos ao criar o tópico
		assertEquals(15, u.pontos);	
	}
	
	@Test
	public void testePontosCriarTopicoBonusDoDiaUsuarioVip() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2; //entao pontos devem ser igual a 50
		
		RegistroPontos rp = new RegistroPontos(cb);
		
		rp.criarUmTopico(u);
		
		//Verifico se o usuario padrão (não vip) somou 5 pontos ao criar o tópico
		assertEquals(50, u.pontos);	
	}

}
