package com.hafiz.erp.approval.dataclass;

import com.hafiz.erp.approval.core.crud.IdHolder;
import lombok.Data;

import java.util.UUID;

@Data
public class ApprovalDTO extends IdHolder {
//    @NotBlank(groups = {CreateValidateGroup.class, UpdateValidateGroup.class})
    private UUID sourceRecordId;
//    @NotEmpty(groups = {CreateValidateGroup.class, UpdateValidateGroup.class})
    private String sourceRecord;
//    @NotEmpty(groups = {CreateValidateGroup.class, UpdateValidateGroup.class})
    private String status;
}
