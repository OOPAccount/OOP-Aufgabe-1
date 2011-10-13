import java.util.Scanner;


class Test {

public static void main( String [] args ) {
	
	//neue Studenten anlegen
	Student nummer1 = new Student("Manuel Klimek", "1029112");
	Student nummer2 = new Student("Andreas Seiwaldstaetter", "1025541");
	
	System.out.println(nummer1.getStudent());
	
	//Studienangebot (Liste aller LVAs)
	Studienangebot LVAs = new Studienangebot();
	
	//neue LVA anlegen
	LVA oop = new LVA("Objektorientierte Programmiertechniken", "185.A01");
	
	//dem Studienangebot hinzufügen
	LVAs.add(oop);
	
	//LVA-Nr muss eindeutig sein. Erfuellt?
	LVA fail = new LVA("Unerlaubte LVA", "185.A01");
	
	//Anmelden
	oop.signIn(nummer1);
	oop.signIn(nummer2);
	
	//Student darf bei einer LVA nur 1 mal angemeldet sein
	oop.signIn(nummer1);
	
	//Teilnehmer ausgeben
	oop.getStudents();
	
	//Studienangebot ausgeben
	LVAs.getLVAs(); 
	
}

}
