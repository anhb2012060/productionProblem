/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productionProblem;

/**
 *
 * @author OS
 */
public class Producer extends  Thread{
    private Buffer buffer ;

    public Producer() {
        this.buffer = new Buffer();
    }

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        int productNumber = 0;
        while (true) {
            try {
                productNumber++;
                buffer.addProduct(productNumber);
                Thread.sleep((long) (Math.random()*1000));  // Simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    
}
