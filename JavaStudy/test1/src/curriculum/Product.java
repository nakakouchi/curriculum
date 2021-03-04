package curriculum;


import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Product {

	List<String> product1 = new LinkedList<String>();
	Map<String, Integer> product2 = new LinkedHashMap<String, Integer>();
	Map<String, Integer> product3 = new LinkedHashMap<String, Integer>();

	public Product() {
		product1.add("コーラ");
		product1.add("スポーツドリンク");
		product1.add("天然水");
		product1.add("ウーロン茶");

		product2.put(product1.get(0), 150);
		product2.put(product1.get(1), 140);
		product2.put(product1.get(2), 110);
		product2.put(product1.get(3), 120);

	}







}
