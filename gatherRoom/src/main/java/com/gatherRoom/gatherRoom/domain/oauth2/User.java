package com.gatherRoom.gatherRoom.domain.oauth2;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "gr_user")
@ToString
@Builder
public class User extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private String picture;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column
    private String nickname;
    @Column
    private Long characterId;


    public User update(String name, String picture){
        this.name = name;
        this.picture = picture;
        return this;
    }

    public String getRoleKey(){
        return this.role.getKey();
    }
}