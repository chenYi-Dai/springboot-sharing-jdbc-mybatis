package com.infinium.um.login.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局存错码
 *
 * @author dfenghuang
 * <p>
 * 错误码规划
 * uc-session 1xx
 * uc-login 2xx
 * um-user 3xx
 * um-mgr 4xx
 * task 8xx
 * 公共5xx
 * 系统错误码9xx
 */
public enum ErrorCodes {
    SUCCESS("0", "ok"),
    ERROR("1", "error"),
    //错误码接入测试码
    ERROR_STYSTEM_TESTCODE("61620318", "错误码接入测试"),
    //公共错误
    @Deprecated
    PARAM_VALIDATE_ERROR(Constants.SYSTEM_ERROR_CODE + "901", "请求参数校验错误:{0} {1}"),
    ILLEGAL_ARGUMENT_ERROR(Constants.SYSTEM_ERROR_CODE + "902", "系统有误，请重试{0}"),
    UNKNOW_ERROR(Constants.SYSTEM_ERROR_CODE + "900", "系统繁忙，请您稍后重试。"),//未细化的异常
    SIGN_ERROR(Constants.SYSTEM_ERROR_CODE + "903", "签名错误"),
    RQUEST_REPEAT_ERROR(Constants.SYSTEM_ERROR_CODE + "904", "请求重放错误"),
    RQUEST_INVALID_ERROR(Constants.SYSTEM_ERROR_CODE + "905", "请求已失效"),
    GW_ERROR(Constants.SYSTEM_ERROR_CODE + "906", "系统繁忙，请您稍后重试"),//网关错误
    STORAGE_ERROR(Constants.BUSINESS_ERROR_CODE + "907", "存储错误"),
    FILE_NOT_FOUND_ERROR(Constants.BUSINESS_ERROR_CODE + "908", "文件未找到"),
    PARSE_EMPLOYEE_FILE_ERROR(Constants.BUSINESS_ERROR_CODE + "909", "解析员工文件失败"),
    DUPLICATE_EMPLOYEE_ERROR(Constants.BUSINESS_ERROR_CODE + "910", "重复员工信息"),
    COS_NOT_ENABLED_ERROR(Constants.BUSINESS_ERROR_CODE + "911", "COS存储未启用"),
    SFTP_JSCH_ERROR(Constants.BUSINESS_ERROR_CODE + "912", "SFTP连接错误"),
    SFTP_ERROR(Constants.BUSINESS_ERROR_CODE + "913", "SFTP错误"),

    NO_DATA_ERROR(Constants.BUSINESS_ERROR_CODE + "914", "暂无查询记录"),
    CREATE_EXCEL_ERROR(Constants.BUSINESS_ERROR_CODE + "915", "生成execl失败"),
    DATE_START_END_ERROR(Constants.BUSINESS_ERROR_CODE + "916", "查询的开始时间大与结束时间"),
    DATE_START_ERROR(Constants.BUSINESS_ERROR_CODE + "917", "查询时间范围不能超过一年"),
    XBOSS_NOCHANGE_ERROR(Constants.BUSINESS_ERROR_CODE + "918", "没有发生数据变更"),
    ERROR_CHECK_HIST_SEQ(Constants.SYSTEM_ERROR_CODE + "919", "该客户已销户，如需修改请重新提交:{0}"),
    DATA_TRUNCATE_ERROR(Constants.SYSTEM_ERROR_CODE + "920", "请求参数过长"),
    FATCA_ERROR(Constants.SYSTEM_ERROR_CODE + "921", "FATCA信息有误"),
    CLONE_BEAN_ERROR(Constants.SYSTEM_ERROR_CODE + "922", "克隆对象失败"),
    DATA_MOST_ONE_ERROR(Constants.SYSTEM_ERROR_CODE + "923", "查询数据多于一笔"),
    SESSION_MIDDLE_UNKNOW_ERROR(Constants.SYSTEM_ERROR_CODE + "924", "系统繁忙，请您稍后重试。"),//session middle未细化的异常
    EVENTBUS_UNKNOW_ERROR(Constants.SYSTEM_ERROR_CODE + "925", "系统繁忙，请您稍后重试。"),//eventBus未细化的异常
    SAS_FILE_NOT_READY_ERROR(Constants.SYSTEM_ERROR_CODE + "926", "sas files may not ready"),
    SAS_CREATE_FILE_ERROR(Constants.SYSTEM_ERROR_CODE + "927", "sas createTempFile error"),
    MYBATIS_ERROR(Constants.SYSTEM_ERROR_CODE + "928", "提取数据库对象的主键错误"),
    ID_GEN_ERROR(Constants.SYSTEM_ERROR_CODE + "929", "获取序列号失败"),
    BATCH_AUDIT_ERROR(Constants.SYSTEM_ERROR_CODE + "930", " 未开启批量审计的上下文"),
    BATCH_HIST_AUDIT_ERROR(Constants.SYSTEM_ERROR_CODE + "931", " auditSeq should be null when histSeq is null"),
    ELK_FLAT_MAPPING_ERROR(Constants.SYSTEM_ERROR_CODE + "932", " ELK flat mappings not ready"),

