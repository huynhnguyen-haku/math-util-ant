/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huynhnguyen.mathutil.main;

import com.huynhnguyen.mathutil.core.MathUtil;

/**
 *
 * @author Huynh Nguyen
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        System.out.println("This jar file is built based on ANT co-operating with JUnit");
        System.out.println("More over, this message comes from a US-Built's Jar File");
        TryTDDFirst();
    }

    public static void TryTDDFirst() {
        
        //Test case là những tình huống kiểm thử, xài app xem app chạy có đúng hay không
        //Một test case bao gồm
        // -Data đưa vào hàm/app, ví dụ 5! được đưa vào hàm giai thừa
        // -Gọi hàm để xử lý data đưa vào
        // -Giá trị kì vọng hàm sẽ trả về expected value == 120???
        // -Status: hàm chạy đúng hay sai

        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! Status | expected: " + expected
                + "| actual " + actual);

        //Test case 2
        //Kiểm tra hàm có chạy đúng với 2!, hi vọng nhận về số 2
        //Input n = 2;
        //Gọi hàm getFactorial(2);
        //Expected nhận về phải là 2
        //Thực tế là mấy??? Chạy mới biết
        System.out.println("2! Status | Expected: 2"
                + " | Actual: " + MathUtil.getFactorial(2));

        //Test case 3
        //n = 5, 5! hi vọng trả về 120
        System.out.println("5! Status | Expected: 120"
                + " | Actual: " + MathUtil.getFactorial(5));

        //Test case 4
        //n = -5, -5! hi vọng bị báo lỗi
      /*  System.out.println("-5! Status | Expected: Error"
                + " | Actual: ");

        MathUtil.getFactorial(-5); */
    }

}

//Tổng kết:
//Một test case là một tình huống chạy app, kiểm thử app chạy đúng hay sai
//So với kỳ vọng, khi ta đưa data cụ thể nào đó vào
