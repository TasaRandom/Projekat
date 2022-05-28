
public class Book {
	private String sifra;
	private String naslov;
	private int godinaIzdanja;
	private String autor;
	private double cena;
	
	public Book() {
		this.sifra="";
		this.naslov="";
		this.godinaIzdanja=0;
		this.autor="";
		this.cena=0;
	}
	public Book(String s, String n, int gI, String a, double c) {
		this.sifra=s;
		this.naslov=n;
		this.godinaIzdanja=gI;
		this.autor=a;
		this.cena=c;
	}
	
	
	
	public String getSifra() {
		return this.sifra;
	}
	
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaslov() {
		return this.naslov;
	}
	
	public void setNaslov(String naslov) {
		this.naslov=naslov;
	}
	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}
	
	public void setGodinaIzdanja(int godina) {
		this.godinaIzdanja=godina;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return this.autor;
	}
	
	public double getCena() {
		return this.cena;
	}
	
	public void setCena(double cena) {
		this.cena=cena;
	}
	
}