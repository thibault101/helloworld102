package banque;

public class LivretA extends Compte
{
	
	public static void main(String args[])
	{
		LivretA la1 = new LivretA();
		la1.deposer(2000);
		System.out.println("compte : "+la1);
		LivretA la2 = new LivretA();
		la1.virer(1000, la2);
		System.out.println("compte : "+la2);
	}
	
	
	@Override
	public int retirer(int somme)
	{
		if(this.getSolde()-somme < 0)
			throw new IllegalArgumentException("Solde insuffisant");
		return this.solde -= somme;
	}
	
	@Override
	public int virer(int somme, Compte compteDestination)
	{
		this.retirer(somme);
		compteDestination.deposer(somme);
		
		return somme;
	}
}
