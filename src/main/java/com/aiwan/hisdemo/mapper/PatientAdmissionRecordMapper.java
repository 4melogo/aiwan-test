package com.aiwan.hisdemo.mapper;

import com.aiwan.hisdemo.po.PatientAdmissionRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.aiwan.hisdemo.po.PatientAdmissionRecord
 */
public interface PatientAdmissionRecordMapper extends BaseMapper<PatientAdmissionRecord> {
    /**
     * 查询患者列表
     *
     * @param id hisdemo主键
     * @return 患者
     */
    public PatientAdmissionRecord selectPatientAdmissionRecordById(Long id);

    /**
     * 查询患者列表
     *
     * @param patientAdmissionRecord
     * @return 患者集合
     */
    public List<PatientAdmissionRecord> selectPatientAdmissionRecordList(PatientAdmissionRecord patientAdmissionRecord);

    /**
     * 新增患者
     *
     * @param patientAdmissionRecord
     * @return 结果
     */
    public int insertPatientAdmissionRecord(PatientAdmissionRecord patientAdmissionRecord);

    /**
     * 修改患者
     *
     * @param patientAdmissionRecord
     * @return 结果
     */
    public int updatePatientAdmissionRecord(PatientAdmissionRecord patientAdmissionRecord);

    /**
     * 删除患者
     *
     * @param id hisdemo主键
     * @return 结果
     */
    public int deletePatientAdmissionRecordById(Long id);

    /**
     * 批量删除患者
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePatientAdmissionRecordByIds(Long[] ids);

}




