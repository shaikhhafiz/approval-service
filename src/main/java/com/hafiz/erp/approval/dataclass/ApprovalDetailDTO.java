package com.hafiz.erp.approval.dataclass;

import com.hafiz.erp.approval.core.crud.IdHolder;
import com.hafiz.erp.approval.core.validatorgroup.CreateValidateGroup;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ApprovalDetailDTO extends IdHolder {
    @NotEmpty(groups = {CreateValidateGroup.class})
    private UUID approvalId;
    @NotEmpty(groups = {CreateValidateGroup.class})
    private UUID detailId;
    @NotEmpty(groups = {CreateValidateGroup.class})
    private String detail;
    @NotEmpty(groups = {CreateValidateGroup.class})
    private BigDecimal detailQty;
}
