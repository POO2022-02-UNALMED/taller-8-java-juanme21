package futbol;

public abstract class Futbolista implements Comparable<Object> {

	private String nombre;
	private int edad;
	private	final String posicion;
	
	
	
	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public Futbolista() {
		this("Maradona", 30, "delantero");
	}

	public boolean equals(Futbolista f) {
		return this.equals((Object) f);
	}
	
	public abstract boolean jugarConLasManos();
	
	@Override
	public String toString() {
		return 	"El futbolista " + nombre + " tiene " + edad + ", y juega de "+ posicion;
	}

	public int compareTo(Object o) {
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	
}
