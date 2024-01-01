package com.demo.back.domain;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity
public class User {
    // 注意属性名要与数据表中的字段名一致
    // 主键自增int(10)对应long
    // 标注用于声明一个实体类的属性映射为数据库的主键列。该属性通常置于属性声明语句之前
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    // 用户名属性varchar对应String
    private String uname;

    // 密码属性varchar对应String
    private String password;
}
