
class PolymorphismWithClasses {
	public static void main(String[] args) {
	String nome = "JAVA";
	String nome2= "JAVA";
	StringBuffer valor = new StringBuffer("JAVA");
	StringBuffer valor2 = new StringBuffer(nome);
	StringBuilder valor3 = new StringBuilder("JAVA");
	StringBuilder valor4 = new StringBuilder("JAVA");

	int dois = 2;
	System.out.println(nome == nome2);

	System.out.println(nome == nome2);

	System.out.println(valor == valor2);

	System.out.println(valor4.equals(valor3));
	

		
	}
}