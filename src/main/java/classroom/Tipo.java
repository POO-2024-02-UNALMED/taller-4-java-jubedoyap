package classroom;

public enum Tipo {
	DISCIPLINAR(10,"Disciplinar"),FUNDAMENTACION(20,"Fundamentación"),ELECTIVA(30,"Electiva"); //Faltaba el String para llamar al constructor
	
	private int codigo;
	private String nombre;
	private Tipo(int codigo,String nombre) {//El constructor de enum debe ser privado por defecto
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
