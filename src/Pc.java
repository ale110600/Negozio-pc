import java.io.Serializable;

public class Pc implements Serializable
{
	private int identificativo;
	private String nome;
	private int quantit‡Disponibile;
	
	//metodi costruttore
	
	public Pc(int identificativo, String nome,int quantit‡Disponibile)
	{
		setIdentificativo(identificativo);
		setNome(nome);
		setQuantit‡Disponibile(quantit‡Disponibile);
	}
	
	public Pc(Pc p)
	{
		setIdentificativo(p.getIdentificativo());
		setNome(p.getNome());
		setQuantit‡Disponibile(p.getQuantit‡Disponibile());
	}
	
	//metodi getter e setter
	
	public int getIdentificativo() 
	{
		return identificativo;
	}
	public void setIdentificativo(int identificativo) 
	{
		this.identificativo = identificativo;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public int getQuantit‡Disponibile() 
	{
		return quantit‡Disponibile;
	}
	public void setQuantit‡Disponibile(int quantit‡Disponibile) 
	{
		this.quantit‡Disponibile = quantit‡Disponibile;
	}
	
	//altri metodi
	
	public String toString()
	{
		return(getIdentificativo()+" "+getNome()+" "+getQuantit‡Disponibile());
	}
	
	
}
