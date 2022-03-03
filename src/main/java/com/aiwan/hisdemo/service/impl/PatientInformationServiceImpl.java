package com.aiwan.hisdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import hisdemo.domain.PatientInformation;
import hisdemo.service.PatientInformationService;
import hisdemo.mapper.PatientInformationMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class PatientInformationServiceImpl extends ServiceImpl<PatientInformationMapper, PatientInformation>
    implements PatientInformationService{

}




