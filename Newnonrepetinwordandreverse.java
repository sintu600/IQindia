package Firstprogram;

import java.util.HashSet;
import java.util.Set;

public class Newnonrepetinwordandreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is a programming language and java is a platform independent";
        String[] str1 = str.split(" ");
        Set<String> uniqueWords = new HashSet<>();

        // First, remove duplicates by adding words to the set
        for (int i = 0; i < str1.length; i++) {
            uniqueWords.add(str1[i]);
        }

        // Now, iterate over the unique words, reverse them, and print
        for (String word : uniqueWords) {
        	//String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.println(word);
        }
	}


	}


