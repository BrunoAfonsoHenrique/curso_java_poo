package estudoherancapoo;

public class AnimalAlado extends Animal{
	
	private int voar;

	public int getVoar() {
		return voar;
	}

	public void setVoar(int voar) {
		this.voar = voar;
	}
	
	@Override
	public void fazerMovimento() {
		System.out.println("Animal alado pode voar ...");
	}
}
