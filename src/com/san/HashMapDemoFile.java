package com.san;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapDemoFile {

	public static void main(String[] args) {
		
		 try {
			Stream<String> lines = Files.lines(
			            Paths.get("D:\\angularTraining\\Angular_Rest_API_Demo\\CodeTest\\src\\in.txt")).skip(1);
			long lineCount = Files.lines(Paths.get("D:\\angularTraining\\Angular_Rest_API_Demo\\CodeTest\\src\\in.txt")).skip(1).count();
			System.out.println(lineCount);
			Employee[] employees = new Employee[(int) lineCount];
			String[] stringArray = lines.toArray(String[]::new);
			//System.out.println(Arrays.toString(stringArray));
			for (int i=0;i<lineCount;i++){
				employees[i]=new Employee();
				String[] empArr= stringArray[i].split(",");
					for (int j=0;j<empArr.length;j++){
					employees[i].setId(Integer.parseInt(empArr[j].split(" ")[0]));
					employees[i].setName((empArr[j].split(" ")[1]));
					employees[i].setDepartment((empArr[j].split(" ")[2]));
					employees[i].setSalary(Double.parseDouble((empArr[j].split(" ")[3])));
					}
			}
			
			Stream.of(employees).forEach(s->System.out.println(s)); //Java 8
			//Normal way
			for(Employee e : employees) {
				System.out.println(e.getId()+" "+e.getDepartment()+" "+e.getName()+" "+e.getSalary());
			}
			
			Map<String, Employee> topEmployees =
				    			Stream.of(employees)
				                .collect(Collectors.groupingBy( e -> e.department,
				                 Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(e -> e.salary)), Optional::get) 
				                ));
			System.out.println(topEmployees);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
