package com.aiwan.hisdemo.service;

import com.aiwan.hisdemo.po.PatientAdmissionRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 病例管理service
 * </p>
 *
 * @author wenlongzhang
 * @since 2022-03-03
 */
public interface PatientAdmissionRecordService extends IService<PatientAdmissionRecord> {

    public List<PatientAdmissionRecord> selectPatientAdmissionRecordList(PatientAdmissionRecord patientAdmissionRecord);

}
