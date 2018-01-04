package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {


public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
    ArrayList<Integer>parzysta=new ArrayList<>();
    for (Integer numer : numbers){
        if (numer % 2==0){
            parzysta.add(numer);
        }
    }
    return parzysta;



}






}