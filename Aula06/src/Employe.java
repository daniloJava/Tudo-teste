
class Employe {
	
	public String frase = "Employee";
	public int valor = 1;
	
	public Employe() {
		// TODO Auto-generated constructor stub
		this.frase = "construtor sem nada";
	
	}
	public Employe(int valor){
		this.valor = valor;
		
	}
	
	StringBuffer name = new StringBuffer("Employee");
	void printName() {
	System.out.println(name);
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String getFrase() {
		return frase;
	}
	
	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public void reachOffice() {
		System.out.println("reached office Employee");
		}
}
