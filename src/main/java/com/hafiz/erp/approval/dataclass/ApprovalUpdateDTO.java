package com.hafiz.erp.approval.dataclass;

import com.hafiz.erp.approval.core.crud.IdHolder;
import lombok.Data;

import java.util.UUID;

@Data
public class ApprovalUpdateDTO extends IdHolder {
    private String status;
}
