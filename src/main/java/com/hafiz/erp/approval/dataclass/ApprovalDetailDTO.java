package com.hafiz.erp.approval.dataclass;

import com.hafiz.erp.approval.core.crud.IdHolder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ApprovalDetailDTO extends IdHolder {
//    @NotBlank(groups = {CreateValidateGroup.class})
    private UUID approvalId;
//    @NotBlank(groups = {CreateValidateGroup.class})
    private UUID detailId;
//    @NotEmpty(groups = {CreateValidateGroup.class})
    private String detail;
//    @NotBlank(groups = {CreateValidateGroup.class})
    private BigDecimal detailQty;
}
