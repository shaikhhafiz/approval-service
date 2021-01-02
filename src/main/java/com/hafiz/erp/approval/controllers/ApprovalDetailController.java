package com.hafiz.erp.approval.controllers;

import com.hafiz.erp.approval.core.constants.EndPoint;
import com.hafiz.erp.approval.core.crud.CrudController;
import com.hafiz.erp.approval.dataclass.*;
import com.hafiz.erp.approval.entities.ApprovalDetail;
import com.hafiz.erp.approval.services.ApprovalDetailService;
import com.hafiz.erp.approval.utility.ApprovalDetailConversionUtility;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndPoint.APPROVAL_DETAIL)
public class ApprovalDetailController extends CrudController<ApprovalDetail, ApprovalDetailDTO> {

    ApprovalDetailController(ApprovalDetailService service, ApprovalDetailConversionUtility conversionUtility) {
        super(service, conversionUtility);
    }

}
