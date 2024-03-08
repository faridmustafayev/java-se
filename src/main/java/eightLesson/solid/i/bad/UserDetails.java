package eightLesson.solid.i.bad;

public interface UserDetails {
    User loadByUserName(String username);
    boolean addUser();
    boolean deleteUser(String username);
    boolean revokeUser(String username);

}

class User implements UserDetails {

    public User loadByUserName(String username) {
        return null;
    }

    @Override
    public boolean addUser() {
        return false;
    }

    @Override
    public boolean deleteUser(String username) {
        return false;
    }

    @Override
    public boolean revokeUser(String username) {
        return false;
    }

    String username;
}