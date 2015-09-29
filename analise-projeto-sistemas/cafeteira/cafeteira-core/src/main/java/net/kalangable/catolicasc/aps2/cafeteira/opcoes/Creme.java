package net.kalangable.catolicasc.aps2.cafeteira.opcoes;

public class Creme extends CafeDecorator {

	public Creme( Cafe cafe ) {
		super( cafe );
	}

	@Override
	public float getPreco() {
		// TODO Auto-generated method stub
		return 1.15f + super.getPreco();
	}

	@Override
	public String preparar() {
		return "Creme";
	}

}
