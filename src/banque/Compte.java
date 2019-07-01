package banque;

public class Compte {
	private int solde;
	
	public void main()
	{
		
	}
	
	public void deposer(int somme)
	{
		this.solde+= somme;
	}
	
	public void retirer(int somme)
	{
		this.solde-=somme;
	}
	
	public int virer(int somme, Compte compteDestination)
	{
		this.solde-= somme;
		compteDestination.solde+= somme;
		
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
