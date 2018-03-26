package book.exam;

import java.util.*;

public class BookExam01 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime);
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		System.out.println(time.getMinute());
//		
//		
		
		
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println(list2);
		
		list2.add("B");
		list2.add("C");
		list2.add("A");
		System.out.println(list2);
		
		list2.add(3,"A");
		System.out.println(list2);
		System.out.println(list2);
		list2.set(3, "AA");
		
		System.out.println(list1.retainAll(list2));
		System.out.println(list1);
		
		list1.remove(1);
		System.out.println(list1);
		
		LinkedList l1 = new  LinkedList<>();
		l1.add("2");
		l1.add("1");
		System.out.println("\n"+l1);
		l1.addAll(list2);
		System.out.println(l1);
		
		
		
		
	}//.main

}//.class






// ============== endDoc ====================================================================================
