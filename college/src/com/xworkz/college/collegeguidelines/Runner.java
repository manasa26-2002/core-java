package com.xworkz.college.collegeguidelines;

import com.xworkz.college.CollegeGuidelines;
import com.xworkz.college.RYMEC;

public class Runner {
    public static void main(String[] args) {

        CollegeGuidelines collegeGuidelines = new RYMEC();
        String r1 = collegeGuidelines.ragging();
        String r2 = collegeGuidelines.collegeProperty();
        String r3 = collegeGuidelines.attendClassRegularly();
        String r4 = collegeGuidelines.classTime();
        String r5 = collegeGuidelines.dressCode();
        String r6 = collegeGuidelines.maintainAttendence();
        String r7 = collegeGuidelines.socialGatherings();
        String r8 = collegeGuidelines.outsiders();
        String r9 = collegeGuidelines.personalHygiene();
        String r = collegeGuidelines.socialGatherings();

        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);

    }
}
