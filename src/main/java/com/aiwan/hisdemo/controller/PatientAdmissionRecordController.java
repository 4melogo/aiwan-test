package com.aiwan.hisdemo.controller;

import com.aiwan.hisdemo.po.PatientAdmissionRecord;
import com.aiwan.hisdemo.service.PatientAdmissionRecordService;
import com.linkdoc.common.core.web.controller.BaseController;
import com.linkdoc.common.core.web.page.TableDataInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 病例管理controller
 * </p>
 *
 * @author wenlongzhang
 * @since 2022-03-03
 */

@RestController("/hisdemo")
public class PatientAdmissionRecordController extends BaseController {

    @Resource
    private PatientAdmissionRecordService patientAdmissionRecordService;


    /**
     * 查询全部患者列表
     * @param patientAdmissionRecord
     * @return
     */
    @PostMapping("/getAllPatients")
    public TableDataInfo getAllPatientAdmission(PatientAdmissionRecord patientAdmissionRecord){
        startPage();
        List<PatientAdmissionRecord> patientAdmissionRecords = patientAdmissionRecordService.selectPatientAdmissionRecordList(patientAdmissionRecord);
        return getDataTable(patientAdmissionRecords);
    }
}
