package net.kalangable.catolicasc.aps2.cafeteira.opcoes;

public class CafeDecorator extends Cafe {

	protected Cafe cafe;

	public CafeDecorator( Cafe cafe ) {
		this.cafe = cafe;
	}

	@Override
	public String preparar() {
		return cafe.preparar();
	}

	@Override
	public float getPreco() {
		return cafe.getPreco();
	}

}
