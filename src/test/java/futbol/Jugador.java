package futbol;

import java.lang.Math;
import java.util.Objects;

public class Jugador extends Futbolista {

	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(dorsal, golesMarcados);
	}

	@Override
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+dorsal
				+ ". Ha marcado "+ golesMarcados;
	}

	
	public int compareTo(Futbolista o) {
		return Math.abs(this.getEdad()-o.getEdad());
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

}
