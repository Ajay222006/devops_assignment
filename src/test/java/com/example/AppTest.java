package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

@Test
public void testAdd(){
App obj=new App();
assertEquals(8,obj.add(5,3));
}

@Test
public void testSubtract(){
App obj=new App();
assertEquals(2,obj.subtract(5,3));
}

}