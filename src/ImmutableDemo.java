import java.util.HashMap;
import java.util.Map;

final class Student {
	private final String name;
	private final Map<Integer, String> map;

	public Student(String name, Map<Integer, String> map) {
		this.name = name;

		Map<Integer, String> tempMap = new HashMap<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.map = tempMap;
	}

	public String getName() {
		return name;
	}

	public Map<Integer, String> getMap() {
		Map<Integer, String> tempMap = new HashMap<>();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
}

public class ImmutableDemo {

	public static void main(String[] args) {

		Map<Integer, String> value = new HashMap<>();
		value.put(1, "Rohit");
		value.put(2, "Rathour");
		Student st = new Student("Rohit", value);
		System.out.println(st.getName());
		System.out.println(st.getMap());
		// st.name = "Rathour"; // Will give error
	}

}
