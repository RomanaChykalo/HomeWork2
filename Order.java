package taskLesson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order extends AbstractEntity {

	private List<Product> products = new ArrayList<>();

	public Order(List<Product> products) {
		this.products = products;
	}

	public void addProductToOrder(Product product) {
		products.add(product);
	}

	public String orderCapasity() {
		return "Amount of products in the list: " + products.size();
	}

	public void forbidAddProduct(BigDecimal price) {
		if (products.size() > 100) {
			System.out.println("You can't add more items");
		}
	}

	public Product removeFirstProduct() {
		return products.remove(0);
	}

	public void showOrder(List<Product> products) {
		for (Product e : products) {
			System.out.println(e);
		}
	}

	public BigDecimal getPCalculation() {
		BigDecimal sum = BigDecimal.ZERO;
		for (Product product : products) {
			sum = sum.add(product.getPrice());
		}
		return sum;
	}
}
