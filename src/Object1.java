/**
 * @author: Veysel Dogan
 * Date: 15-Aug-2018 
 * Console Application: Object
 * Main Class
 */
public class Object1 {

	public static void main(String[] args) {

		Ev evNesnesi = new Ev();
		Ev evNesnesi2 = evNesnesi;
		
		System.out.println("evNesnesi ve deÛerleri");
		evNesnesi.en = 1453;
		evNesnesi.boy = 1299;
		evNesnesi.yukseklik = 1517;

		System.out.println("EN        : " + evNesnesi.en);
		System.out.println("BOY       : " + evNesnesi.boy);
		System.out.println("YüKSEKLiK : " + evNesnesi.yukseklik);

		double hacim = evNesnesi.en * evNesnesi.boy * evNesnesi.yukseklik;
		System.out.println("EViN HACMİ : " + hacim);
		
		
		
		System.out.println("-------------");
		System.out.println("evNesnesi2 ve deÛerleri");
		
		System.out.println("EN2        : " + evNesnesi2.en);
		System.out.println("BOY2       : " + evNesnesi2.boy);
		System.out.println("YÜKSEKLİK2 : " + evNesnesi2.yukseklik);

		hacim = evNesnesi2.en * evNesnesi2.boy * evNesnesi2.yukseklik;
		System.out.println("EVİN HACMİ2 : " + hacim);

		

		System.out.println("-------------");
		System.out.println("evNesnesi2'sinin yeni deÛerleri");
		
		evNesnesi2.en = 5;
		evNesnesi2.boy = 7;
		evNesnesi2.yukseklik = 1;

		System.out.println("EN2        : " + evNesnesi2.en);
		System.out.println("BOY2       : " + evNesnesi2.boy);
		System.out.println("YÜKSEKLİK2 : " + evNesnesi2.yukseklik);

	    hacim = evNesnesi2.en * evNesnesi2.boy * evNesnesi2.yukseklik;
		System.out.println("EVİN HACMİ2 : " + hacim);
		
		
		
		System.out.println("-------------");
		System.out.println("evNesnesi'sinin deÛerleri");
		
		System.out.println("EN        : " + evNesnesi.en);
		System.out.println("BOY       : " + evNesnesi.boy);
		System.out.println("YÜKSEKLİK : " + evNesnesi.yukseklik);

	    hacim = evNesnesi.en * evNesnesi.boy * evNesnesi.yukseklik;
		System.out.println("EVİN HACMİ : " + hacim);
		
		
	}

}
