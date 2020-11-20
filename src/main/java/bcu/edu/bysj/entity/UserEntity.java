package bcu.edu.bysj.entity;


import java.util.Objects;

public class UserEntity {
    private int uid;
    private String uname;
    private String password;
    private int sex;
    private int uphone;
    private String birth;
    private int type;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getUphone() {
        return uphone;
    }

    public void setUphone(int uphone) {
        this.uphone = uphone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return uid == that.uid &&
                Objects.equals(uphone, that.uphone) &&
                Objects.equals(uname, that.uname) &&
                Objects.equals(birth, that.birth);
    }
    @Override
    public int hashCode() {

        return Objects.hash(uid, uphone, uname, birth);
    }


}
