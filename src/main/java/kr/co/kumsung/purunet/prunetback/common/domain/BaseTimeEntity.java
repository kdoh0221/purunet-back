package kr.co.kumsung.purunet.prunetback.common.domain;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
//    @CreatedDate
//    private LocalDateTime createdDate;
//    @LastModifiedDate
//    private LocalDateTime lastModifiedDate;
//    @Version
//    private LocalDateTime versionNo;
}