    HTTPCLIENT_INIT_ERROR(Constants.SYSTEM_ERROR_CODE + "933", "httpClient 初始化失败"),
    HTTPCLIENT_GET_ERROR(Constants.SYSTEM_ERROR_CODE + "934", "httpClient 获取页面失败"),
    OFCA_LOGIN_ERROR(Constants.SYSTEM_ERROR_CODE + "935", "OFCA登陆失败"),
    BEAN_TO_MAP_ERROR(Constants.SYSTEM_ERROR_CODE + "936", "java bean对应转化map失败"),
    REDIS_OPERATION_FAILED_ERROR(Constants.SYSTEM_ERROR_CODE + "937", "redis operation failed!"),

    MIDDLE_SESSIONID_INVALID(Constants.SYSTEM_ERROR_CODE + "940", "系统繁忙，请您稍后重试。"),//未细化的异常
    MIDDLE_SERVICE_INVALID(Constants.SYSTEM_ERROR_CODE + "941", "Middle 服务调用异常。"),//未细化的异常
    GRPC_SERVICE_INVALID(Constants.SYSTEM_ERROR_CODE + "942", "Grpc 服务调用异常。"),//未细化的异常
    CORE_SERVICE_INVALID(Constants.SYSTEM_ERROR_CODE + "943", "Core gw 服务调用异常。"),//未细化的异常


    SECURITY_DECRYPT_REQUEST_ERROR(Constants.SYSTEM_ERROR_CODE + "946", "Failed to decrypt sensitive fields: {0}!"),//加解密异常

    GW_INIT_HTTP_PROCESSER_VERSION_EMPTY_ERROR(Constants.SYSTEM_ERROR_CODE + "947", "Http Request authorization Processer version is empty!"),
    GW_INIT_HTTP_PROCESSER_VERSION_REPEATED_ERROR(Constants.SYSTEM_ERROR_CODE + "948", "Http Request authorization Processer version is repeated!"),

    GW_INNER_TOKEN_CREATE_ERROR(Constants.SYSTEM_ERROR_CODE + "949", "um gateway inner token create fail!"),
    GW_CHECK_CORE_SAFE_SDK_VERSION_ERROR(Constants.SYSTEM_ERROR_CODE + "950", "um gateway check req core sdk version fail!"),

    SECURITY_PROCESS_REQUEST_ERROR(Constants.SYSTEM_ERROR_CODE + "951", "process sensitive fields failed!"),
    GW_CHANNEL_NOT_PERMISSION_ERROR(Constants.SYSTEM_ERROR_CODE + "952", "Channel does not have permission !"),//网关错误

    //定时任务执行异常953
    TIMER_RUN_FAIL_ERROR(Constants.SYSTEM_ERROR_CODE + "953", "定时任务执行失败!"),

    GW_AUTH_CONFIG_LOAD_ERROR(Constants.SYSTEM_ERROR_CODE + "954", "um-gateway init failed, load db config error!"),//网关错误
    GW_AUTH_CONFIG_RELOAD_ERROR(Constants.SYSTEM_ERROR_CODE + "955", "um-gateway init failed, reload db config error!"),//网关错误
    GW_AUTH_INIT_UNDONE_ERROR(Constants.SYSTEM_ERROR_CODE + "956", "um-gateway auth config not init!"),//网关错误
    GW_BODY_FORMAT_ERROR(Constants.SYSTEM_ERROR_CODE + "957", "read request comm_req format error!"),//网关错误

    GW_CALL_BUSS_ONLINE_ERROR(Constants.SYSTEM_ERROR_CODE + "960", "um gateway call um buss online fail!"),


