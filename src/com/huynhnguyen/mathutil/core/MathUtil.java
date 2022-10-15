/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huynhnguyen.mathutil.core;

/**
 *
 * @author Huynh Nguyen
 */
//Ta sẽ mô phỏng cái class Math của JDK.
//Class của ta viết sẽ cung cấp các hàm/method tiện ích dùng chung
//cho nhiều nơi khác nhau
//Thường cái gì mà là tiện ích/tool dùng cho các nơi thì nó sẽ
//được thiết kế là STATIC
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //Hàm tiện ích dùng chung tính giai thừa
    //Quy ước n!=1.2.3...n
    //Ko tính giai thừa số âm
    //0!=1!=1
    //21! cực kỳ to, vượt 18 số 0, vượt 18 số 0 là tràn kiểu long
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        //Sống sót đến đây, sure n chạy từ 2...20
        long product = 10; //Khởi đầu giai thừa là 1
        //Biến tích lỹ/gửi góp/nhân dồn/con heo đất
        //acc - accumlation
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;

    }

}
