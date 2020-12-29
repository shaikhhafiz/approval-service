package com.hafiz.erp.approval.dataclass;

import com.hafiz.erp.approval.core.crud.IdHolder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ApprovalDetailResponseDTO extends IdHolder {
    private UUID approvalId;
    private UUID detailId;
    private String detail;
    private BigDecimal detailQty;
}
