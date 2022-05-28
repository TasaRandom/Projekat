import java.util.ArrayList;
import java.util.List;

public class Biblioteka {

	public List<Book> library = new ArrayList<Book>();
	
	public void AddBook(Book b) {
		library.add(b);
	}
	
	public void RemoveBook(String sifra) {
		
		for(int i = 0; i<library.size(); i++) {
			Book book = library.get(i);
			if(book.getSifra()==sifra) {
				library.remove(i);
				break;
			}
		}
		
	}
	
	public void PrikaziKnjige() {
		for(int i = 0; i<library.size(); i++) {
			Book book = library.get(i);
			System.out.print(book.getNaslov()+"\n");
		}
	}
	
	public Biblioteka() {
		
	}

}
