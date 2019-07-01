package banque;

public class Compte {
	protected int solde = 0;
	
	public static void main (String args[])
	{
		Compte c1 = new Compte();
		c1.deposer(150);
		System.out.println("compte 1 (dépot): "+c1);
		c1.retirer(10);
		System.out.println("compte 1 (retrait 10): "+c1);
		
		Compte c2 = new Compte();
		
		c1.virer(20, c2);
		System.out.println("compte 1 (virement): "+c1);
		System.out.println("compte 2 (virement): "+c2);
	}
	
	
	public void deposer(int somme)
	{
		this.solde+=somme;
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
	
	@Override
	public String toString()
	{
		return "Solde: "+solde;
	}
	
	public int getSolde()
	{
		return this.solde;
	}
}	
