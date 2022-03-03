package com.aiwan.hisdemo.service.impl;

import com.aiwan.hisdemo.mapper.PatientAdmissionRecordMapper;
import com.aiwan.hisdemo.po.PatientAdmissionRecord;
import com.aiwan.hisdemo.service.PatientAdmissionRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 病例管理serviceImp;
 * </p>
 *
 * @author wenlongzhang
 * @since 2022-03-03
 */
@Service
public class PatientAdmissionRecordServiceImpl extends ServiceImpl<PatientAdmissionRecordMapper, PatientAdmissionRecord>
    implements PatientAdmissionRecordService {

    @Resource
    private PatientAdmissionRecordMapper patientAdmissionRecordMapper;

    @Override
    public List<PatientAdmissionRecord> selectPatientAdmissionRecordList(PatientAdmissionRecord patientAdmissionRecord) {
        return patientAdmissionRecordMapper.selectPatientAdmissionRecordList(patientAdmissionRecord);
    }
}




