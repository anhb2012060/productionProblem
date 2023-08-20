/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productionProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * 
 * @author OS
 */
public class test {
    public static void main(String[] args) throws IOException {
        Buffer buffer = new Buffer(10);
        Producer p1 = new Producer(buffer);
        Consumer c1 = new Consumer(buffer);
        //Bắt đầu mua: 
        c1.start();
        //Bắt đầu sản xuất:
        p1.start();
       
    }
}
