package com.hafiz.erp.approval.services;

import com.hafiz.erp.approval.entities.Approval;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IApprovalService {
  List<Approval> getList();
  Optional<Approval> getById(UUID id);
  Approval create(Optional<Approval> entity);
  List<Approval> createAll(List<Approval> entities);
  Optional<Approval> update(Optional<Approval> entity);
  void deleteById(Optional<UUID> id);
}
