package futbol;

public class Portero extends Futbolista {

	public short golesRecibidos;
	public byte dorsal;
	
	
	
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+dorsal
				+ ". Le han han marcado "+ golesRecibidos;
	}
	
	public int compareTo(Portero o) {
		return Math.abs(this.golesRecibidos -o.getGolesRecibidos());
	}


	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

}
