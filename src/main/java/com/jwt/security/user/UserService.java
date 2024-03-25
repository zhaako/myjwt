package com.jwt.security.user;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUser(int id);
}
