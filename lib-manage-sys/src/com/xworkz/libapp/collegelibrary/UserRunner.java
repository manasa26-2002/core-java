package com.xworkz.libapp.collegelibrary;

public class UserRunner {
    public static void main(String[] args) {

        User user = new User();
        user.userId = 4;

        Object ob[] = {456,"hello",user};

        System.out.println(ob[0]+ " "+ob[1]+ " "+ob[2]);

    }
}
