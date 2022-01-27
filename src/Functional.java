import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Functional {


	public static void main(String... args) {
        
		//   Map and Flat Map
		  
//		  List<Integer> list = Arrays.asList(1,5,9,4,25,2,6,5,8);
//		  System.out.println(list);
//		  
//		  List<Integer> li = list.stream().map(e->e).collect(Collectors.toList());
//		  System.out.println("map  "+li);
//		  
//		  List li2 =
//		  list.stream().map(e->Arrays.asList(e,e+1)).collect(Collectors.toList());
//		  System.out.println("Map 2 "+li2);
//		  
//		  List<Integer> lis3 =
//		  list.stream().flatMap(x -> Stream.of(x,x+1)).collect(Collectors.toList());
//		  System.out.println("flatMap  "+lis3);
//		 
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		/* Peek method
		 * 
		 * 
		 * List<String> stringList = Arrays.asList("A8", "B2", "C1", "A8", "B3", "A3",
		 * "C4", "A1", "D5", "E6", "C8");
		 * 
		 * List<String> str = stringList.stream().filter(e ->
		 * e.startsWith("A")).peek(System.out::println).sorted()
		 * .peek(System.out::print).distinct().skip(1).collect(Collectors.toList());
		 * System.out.println(
		 * "----------------------------------------------------------------");
		 * List<String> list = Arrays.asList("A08", "B02", "C01", "A01", "B03", "A03",
		 * "C04", "A01", "D05", "E06", "C08"); str.forEach(System.out::println);
		 */
		
////////////////////////////Reduce////////////////////////////////////////////////////////////////////////////
		
		  List<Integer> elements = Arrays.asList(1,2,2,4,5);
		  Optional<Integer> i = elements.stream().reduce((x,y)->x+y);
		  System.out.println("Using reduce method "+i.get());
		  
		  elements.stream().forEach(System.out::println);
		  
////////////////////////////////////////////////////////////////////////////////////////////////////
		  
			/* Combining key value elements and converting to List type data using parallel streams */
		  
		  
		  Map<String,String> data = new HashMap<>();
			data.put("rohit","singh");
			data.put("mohit","eqngh");
			data.put("sohit","qwingh");
			data.put("tohit","tingh");
			data.put("uohit","yingh");
			
			List<String> finalData=data.entrySet().parallelStream().map(e->e.getKey()+" "+e.getValue()).collect(Collectors.toList());
			finalData.forEach(System.out::println);
/////////////////////////////////////////////////////////////////////////////////////////////////		

	}
}
