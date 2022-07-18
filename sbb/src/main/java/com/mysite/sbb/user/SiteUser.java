package com.mysite.sbb.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
//unique = true는 유일한 값만 저장할 수 있음을 의미한다. 즉, 값을 중복되게 저장할 수 없음을 뜻한다. 이렇게 해야 username과 email에 동일한 값이 저장되지 않는다.
@Getter
@Setter
@Entity
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private  String name;

    private String passwrod;

    @Column(unique = true)
    private String email;

}
