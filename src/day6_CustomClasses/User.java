package day6_CustomClasses;

public class User {

    public static void main(String[] args) {
        FacebookUser user = new FacebookUser("java5", "kesda");
        user.setPassword("java5");
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }
}
