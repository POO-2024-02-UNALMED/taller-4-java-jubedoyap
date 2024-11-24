package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo) {//El constructor de enum debe ser privado por defecto
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
