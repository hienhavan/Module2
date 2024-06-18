package demo.test;

import org.junit.Test;
import org.testng.annotations.*;

public class Automatedss {
    //@AfterSuite: Chạy một lần sau khi tất cả các bài kiểm thử trong suite đã được chạy.
    @AfterSuite
    //@AfterTest: Chạy sau khi tất cả các phương thức kiểm thử thuộc thẻ <test> XML đã được chạy.
    @AfterTest
    //@BeforeSuite: Chạy một lần trước khi tất cả các bài kiểm thử trong suite được chạy.
    @BeforeSuite
    //@BeforeTest: Chạy trước khi bất kỳ phương thức kiểm thử nào thuộc thẻ <test> XML được chạy.
    @BeforeTest
    //@BeforeClass: Chạy trước lần chạy đầu tiên của bất kỳ phương thức kiểm thử nào trong class hiện tại.
    @BeforeClass
    public void setUp() {
        System.out.println("before class");

    }

    //@BeforeMethod: Chạy trước mỗi phương thức kiểm thử.
    @BeforeMethod

    public void beforeMethod() {
        System.out.println("before method");

    }

    //@AfterMethod: Chạy sau mỗi phương thức kiểm thử.
    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    // @Test: Đánh dấu một phương thức là một phần của bộ kiểm thử.
    @Test
    public void testMethodOne() {
        System.out.println("hello world1");
    }

    @Test
    public void testMethodTwo() {
        System.out.println("hello world2");
    }

    // @AfterClass: Chạy sau lần chạy cuối cùng của tất cả các phương thức kiểm thử trong class hiện tại.
    @AfterClass
    public void cleanUp() {
        System.out.println("after method");
    }
}
