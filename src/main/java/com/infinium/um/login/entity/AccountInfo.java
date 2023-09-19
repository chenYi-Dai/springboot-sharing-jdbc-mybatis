package com.infinium.um.login.entity;


import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder(builderMethodName = "AccountInfoBuild")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccountInfo extends LoginBaseEntity {
    /**
     * 用户id
     */
    private Long uid;

    /**
     * 客户号
     */
    private String custNo;

    /**
     * 卡号
     */

    private String cardNo;

    /**
     * 账户类型
     */
    private String acctType;

    /**
     * 账户号
     */
    private String acctNo;

    /**
     * 账户标识 1 -基础账户 2-其他账户
     */
    private Integer acctFlag;

    /**
     * 账户状态 1-正常， 2销户
     */
    private String acctStatus;

    /**
     * 销户时间
     */
    private String closeTime;

    /**
     * 开户渠道 APP, H5
     */
    private String channelSource;

    /**
     * 开户渠道2邮箱，3手机，4微信，5fb
     */
    private Integer channel;
/*
    public Long getUid() {
        return uid;
    }


    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getCustNo() {
        return custNo;
    }


    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Integer getAcctFlag() {
        return acctFlag;
    }


    public void setAcctFlag(Integer acctFlag) {
        this.acctFlag = acctFlag;
    }


    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus == null ? null : acctStatus.trim();
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo == null ? null : acctNo.trim();
    }

    public String getCloseTime() { return closeTime; }

    public void setCloseTime(String closeTime) { this.closeTime = closeTime; }

    public String getChannelSource() {
        return channelSource;
    }

    public void setChannelSource(String channelSource) {
        this.channelSource = channelSource;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }*/

}