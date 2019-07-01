package banque;

public class Compte {
	private int solde = 0;
	
	public void main()
	{
		
	}
	
	public void deposer(int somme)
	{
		this.setSolde(this.getSolde()+somme);
	}
	
	public void retirer(int somme)
	{
		this.setSolde(this.getSolde()-somme);
	}
	
	public int virer(int somme, Compte compteDestination)
	{
		this.setSolde(this.getSolde()-somme);
		compteDestination.setSolde(compteDestination.getSolde()+somme);
		
		return somme;
	}
	
	public int getSolde()
	{
		return this.solde;
	}
	
	public void setSolde(int solde)
	{
		this.solde = solde;
	}
}	
