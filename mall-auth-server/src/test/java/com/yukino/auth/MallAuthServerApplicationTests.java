package com.yukino.auth;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallAuthServerApplicationTests {

    @Test
    void contextLoads() {
    }
    static class Shape{
        Shape(int i){
            System.out.println("This is Shape" + i);
        }
    }

    public static class Circle extends Shape{
        static Shape s1 = new Shape(1);
        Shape s2 = new Shape(3);
        Circle(int i){
            super(i);
            System.out.println("This is Circle" + i);
        }
        @Test
        public static void main(String args[]){
            Circle c1 = new Circle(2);
        }
    }


}
