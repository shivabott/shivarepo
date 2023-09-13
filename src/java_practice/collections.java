package java_practice;

import java.util.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class collections {
	public void set() {
	Set s=new HashSet();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	System.out.println(s);
	for(Object b:s) {
		System.out.println(b);
	}
	}
	
	public void linkedset() {
	Set ss=new LinkedHashSet();
	ss.add(1);
	ss.add(2);
	ss.add(3);
	ss.add(4);
	System.out.println(ss);
	}
	
	public void treeset() {
	Set s=new TreeSet();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	System.out.println(s);
	}
	
	
	public void list() {
	List s=new ArrayList();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	System.out.println(s);
	}
	
	public void linkedlist() {
	List s=new LinkedList();
	s.add(1);
	s.add(2);
	s.add(3);
	s.add(4);
	System.out.println(s);
	}
	
	public void map() {
	Map s=new HashMap();
	s.put("a", 1);
	s.put("b", 2);
	s.put("c", 3);
	s.put("d", 4);
	System.out.println(s);
	}
	
	public void treemap() {
	Map s=new TreeMap();
	s.put("a", 1);
	s.put("b", 2);
	s.put("c", 3);
	s.put("d", 4);
	System.out.println(s);
	}
	
	
	
	
	
	public static void main(String[] args) {

		collections c=new collections();
		c.set();
		c.linkedset();
		c.treeset();
		
		c.list();
		c.linkedlist();
		
		c.map();
		c.treemap();
		
		
	}

}
