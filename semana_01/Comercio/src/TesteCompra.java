import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void testCompraAVista() {
		Compra c = new Compra(500);
		
		//verificando se o número de parcelas é igual a 1
		assertEquals(1 , c.getNumeroParcelas());
		
		//verifica se o valor total da compra está correto
		assertEquals(500 , c.getValorTotal());
		
		//verifica se o valor da parcela está correto
		assertEquals(500 , c.getValorParcela());
	}

	@Test
	public void testCompraParcelada() {
		Compra c = new Compra(4, 250);
		
		//verificando se o número de parcelas é igual a 1
		assertEquals(4 , c.getNumeroParcelas());
		
		//verifica se o valor total da compra está correto
		assertEquals(1000 , c.getValorTotal());
		
		//verifica se o valor da parcela está correto
		assertEquals(250 , c.getValorParcela());
	}
}
