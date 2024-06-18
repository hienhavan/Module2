package demo.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][]{{"data1"}, {"data2"}};
    }

    @Test(dataProvider = "testData")
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }

    @DataProvider(name = "loginData")
    public static Object[][] loginData() {
        return new Object[][]{
                {"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        System.out.println("Attempting login with username: " + username + " and password: " + password);


//        assertTrue(loginPage.login(username, password));
    }


}
