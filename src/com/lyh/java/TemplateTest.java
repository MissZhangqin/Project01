package com.lyh.java;

import java.util.ArrayList;

/**
 * @author zhangqin
 * @date 2019/2/13 0013 - 8:07
 */
public class TemplateTest {
    //psmv
    static void main(String[] args) {
        //sout
        System.out.println("hello");
        System.out.println("hello");
        //soutp,soutm,soutv,xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);

        //foti
        String [] arr = new String[]{" Tom","JERRY","hanmeimei"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println();
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.fort
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }
    public  void method() {
        System.out.println("TemplateTest.method");
        //模板5：ifn
        ArrayList list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        //变形 inn
        if (list != null) {
            
        }
        //变形：xxx.nn, xxx.null
        if (list != null) {
        }
        if (list == null) {

        }

    }


}


