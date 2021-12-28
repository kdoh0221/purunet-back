package kr.co.kumsung.purunet.prunetback.lecture.domain;

import kr.co.kumsung.purunet.prunetback.common.domain.BaseTimeEntity;
import kr.co.kumsung.purunet.prunetback.enrollment.domain.Enrollment;

import javax.persistence.*;

@Entity
@Table(name = "lecture")
public class Lecture extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String lectureName;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "enrollmentId", foreignKey = @ForeignKey(name ="fk_lecture_enrollment"))
    private Enrollment enrollment;
}
