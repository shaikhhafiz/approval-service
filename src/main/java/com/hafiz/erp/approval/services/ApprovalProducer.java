package com.hafiz.erp.approval.services;

import com.hafiz.erp.approval.dataclass.ApprovalResponseDTO;
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
      ApprovalResponseDTO response = buildResponseDTO(entity);
      kafkaTemplate.send("pending-approval", response);
      return null;
    });
  }

  private ApprovalResponseDTO buildResponseDTO(Approval entity) {
    ApprovalResponseDTO response = new ApprovalResponseDTO();
    response.setSourceRecord(entity.getSourceRecord());
    response.setSourceRecordId(entity.getSourceRecordId());
    response.setStatus("Pending");
    return response;
  }
}
