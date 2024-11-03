package com.yisongda.mall.mapper;

import java.util.List;
import com.yisongda.mall.domain.TestDome;

/**
 * 测试Mapper接口
 * 
 * @author MR.lU
 * @date 2024-11-03
 */
public interface TestDomeMapper 
{
    /**
     * 查询测试
     * 
     * @param id 测试主键
     * @return 测试
     */
    public TestDome selectTestDomeById(Long id);

    /**
     * 查询测试列表
     * 
     * @param testDome 测试
     * @return 测试集合
     */
    public List<TestDome> selectTestDomeList(TestDome testDome);

    /**
     * 新增测试
     * 
     * @param testDome 测试
     * @return 结果
     */
    public int insertTestDome(TestDome testDome);

    /**
     * 修改测试
     * 
     * @param testDome 测试
     * @return 结果
     */
    public int updateTestDome(TestDome testDome);

    /**
     * 删除测试
     * 
     * @param id 测试主键
     * @return 结果
     */
    public int deleteTestDomeById(Long id);

    /**
     * 批量删除测试
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTestDomeByIds(Long[] ids);
}
