package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
@Test
    public void testOddNumbersExterminatorEmptyList(){
        //given
   ArrayList<Integer>lista =new ArrayList<>();
   OddNumbersExterminator tester=new OddNumbersExterminator();
   //when
    ArrayList<Integer>wyniki = new ArrayList<>();
    wyniki=tester.exterminate(lista);
    //then
    Assert.assertEquals(0,wyniki.size());

    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer>lista = new ArrayList<>();
        lista.add(4);
        lista.add(3);
        OddNumbersExterminator tester = new OddNumbersExterminator();
        ArrayList<Integer>wyniki = new ArrayList<>();
        wyniki=tester.exterminate(lista);
        Assert.assertEquals(1,wyniki.size());
    }
}
