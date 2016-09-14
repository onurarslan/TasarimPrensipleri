package _02.LiskovSubstitution_LiskovYerineGecme;

public class MasaustuBilgisayar extends Bilgisayar {

	/* Bilgisayar sınıfında abstrack metot kalsaydı override edecektik.
	 * Fakat masaüstü bilgisayarda pilhücresi olmadığı için Liskov prensibine uymuyor
	@Override
	public int pilHucreSayisi() {
		return 6;
	}*/

	@Override
	public int maxRam() {
		return 32;
	}

}
