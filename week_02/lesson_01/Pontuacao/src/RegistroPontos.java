
public class RegistroPontos {
	
	private CalculadoraBonus calculadoraBonus;
	
	public RegistroPontos(CalculadoraBonus cb) {
		// TODO Auto-generated constructor stub
		this.calculadoraBonus = cb;
	}

	public void fazerUmComentario(Usuario u) {
		u.pontos += 3 * calculadoraBonus.bonus(u);
	}

	public void criarUmTopico(Usuario u) {
		u.pontos += 5 * calculadoraBonus.bonus(u);
	}

	public void darUmLike(Usuario u) {
		u.pontos += 1 * calculadoraBonus.bonus(u);
	}

}
