package com.example.study1.mapper;


import com.example.study1.domain.Study;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudyMapper {

    @Select("""
            SELECT * FROM study
            """)
    @ResultMap("studyMap")
    public List<Study> list();
}
