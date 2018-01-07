package com.kodilla.stream.beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String [] args){
        PoemBeautifier poembeautifier = new PoemBeautifier();
        poembeautifier.beautify("Jagna",(text)->(text+"ABC"));
        poembeautifier.beautify("Kuba", (text)->("ABC"+text));
        poembeautifier.beautify("dorota", (text)->(text.toUpperCase()));




    }

}
