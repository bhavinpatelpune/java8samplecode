package com.Java8SEII.OCP.Samples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList (1, 2, 3); 
			values.stream ()
				  .map(n -> n*2) //line n1
				  .peek(System.out::println) //line n2
				  .count(); 			// OP: 246
			
		System.out.println("---------------------------");
		
		List<String> valList = Arrays.asList("","George","","John","Jim");
		Long newVal = valList.stream()
							 .filter(x -> !x.isEmpty())
						     .count();
		System.out.println(newVal);  //OP: 3
		
		System.out.println("---------------------------");
		
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom"); 
		System.out.println(
				listVal.stream().filter(x -> x.length()>3).count()
				);  // OP: 2
		
		System.out.println("---------------------------");
		
		List<Book>books = Arrays.asList(new Book ("Beginning with Java", 2), 
										new Book ("A Guide to Java Tour", 3));
		Collections.sort(books, new Book()); 
		System.out.println(books); // OP: [A Guide to Java Tour:3.0, Beginning with Java:2.0]
		
		System.out.println("---------------------------");
		
		//Question: 19 (Dump)
		List<Vehicle> vehicles = Arrays.asList(new Vehicle(2,"Car"),
											   new Vehicle(3,"Bike"),
											   new Vehicle(1,"Truck"));
		vehicles.stream()
				.sorted(Comparator.comparing((Vehicle v) -> v.getVid()))
				.forEach(System.out::println);  //OP: TruckCarBike
		
		vehicles.stream()
				.sorted((v1,v2)-> Integer.compare(v1.getVid(), v2.getVid()))
				.forEach(System.out::println);  //OP: TruckCarBike
		
		vehicles.stream()
		.sorted(Comparator.comparing(Vehicle::getVName).reversed().thenComparing(Vehicle::getVName))
		.forEach(System.out::println);  //OP: TruckCarBike
		
		System.out.println("---------------------------");
		
		List<Student> stds = Arrays.asList(
				new Student("Jessy","Java ME","Chicago"),
				new Student("Helen","Java EE","Houston"),
				new Student("Mark","Java ME","Chicago")
				);
		
