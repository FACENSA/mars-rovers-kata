package cc.marsrovers;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarsRoversTest {

	
	@Test
	public void deveRetornarAPosticaoDeX(){
	
		MarsRovers marsRovers = new MarsRovers();
		int posicaoDeX = 3;
		int posicaoDeY = 2;
		marsRovers.setPosition(posicaoDeX, posicaoDeY);
		int x = marsRovers.getPosicaoDeX();
		assertEquals(3,x);
	}

	@Test
	public void deveRetornarAPosicaoDeY(){
		
		MarsRovers marsRovers = new MarsRovers();
		int positionDeX = 1;
		int positionDeY = 2;
		marsRovers.setPosition(positionDeX, positionDeY);
		int y = marsRovers.getPosicaoDeY();
		assertEquals(2, y);
	}
	
	@Test
	public void deveAndarParaAEsquerda(){

		// Dado que eu tenho
		MarsRovers marsRovers = new MarsRovers();
		marsRovers.setPosition(3, 4);
		
		// Quando eu 
		marsRovers.move("L");

		// Entao irei verificar que
		int x = marsRovers.getPosicaoDeX();
		assertEquals(2,x);
		int y = marsRovers.getPosicaoDeY();
		assertEquals(4, y);
		
	}
	
	@Test
	public void deveAndarParaADireita(){

		// Dado que eu tenho
		MarsRovers marsRovers = new MarsRovers();
		marsRovers.setPosition(3, 4);
		
		// Quando eu 
		marsRovers.move("R");

		// Entao irei verificar que
		int x = marsRovers.getPosicaoDeX();
		assertEquals(4,x);
		int y = marsRovers.getPosicaoDeY();
		assertEquals(4, y);
		
	}
	
}
