/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productionProblem;

import java.util.ArrayList;

public class Buffer {
    private int capacity;
    private ArrayList<Integer> products = new ArrayList<>();

    public Buffer() {
    }

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void addProduct(int product) throws InterruptedException {
        // 1. Kiểm tra điều kiện: Khi kho đã đầy (số lượng sản phẩm >= sức chứa), thì luồng sẽ dừng tại vòng lặp while và chờ
        while (products.size() >= capacity) {
            wait(); // Dừng luồng tại đây và chờ đến khi được đánh thức bằng notify()
        }

        // 2. Khi điều kiện đủ chỗ để thêm sản phẩm được đáp ứng, tiếp tục thực hiện sau vòng lặp while
        products.add(product); // Thêm sản phẩm vào kho
        System.out.println("San xuat san pham #" + product); // In thông báo sản xuất sản phẩm
        notify(); // Đánh thức một trong các luồng đang chờ bằng wait()
    }


    public synchronized void removeProduct() throws InterruptedException {
        // 1. Kiểm tra điều kiện: Khi kho rỗng (không có sản phẩm để tiêu thụ), luồng sẽ dừng tại vòng lặp while và chờ
        while (products.isEmpty()) {
            wait(); // Dừng luồng tại đây và chờ đến khi được đánh thức bằng notify()
        }

        // 2. Khi có sản phẩm để tiêu thụ, tiếp tục thực hiện sau vòng lặp while
        int product = products.remove(0); // Loại bỏ sản phẩm đầu tiên từ kho
        System.out.println("TIEU THU SAN PHAM #" + product); // In thông báo tiêu thụ sản phẩm
        notify(); // Đánh thức một trong các luồng đang chờ bằng wait()
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int getSizeProducts(){
        return products.size();
    }
}

