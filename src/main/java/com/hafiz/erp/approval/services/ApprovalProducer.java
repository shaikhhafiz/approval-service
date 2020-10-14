package com.hafiz.erp.approval.services;

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
      kafkaTemplate.send("pending-approval", entity);
      return null;
    });
  }
}
