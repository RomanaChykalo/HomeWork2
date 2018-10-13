package taskLesson;

import java.util.Arrays;

public enum ProductCategory {
	MOBILEPHONE(1, "phone"), LAPTOP(2, "lad"), TELEVISION(3, "tv"), ROBOT(4, "robot"), SMART_WATCHES(5, "watch");

	private final int number;
	private final String shortName;

	ProductCategory(int number, String shortName) {
		this.number = number;
		this.shortName = shortName;
	}

	public static ProductCategory getCategory(int number) {
		final ProductCategory[] values = values();
		for (ProductCategory category : values) {
			if (category.number == number) {
				return category;
			}
		}

		throw new CategoryNotFoundException("Category with id " + number + " not found");

	}

	public static ProductCategory get(String name) {
		return Arrays.stream(values()).filter(category -> category.shortName.equals(name)).findFirst()
				.orElseThrow(() -> new CategoryNotFoundException("Category with shortName " + name + " not found"));
	}
}
