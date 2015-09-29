package net.kalangable.catolicasc.aps2.cafeteira;

import java.util.ArrayList;
import java.util.Iterator;

import net.kalangable.catolicasc.aps2.cafeteira.moeda.Moeda;
import net.kalangable.catolicasc.aps2.cafeteira.opcoes.Acucar;
import net.kalangable.catolicasc.aps2.cafeteira.opcoes.Cafe;
import net.kalangable.catolicasc.aps2.cafeteira.opcoes.Creme;
import net.kalangable.catolicasc.aps2.cafeteira.opcoes.Preto;

public class CafeteiraImpl implements Cafeteira {
	private Cafe preto;
	private Iterator<Moeda> moedas;

	private ArrayList<Moeda> listaMoedas;
	private float soma;

	public CafeteiraImpl() {
		preto = new Preto();
		listaMoedas = new ArrayList<Moeda>();
		soma = 0.0f;
	}

	@Override
	public String cafePreto() {
		return new Preto().preparar();
	}

	@Override
	public String cafeComCreme() {
		Cafe adcional = new Creme( preto );
		return preto.preparar() + " com " + adcional.preparar();
	}

	@Override
	public String cafeComAcucar() {
		Cafe adcional = new Acucar( preto );
		return preto.preparar() + " com " + adcional.preparar();
	}

	@Override
	public String cafeComCremeAcucar() {
		Cafe adcionalCreme = new Creme( preto );
		Cafe adcionalAcucar = new Acucar( adcionalCreme );
		System.out.println( adcionalAcucar.getPreco() );
		return preto.preparar() + " com " + adcionalCreme.preparar() + " e " + adcionalAcucar.preparar();
	}

	@Override
	public float depositarMoeda( Moeda m ) {
		listaMoedas.add( m );
		soma += m.valor();
		return soma;
	}

	@Override
	public Iterator<Moeda> getTroco() {
		// TODO Auto-generated method stub
		return null;
	}

}
