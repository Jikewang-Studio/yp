package com.service.Impl;

import com.bean.Custom_made;
import com.dao.Custom_madeMapper;
import com.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/3.
 */
@Service
public class CustomServiceImpl implements CustomService {
    @Autowired
    Custom_madeMapper custom_madeMapper;
    /**
     * 1.用户提交定制信息。
     * @param custom_made
     */
    @Override
    public void insertCustom(Custom_made custom_made) {
        custom_madeMapper.insert(custom_made);
    }

    //2.管理者查询各种类型的订单
    public List<Custom_made> getCustoms(Integer customType) {
        return custom_madeMapper.selectByCustomType(customType);
    }

}
