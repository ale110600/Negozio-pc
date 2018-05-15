import java.io.Serializable;

/**
 * Istanzia il nodo di una lista,implementa la serializzazione 
 * @author Alessio Broghetti
 */
public class Nodo implements Serializable
{
	private Pc info;
	private Nodo link;
	
	/**
	*Il costruttore riceve come parametro un oggetto di tipo Atterraggio e assegna al proprio
	*attributo info una copia di questo atterraggio
	* L attributo link viene posto a null.
	* @param atterraggio è il volo da aggiungere
	*/
	public Nodo(Pc Pc) 
	{
		setInfo(Pc);
		link=null;
	}
	
	/**
	 * Metodo getter che restituisce la componente informativa di un nodo
	 * @return la componente informativa di un nodo
	 */
	public Pc getInfo() 
	{
		return info;
	}
	
	/**
	 * Metodo setter che consente di impostare la componente informativa di un nodo
	 * @param info componente informativa di un nodo
	 */
	public void setInfo(Pc info) 
	{
		this.info = info;
	}
	
	/**
	 * Metodo getter che restituisce il link di un nodo
	 * @return il link di un nodo
	 */
	public Nodo getLink() 
	{
		return link;
	}
	
	/**
	 *  Metodo setter che consente di impostare il link di un nodo 
	 * @param link link di un nodo
	 */
	public void setLink(Nodo link)
	{
		this.link = link;
	}
}
