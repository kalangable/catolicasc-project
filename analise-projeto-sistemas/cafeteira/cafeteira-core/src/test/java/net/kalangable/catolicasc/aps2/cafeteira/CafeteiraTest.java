package net.kalangable.catolicasc.aps2.cafeteira;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Iterator;

import net.kalangable.catolicasc.aps2.cafeteira.moeda.CincoCentavos;
import net.kalangable.catolicasc.aps2.cafeteira.moeda.CinquentaCentavos;
import net.kalangable.catolicasc.aps2.cafeteira.moeda.Moeda;
import net.kalangable.catolicasc.aps2.cafeteira.moeda.VinteCincoCentavos;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CafeteiraTest {

	private Cafeteira instance;

	@Before
	public void setUp() {
		instance = new CafeteiraImpl();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testCafePreto() {
		System.out.println( "cafePreto" );
		String expResult = "Cafe";
		String result = instance.cafePreto();
		assertEquals( expResult, result );
	}

	@Test
	public void testCafeComCreme() {
		System.out.println( "cafeComCreme" );
		String expResult = "Cafe com Creme";
		String result = instance.cafeComCreme();
		assertEquals( expResult, result );
	}

	@Test
	public void testCafeComAcucar() {
		System.out.println( "cafeComAcucar" );
		String expResult = "Cafe com Acucar";
		String result = instance.cafeComAcucar();
		assertEquals( expResult, result );
	}

	@Test
	public void testCafeComCremeAcucar() {
		System.out.println( "cafeComCremeAcucar" );
		String expResult = "Cafe com Creme e Acucar";
		String result = instance.cafeComCremeAcucar();
		assertEquals( expResult, result );
	}

	@Test
	public void testDepositarMoeda() {
		System.out.println( "depositarMoeda" );
		Moeda m = new VinteCincoCentavos();
		float expResult = 0.25f;
		instance.depositarMoeda( new VinteCincoCentavos() );
		instance.depositarMoeda( new CinquentaCentavos() );
		float result = instance.depositarMoeda( new CincoCentavos() );
		assertEquals( expResult, result, 0.8 );
		// TODO review the generated test code and remove the default call to
		// fail.
		fail( "The test case is a prototype." );
	}

	@Test
	public void testGetTroco() {
		System.out.println( "getTroco" );
		Iterator<Moeda> expResult = null;
		Iterator<Moeda> result = instance.getTroco();
		assertEquals( expResult, result );
		// TODO review the generated test code and remove the default call to
		// fail.
		fail( "The test case is a prototype." );
	}

}
