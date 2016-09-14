package _02.LiskovSubstitution_LiskovYerineGecme;

public class DizustuBilgisayar extends Bilgisayar{

	//Bilgisayar sınıfında abstrack metot kalsaydı override edecektik.
	//Ama sadece Dizüstüne ait özellik olduğu için sadece buraya ekledik.
	// return 0 yada throw yollayabilirdik fakat metota özel durum LSP ye göre oluşturamayız.
	//@Override
	public int pilHucreSayisi() {
		return 6;
	}

	@Override
	public int maxRam() {
		return 16;
	}
	
}
