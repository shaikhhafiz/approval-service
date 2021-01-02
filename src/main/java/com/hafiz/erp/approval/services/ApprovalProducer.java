package com.hafiz.erp.approval.services;

import com.hafiz.erp.approval.dataclass.ApprovalDTO;
import com.hafiz.erp.approval.entities.Approval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ApprovalProducer {

  @Autowired
  private KafkaTemplate<Object, Object> template;

  public void produceMessage(Approval entity) {
    this.template.executeInTransaction(kafkaTemplate -> {
      ApprovalDTO response = buildResponseDTO(entity);
      kafkaTemplate.send("pending-approval", response);
      return null;
    });
  }

  private ApprovalDTO buildResponseDTO(Approval entity) {
    ApprovalDTO dto = new ApprovalDTO();
    dto.setSourceRecord(entity.getSourceRecord());
    dto.setSourceRecordId(entity.getSourceRecordId());
    dto.setStatus("Pending");
    return dto;
  }
}
