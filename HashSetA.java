package com.advance.set;
import java.util.HashSet;
import java.util.Set;

public class HashSetA {

	public static void main(String[] args) {
		Set<String>carBrands=new HashSet<>();
		carBrands.add("kia");
		carBrands.add("Innova");
		carBrands.add("Benz");
		carBrands.add("Tesla");
		carBrands.clear();
		carBrands.remove("Benz");
		System.out.println("carBrands");
		System.out.println("kia is in the set:" +carBrands.contains("kia"));
		System.out.println("size of the set:" +carBrands.size());
		System.out.println();
		System.out.println("following car brands");
		for(String carBrand:carBrands) {
			System.out.println("_" + carBrand.toUpperCase());
		}
		
		

	}

}
