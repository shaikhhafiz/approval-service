package com.hafiz.erp.approval.dataclass;

import lombok.Data;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
public class ApprovalCreateDTO {
    private UUID sourceRecordId;
    private String source;
    private String status;
}
