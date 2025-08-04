package exceptionHandling;

import java.lang.IllegalArgumentException;
import java.util.HashMap;

public class UserAuthenticationClass{
    private static HashMap<String,String> users;

    public UserAuthenticationClass(){
        users = new HashMap<>();
    }

    public void signIn(String userName,String password){
        if(users.containsKey(userName)){
            throw new IllegalArgumentException("Username already Exists");
        }
        else{
            users.put(userName, password);
            System.out.println("Successfully Signed In");
        }
    }

    public void login(String userName, String password){
        if(!users.containsKey(userName)){
            throw new IllegalArgumentException("Username not found");
        }
        else if(!users.get(userName).equals(password)){
            throw new IllegalArgumentException("Password not match");
        }
        else{
            users.put(userName, password);
            System.out.println("Successfully Logged In");
        }
    }

    public void changePassword(String username,String oldPassword, String newPassword){
        if(!users.containsKey(username)){
            throw new IllegalArgumentException("Username doesn't exists");
        }
        else if(!users.get(username).equals(oldPassword)){
            throw new IllegalArgumentException("Password doesn't match");
        }
        else{
            users.put(username,newPassword);
            System.out.println("Password changed successfully");
        }
    }

    public static void main(String[] args) throws Exception {
        UserAuthenticationClass company1 = new UserAuthenticationClass();
        company1.signIn("admin","admin");
        company1.signIn("Nobita","07081995");
        company1.signIn("Shinchan","@#&@(@");
        company1.signIn("Kiteretsu","IAmAGoat");
        company1.signIn("Nobita","nobitaNobi");
        company1.login("Nobita","070899");
        company1.changePassword("admin","I am the Admin");
        company1.changePassword("shnchan","mai hoo Shinchan");
    }

}
