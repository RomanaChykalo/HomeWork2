package taskLesson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product extends AbstractEntity {

	private String name;
	private BigDecimal price;
	private Country country;
	private List<ProductCategory> categories = new ArrayList<>();

	public Product(String name, BigDecimal price, Country country, List<ProductCategory> categories) {
		this.name = name;
		this.price = price;
		this.country = country;
		this.categories.addAll(categories);
	}

	public String toString() {
		return "Product " + name + ", from " + country + ", costs " + price;
	}

	public void removeCategory(ProductCategory category) {
		if (categories.size() > 1) {
			categories.remove(category);
		}

	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Country getCountry() {
		return country;
	}

	public List<ProductCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<ProductCategory> categories) {
		this.categories = categories;
	}

}
