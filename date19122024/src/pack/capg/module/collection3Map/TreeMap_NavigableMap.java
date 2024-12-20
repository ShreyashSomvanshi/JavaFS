package pack.capg.module.collection3Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class Technology{
	String name;
	int yearOfIntro;
	public Technology(String name, int yearOfIntro) {
		super();
		this.name = name;
		this.yearOfIntro = yearOfIntro;
	}
	
	public String getName() {
		return name;
	}
	
	public int getYearOfIntro() {
		return yearOfIntro;
	}
	
	@Override
	public String toString() {
		return " Technology - name: " + name + ", year Of Intro: " + yearOfIntro + " ";
	}
	
	
}

class TechnologyStack{

	private NavigableMap<Integer, Technology> tech;
	
	public TechnologyStack() {
		super();
		tech = new TreeMap<Integer, Technology>();
	}
	
	public void addTech(int year, String name) {
		Technology techn = new Technology(name,year);
		tech.put(year, techn);
	}
	
	public void displayTech() {
		for(Map.Entry<Integer, Technology> entry : tech.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	
	public void getTechBeforeYear(int year) {
		Map.Entry<Integer, Technology> entry = tech.lowerEntry(year);
		if(entry != null) {
			System.out.println("Technology before: "+year+ entry.getValue());
		}else {
			System.out.println("No tech found before: "+year);
		}
	}
	
	public void getTechAfterYear(int year) {
		Map.Entry<Integer, Technology> entry = tech.higherEntry(year);
		if(entry != null) {
			System.out.println("Technology after: "+year+ entry.getValue());
		}else {
			System.out.println("No tech found after: "+year);
		}
	}
	
	public void getTechAfterCeilling(int year) {
		Map.Entry<Integer, Technology> entry = tech.ceilingEntry(year);
		if(entry != null) {
			System.out.println("technology introduced on or after: "+year+" : "+entry.getValue());
		}else {
			System.out.println("No tech found on or after "+year);
		}
	}
	
	public void getTechFloor(int year) {
		Map.Entry<Integer, Technology> entry = tech.floorEntry(year);
		if(entry != null) {
			System.out.println("technology introduced on or before: "+year+" : "+entry.getValue());
		}else {
			System.out.println("No tech found on or before "+year);
		}
	}
	
}

public class TreeMap_NavigableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TechnologyStack ts = new TechnologyStack();
		
		ts.addTech(1991, "Linux");
		ts.addTech(1995, "Java");
		ts.addTech(1998, "Servlet");
		ts.addTech(2000, "SpringBoot");
		ts.addTech(2002, "Bluetooth");
		ts.addTech(2005, "wifi");
		
		ts.displayTech();
		ts.getTechAfterYear(1999);
		ts.getTechBeforeYear(2000);
		
		System.out.println();
		ts.getTechAfterCeilling(1999);
		System.out.println();
		ts.getTechFloor(1998);
	}

}