    TASK_RUNNING_ERROR(Constants.BUSINESS_ERROR_CODE + "800", "The service is already running !"),
    TASK_INTERRUPT_ERROR(Constants.BUSINESS_ERROR_CODE + "800", "The service has been interrupted!"),

    TASK_EPRC_RUN_FAIL_ERROR(Constants.SYSTEM_ERROR_CODE + "807", "The eprc task run failed, success count below {0}!"),

    //参数格式错误
    COMMON_FORMAT_ERROR(Constants.SYSTEM_ERROR_CODE + "502", "请求参数错误"),
    //安全校验不通过
    COMMON_SAFE_CHECK_UNPASS(Constants.BUSINESS_ERROR_CODE + "507", "安全验证失败，请重试"),
    //验证码
    @Deprecated
    VALIDATE_CODE_ERROR(Constants.BUSINESS_ERROR_CODE + "500", "一次性有效验证码错误，请重新输入"),
    @Deprecated
    VALIDATE_CODE_EXPIRE(Constants.BUSINESS_ERROR_CODE + "501", "验证码已超时，请重新获取验证码。"),
    @Deprecated
    VALIDATE_CODE_FREQUENTLY(Constants.BUSINESS_ERROR_CODE + "503", "验证码发送频繁，稍后再试"),
    @Deprecated
    VALIDATE_CODE_MINUTE_FREQUENTLY(Constants.BUSINESS_ERROR_CODE + "504", "验证码发送频繁，60s发送一次"),
    //基础参数校验
    VALIDATE_EMAIL_ERROR(Constants.BUSINESS_ERROR_CODE + "505", "电邮地址格式不正确，请重新输入"),
    VALIDATE_MOBILE_ERROR(Constants.BUSINESS_ERROR_CODE + "506", "手机号格式不正确，请重新输入"),
    VALIDATE_CARD_NO_ERROR(Constants.BUSINESS_ERROR_CODE + "508", "证件号有误，请您重新输入"),
    DUPLICATE_DATA_ERROR(Constants.SYSTEM_ERROR_CODE + "509", "该记录已存在"),
    VALIDATE_NAME_ERROR(Constants.BUSINESS_ERROR_CODE + "510", "姓名有误，请您重新输入"),
    RECORD_NOT_EXISTS_ERROR(Constants.SYSTEM_ERROR_CODE + "511", "该记录不存在"),
    VALIDATE_CARD_TYPE_ERROR(Constants.BUSINESS_ERROR_CODE + "512", "不支持该证件类型！"),

    //登录态
    SESSION_NOT_EXIST(Constants.BUSINESS_ERROR_CODE + "100", "系统有误，请重试:{0}"),
    SESSION_FORMAT_ERROR(Constants.BUSINESS_ERROR_CODE + "101", "系统有误，请重试:{0}"),
    SESSION_HAD_MODIFIED(Constants.BUSINESS_ERROR_CODE + "102", "系统有误，请重试:{0}"),
    SESSION_DEVICE_CHANGE(Constants.BUSINESS_ERROR_CODE + "103", "您正在使用与本行记录不同的装置，请使用原有装置重新登入"),
    SESSION_VERIFY_ERROR(Constants.BUSINESS_ERROR_CODE + "104", "会话校验失败，请重新登录"),
    SESSION_FAKE_GID_ISNULL(Constants.BUSINESS_ERROR_CODE + "105", "会话已失效，请重试！"),


    //登录
    @Deprecated
    LOGIN_PWD_DECRYPT_ERROR(Constants.BUSINESS_ERROR_CODE + "201", "解密错误"),
    @Deprecated
    LOGIN_EMAIL_ERROR(Constants.BUSINESS_ERROR_CODE + "202", "邮箱验证码错误"),
    @Deprecated
    LOGIN_ACCOUT_STOP(Constants.BUSINESS_ERROR_CODE + "203", "该账号被限制登录"),
    @Deprecated
    LOGIN_WX_OPEN_ERROR(Constants.BUSINESS_ERROR_CODE + "206", "微信授权登录失败"),
    @Deprecated
    LOGIN_FB_ERROR(Constants.BUSINESS_ERROR_CODE + "207", "FaceBook授权登录失败"),
    @Deprecated
    LOGIN_NEW_DEVICE_CHECK(Constants.BUSINESS_ERROR_CODE + "208", "新设备需要加验"),

    LIMIT_EUROPE_LOGIN(Constants.BUSINESS_ERROR_CODE + "209", "你所在地区暂不支持登入，敬请谅解"),

