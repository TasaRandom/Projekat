
public class Main {

	public static void main(String[] args) {
		
		Biblioteka lib = new Biblioteka();
		
		Book b1=new Book("4321","Knjiga",1950, "DanteAligijeri", 1499.99);
		Book b2=new Book("1234","BozanstvenaKomedija",1950, "DanteAligijeri", 1499.99);
		
		lib.AddBook(b2);
		lib.AddBook(b1);
		
		System.out.print("Sve knjige:\n");
		lib.PrikaziKnjige();
		
		lib.RemoveBook("1234");
		
		
		System.out.print("Sve knjige:\n");
		lib.PrikaziKnjige();
		
	}

}
