package website;

public class Test {
	
	@FunctionalInterface
	interface Converter<F, T> {
	    T convert(F from);
	}
	
	public static void main(String[] args) {
//		Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Converter<String, Integer> converter = Integer::valueOf;
		Integer converted = converter.convert("123");
		System.out.println(converted);    // 123
	}

}
