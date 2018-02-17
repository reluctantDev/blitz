package service;

import model.User;
import repository.IUserRepository;

public class LoginService implements ILoginService {

    private IUserRepository userRepository;

    public LoginService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(String userName, String password) {
        User user = userRepository.getUser(userName);
        if(user.getUserName().equals(userName) &&
                user.getPassword().equals(password)) {
            return true;
        }
        else {
            return false;
        }
    }
}
