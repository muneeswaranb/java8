package com.bsj.hacker.samples;

import java.util.Arrays;
import java.util.List;

public class WholeMinuteDilema {
    /*
     * Complete the 'playlist' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY songs as parameter.
     */
    /*public static long playlist(List<Integer> songs) {
// Write your code here
        long count = 0;
        long [] list = new long[60];
        if(songs.size() == 0)
            return 0;
        for(int w = 0 ; w < songs.size() ; w++)
            list[songs.get(w) % 60] += 1;
        for(int w = 1 ; w < 30 ; w++)
            count = count + (list[w] * list[60 - w]);
        count += checkWholeMinute(list);
        return count;
    }
    public static long checkWholeMinute(long[] list){
        return ((list[30] * (list[30] - 1)) / 2) + ((list[0] * (list[0] - 1))
                / 2);
    }*/

    public static int numPairsDivisibleBy60(Integer[] time) {
        int[] map = new int[60];
        int count =0;
        for(int i=0;i <time.length; i++){

            int rest = time[i] % 60;
            if(rest ==0){
                rest = 60;
            }
            int value = map[60-rest];
            count+= value;

            if(rest ==60){
                rest =0;
            }
            map[rest]++;

        }
        return count;
    }

    public static void main(String[] args) {
        //Integer[] songsArray={60,60,60};
        Integer[] songsArray={30,20,40,60,60,60};
        //Integer[] songsArray={30,20,150,100,40};

        List<Integer> songs= Arrays.asList(songsArray);
        System.out.println(numPairsDivisibleBy60(songsArray));
    }
}
