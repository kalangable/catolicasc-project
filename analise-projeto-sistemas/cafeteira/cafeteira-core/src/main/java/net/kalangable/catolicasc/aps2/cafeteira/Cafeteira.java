package net.kalangable.catolicasc.aps2.cafeteira;

import java.util.Iterator;

import net.kalangable.catolicasc.aps2.cafeteira.moeda.Moeda;

public interface Cafeteira {
	String cafePreto();

	String cafeComCreme();

	String cafeComAcucar();

	String cafeComCremeAcucar();

	float depositarMoeda( Moeda m );

	Iterator<Moeda> getTroco();

}
