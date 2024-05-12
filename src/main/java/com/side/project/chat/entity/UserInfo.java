package com.side.project.chat.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String username;
    private String name;

    // 생성자, getter, setter 등 필요한 코드 추가
}
