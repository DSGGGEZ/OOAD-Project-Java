public class Admin extends Person {

    private String username[] = new String[100];
    String nickname[] = new String[100];
    String birthday[] = new String[100];

    Admin(int aid, String username, String password, String nickname, String birthday) {
        super.personId[0] = aid;
        this.username[0] = username;
        super.password[0] = password;
        this.nickname[0] = nickname;
        this.birthday[0] = birthday;
    }

    public String getUsername(int i) {
        return username[i];
    }

    public String getPassword(int i) {
        return password[i];
    }

    public String getNickname(int i) {
        return nickname[i];
    }

    public String getBirthday(int i) {
        return birthday[i];
    }

}