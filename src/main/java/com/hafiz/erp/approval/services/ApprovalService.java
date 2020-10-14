package com.hafiz.erp.approval.services;

import com.hafiz.erp.approval.core.crud.CrudService;
import com.hafiz.erp.approval.entities.Approval;
import com.hafiz.erp.approval.repositories.ApprovalRepository;
import org.springframework.stereotype.Service;

@Service
public class ApprovalService extends CrudService<Approval> implements IApprovalService {

    public ApprovalService(ApprovalRepository repository) {
        super(repository);
    }
}
