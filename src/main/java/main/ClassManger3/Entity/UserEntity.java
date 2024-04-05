package main.ClassManger3.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StudentID;

    private String Username;

    private String Password;

    private String Role;

    public UserEntity(String US, String PW, String RO){
        this.setUsername(US);
        this.setPassword(PW);
        this.setRole(RO);
    }

    public UserEntity(){
        super();
    }

    public Long getStudentID() {
        return StudentID;
    }

    public void setStudentID(Long studentID) {
        StudentID = studentID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
