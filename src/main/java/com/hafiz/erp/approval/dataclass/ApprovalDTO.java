package com.hafiz.erp.approval.dataclass;

import com.hafiz.erp.approval.core.crud.IdHolder;
import com.hafiz.erp.approval.core.validatorgroup.CreateValidateGroup;
import com.hafiz.erp.approval.core.validatorgroup.UpdateValidateGroup;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.UUID;

@Data
public class ApprovalDTO extends IdHolder {
    @NotEmpty(groups = {CreateValidateGroup.class, UpdateValidateGroup.class})
    private UUID sourceRecordId;
    @NotEmpty(groups = {CreateValidateGroup.class, UpdateValidateGroup.class})
    private String sourceRecord;
    @NotEmpty(groups = {CreateValidateGroup.class, UpdateValidateGroup.class})
    private String status;
}
