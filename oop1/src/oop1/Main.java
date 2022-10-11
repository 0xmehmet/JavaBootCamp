package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "vade oranı";

		// class ı aşağıdaki gibi tanımlayacapız

		Product product1 = new Product();
		product1.setName("Delonghi Kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		// set value
		/*
		 * product1.name = "Delonghi Kahve Makinesi"; product1.unitPrice = 7500;
		 * product1.discount = 7; product1.unitsInStock = 3; product1.imageUrl =
		 * "bilmemne.jpg";
		 */

		// get okumak deniliyor
		// System.out.println(product1.name);
		Product product2 = new Product();
		product2.setName("Semi Kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");

		Product product3 = new Product();
		product3.setName("K Kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");

		Product[] products = { product1, product2, product3 };
		// takma isim alttaki
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");

		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer =new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("4564");
		individualCustomer.setFirstName("mehmet");
		individualCustomer.setLastName("kara");
		
		CorporateCustomer corporateCustomer =new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("021561651");
		corporateCustomer.setTaxNumber("54656");
		corporateCustomer.setCustomerNumber("65654");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
