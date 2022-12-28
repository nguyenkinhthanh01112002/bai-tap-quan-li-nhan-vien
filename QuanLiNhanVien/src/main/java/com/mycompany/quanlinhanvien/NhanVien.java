/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlinhanvien;

/**
 *
 * @author KINHTHANH
 */
public class NhanVien extends ConNguoi {
    private double salary;
    private double rate;

    public NhanVien(double salary, double rate, String name, int age, String address) {
        super(name, age, address);
        this.salary = salary;
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
   public double totalSalary(){
       return salary*rate;
   }

    @Override
    public String toString() {
        return super.toString()+", Salary = "+totalSalary(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien(1000,1.5,"NGUYEN KINH THANH",20,"IN QUANG NAM");
        System.out.println(""+nhanVien1.toString());
    }
    

    
   
}
