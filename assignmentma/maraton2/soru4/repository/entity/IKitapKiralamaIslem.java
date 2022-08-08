package assignmentma.maraton2.soru4.repository.entity;

public interface IKitapKiralamaIslem {

	public void kiralamaYap(Kitap kitap, Musteri musteri);

	public boolean kitapAra(Kitap kitap);

	public boolean musteriAra(Musteri musteri);

	public void kiralananKitapListesi();

}
