package com.steven.demo.springcloudcodeautogenerate.mms.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.steven.demo.springcloudcodeautogenerate.mms.service.MessageReceiverService;
import com.steven.demo.springcloudcodeautogenerate.mms.entity.MessageReceiver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.steven.demo.springcloudcodeautogenerate.common.DataJson;
import java.util.List;

/**
 *code is far away from bug with the animal protecting
 *   @description : MessageReceiver 控制器
 *   ---------------------------------
 *      @author steven
 *   @since 2019-02-27
 */
@Api(tags = {"消息接收人"})
@RestController
@RequestMapping("/messageReceiver")
@EnableSwagger2
public class MessageReceiverController {
private final Logger logger = LoggerFactory.getLogger(MessageReceiverController.class);

@Autowired
public MessageReceiverService messageReceiverService;

/**
 * @description : 获取分页列表
 * ---------------------------------
 * @author : steven
 * @since : Create in 2019-02-27
 */
@ApiOperation(value = "获取分页列表", notes = "获取分页列表", produces = "application/json")
@GetMapping(value = "/messageReceiver/{pageNumber}/{pageSize}")
public Object getMessageReceiverList(@RequestBody(required = false) MessageReceiver param,
@PathVariable(value = "pageNumber") Integer pageNumber,
@PathVariable(value = "pageSize") Integer pageSize){
        DataJson<List<MessageReceiver>> repJson=new DataJson<>();

        try{
        Page<MessageReceiver> page=new Page<MessageReceiver>(pageNumber,pageSize);
        messageReceiverService.selectPage(page,new EntityWrapper<MessageReceiver>(param));
        repJson.setTotal(page.getTotal());
        repJson.setPageSize(pageSize);
        repJson.setPageNumber(pageNumber);
        repJson.setData(page.getRecords());
        repJson.setSuccess(true);
        }catch(Exception e){
        repJson.setSuccess(false);
        repJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
        logger.info("异常信息:{}"+e.getMessage());
        }
        return repJson;
        }

/**
 * @description : 通过id获取MessageReceiver
 * ---------------------------------
 * @author : steven
 * @since : Create in 2019-02-27
 */
@ApiOperation(value="通过id获取MessageReceiver", notes="通过id获取MessageReceiver",produces = "application/json")
@GetMapping(value = "/messageReceiver/{id}")
public Object getMessageReceiverById(@PathVariable(value = "id") String id) {
        DataJson<MessageReceiver> repJson = new DataJson<>();
        try {
        MessageReceiver param= messageReceiverService.selectById(id);
        repJson.setData(param);
        repJson.setSuccess(true);
        }catch (Exception e) {
        repJson.setSuccess(false);
        repJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
        logger.info("异常信息:{}"+e.getMessage());
        }
        return repJson;
        }

/**
 * @description : 通过id删除MessageReceiver
 * ---------------------------------
 * @author : steven
 * @since : Create in 2019-02-27
 */
@ApiOperation(value="通过id删除MessageReceiver", notes="通过id删除MessageReceiver",produces = "application/json")
@DeleteMapping(value = "/messageReceiver/{id}")
public Object deleteMessageReceiverById(@PathVariable(value = "id") String id) {
        DataJson<MessageReceiver> repJson = new DataJson<>();
        try{
        repJson.setSuccess(messageReceiverService.deleteById(Long.valueOf(id)));
        }catch (Exception e) {
        repJson.setSuccess(false);
        repJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
        logger.info("异常信息:{}"+e.getMessage());
        }
        return repJson;
        }

/**
 * @description : 通过id更新MessageReceiver
 * ---------------------------------
 * @author : steven
 * @since : Create in 2019-02-27
 */
@ApiOperation(value="通过id更新MessageReceiver", notes="通过id更新MessageReceiver",produces = "application/json")
@PutMapping(value = "/messageReceiver")
public Object updateMessageReceiverById(@RequestBody MessageReceiver param) {
        DataJson<MessageReceiver> repJson = new DataJson<>();
        try{
        repJson.setSuccess(messageReceiverService.updateById(param));
        }catch (Exception e) {
        repJson.setSuccess(false);
        repJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
        logger.info("异常信息:{}"+e.getMessage());
        }
        return repJson;
        }

/**
 * @description : 添加MessageReceiver
 * ---------------------------------
 * @author : steven
 * @since : Create in 2019-02-27
 */
@ApiOperation(value="添加MessageReceiver", notes="添加MessageReceiver",produces = "application/json")
@PostMapping(value = "/messageReceiver")
public Object addMessageReceiver(@RequestBody MessageReceiver param) {
        DataJson<MessageReceiver> repJson = new DataJson<>();
        try{
        repJson.setSuccess(messageReceiverService.insert(param));
        }catch (Exception e) {
        repJson.setSuccess(false);
        repJson.setMessage("异常信息:{"+e.getClass().getName()+"}");
        logger.info("异常信息:{}"+e.getMessage());
        }
        return repJson;
        }
        }