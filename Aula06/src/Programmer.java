class Programmer extends Employe {
	public void startProjectWork() {
		defineClasses();
		unitTestCode();
	}
	private void defineClasses() { System.out.println(" startProjectWork Programer define classes"); }
	private void unitTestCode() { System.out.println(" startProjectWork Programmert unit test code"); }
	StringBuffer name = new StringBuffer("Programmer");
	void printName() {
		
		System.out.println(name);
		
	
	}

}