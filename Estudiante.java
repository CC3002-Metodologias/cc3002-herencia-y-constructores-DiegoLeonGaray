package Aux1;

public class Estudiante extends Persona{
	
	public Estudiante(String n, int e){
		super(n,e);
		this.ocupacion="estudiante";
	}
	
	public void comer() {
        System.out.println("Rico completito gorbea");
	}
	
	public void dormir() {
        System.out.println("zzzzzz horas");
    }
	
	
	public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "Veo anime y Netflix";
    }
}
