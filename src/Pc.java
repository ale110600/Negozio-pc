import java.io.Serializable;

public class Pc implements Serializable
{
	private int identificativo;
	private String nome;
	private int quantitąDisponibile;
	
	//metodi costruttore
	
	public Pc(int identificativo, String nome,int quantitąDisponibile)
	{
		setIdentificativo(identificativo);
		setNome(nome);
		setQuantitąDisponibile(quantitąDisponibile);
	}
	
	public Pc(Pc p)
	{
		setIdentificativo(p.getIdentificativo());
		setNome(p.getNome());
		setQuantitąDisponibile(p.getQuantitąDisponibile());
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
	public int getQuantitąDisponibile() 
	{
		return quantitąDisponibile;
	}
	public void setQuantitąDisponibile(int quantitąDisponibile) 
	{
		this.quantitąDisponibile = quantitąDisponibile;
	}
	
	//altri metodi
	
	public String toString()
	{
		return(getIdentificativo()+" "+getNome()+" "+getQuantitąDisponibile());
	}
	
	
}
