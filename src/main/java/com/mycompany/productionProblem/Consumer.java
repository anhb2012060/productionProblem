/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productionProblem;

/**
 *
 * @author OS
 */
public class Consumer extends Thread{
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    
    
    @Override
    public void run() {
        while (true) {
            try {
                buffer.removeProduct();
                Thread.sleep(1000); // Simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
}
