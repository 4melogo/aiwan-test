package com.aiwan.hisdemo.mapper;

import com.aiwan.hisdemo.po.PatientAdmissionRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.aiwan.hisdemo.po.PatientAdmissionRecord
 */
public interface PatientAdmissionRecordMapper extends BaseMapper<PatientAdmissionRecord> {
    /**
     * 查询hisdemo
     *
     * @param id hisdemo主键
     * @return hisdemo
     */
    public PatientAdmissionRecord selectPatientAdmissionRecordById(Long id);

    /**
     * 查询hisdemo列表
     *
     * @param patientAdmissionRecord hisdemo
     * @return hisdemo集合
     */
    public List<PatientAdmissionRecord> selectPatientAdmissionRecordList(PatientAdmissionRecord patientAdmissionRecord);

    /**
     * 新增hisdemo
     *
     * @param patientAdmissionRecord hisdemo
     * @return 结果
     */
    public int insertPatientAdmissionRecord(PatientAdmissionRecord patientAdmissionRecord);

    /**
     * 修改hisdemo
     *
     * @param patientAdmissionRecord hisdemo
     * @return 结果
     */
    public int updatePatientAdmissionRecord(PatientAdmissionRecord patientAdmissionRecord);

    /**
     * 删除hisdemo
     *
     * @param id hisdemo主键
     * @return 结果
     */
    public int deletePatientAdmissionRecordById(Long id);

    /**
     * 批量删除hisdemo
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePatientAdmissionRecordByIds(Long[] ids);

}




