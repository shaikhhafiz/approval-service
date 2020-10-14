package com.hafiz.erp.approval.utility;

import com.hafiz.erp.approval.core.crud.ConversionUtility;
import com.hafiz.erp.approval.dataclass.ApprovalDetailResponseDTO;
import com.hafiz.erp.approval.entities.ApprovalDetail;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ApprovalDetailConversionUtility extends ConversionUtility<ApprovalDetail, ApprovalDetailResponseDTO> {
    ApprovalDetailConversionUtility(ModelMapper modelMapper) {
        super(modelMapper, ApprovalDetail.class, ApprovalDetailResponseDTO.class);
    }
}
