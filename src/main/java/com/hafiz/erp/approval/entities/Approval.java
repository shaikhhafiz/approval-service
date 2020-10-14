package com.hafiz.erp.approval.entities;

import com.hafiz.erp.approval.core.crud.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Data
@Entity
@Table(name = "approval")
public class Approval extends BaseEntity {
    private UUID sourceRecordId;
    private String source;
    private String status;
}
