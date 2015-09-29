package net.kalangable.catolicasc.aps2.cafeteira.opcoes;

public class Acucar extends CafeDecorator {

	public Acucar( Cafe cafe ) {
		super( cafe );
	}

	@Override
	public float getPreco() {
		return 0.3f + super.getPreco();
	}

	@Override
	public String preparar() {
		return "Acucar";
	}

}
