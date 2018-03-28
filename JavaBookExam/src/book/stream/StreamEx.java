package book.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
	
	public static void main(String[] args) {
		
		String[] strArr = {"aaa","bbb","ccc","aaa"};
		List<String> strList = Arrays.asList(strArr);
		
//		System.out.println(strArr);
		System.out.println(strList);
		
		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);
		
//		System.out.println(strStream1);
//		System.out.println(strStream2);
		
//		strStream1.sorted().forEach(System.out::println);
//		strStream2.sorted().forEach(System.out::println);
		
		List<String> sortedList  = strStream2.sorted().collect(Collectors.toList()); 
		
		System.out.println(sortedList);
		
		
	}

}//.class
