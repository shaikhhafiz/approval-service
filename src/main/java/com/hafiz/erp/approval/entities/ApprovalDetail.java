package com.hafiz.erp.approval.entities;

import com.hafiz.erp.approval.core.crud.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Table(name = "approval_detail")
public class ApprovalDetail extends BaseEntity {
    private UUID approvalId;
    private UUID detailId;
    private String detail;
    private BigDecimal detailQty;
}
