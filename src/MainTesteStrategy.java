import one.digitalinnovation.gof.strategy.*;

public class MainTesteStrategy {

	public static void main(String[] args) {

		Comportamento lento = new ComportamentoLento();
		Comportamento normal = new ComportamentoNormal();
		Comportamento rapido = new ComportamentoRapido();

		Personagem robo = new Personagem();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(lento);
		robo.mover();
		robo.setComportamento(rapido);
		robo.mover();
		robo.mover();
		robo.mover();
	}

}
