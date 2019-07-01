package banque;

public class Compte {
	private int solde = 0;
	
	
	public void deposer(int somme)
	{
		this.solde+=solde;
	}
	
	public int retirer(int somme)
	{
		 return this.solde-=somme;
	}
	
	public int virer(int somme, Compte compteDestination)
	{
		this.retirer(somme);
		compteDestination.deposer(somme);
		
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
