package demo.demo.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        AtomicInteger countAdmin = new AtomicInteger();
        AtomicInteger countUser = new AtomicInteger();
        List<User> list = new ArrayList<User>();
        list.add(new User("John1", "John1@gmail.com", RoleConst.ROLE_ADMIN));
        list.add(new User("John2", "John2@gmail.com", RoleConst.ROLE_ADMIN));
        list.add(new User("Teo", "Teo@gmail.com", RoleConst.ROLE_USER));
        list.add(new User("Ty", "Ty@gmail.com", RoleConst.ROLE_USER));
        list.forEach (( user ) ->  {
            if (RoleConst.ROLE_ADMIN == user.getRole()) countAdmin.getAndIncrement();
            else countUser.getAndIncrement();
            if (user.getEmail().equals("Teo@gmail.com"))
                System.out.println("user co email la Teo@gmail.com la:" + user);
            if (user.getName().equals("Ty")) System.out.println("user co ten la Ty la:" + user);
        });
        System.out.println("so luong role admin:" + countAdmin.get() + '\n' + "so luong role user:" + countUser);
    }
}
