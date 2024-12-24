package com.xworkz.libapp.collegelibrary;

public class OddEven {
    public static void main(String[] args) {
         Integer i[] ={23,22,46,72,13,47};
        for(int a:i){
            if(a % 2==0){
                System.out.println(a + "is even" );
            }else{
                System.out.println(a + "is odd");
            }

        }
    }
}

//Arrays.stream(i).filter(value