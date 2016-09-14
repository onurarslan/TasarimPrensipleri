package _02.LiskovSubstitution_LiskovYerineGecme;

public class Test {

	public static void main(String[] args) {
		Bilgisayar pc1=new DizustuBilgisayar();
		maxRamYazdir(pc1);
		
		Bilgisayar pc2=new MasaustuBilgisayar();
		maxRamYazdir(pc2);
		
		/*Masaüstü bilgisayarda batarya pili olmadığı için aşağıda ki şekilde bir metot yazsaydık LSP uymayacaktı.
		 * Çünkü Bilgisayar abstract sınıfını extend olarak alan tüm sınıfların kullandığı metotlarda özel durum olmamalıdır.
		 * Masaüstü bilgisayarın pil sayısı için 0 döndürmek veya throw yollamak doğru değildir.
		 * Bu yüzden pil hücre sayısını bilgisayar sınıfından ayırdık.
		pilHucreSayisi(pc1);
		pilHucreSayisi(pc2);*/
	}

	public static void maxRamYazdir(Bilgisayar pc){
		System.out.println("MAX RAM Miktarı: " + pc.maxRam());
	}
	
	/*public static void pilHucreSayisi(Bilgisayar pc){
		System.out.println(pc.pilHucreSayisi());
	}*/
	
}