package com.hafiz.erp.approval.services;

import com.hafiz.erp.approval.core.crud.CrudService;
import com.hafiz.erp.approval.entities.ApprovalDetail;
import com.hafiz.erp.approval.repositories.ApprovalDetailRepository;
import org.springframework.stereotype.Service;

@Service
public class ApprovalDetailService extends CrudService<ApprovalDetail> {

    public ApprovalDetailService(ApprovalDetailRepository repository) {
        super(repository);
    }
}
