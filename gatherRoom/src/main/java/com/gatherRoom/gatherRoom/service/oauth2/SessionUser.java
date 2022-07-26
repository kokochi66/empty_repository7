package com.gatherRoom.gatherRoom.service.oauth2;

import com.gatherRoom.gatherRoom.domain.oauth2.User;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}