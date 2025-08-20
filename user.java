package Rk;
public class user {
	String name;
	user(String name) {
	     this.name = name;
	}  
	public void printRole() {
	        System.out.println(name + " is a User");
	    }
	}
	class Admin extends user {
	    Admin(String name) {
	        super(name);
	    }
	    public void printRole() {
	        System.out.println(name + " is an Admin");
	    }
	}
	class Customer extends user {
	    Customer(String name) {
	        super(name);
	    }
	    public void printRole() {
	        System.out.println(name + " is a Customer");
	    }
	}
	class Guest extends user {
	    Guest(String name) {
	        super(name);
	    }
	    public void printRole() {
	        System.out.println(name + " is a Guest");
	    }
	}