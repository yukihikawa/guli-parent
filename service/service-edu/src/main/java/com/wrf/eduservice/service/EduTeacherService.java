package com.wrf.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wrf.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.wrf.eduservice.entity.vo.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author wrf
 * @since 2022-06-14
 */
public interface EduTeacherService extends IService<EduTeacher> {

    void pageQuery(Page<EduTeacher> pageParam, TeacherQuery teacherQuery);
}
