package com.hafiz.erp.approval.dataclass;

import lombok.Data;

import java.util.UUID;

@Data
public class ApprovalCreateDTO {
    private UUID sourceRecordId;
    private String sourceRecord;
    private String status;
}
