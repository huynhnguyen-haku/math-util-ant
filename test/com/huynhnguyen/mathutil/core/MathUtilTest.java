package com.huynhnguyen.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtilTest {

    //Kiểm thử tình huống cà chớn, đưa data vào cà chớn
    //Thì nhận về cú tát EXCEPTION
    //Hàm getFactorial() đc thiết kế để:
    //- Nếu đưa vào n tử tế từ 0 đến 20 -> đưa ra 1 con n! đúng đắn
    //- Nếu đưa vào n cà chớn n < 0 || n > 20
    //Chửi và chửi = ném ra exception/Illegal Agrument Exception
    
    

    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //Test case #7:
        //n = -5; -5! hi vọng trả về cái exception
        //Không xài assertEquals vì nó dùng cho các giá trị cụ thể
        //Còn ngoại lệ là 1 thứ đo lường = cách mày có xuất hiện hay không
        //Mày không thể là 1 giá trị kiểu 5 10 15 20
        MathUtil.getFactorial(-5); //Ngoại lệ 100%
        //Nhưng phải đo/dòm xem mày có xuất hiện hay ko
    }
            
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //Test case #4:
        //n = 3, 3! hi vọng trả về 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        //Test case #5:
        //n = 4, 4! hi vọng trả về 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //Test case #6:
        //n = 5, 5! hi vọng trả về 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }

    @Test
    public void tryAsrert() {
        Assert.assertEquals(69, 69);
    }

    @Test //Quy tắc đặt tên hàm kiểm thử phải mang ý nghĩa của các test
    //case mình muốn test hàm - CODING CONVENTION
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: Tình huống kiểm thử xài hàng getF() đầu tiên
        //n = 0, 0! hi vọng expected = 1; actual thực tế phải gọi và chạy
        //hàm mới biết được
        //Nếu expected == actual, màu xanh, còn không màu đỏ
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //Phải so sánh 2 giá trị này!!! Dùng framework, hok xài sout()
        Assert.assertEquals(expected, actual);
        //So sánh xem 0! có đúng là trả về 1 hay hem?

        //Test case #2: 
        //n = 1; 1! hi vọng expected trả về 1
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);

        //Test case #3: 
        //n = 2; 2! hi vọng expected trả về 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));

        //Test case #4:
    }
}

//Trong class này chứa cái gì
//Class này chứa các đoạn code dùng để test code chính ở bên thư mục
//Source package
//Các đoạn code ở đây sẽ dùng để test cái hàm get factiorial() coi mày
//chạy có đúng không
//VIết code để test code
//Những đoạn code trong này do dev viết ra để test chính cái code
//Ở bên thư mục source để đảm bảo hàm hay classs viết ra
//Phải chạy đúng
//Đoạn code dùng để viết code thì dc gọi là test script
//Các test scrip này sẽ có lệnh cơ bản: so sánh giữa expected và actual
//Như bên hàm main() đã làm thử
//Những đoạn code này không dùng sout() truyền thống mà dùng những thư viện đặc biệt
//Khi hàm sai, khi hàm expected =/= actual thì nó ném ra màu đỏ.
//Ngược lại, nó ném ra màu xanh
//Các thư viện giúp thảy ra màu đỏ xanh, tự so sánh giùm expected và actual
//để kết luận hàm đúng hay sai, mắt lúc này chỉ cần nhìn đúng hai màu xanh đỏ
//không cần xem chi tiết các dòng so sánh bên trong main()
//Bộ thư viện này còn được gọi là unit test framework
//Mỗi ngôn ngữ lập trình đều có vài bộ thư viện, giúp dev test hàm của mình
//Ví dụ:
//Java: Junit, TestNG
//C#: xUnit, NUnit, MSTest
//pHp: phpUnit
//JavaScript:...
//Python:...
//@Test được gọi là 1 flag/cờ đánh dấu - ANNOTATION
//Nó báo hiệu cho thưi viện Junit biết cần GENERATE HÀM ĐI KÈM @TEST
//BIẾN HÀM NÀY THÀNH HÀM MAIN() VÀ GỬI MAIN() NÀY CHO JVM - JAVA
//VIRTUAL MACHINE ĐỂ CHẠY, KHI CHẠY THÌ SO SÁNH 2 ĐỨA EXPECTED VÀ ACTUAL
//COI NẾU CHÚNG == NHAU, THẢY MÀU XANH
//COI NẾU CHÚNG != NHAU, THẢY MÀU ĐỎ
//NẾU KHÔNG CÓ @TEST, NO RUNNABLE TEST 
//Việc xài thư viện mà bị ép phải làm những gì đó, theo quy tắc nào đó
//Gọi là framework
//Chốt deal xanh đỏ
//Nếu việc chạy bộ test case ra màu xanh <=> Khi tất cả chỉ xanh
//Xanh: khi tất cả các test case cùng xanh
//Xanh: khi tất cả các việc so sánh expectecd đều == actual
//Đỏ: chỉ cần 1 thằng trong đám test case màu đỏ, tất cả đỏ
//Đỏ: chỉ cần 1 viện so sánh expected != actual, màu đỏ xuất hiện
//Logic: Hàm nếu đã đúng, thì phải đúng với tất cả case được liệt kê ra
//Hàm ngon với case đã được test, cố gắng liệt kê đủ
//Chốt deal 2: 
//Khi ra màu xanh tổng, hàm ổn với tất cả các test case
//Khi ra màu đỏ, có ít nhất 1 việc so sánh expected != actual
//- Do actual trả về không đúng như kỳ vọng => bug
//- Do expected tính toán không đúnh luôn!! QC bị ngáo
