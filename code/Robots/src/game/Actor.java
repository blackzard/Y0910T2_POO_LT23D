package game;

import common.Point;

public abstract class Actor {

	// Construtor
	public Actor(Point initialPosition, char symbol) {

		// Criar um NOVO ponto a partir do recebido como par�metro
		this.position = new Point(initialPosition);
		
		this.symbol = symbol;
	}

	// ############################################################
	// Posi��o do Actor no mundo
	// ############################################################
	private final Point position;
	public Point getPosition() { return position; }

	// ############################################################
	// Deslocamento
	// ############################################################
	public abstract Point getDirection();
	
	// ############################################################
	// Apresenta��o (aspecto gr�fico)
	// ############################################################
	private char symbol;
	public char toSymbol() { return symbol; }
	
	// ############################################################
	// Acesso a informa��o relativa aos limites do tabuleiro
	// ############################################################
	private BoundaryProvider boundaryProvider;
	public void setBoundaryProvider(BoundaryProvider bp) {
		this.boundaryProvider = bp;
	}
	
	// ############################################################
	// Actualiza��o 
	// ############################################################
	public void update() {

		Point direction = getDirection();
		if( direction.equals(Point.STOPED) )
			return;
		
		Point newPosition = new Point(getPosition());
		newPosition.translate(direction);
		
		// O actor apenas se move se for poss�vel
		// O boundaryProvider fornece essa funcionalidade
		if( boundaryProvider.isInside(newPosition) )
		{
			position.moveTo(newPosition);
			
			// verificar colis�o
			Game.getInstance().checkCollision(this);
		}

	}

	// ############################################################
	// Colis�o 
	// ############################################################
	public abstract void collide(Actor actor);


	// ############################################################
	// Tempo de vida
	// ############################################################
	private boolean isAlive = true;
	public boolean isAlive() { return isAlive; }
	
	public void die() {
		isAlive = false;
	}

}
