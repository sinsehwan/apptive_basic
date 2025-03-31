package apptive.basic.auth.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class UserDTO {

    private String email;
    private String name;
    private String nickname;
    private LocalDate birth;
    private String gender;

    public UserDTO(){}

    public UserDTO(String email, String name, String nickname, LocalDate birth, String gender){
        this.email = email;
        this.name = name;
        this.nickname = nickname;
        this.birth = birth;
        this.gender = gender;
    }
}
