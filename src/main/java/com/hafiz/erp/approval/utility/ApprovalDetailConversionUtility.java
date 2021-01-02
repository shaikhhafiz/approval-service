package com.hafiz.erp.approval.utility;

import com.hafiz.erp.approval.core.crud.ConversionUtility;
import com.hafiz.erp.approval.dataclass.ApprovalDetailDTO;
import com.hafiz.erp.approval.entities.ApprovalDetail;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ApprovalDetailConversionUtility extends ConversionUtility<ApprovalDetail, ApprovalDetailDTO> {
    ApprovalDetailConversionUtility(ModelMapper modelMapper) {
        super(modelMapper, ApprovalDetail.class, ApprovalDetailDTO.class);
    }
}
