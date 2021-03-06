package com.hafiz.erp.approval.controllers;

import com.hafiz.erp.approval.core.constants.EndPoint;
import com.hafiz.erp.approval.core.crud.CrudController;
import com.hafiz.erp.approval.dataclass.ApprovalDTO;
import com.hafiz.erp.approval.entities.Approval;
import com.hafiz.erp.approval.services.ApprovalService;
import com.hafiz.erp.approval.utility.ApprovalConversionUtility;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(EndPoint.APPROVAL)
public class ApprovalController extends CrudController<Approval, ApprovalDTO> {

    ApprovalController(ApprovalService service, ApprovalConversionUtility conversionUtility) {
        super(service, conversionUtility);
    }

}
