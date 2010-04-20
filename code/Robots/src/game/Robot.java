package game;

import common.Point;

public class Robot extends Actor {

	private final Hero hero;

	// Construtor
	public Robot(Point initialPosition, Hero hero) {
		super(initialPosition, '+');
		this.hero = hero;
	}

	// ############################################################
	// Deslocamento
	// ############################################################
	public Point getDirection() { 
		// O robot est� sempre virado para o heroi
		Point dif = Point.subtract(hero.getPosition(), getPosition() );
		
		// Como o robot n�o anda na diagonal, colocar o menor dos valores de (x, y) a ZERO e o outro a UM
		// Seguimos na direc��o de menor valor
		if(dif.x == 0) 
			dif.y = Math.signum(dif.y);
		else 
			if(dif.y == 0) 
				dif.x = Math.signum(dif.x);
		else 
			if(Math.abs(dif.x) < Math.abs(dif.y)) {
				dif.x = Math.signum(dif.x); 
				dif.y = 0;
			} else {
				dif.x = 0;
				dif.y = Math.signum(dif.y);
			}
		
		return dif;
	}
	
}
