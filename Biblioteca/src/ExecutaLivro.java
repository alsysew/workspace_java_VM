
public class ExecutaLivro {
	public static void main(String args[]) {
		Livro l1, l2, l3;
		
		l1 = new Livro("1808", "Laurentino Gomes", 2005, "Hit�ria", 1, 1, true);
		l2 = new Livro("As cronicas de Narnia", "C. S. Lewiss", 2002, "Aventura, Fic��o", 1, 2, false);
		l3 = new Livro("Eragon", "Laurentino Gomes", 2003, "Aventura, Fic��o", 2, 3, true);
		
		l1.imprimir();
		l2.imprimir();
		l3.imprimir();
		
	}

}
