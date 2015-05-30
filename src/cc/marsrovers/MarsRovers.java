package cc.marsrovers;

public class MarsRovers {

	private String position;
	private int posicaoDeX;
	private int posicaoDeY;

	public String getPosition() {
		return this.position;
	}

	public void setPosition(int posicaoDeX, int posicaoDeY) {
		this.posicaoDeX = posicaoDeX;
		this.posicaoDeY = posicaoDeY;
	}

	public int getPosicaoDeX() {
		return this.posicaoDeX;
	}

	public int getPosicaoDeY() {
		return this.posicaoDeY;
	}

	public void move(String comando) {
		if (comando.equals("R")){
			this.posicaoDeX++;
		}else if (comando.equals("L")){
			this.posicaoDeX--;
		}
		
	}

}
