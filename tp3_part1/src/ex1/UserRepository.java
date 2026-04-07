package ex1;

import tpaql_shared.User;

public interface UserRepository {
    User findUserById(long id);
}
