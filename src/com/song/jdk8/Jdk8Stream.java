package com.song.jdk8;

import java.util.ArrayList;

public class Jdk8Stream {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.stream().filter(x -> x.equals("2")).forEach(System.out::println);
	}
}
