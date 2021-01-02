package com.hafiz.erp.approval.services;

import com.hafiz.erp.approval.core.crud.CrudService;
import com.hafiz.erp.approval.entities.Approval;
import com.hafiz.erp.approval.repositories.ApprovalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApprovalService extends CrudService<Approval> implements IApprovalService {

    private final ApprovalProducer producer;

    public ApprovalService(ApprovalRepository repository, ApprovalProducer producer) {
        super(repository);
        this.producer = producer;
    }

    @Override
    public Approval create(Optional<Approval> entity) {
        Approval createdEntity = super.create(entity);
        this.producer.produceMessage(createdEntity);
        return createdEntity;
    }
}
