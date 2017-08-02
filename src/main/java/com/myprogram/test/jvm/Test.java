package com.myprogram.test.jvm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by kpc on 2017/7/26.
 */
public class Test {

    static class B {
        int a;
        int b;
        int c;
    }

    public static void main(String[] args) throws Exception{

        //testSizeOfObject();
        //testList();
        testObject();

//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                System.out.println("my thread 1 !!!");
//            }
//        }.start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.printf("my thread 2 !!!");
//            }
//        }).start();
    }

    private static void testObject() throws IllegalAccessException, InterruptedException{
        List l = new ArrayList();
        for(int i=0;i<10000;i++){
            BigObject b = new BigObject();
            l.add(b);
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            System.out.println(dateString+": list.bytes == >" + SizeOfObject.fullSizeOf(l)+"bytes");
            System.out.println(dateString+": list.bytes == >" + SizeOfObject.fullSizeOf(l)/1024+"kb");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    private static void testList() throws IllegalAccessException, InterruptedException {
        List l = new ArrayList();
        for(int i=0;i<10000;i++){
            byte[] bs = new byte[10*1024]; //一个对象100k
            l.add(bs);
            Date currentTime = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = formatter.format(currentTime);
            System.out.println(dateString+": list.bytes == >" + SizeOfObject.fullSizeOf(l)+"bytes");
            System.out.println(dateString+": list.bytes == >" + SizeOfObject.fullSizeOf(l)/1024+"kb");
            TimeUnit.SECONDS.sleep(1);
        }
    }

    private static void testSizeOfObject() throws IllegalAccessException {
        System.out.println("hello wolrd!!!");
        System.out.println("object size:" + SizeOfObject.sizeOf(new Object()) + "bytes");
        System.out.println("XmlModel size:"+SizeOfObject.sizeOf(new XMLModel())+"bytes");
        System.out.println("XmlModel size.xml:"+SizeOfObject.fullSizeOf(new XMLModel())+"bytes");
        System.out.println("B size:"+SizeOfObject.sizeOf(new B())+"bytes");
        System.out.println("new int[2] size:"+SizeOfObject.sizeOf(new int[2])+"bytes");
        System.out.println("new int[3] size:"+SizeOfObject.sizeOf(new int[3])+"bytes");
        System.out.println("new int[0] size:"+SizeOfObject.sizeOf(new int[0])+"bytes");
        System.out.println("new int[1] size:"+SizeOfObject.sizeOf(new int[1])+"bytes");
        System.out.println("new int[10] size:" + SizeOfObject.sizeOf(new int[10]) + "bytes");
        byte[] bs = new byte[10*1024];
        System.out.println("bs size:"+SizeOfObject.sizeOf(bs)+"bytes");
    }


}