    LIMIT_BLACKLIST_LOGIN(Constants.BUSINESS_ERROR_CODE + "210", "目前您暂时无法登录，请您谅解。若有需要请联系客服。"),
    LIMIT_IP_BLACKLIST_LOGIN(Constants.BUSINESS_ERROR_CODE + "211", "您的网络位址不安全。我们建议您更换安全网络重试登录。如有查询，请立即致电21112688联络本行客服热线。"),
    LIMIT_USER_BLACKLIST_LOGIN(Constants.BUSINESS_ERROR_CODE + "212", "为保障阁下，目前您暂时无法登录。如有查询，请立即致电21112688联络本行客服热线。"),
    LOGIN_AGREE_ERROR(Constants.BUSINESS_ERROR_CODE + "213", "您当前未同意隐私保护提示（或清除了系统缓存），请重新启动应用，并同意《隐私保护提示》后再进行登录，谢谢。"),
    WX_OPENID_NO_LOGIN_ERROR(Constants.BUSINESS_ERROR_CODE + "214", "该微信未登陆"),
    WX_MOBILE_LOGIN_ERROR(Constants.BUSINESS_ERROR_CODE + "215", "未能查询到当前手机号关联的Fusion Bank户口信息，请核对后再试"),

    USER_NOTICE_MSG_SEND_ERROR(Constants.BUSINESS_ERROR_CODE + "300", "触达消息发送失败"),
    USER_WX_ERROR(Constants.BUSINESS_ERROR_CODE + "302", "登入失败，请重试"),
    USER_FB_ERROR(Constants.BUSINESS_ERROR_CODE + "303", "登入失败，请重试"),
    USER_APPLE_ERROR(Constants.BUSINESS_ERROR_CODE + "304", "登入失败，请重试"),
    USER_BUILD_CUSTOMER_ERROR(Constants.BUSINESS_ERROR_CODE + "310", "建立客户失败:{0}"),
    USER_OPNE_ACCOUNT_BIND_OTHER_LOGIN_ACCOUT_ERROR(Constants.BUSINESS_ERROR_CODE + "311", "已开过户且绑定过其他登录账号"),
    USER_UID_NOT_EXISTS(Constants.BUSINESS_ERROR_CODE + "312", "系统有误，请重试"),
    USER_GID_NOT_EXISTS(Constants.BUSINESS_ERROR_CODE + "313", "用户不存在"),
    USER_CLOSE_ACCOUT_ERROR(Constants.BUSINESS_ERROR_CODE + "314", "销户失败:{0}"),
    @Deprecated
    USER_ALREADY_CLOSE_OR_NOT_MATCH_ERROR(Constants.BUSINESS_ERROR_CODE + "315", "已销户，或者uid与acctNo不匹配"),
    USER_OPNE_ACCOUNT_BIND_PARTYNUM_ERROR(Constants.BUSINESS_ERROR_CODE + "316", "证件信息与partynum不匹配"),
    USER_QRY_PARTYNUM_ERROR(Constants.BUSINESS_ERROR_CODE + "317", "获取partynum锁失败"),
    USER_CREDENTIALS_NOT_EXISTS(Constants.BUSINESS_ERROR_CODE + "319", "证件信息不存在"),
    USER_SAFE_ERROR(Constants.SYSTEM_ERROR_CODE + "320", "系统有误，请重试"),
    USER_PUBLIC_KEY_ENCRYPT_ERROR(Constants.SYSTEM_ERROR_CODE + "321", "调用密匙系统加密失败"),
    USER_PUBLIC_KEY_DECRYPT_ERROR(Constants.SYSTEM_ERROR_CODE + "322", "调用密匙系统解密失败"),
    USER_PUBLIC_KEY_SIGN_ERROR(Constants.SYSTEM_ERROR_CODE + "323", "调用密匙系统加签失败"),
    USER_PUBLIC_KEY_VERFYSIGN_ERROR(Constants.SYSTEM_ERROR_CODE + "324", "调用密匙系统验签失败"),
    USER_PUBLIC_KEY_GETNEWKEY_ERROR(Constants.SYSTEM_ERROR_CODE + "325", "调用密匙系统获取最新秘钥失败"),
    USER_ONLINE_CUSTOMER_SERVICE_NOT_EXISTS(Constants.BUSINESS_ERROR_CODE + "326", "环信用户不存在"),
    USER_CALL_CUSTOMER_SERVICE_ERROR(Constants.SYSTEM_ERROR_CODE + "327", "调用客服系统失败:{0}"),
    USER_CUSTOMER_SERVICE_SESSION_NOT_EXISTS(Constants.BUSINESS_ERROR_CODE + "328", "登录态已失效"),
    USER_CUSTOMER_SERVICE_SESSION_SIGN_ERROR(Constants.BUSINESS_ERROR_CODE + "329", "登录态签名错误"),
    USER_HX_GETCUSTOMER_INFO_ERROR(Constants.BUSINESS_ERROR_CODE + "330", "获取客户信息失败"),
    USER_ACCT_NOEXICT_ERROR(Constants.BUSINESS_ERROR_CODE + "331", "卡号不存在！"),
    USER_ID_CARD_USED__ERROR(Constants.BUSINESS_ERROR_CODE + "332", "该证件已被使用"),
    USER_CONTRACT_ERROR(Constants.SYSTEM_ERROR_CODE + "333", "系统有误，请重试"),
    USER_ID_CARD_MAIN(Constants.BUSINESS_ERROR_CODE + "334", "主证件有且只应有一张"),
    USER_STATUS_UNNORMAL(Constants.BUSINESS_ERROR_CODE + "335", "用户已销户"),
    USER_MOBILE_EMPTY(Constants.BUSINESS_ERROR_CODE + "336", "用户手机号已解绑"),
    USER_DEAL_NO_NOT_EXIST(Constants.BUSINESS_ERROR_CODE + "337", "开户记录不存在"),
    USER_PUBLIC_KEY_DECRYPT_CIPHER_INVALID(Constants.SYSTEM_ERROR_CODE + "338", "解密原串非法"),
    WX_TOKEN_SIGN_ERROR(Constants.BUSINESS_ERROR_CODE + "338", "微信公众号accesstoken签名错误"),
    WX_JSTICKET_SIGN_ERROR(Constants.BUSINESS_ERROR_CODE + "339", "微信公众号jsticket签名错误"),
    WX_TOKEN_SESSION_NOT_EXISTS(Constants.BUSINESS_ERROR_CODE + "340", "微信公共accesstoken已失效"),
    WX_PUBLIC_CONF_INVALID(Constants.BUSINESS_ERROR_CODE + "341", "微信公众号配置无效"),
    CALL_WX_ACCESS_TOKEN_ERROR(Constants.BUSINESS_ERROR_CODE + "342", "调用微信获取公众号accesstoken失败"),
    CALL_WX_JS_TICKET_ERROR(Constants.BUSINESS_ERROR_CODE + "343", "调用微信获取公众号jsticket失败"),
    USER_BASE_CONFIG_ERROR(Constants.SYSTEM_ERROR_CODE + "344", "调用配置文件信息失败"),
    USER_GET_BASE_CONFIG_ERROR(Constants.SYSTEM_ERROR_CODE + "345", "配置文件信息非法"),
    GET_WX_BIND_INFO_ERROR(Constants.SYSTEM_ERROR_CODE + "346", "获取微信绑定信息失败！"),
    USER_CDD_VERIFY_CALL_ERROR(Constants.BUSINESS_ERROR_CODE + "347", "微信钱包用户实名调用失败"),
    USER_CDD_VERIFY_HK_PAY_ERROR(Constants.BUSINESS_ERROR_CODE + "348", "微信钱包用户实名校验失败"),
    USER_EPRC_ERROR(Constants.SYSTEM_ERROR_CODE + "349", "调用EPRC服务信息失败"),

