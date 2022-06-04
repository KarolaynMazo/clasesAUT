package co.com.test2.models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class FormTools {

    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String mobile;
    private String subjects;
    private String hobbies;
    private String address;
    private String state;
    private String city;

}
