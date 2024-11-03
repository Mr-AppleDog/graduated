package com.yisongda.mall.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yisongda.common.annotation.Log;
import com.yisongda.common.core.controller.BaseController;
import com.yisongda.common.core.domain.AjaxResult;
import com.yisongda.common.enums.BusinessType;
import com.yisongda.mall.domain.TestDome;
import com.yisongda.mall.service.ITestDomeService;
import com.yisongda.common.utils.poi.ExcelUtil;
import com.yisongda.common.core.page.TableDataInfo;

/**
 * 测试Controller
 * 
 * @author MR.lU
 * @date 2024-11-03
 */
@RestController
@RequestMapping("/mall/testDome")
public class TestDomeController extends BaseController
{
    @Autowired
    private ITestDomeService testDomeService;

    /**
     * 查询测试列表
     */
    @PreAuthorize("@ss.hasPermi('mall:testDome:list')")
    @GetMapping("/list")
    public TableDataInfo list(TestDome testDome)
    {
        startPage();
        List<TestDome> list = testDomeService.selectTestDomeList(testDome);
        return getDataTable(list);
    }

    /**
     * 导出测试列表
     */
    @PreAuthorize("@ss.hasPermi('mall:testDome:export')")
    @Log(title = "测试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TestDome testDome)
    {
        List<TestDome> list = testDomeService.selectTestDomeList(testDome);
        ExcelUtil<TestDome> util = new ExcelUtil<TestDome>(TestDome.class);
        util.exportExcel(response, list, "测试数据");
    }

    /**
     * 获取测试详细信息
     */
    @PreAuthorize("@ss.hasPermi('mall:testDome:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(testDomeService.selectTestDomeById(id));
    }

    /**
     * 新增测试
     */
    @PreAuthorize("@ss.hasPermi('mall:testDome:add')")
    @Log(title = "测试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TestDome testDome)
    {
        return toAjax(testDomeService.insertTestDome(testDome));
    }

    /**
     * 修改测试
     */
    @PreAuthorize("@ss.hasPermi('mall:testDome:edit')")
    @Log(title = "测试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TestDome testDome)
    {
        return toAjax(testDomeService.updateTestDome(testDome));
    }

    /**
     * 删除测试
     */
    @PreAuthorize("@ss.hasPermi('mall:testDome:remove')")
    @Log(title = "测试", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(testDomeService.deleteTestDomeByIds(ids));
    }
}