    //user not kyc=用户未做实名认证
    USER_CDD_VERIFY_NOT_REAL_NAME(Constants.BUSINESS_ERROR_CODE + "350", "微信钱包用户未进行实名认证"),
    //check name kyc info err=校验用户姓名kyc信息错误
    USER_CDD_VERIFY_USERNAME_ERROR(Constants.BUSINESS_ERROR_CODE + "351", "微信钱包用户实名校验中用户姓名校验失败"),
    //check id kyc info err=校验用户证件kyc信息错误
    USER_CDD_VERIFY_IDNO_ERROR(Constants.BUSINESS_ERROR_CODE + "352", "微信钱包用户实名校验中用户证件校验失败"),
    //parameter error=参数错误
    USER_CDD_VERIFY_PARAMETER_ERROR(Constants.BUSINESS_ERROR_CODE + "353", "微信钱包参数错误"),
    //user not exist=用户不存在
    USER_CDD_VERIFY_USER_NOT_EXIST(Constants.BUSINESS_ERROR_CODE + "354", "用户unionid获取失败，微信钱包系统中无法找到此用户"),
    CALL_WX_HK_PAY_SERVER_ERROR(Constants.SYSTEM_ERROR_CODE + "355", "call wx hk pay server error!"),

    USER_ANTI_FRAUD_SEND_ERROR(Constants.BUSINESS_ERROR_CODE + "360", "反欺诈上报发送失败"),
    USER_ANTI_FRAUD_SYSTEM_ERROR(Constants.BUSINESS_ERROR_CODE + "361", "AFM系统异常"),
    OPEN_ACCT_TYPE_ILLEGAL_ERROR(Constants.BUSINESS_ERROR_CODE + "362", "开户账户类型非法，请检查"),
    MAIN_DOC_NAME_ILLEGAL_ERROR(Constants.BUSINESS_ERROR_CODE + "363", "开户主证件姓名和客户基本姓名不一致，请检查！"),
    DOC_NOT_MATCH_ACCT_ILLEGAL_ERROR(Constants.BUSINESS_ERROR_CODE + "364", "开户证件类与账户类型不匹配，请检查！"),
    BANK_CARD_IS_NULL_ERROR(Constants.BUSINESS_ERROR_CODE + "365", "银行卡为空，请检查！"),
    ACCT_NO_NOT_EXISTS_ERROR(Constants.BUSINESS_ERROR_CODE + "366", "账户信息不存在，请检查！"),
    MAIN_DOC_CAN_NOT_DELETE_ERROR(Constants.BUSINESS_ERROR_CODE + "367", "主证件不可以删除！"),

