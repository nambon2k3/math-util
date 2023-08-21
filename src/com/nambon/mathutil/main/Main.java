/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nambon.mathutil.main;

import com.nambon.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        // thu nghiem ham tinh giai thua coi chay dung nhu thiet ke hay khong
        //ta phai dua cac tinh huong su dung ham trong thuc te
        //vi du:
        // -5 coi tinh dc ko
        // 0 coi tinh dc ko
        //20 may coi tinh dc ko
        //21 coi tinh ra bn
        //Test case: mot tinh huong ham/man hinh/chuc nang duoc dua vao su dung
        //gia lap hanh vi cua ai do
        //no bao ham: data dau vao (input). result (ouput) cua data do ung voi xu li cua ham
        long expected = 120; // ki vong output = 120
        int n = 5;//input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " (expected)");
        System.out.println("5! = " + actual + " (actual)");
        
    }
}
