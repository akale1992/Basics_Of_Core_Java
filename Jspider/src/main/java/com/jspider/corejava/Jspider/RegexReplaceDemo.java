package com.jspider.corejava.Jspider;

public class RegexReplaceDemo {
	
	public static void main(String[] args) {
		String givenString="Ashijksh", matchedString="";
		
		System.out.println(givenString.replaceAll(matchedString,"|").replaceAll("[^|]", "+").replaceAll("\\|", matchedString));
		//System.out.println(givenString.replaceAll(matchdString, "|").replaceAll(".*", "+").replaceAll("|", matchedString));
	}

}