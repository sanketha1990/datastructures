package com.ds.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(100,"Sanketh");
		map.put(101, "Mohan");
		map.put(116,"Manju");
		map.put(117, "nikhil");
		map.put(132, "rambabu");
		map.put(134, "singham");
		
		System.out.println(100%16);
		System.out.println(101%16);
		
		System.out.println("MAP "+map);
		

	}

}
