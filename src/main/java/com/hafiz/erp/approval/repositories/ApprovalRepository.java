package com.hafiz.erp.approval.repositories;

import com.hafiz.erp.approval.core.crud.ICrudRepository;
import com.hafiz.erp.approval.entities.Approval;

import java.util.UUID;

public interface ApprovalRepository extends ICrudRepository<Approval, UUID> {
}
