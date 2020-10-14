package com.hafiz.erp.approval.utility;

import com.hafiz.erp.approval.core.crud.ConversionUtility;
import com.hafiz.erp.approval.dataclass.ApprovalResponseDTO;
import com.hafiz.erp.approval.entities.Approval;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ApprovalConversionUtility extends ConversionUtility<Approval, ApprovalResponseDTO> {
    ApprovalConversionUtility(ModelMapper modelMapper) {
        super(modelMapper, Approval.class, ApprovalResponseDTO.class);
    }
}
