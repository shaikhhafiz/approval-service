package com.hafiz.erp.approval.dataclass;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ApprovalDetailCreateDTO {
    private UUID approvalId;
    private UUID detailId;
    private String detail;
    private BigDecimal detailQty;
}
