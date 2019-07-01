package banque;

public class LivretA extends Compte
{
	@Override
	public int retirer(int somme)
	{
		if(this.getSolde()-somme > 0)
		{
			this.solde -= somme;
		}
		else
		{
			System.out.print("Vous n'avez pas assez d'argent pour faire un retrait");
		}
		return getSolde();
	}
	
	@Override
	public int virer(int somme, Compte compteDestination)
	{
		this.retirer(somme);
		compteDestination.deposer(somme);
		
		return somme;
	}
}
