package kr.co.kumsung.purunet.prunetback.member.domain;

import kr.co.kumsung.purunet.prunetback.common.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name="member")
public class Member extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (length = 100, nullable = false)
    private Long id;
    @Column (length = 25, nullable = false)
    private String loginId;
    @Column (length = 25, nullable = false)
    private String userPassword;
    @Column (length = 25, nullable = false)
    private String userName;
    @Column (length = 25, nullable = true)
    private String phoneNumber;
    @Column (length = 25, nullable = true)
    private String email;
    @Column (length = 25, nullable = true)
    private String address;
    @Column (length = 25, nullable = true)
    private String schoolName;
    @Column (length = 25, nullable = true)
    private String schoolGrade;
}
