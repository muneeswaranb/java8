package com.bsj.hacker.samples;

public class CountHoles {
    int holes1[]={0,1,2,3,4,5,6,7,8,9};
    int holes[]={1,0,0,0,1,0,1,0,2,1};

    private Integer findHoles(int number){
        int numberOfHole=0;
        while(number>0){
            int digit=number%10;
            numberOfHole+=holes[digit];
            number=number/10;
        }
        return numberOfHole;
    }
    public static void main(String[] args) {
        CountHoles countHoles=new CountHoles();
        System.out.println("Number of holes of 450 "+countHoles.findHoles(800));
    }
}
