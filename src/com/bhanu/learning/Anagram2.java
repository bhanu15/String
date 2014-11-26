package com.bhanu.learning;

public class Anagram2 {

	public static void main(String[] args) {
		int i = 'A';
		String str = "HelloWorld";
		Anagram2 anagram2  = new Anagram2();
		System.out.println(anagram2.checkAnagram(str.toUpperCase(), str.toUpperCase()));
		
	}
	
	public boolean checkAnagram(String str1 , String str2){
		char [] ch = new char[26];
		char [] chArray1 = str1.toCharArray();
		char [] chArray2 = str2.toCharArray();
		
		for(char c:chArray1){
			ch[(int)c-65]++;
		}
		
		for(char c:chArray2){
			ch[(int)c-65]--;
		}
		
		for(int i :ch){
			if(i>0 || i<0){
				return false;
			}
		}
		
		return true;
	}
}
