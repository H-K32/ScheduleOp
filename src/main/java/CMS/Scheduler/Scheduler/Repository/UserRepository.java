package CMS.Scheduler.Scheduler.Repository;

import CMS.Scheduler.Scheduler.Model.User;

public interface UserRepository {
    User findByUsername(String username);
}
