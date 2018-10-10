package com.siyu.interviewquestion;

/**
 * @author siyu
 * @version V1.0
 * @Package test
 * @Class: Example
 * @Description: TODO
 * @date 2018/8/25 16:02
 */
public class Example {
    int x = 0;

    public class runner implements Runnable{

        @Override
        public void run() {
            int current = 0;
            for(int i=0; i<4; i++){
                current = x;
                System.out.println(current+",");
                x = current+2;
            }
        }
    }

    public void go(){
        Runnable r1 = new runner();
        new Thread(r1).start();
        new Thread(r1).start();
    }

    public static void main(String[] args){
        new Example().go();
    }
}
