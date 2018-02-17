package repository;

import model.User;

import java.util.HashMap;

public class UserRepository implements IUserRepository {

    private static HashMap<Long,User> userData = new HashMap<Long, User>();
    static{
        userData.put(new Long(1),new User(1,"Rahul", "123","Rahul@gmail.comx"));
        userData.put(new Long(2),new User(2,"Prabhu","345","Prabhu@gmail.comx"));
    }

    public User getUser(long userId) {
        return userData.get(userId);
    }

    public User getUser(String userName) {
        for(User user:userData.values()){
            if(user.getUserName().equals(userName)) return user;
        }
        return null;
    }

    public boolean updateUser(long userId, User user) {
        if(userData.get(userId)!=null){
            userData.put(userId,user);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteUser(long userId) {
        if(userData.get(userId)!=null){
            userData.remove(userId);
            return true;
        }else{
            return false;
        }
    }
}
