package com.yisongda.mall.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yisongda.mall.mapper.TestDomeMapper;
import com.yisongda.mall.domain.TestDome;
import com.yisongda.mall.service.ITestDomeService;

/**
 * 测试Service业务层处理
 * 
 * @author MR.lU
 * @date 2024-11-03
 */
@Service
public class TestDomeServiceImpl implements ITestDomeService 
{
    @Autowired
    private TestDomeMapper testDomeMapper;

    /**
     * 查询测试
     * 
     * @param id 测试主键
     * @return 测试
     */
    @Override
    public TestDome selectTestDomeById(Long id)
    {
        return testDomeMapper.selectTestDomeById(id);
    }

    /**
     * 查询测试列表
     * 
     * @param testDome 测试
     * @return 测试
     */
    @Override
    public List<TestDome> selectTestDomeList(TestDome testDome)
    {
        return testDomeMapper.selectTestDomeList(testDome);
    }

    /**
     * 新增测试
     * 
     * @param testDome 测试
     * @return 结果
     */
    @Override
    public int insertTestDome(TestDome testDome)
    {
        return testDomeMapper.insertTestDome(testDome);
    }

    /**
     * 修改测试
     * 
     * @param testDome 测试
     * @return 结果
     */
    @Override
    public int updateTestDome(TestDome testDome)
    {
        return testDomeMapper.updateTestDome(testDome);
    }

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的测试主键
     * @return 结果
     */
    @Override
    public int deleteTestDomeByIds(Long[] ids)
    {
        return testDomeMapper.deleteTestDomeByIds(ids);
    }

    /**
     * 删除测试信息
     * 
     * @param id 测试主键
     * @return 结果
     */
    @Override
    public int deleteTestDomeById(Long id)
    {
        return testDomeMapper.deleteTestDomeById(id);
    }
}
