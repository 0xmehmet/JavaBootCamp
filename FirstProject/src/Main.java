
public class Main {
          // bu şekil olursa yorum satırıdır
	public static void main(String[] args) {
		
		System.out.println("hello world!");
		
		// string metinsel ifade tutacağını belirtiyor
		// ";" bununla bitirmek zorundayız
		// değişken isimleri camelCase şeklinde yazılır
		
		String ortaMetin ="ilginizi çekebilir" ;
		String altMetin ="vade süresi";
		
		// System.out.println("ortaMetin"); 
		// parantez içerisini " " şeklinde yazarsak atama yapamış oluruz sadece " " içindeki metini yazdırmış oluruz.
		// atama yapmak istiyorsak "" bunu kullanmadan yapmamız gerekiyor.
		
		System.out.println(ortaMetin);
		//yukarıdaki gibi yapılırsa atama yapılmış olur.
		
		//tam sayı durumlarında mesela 10 12 gibi durumlarda "int" komutunu kullanıyoruz
		
		int vade = 12;
		
		//ondalıklı sayıları "double" ile tutarız 10.3 12.45 gibi
		
		double dolarDun = 18.10;
		double dolarBugun = 18.10;
		
		boolean dolarDegeri = true;
		
		String okYonu ="";// "" bu şekil olursa boş olur
		
		if (dolarBugun<dolarDun) {//true
			
			okYonu="down.svg";
			System.out.println(okYonu);
			
			
		}else if(dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
			//else if lerde sınır yok istediğimiz kadar yazabiliriz
		} 
		
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
			
			//array listelemek için kullanılır
			String[] krediler = {"hızlı kredi","mutlu emekli","çokommelli kredi"};
			//System.out.println(krediler[0]);
			//System.out.println(krediler[1]);
			//System.out.println(krediler[2]); //böyle tek tek yazmak vakit kaybıdır bunun yerine döngüleri kullancağız
			        //⬇️ ok ile gösterilen yer bize 0 dan başla diyor "System.out.println(krediler[0]);" burada 0 dan başladığı gibi
			for (int i = 0; i < krediler.length; i++) {
				System.out.println(krediler[i]);
			}
			

		}
		
	}

}
