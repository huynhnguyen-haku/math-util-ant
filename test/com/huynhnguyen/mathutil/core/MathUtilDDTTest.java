/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huynhnguyen.mathutil.core;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.huynhnguyen.mathutil.core.MathUtil.*;

/**
 *
 * @author Huynh Nguyen
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //Chuẩn bị data mảng 2 chiều vì nó có n đưa vào và expected [2]
    //Và có nhiều cặp như thế [7]
    //Mảng 2 chiều [7][2]
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };

        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };
    }   //Xài wrapper class nếu chơi số, ví dụ Integer (int) Long (long)
//Sau khi có bộ data qua mảng 2 chiều, Junit sẽ tự lặp for
    //Để lôi ra từng cặp (1, 0), (1, 1)...
    //Nhồi cặp này vào hàm so sánh bằng cách gán value vào biến nào đó
    //Gán vào biến Tham số hóaParameterized
    //Ta sẽ map/ánh xạ 2 cột ứng với 2 biến: cột 0 - expected
    //                                       cột 1 - n đưa vào hàm getf()

    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //Test hoy vì đã có các test case và data
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}

//Class này sẽ chứa code dùng để test code chính bên class MathUtil
//Class này sẽ dùng để chứa code test Hàm Factorial, xem hàm chạy có đúng không
//Code được viết ra dùng để test các code/hàm/class khác
//Thì đoạn code/class này được gọi là : "Test scrip"
//Trong Test Scrip, sẽ có những tình huống xài app
//Tức là đưa data cụ thể vào, xem hàm xử lý có ra kết quả như kỳ vọng không
//Một Test Script sẽ chứa nhiều Test Cases
//Mỗi Test Case sẽ tương đương 1 tình huống xài hàm
//Phân tích Test Script cũ hôm kia, trong đấy xuất hiện bad smell
//Assert.assertEquals(120, MathUtil.getFactorial(5));
//Nó là sự trùng lặp về câu lệnh nhiều lần
//Lệnh so sánh giá trị, lệnh gọi hàm được lặp đi lặp lại với mỗi test case
//Cũng hàm này, cũng lệnh này nhưng nó được viết đi viết lại cho các bộ data.

//Có cách nào kiểu thay 2 con số trong lệnh so sánh = 2 ??? nào đó
//Assert.assertEquals(???, MathUtil.getFactorial(???));
//Assert.assertEquals(expected, MathUtil.getFactorial(n));

//Nếu ta tách được toàn bộ data trong các câu lệnh so sánh hôm qua ra riêng biệt
//Ta chỉ việc pick/lấy/tỉa data này nạp dần vào/nhồi dần vào cái lệnh gọi hàm
//Ta sẽ đạt được
//-Code gọn gàng hơn, hong bị trùng lập
//- Nhìn tổng quan biết có bao nhiêu test case và liệu rằng chúng đủ hay chưa

//Kỹ thuật viết Test Script mà tách biệt data ra khỏi lệnh so sánh, được gọi
//bằng những tên sau
//- Parameterized - tham số hóa, biến data ra một chỗ rồi đặt chúng tên riêng (sau nhồi chúng trở lại)
//- DDT - Data Driven Testing - viết code kiểm thử theo style tách data
// Unit FW hỗ trợ sẵn ta vụ tách data, duyệt vòng for trên data và nhồi vào hàm tương ứng
//Để chơi vs DDT, ta cần
//- Tách Data ra một chỗ - Mảng
//- Map cái data này vào các biến tương ứng
//- Nhồi các biến tương ứng này vào câu lệnh gọi hàm/so sánh

