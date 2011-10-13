import java.util.ArrayList;

public class Studienangebot
{
	ArrayList<LVA> LVAListe = new ArrayList<LVA>();

	public Studienangebot()
	{
	}

	public void addLVA(LVA LVAName) throws LVAException
	{
		for(LVA Name: LVAListe)
		{
			if(Name.getLVANr().compareTo(LVAName.getLVANr()) == 0) throw new LVAException();
		}
		LVAListe.add(LVAName);
	}
	
	public String getLVAs()
	{
		for(LVA Ausgabe: LVAListe)
		{
			System.out.println(Ausgabe.toString());
		}
	}
}
