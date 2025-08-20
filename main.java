package Rk;

public class main {
    public static void main(String[] args) {
        user[] users = {
            new Admin("Alice"),
            new Customer("Bob"),
            new Guest("Charlie")
        };
        for (user u : users) {
            u.printRole();
        }
    }
}
	

