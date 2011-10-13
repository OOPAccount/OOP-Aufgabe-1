public class LVAException extends Exception
{
	/**
	* Erzeugt eine leere LVAException. 	
	*/
	
	public LVAException()
	{
		super();
	}
	
	/**
	* Erzeugt eine LVAException mit der entsprechenden Fehlerbeschreibung.
	*/
	
	public LVAException(String message)
	{
		super(message);
	}
}
