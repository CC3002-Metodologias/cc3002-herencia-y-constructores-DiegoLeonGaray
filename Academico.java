package Aux1;

public class Academico extends Persona{
	String paper;
	
	public Academico(String n, String o, int e, String p) {
		super(n,e);
		this.paper=p;
		this.ocupacion="academico";
	}
	
	public void dormir() {
        System.out.println("zzzzzzz horas");
    }
	
	public String hacerLoSuyo() {
        return super.hacerLoSuyo() + "y aprendo Zoom";
    }

}