    MGR_USER_ALREADY_OPEN_ACCOUT(Constants.BUSINESS_ERROR_CODE + "400", "当前用户已开过户不能再绑定手机号"),
    MGR_USER_WX_NOT_CHANGE(Constants.BUSINESS_ERROR_CODE + "403", "该微信号与当前绑定的微信号相同"),
    MGR_USER_FB_NOT_CHANGE(Constants.BUSINESS_ERROR_CODE + "404", "该Facebook帐号与当前绑定的Facebook帐号相同"),
    @Deprecated
    MGR_USER_CHANGE_MOBILE_OR_MAIL_ERROR(Constants.BUSINESS_ERROR_CODE + "405", "更改失败:{0}"),
    MGR_EMAIL_USED_ERROR(Constants.BUSINESS_ERROR_CODE + "406", "该电邮地址已经被其他户口绑定，您可以尝试绑定其他电邮地址"),
    MGR_MOBILE_USED_ERROR(Constants.BUSINESS_ERROR_CODE + "407", "该手机号已经被其他户口绑定，您可以尝试绑定其他手机号"),
    MGR_WX_USED_ERROR(Constants.BUSINESS_ERROR_CODE + "408", "该微信号已经被其他户口绑定，您可以尝试绑定其他微信号"),
    MGR_FB_USED_ERROR(Constants.BUSINESS_ERROR_CODE + "409", "该Facebook账户已经被其他户口绑定，您可以尝试绑定其他Facebook账户"),
    MGR_USER_CHANGE_TRANSPASSWORD_ERROR(Constants.BUSINESS_ERROR_CODE + "410", "修改密码失败:{0}"),
    MGR_USER_RESET_TRANSPASSWORD_ERROR(Constants.BUSINESS_ERROR_CODE + "411", "重置密码失败:{0}"),
    MGR_EMAIL_SAME_AS_CURRENT(Constants.BUSINESS_ERROR_CODE + "412", "该电邮地址与当前绑定的电邮地址相同"),
    MGR_MOBILE_SAME_AS_CURRENT(Constants.BUSINESS_ERROR_CODE + "413", "该手机号与当前绑定的手机号相同"),
    MGR_ONLY_CAN_OPEN_ACCOUT_USE(Constants.BUSINESS_ERROR_CODE + "414", "开户后方可更改个人资料"),
    MGR_GET_USER_QUERY_PASSWORD_FLAG(Constants.BUSINESS_ERROR_CODE + "415", "获取用户查询密码设置标志错误"),
    MGR_CHECK_USER_QUERY_PASSWORD(Constants.BUSINESS_ERROR_CODE + "416", "查询密码验证失败:{0}"),
    MGR_CHECK_USER_TRANS_PASSWORD(Constants.BUSINESS_ERROR_CODE + "417", "交易密码验证失败:{0}"),
    MGR_CHECK_MODIFY_LIMIT(Constants.BUSINESS_ERROR_CODE + "418", "感谢选用富融银行。抱歉，我们暂时未能处理您更改资料。您如有需要，请亲临本行客户体验中心，或致电21112688联络本行客服热线。"),
    MGR_USER_APPLE_NOT_CHANGE(Constants.BUSINESS_ERROR_CODE + "419", "该Apple ID与当前绑定的Apple ID相同"),
    MGR_APPLE_USED_ERROR(Constants.BUSINESS_ERROR_CODE + "420", "该Apple ID已经被其他户口绑定，您可以尝试绑定其他Apple ID"),
//    MGR_AUTHENTICATION_ERROR(Constants.BUSINESS_ERROR_CODE + "421", "多次输入错误，请检查身份证信息，并于{0}小时后重试。"),
    MGR_AUTHENTICATION_ERROR_CN(Constants.BUSINESS_ERROR_CODE + "421", "多次输入错误，请检查身份证信息，并于{0}小时后重试。"),
    MGR_AUTHENTICATION_ERROR_HK(Constants.BUSINESS_ERROR_CODE + "421", "多次輸入錯誤，請檢查證件資料，並於{0}小時後重試。"),
    MGR_AUTHENTICATION_ERROR_EN(Constants.BUSINESS_ERROR_CODE + "421", "Too many attempts, please check your ID information, and try again in {0} hours."),
    MGR_USER_NO_WX_ERROR(Constants.BUSINESS_ERROR_CODE + "441", "该用户没有微信注册"),
    MGR_USER_HAVE_WX_ERROR(Constants.BUSINESS_ERROR_CODE + "442", "您的户口已绑定其他微信，是否更新为当前微信"),
    MGR_USER_BIND_DEVICE_ERROR(Constants.BUSINESS_ERROR_CODE + "443", "未能成完成手机安全绑定，请重新再试"),
    MGR_DEVICE_NOT_EXIST(Constants.BUSINESS_ERROR_CODE + "444", "该设备不存在或不是最近使用的设备"),

