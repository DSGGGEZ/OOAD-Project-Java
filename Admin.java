public class Admin {

    private String username;
    private String password;
    String nickname;
    String birthday;

    Admin(String username, String password, String nickname, String birthday) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getBirthday() {
        return birthday;
    }

}