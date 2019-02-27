package com.steven.demo.springcloudcodeautogenerate.mms.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* @author steven
* @since 2019-02-27
*/
@ApiModel(value ="消息接收人")
@Data
    @EqualsAndHashCode(callSuper = false)
@TableName("message_receiver")
public class MessageReceiver extends Model<MessageReceiver> {

private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
                            private Long id;
    @ApiModelProperty(value = "消息ID")
    @TableField("message_id")
        private Long messageId;
    @ApiModelProperty(value = "接收者ID")
    @TableField("receiver_id")
        private Long receiverId;
    @ApiModelProperty(value = "接收者名称")
    @TableField("receiver_name")
        private String receiverName;
    @ApiModelProperty(value = "接收者email")
    @TableField("receiver_email")
        private String receiverEmail;
    @ApiModelProperty(value = "接收人手机号码")
    @TableField("receiver_phone")
        private String receiverPhone;
    @ApiModelProperty(value = "接收应用名称")
    @TableField("receive_app_name")
        private String receiveAppName;
    @ApiModelProperty(value = "接收应用ID")
    @TableField("receive_app_id")
        private Long receiveAppId;
    @ApiModelProperty(value = "接收企业ID, 如果是个人传 -1")
    @TableField("company_id")
        private Long companyId;
    @ApiModelProperty(value = "是否已读")
    @TableField("is_read")
        private Integer isRead;
    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
        private Date createTime;
    @ApiModelProperty(value = "修改时间")
    @TableField("update_time")
        private Date updateTime;
    @ApiModelProperty(value = "操作人")
        private Long operator;
    @ApiModelProperty(value = "是否删除")
    @TableField("is_deleted")
        private Integer isDeleted;
    @ApiModelProperty(value = "消息通道类型")
    @TableField("send_channel_type")
        private Integer sendChannelType;


@Override
protected Serializable pkVal() {
    return this.id;
}
}