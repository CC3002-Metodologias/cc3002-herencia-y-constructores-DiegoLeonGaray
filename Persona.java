package Aux1;

public class Persona {
	protected String nombre;
	protected String ocupacion;
	protected int edad;
	
	public Persona(String n, int e) {
		this.nombre=n;
		this.edad=e;
	}
	
	public void comer() {
        System.out.println("Ñom Ñom comida casera");
	}
	public void dormir() {
        System.out.println("8 horas");
    }

    public String hacerLoSuyo() {
        return "Hago cuarentena";
    }

        
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