    AFS_JUDGE_ERROR(Constants.BUSINESS_ERROR_CODE + "445", "为保障您的账户安全，请使用富融银行手机应用程式进行身份验证。"),
    AFS_JUDGE_IP_ERROR(Constants.BUSINESS_ERROR_CODE+"211","您的网络位址不安全。我们建议您更换安全网络重试登录。如有查询，请立即致电21112688联络本行客服热线。"),
    AFS_JUDGE_BLACK_ERROR(Constants.BUSINESS_ERROR_CODE+"212","为保障阁下，目前您暂时无法登录。如有查询，请立即致电21112688联络本行客服热线。"),

    MGR_USER_REMOVE_DEVICE_ERROR(Constants.BUSINESS_ERROR_CODE + "446", "解除设备绑定失败，请重试！"),
    SYNC_RELATED_INFO_ERROR(Constants.BUSINESS_ERROR_CODE + "447", "同步关联人信息失败，请检查！"),
    APPLE_TOKEN_REVOKE_FAIL(Constants.BUSINESS_ERROR_CODE + "448", "revoke apple token fail");

    public static final Map<String, ErrorCodes> MGR_AUTHENTICATION_ERROR_MAPPING = new HashMap<>();
    static {
        MGR_AUTHENTICATION_ERROR_MAPPING.put(Constants.Lang.ZH_CN.value(), MGR_AUTHENTICATION_ERROR_CN);
        MGR_AUTHENTICATION_ERROR_MAPPING.put(Constants.Lang.ZH_HK.value(), MGR_AUTHENTICATION_ERROR_HK);
        MGR_AUTHENTICATION_ERROR_MAPPING.put(Constants.Lang.EN_GB.value(), MGR_AUTHENTICATION_ERROR_EN);
    }

        private String code;
    private String msg;

    ErrorCodes(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String code() {
        return this.code;
    }

    public String msg() {
        return this.msg;
    }

    public static boolean isSysError(String code) {
        return code.startsWith(Constants.SYSTEM_ERROR_CODE);
    }

    public static boolean isBizError(String code) {
        return code.startsWith(Constants.BUSINESS_ERROR_CODE);
    }

}
