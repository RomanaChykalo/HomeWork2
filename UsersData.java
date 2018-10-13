package taskLesson;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsersData {

	public static void data() {
		Name userName = new Name("Anrij", "Bogdanovuch", "Zhukovskuj");
		PhoneNumber userPhone = new PhoneNumber(999, 9972737, 2407599);
		LocalDate userBirthday = LocalDate.of(1992, 9, 14);
		String userEmail = "zvit@gmail.com";
		Location userLocation = new Location("Zhovkva", "Gajdara", "flat ¹1", Country.BRAZIL);
		BigDecimal productPrice = new BigDecimal(2500.02);
		List<ProductCategory> categories = new ArrayList<>(Arrays.asList(ProductCategory.MOBILEPHONE, ProductCategory.getCategory(5)));
		Product product = new Product("laptop", productPrice, Country.GREECE,categories);
		User andrij = new User(userName, userBirthday, userEmail, userPhone, userLocation);
		System.out.println(userName);
		System.out.println("Date of birthday: " + userBirthday);
		System.out.println("User email: " + userEmail);
		System.out.println(userPhone);
		System.out.println(userLocation);
		List<Product> products = new ArrayList<>();
		products.add(product); // add some product;
		Order ordering = new Order(products);
		System.out.println(ordering.orderCapasity());
	}

}
