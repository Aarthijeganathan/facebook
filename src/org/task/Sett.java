package org.task;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sett {
	public static void main(String[]args) {
		System.out.println("hash set list");
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(30);
		s.add(50);
		s.add(10);
		s.add(40);
		System.out.println(s);
		System.out.println(s.size());
		
		System.out.println("linked hash set list");
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.add(30);
		s1.add(50);
		s1.add(10);
		s1.add(40);
		System.out.println(s1);
		
		System.out.println("tree set list");
		Set<Integer> s2=new TreeSet<>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		s2.add(70);
		s2.add(30);
		s2.add(50);
		s2.add(10);
		s2.add(40);
		System.out.println(s2);
	}}