//stds.stream().collect(Collectors.groupingBy(Student::getCourse))
//	  .forEach(src, res) -> System.out.println(scr); //Syntax error on token "->", invalid AssignmentOperator
		
		System.out.println("---------------------------");
		
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> { 
			System.out.println("Searching...");
			return n.contains("red");
		};
		colors.stream().filter(c -> c.length() > 3)
					   .allMatch(test);  // OP: Searching...
		
		System.out.println("---------------------------");
		
		List<String> nL = Arrays.asList("Jim", "John", "Jeff"); 
		Function<String, String> funVal = s -> "Hello : ".concat(s); 
		nL.stream()
	      .map(funVal)
	      .peek(System.out::print);  //OP: The program prints nothing.
		
		System.out.println("---------------------------");
		
		UnaryOperator<Integer> uo1 = s -> s*2; //line n1
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0); 
			loanValues.stream()
					  .filter(lv -> lv >= 1500)
		//			  .map(lv -> uo1.apply(lv))  // //line n2 - compilation error occurs at line n2.
					  .forEach(s -> System.out.println(s + ""));  //OP: 2000.0
			//OP: The method apply(Integer) in the type Function<Integer,Integer> is not applicable for the arguments (Double)
		
		System.out.println("---------------------------");
			
		List<String> empDetails = Arrays.asList("100, Robin, HR", 
												"200, Mary, AdminServices",
												"101, Peter, HR");
			empDetails.stream()
			.filter(s-> s.contains("1"))
			.sorted()
			.forEach(System.out::println); //OP:  100, Robin, HR
   										   //     101, Peter, HR
			
		System.out.println("---------------------------");
		
		List<Person> emps = new ArrayList<>();
		emps.add(new Person("Patel"));
		emps.add(new Person("Bhavin"));
		Collections.sort(emps); //OP:  Bhavin Patel
		
		System.out.println("---------------------------");
		
		// Question: Dump has answer as A. [sales:Ada, hr:Bob, sales:Bob, hr:Eva] but output showing other answer below
		List<Employee> empList = Arrays.asList(
				new Employee("sales","Ada","Pat"),
				new Employee("sales","Bob","Pat"),
				new Employee("hr","Bob","Pat"),
				new Employee("hr","Eva","Pat"));
		
		Stream<Employee>  s = empList.stream()
									 .sorted(Comparator.comparing((Employee e) -> e.getDept())
											 	       .thenComparing((Employee e) -> e.getName()));
		List<Employee> eSorted = s.collect(Collectors.toList());
		System.out.println(eSorted); // [hr : Bob, hr : Eva, sales : Ada, sales : Bob]
		
		System.out.println("---------------------------");
		
		List<Integer> myNumbs = Arrays.asList(1,2,3,4,5);
		myNumbs.stream()
				.filter(n -> n%2 == 0)
				.forEach(shh -> System.out.println(" "+shh));  // 2 4
		
		System.out.println("---------------------------");
		
		List<String> li = Arrays.asList("Java","J2EE","J2ME","JSP","Oracle","JSTL");
		Predicate<String> val = p -> p.contains("J");
		
		List<String> newLi = li.stream().filter(x->x.length()>3)
									    .filter(val)
									    .collect(Collectors.toList());
		System.out.println(newLi);  // [Java, J2EE, J2ME, JSTL]
		
		System.out.println("---------------------------");
		
		List<String> myli = Arrays.asList("EE","SE");
		String ans = myli.parallelStream().reduce("Java ", (a,b)-> a.concat(b));
		System.out.println(ans);  // Java EE Java SE
		
		System.out.println("---------------------------");
		
		List<Country> couList = Arrays.asList (
				new Country ("Japan", Country.Continent.ASIA),
				new Country ("Italy", Country.Continent.EUROPE),
				new Country ("Germany", Country.Continent.EUROPE));
		
		Map<Country.Continent, List<String>> regionNames = 
				couList.stream()
					   .collect(Collectors.groupingBy(Country::getRegion,
							   	Collectors.mapping(Country::getName, 
							   	Collectors.toList())));
		System.out.println(regionNames);  //{ASIA=[Japan], EUROPE=[Italy, Germany]}
		
		System.out.println("---------------------------");
		
		List<String> words = Arrays.asList("win","try","best","luck","do");
		Predicate<String> test11 = w -> {
			System.out.println("Checking...");
			return w.equals("do");
		};
		//Predicate test22 = (String w) -> w.length() > 3;  ///Lambda expression's parameter w is expected to be of type Object
		//words.stream().filter(test22).filter(test11).count();
		
		System.out.println("---------------------------");
		
		List<Integer> nums = Arrays.asList (10, 20, 8); 
		System.out.println(nums.stream().max(Comparator.comparing(a -> a)).get()); // 20
		
		System.out.println("---------------------------");
		
		List<String> words1 = Arrays.asList("Why ","What ","When ");
		BinaryOperator<String> operator = (s1,s2) -> s1.concat(s2);
		String sen = words1.stream().reduce("Word : " + operator, operator);
		System.out.println(sen);  // Why What When
		
		System.out.println("---------------------------");
		
		List<Product> ll = Arrays.asList(new Product("TV", 1000), new Product("Fridge",2000));
		Consumer<Product> raise = e-> e.setPrice(e.getPrice() + 100);
		ll.forEach(raise);
		ll.stream().forEach(Product::printVal); // TV Price : 1100 	Fridge Price : 2100
		
		System.out.println("---------------------------");
		
		List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen"); 
		Predicate<String> test1 = ss -> {
						int i = 0;
						boolean result = ss.contains ("pen");
						System.out.print(i++ + ":"); 
						return result;
					};
			str.stream()
				.filter(test1)
				.findFirst()
				.ifPresent(System.out ::println);  // 0:0:pen
			
		System.out.println("---------------------------");
		
		
		List<Integer> mylist = Arrays.asList (10,20,30);
		Function<Integer, Integer> fn = f1 -> f1 + f1;
		Consumer<Integer> conVal = sss-> System.out.println("Val: " + sss + " ");
		mylist.stream().map(fn).forEach(conVal); //	Val: 20 		Val: 40 		Val: 60 
		
		System.out.println("---------------------------");
		
		List<Employee> emp = Arrays.asList (new Employee("sales","Ada","Patel"),
										new Employee("sales","Bob","ZZZ"),
										new Employee("hr","Bob","AAA"),
										new Employee("hr","Eva","BBB")); 
		emp.stream()
				.sorted(Comparator.comparing(Employee::getLName).reversed().thenComparing(Employee::getLName))
				.collect(Collectors.toList());
		System.out.println(emp); // [sales:Ada, sales:Bob, hr:Bob, hr:Eva]
		
		
		System.out.println("---------------------------");
		
//		Set<Car> cars = new TreeSet<>(); 
//		cars.add(new Car(10123, "Ford"));
//		cars.add(new Car(10124, "BMW"));
//		System.out.println(cars); 
		// Exception in thread "main" java.lang.ClassCastException: com.Java8SEII.OCP.Samples.Car cannot be cast to java.lang.Comparable
		
		
		System.out.println("---------------------------");
		
		List<String> cs = Arrays.asList("Java","Java EE","Java ME");
		boolean b1 = cs.stream().findFirst().get().equals("Java");
		boolean b2 = cs.stream().anyMatch(w -> w.equals ("Java"));
		boolean b3 = cs.stream().findAny().get().equals("Java");
		boolean b4 = cs.stream().allMatch(w -> w.equals("Java"));
		System.out.println(b1); //true
		System.out.println(b2); //true
		System.out.println(b3); //true
		System.out.println(b4); //false
		
		System.out.println("---------------------------");
		
		List<Blocks> block = new ArrayList<>();
		block.add(new Blocks(10,"Green"));
		block.add(new Blocks(7,"Red"));
		block.add(new Blocks(12,"Blue"));
		Collections.sort(block, new ColorSorter());
		System.out.println(block);
	}
}
