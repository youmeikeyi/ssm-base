package com.ssm.service;

import com.ssm.domain.SzUser;
import com.ssm.domain.User;

/**
 * Created by xujinchao on 2015/10/23.
 */
public interface UserService {

    User getUserById(int userId);

    SzUser getSzUserById(int userId);

    int addSzUser(SzUser szUser);
}
