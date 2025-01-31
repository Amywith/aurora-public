package com.aurora.controller;

import com.aurora.dto.ExceptionLogDTO;
import com.aurora.service.ExceptionLogService;
import com.aurora.vo.ConditionVO;
import com.aurora.vo.PageResult;
import com.aurora.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "异常日志模块")
@RestController
public class ExceptionLogController {

    @Autowired
    private ExceptionLogService exceptionLogService;

    @ApiOperation("获取异常日志")
    @GetMapping("/admin/exception/logs")
    public Result<PageResult<ExceptionLogDTO>> listExceptionLogs(ConditionVO conditionVO) {
        return Result.ok(exceptionLogService.listExceptionLogs(conditionVO));
    }

    @ApiOperation(value = "删除异常日志")
    @DeleteMapping("/admin/exception/logs")
    public Result<?> deleteExceptionLogs(@RequestBody List<Integer> exceptionLogIds) {
        exceptionLogService.removeByIds(exceptionLogIds);
        return Result.ok();
    }

}
