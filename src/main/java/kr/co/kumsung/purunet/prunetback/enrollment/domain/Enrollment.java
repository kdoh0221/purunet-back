package kr.co.kumsung.purunet.prunetback.enrollment.domain;

import kr.co.kumsung.purunet.prunetback.common.domain.BaseTimeEntity;

import javax.persistence.*;

@Entity
public class Enrollment extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (length = 100, nullable = false)
    private Long id;
    @Column (length = 100, nullable = false)
    private String userId;
    @Column (length = 25, nullable = false)
    private String lectureId;
}
