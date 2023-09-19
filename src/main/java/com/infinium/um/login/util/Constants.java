package com.infinium.um.login.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局公共常量
 *
 * @author dfenghuang
 */
public class Constants {
    public static String REQID = "103379";
    public static String SYSTEM_ERROR_CODE = REQID + "1";
    public static String BUSINESS_ERROR_CODE = REQID + "2";
    public static int SESSION_KEY_LENGTH = 32;
    public static int CAR_LENGTH = 4;
    public static String CMQ_TOPICS = "t_vb_base_fps";
    public static String ANTIFRAUD_CMQ_TOPICS = "t_antifraud_event";

    //系统编号
    public static final String SYSTEM_ID = "ECF";

    //um-user模块名
    public static final String USER_APPLICATION_NAME = "um-user";

    //客户类型，1-个人、2-对公。
    public static interface CUST_TYPE{
        public static final Integer PERSONAL = 1;
        public static final Integer COMPANY = 2;
    }

    //路由方式，0-汇总调用 1-UID 2-客户类型 3-证件类型 todo: 0-汇总调用暂时不支持
    public static interface ROUTE_TYPE{
        public static final Integer SUMMARY_REQUEST = 0;
        public static final Integer REQUEST_BY_UID = 1;
        public static final Integer SUMMARY_BY_CUST_TYPE = 2;
        public static final Integer SUMMARY_BY_DOC_TYPE = 3;
    }

    public interface target_server_name{
        public String HKVB_ICORE_CBS = "hkvb_icore_cbs";   //核心系统
        public String HKVB_CARD = "hkvb_card";            //卡系统
        public String AO_VB_BUS_ADDRESS_SERVER = "ao_vb_bus_address_server";     //EPRC
        public String AO_VB_AFS_REALTIME_SERVER = "ao_vb_afs_realtime_server";     //外调反欺诈服务
        public String AO_VB_CONTRACT_TEMPL_SERVER = "ao_vb_contract_templ_server";     //合同中心
        public String DAO_VB_BASE_CONFIG_SERVER = "dao_vb_base_config_server";     //配置通用化服务
        public String AO_VB_SAFE_SERVER = "ao_vb_safe_server";     //安全中心
        public String AO_VB_MCS_MSGSEND_SERVER = "ao_vb_mcs_msgsend_server";     //消息中心
    }

    /**
     * 高阳对公ECIF基础默认值 begin
     * */
    public static final String CCIF_APPLICATION_NAME = "um-buss-online";

    //uid号段分配
    public static final String CCIF_UID_BEGINNING = "6";

    //银行号
    public static final String CCIF_BANK_NUM = "001";
    //交易机构号
    public static final String CCIF_TRANS_ORGANIZE_NUM = "1234";
    //对公柜面，默认虚拟柜员
    public static final String CCIF_USER_NAME = "00001";
    //报文类型
    public static final String CCIF_MESSAGE_TYPE = "0100";
    //版本号
    public static final String CCIF_VRSN_NUM = "1.0";
    //版本号
    public static final Integer CCIF_DEFAULT_RETRY_NUMBER = 1;

    //对公客户账户类型
    public interface CCIF_DOC_TYPE{
        public final Integer BUSINESS_REGISTRATION = 227;
        public final Integer COMPANY_REGISTRATION = 228;
        public final Integer OTHER_COMPANY_DOC = 299;
    }

    //对公交易返回状态
    public interface CCIF_INFO_TYPE{
        public String SUCCESS = "N";
        public String SUCCESS_WITH_AUTH = "A";
        public String FAIL = "E";
        public String AUTH_AND_ROLLBACK = "S";
    }

    //对公多页查询条件
    public interface CCIF_PAGE{
        public Integer START_RECORD_DEFAULT = 1;
        public Integer PIECE_NUMBER_DEFAULT = 10;
    }

    //同步原因
    public interface related_sync_reason{
        public String OPEN_CUST = "OPEN_CUST";     //开户
        public String XBOSS_UPDATE_CUST = "XBOSS_UPDATE_CUST";     //xboss修改客户资料
        public String CUST_UPDATE_INFO = "CUST_UPDATE_INFO";     //客户发起信息变更
    }

    // 请求状态 0-初始化、1-成功、2-失败、3-处理中、4-异常、5-废单
    public interface trans_status{
        public Integer INIT = 0;
        public Integer SUCCESS = 1;
        public Integer FAIL = 2;
        public Integer PROCESSING = 3;
        public Integer ABNORMAL = 4;
        public Integer WASTE = 5;
    }

    /**
     * 高阳对公ECIF基础默认值 end
     * */

    //对公交易返回状态
    public interface comm_res_status{
        public String SUCCESS = "S";
        public String SUCCESS_WITH_AUTH = "A";
        public String FAIL = "F";
    }

    /**
     * DB常用状态 1 正常 2 不正常 一般为删除意思
     */
    public static Integer STATUS_NORMAL = 1;
    public static Integer STATUS_UNNORMAL = 2;

    public static final Map<Integer, String> StatusMapping = new HashMap<>();

    static {
        StatusMapping.put(STATUS_NORMAL, "正常");
        StatusMapping.put(STATUS_UNNORMAL, "销户");
    }

    /**
     * id类型
     */
    public static String PARTYNUM_ID = "P";
    public static String CORP_PARTYNUM_ID = "C";

    /**
     * 0-未绑定， 1-已绑定， 2-填邮箱未校验
     */
    public static Integer YES = 1;
    public static Integer NO = 0;
    public static Integer BINDING=2;

    public static Integer INT_YES = 1;
    public static Integer INT_NO = 2;
    public static Integer INT_INIT = 9;

    /**
     * 1-开启,0-关闭
     */
    public static Integer REACH_YES = 1;
    public static Integer REACH_NO = 0;

    /**
     * loginFlag
     * 1   首次登录
     * 0   其他
     */
    public static Integer LOGIN_FIRST = 1;
    public static Integer LOGIN_OTHER = 0;

    /**
     * 是否
     */
    public static String Y = "Y";
    public static String N = "N";

    /**
     * 是否
     */
    public static String STR_1 = "1";
    public static String STR_0 = "0";

    /**
     * 是否
     */
    public static String S_YES = "1";
    public static String S_NO = "0";

    /**
     * true/false
     */
    public static String TRUE = "true";
    public static String FALSE = "false";

    /**
     * 修改/重置
     */
    public static String CHANGE = "CHANGE";
    public static String RESET = "RESET";

    /**
     * 交易类型
     */
    public static String QUERY = "Q";
    public static String TRANSANCTION = "T";
    public static String CARD = "C";

    //渠道
    public static String HKVB_UM_CHANNEL = "hkvb-um";
    public static String X_AUTH_USER = "X-AUTH-USER";

    //证件类型
    public static int IDCARD_TYPE_HK = 1;
    public static int IDCARD_TYPE_CN = 2;
    public static int IDCARD_TYPE_HK_MO_PASS = 3;

    //验证码有效期
    @Deprecated
    public static int VALIDATE_CODE_EXPIRE_SECONDS = 90;
    //验证码存放时间
    @Deprecated
    public static int VALIDATE_CODE_STORE_SECONDS = 5 * 60;
    //15分钟内发送最多15次
    @Deprecated
    public static int VALIDATE_CODE_LIMIT_CONTACTNO_MINUTES = 15;
    @Deprecated
    public static long VALIDATE_CODE_LIMIT_CONTACTNO_TIMES = 15;
    //15分钟内单设备发送最多30次
    @Deprecated
    public static int VALIDATE_CODE_LIMIT_DEVICE_MINUTES = 15;
    @Deprecated
    public static long VALIDATE_CODE_LIMIT_DEVICE_TIMES = 30;
    //重发限制
    @Deprecated
    public static long VALIDATE_CODE_RESEND_SECONDS = 60;

    /**
     * 密码来源
     */
    public static final String FROM_KEY_SERVER = "from_key_server:";
    //短信一位模板填充值
    public static final String MSG_DEFAULT_PLACEHOLDER = "content";
    public static final String MSG_DEFAULT_JUMP_URL = "jump_url";
    public static final String SERVICE_PHONE = "21112688";
    public static final String SHORT_JUMP_URL_MY = "/e/my/index.html";
    public static final String LONG_JUMP_URL_MY = "https://www.infiniumbank.com/Operation?module=tabbar&tab=2&m_pop=1&__nativeUrl=%2FOperation"; // 我的
    public static final String JUMP_URL_MESSAGE = "/e/my/message.html?__target=weex"; // 消息中心页面的站内地址
    public static final String JUMP_PWD_SET_PUSH = "https://static.infiniumbank.com/e/coms/setting.html?__target=weex&__subPath=pwdModify&pwdType=trade&"; // 修改交易密码页面
    public static final String JUMP_PWD_SET_LETTER = "/e/coms/setting.html?__target=weex&__subPath=pwdModify&pwdType=trade&"; // 修改交易密码页面

    // 触达模板中日期格式
    public static final String NOTIFY_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    public static final String NOTIFY_DATE_FORMAT_D = "yyyy-MM-dd";
    public static final String NOTIFY_DATE_FORMAT_T = "HH:mm:ss";
    public static final String NOTIFY_DATE_FORMAT_DT = "yyyy-MM-dd HH:mm:ss";

    //客服验证结果
    public static final Integer ONLINE_HX_VALIDATE_NONE = 0;
    public static final Integer ONLINE_HX_VALIDATE_LOW = 1;
    public static final Integer ONLINE_HX_VALIDATE_HIGHT = 2;

    //客服热线登录验证方式
    public static final Integer HOTLINE_HX_CRADNO = 1;
    public static final Integer HOTLINE_HX_MOBILE = 2;
    public static final Integer HOTLINE_HX_ACCTNO = 3;

    //人脸验证
    public static final Integer ADD_VERIFIED_METHOD = 3;

    public static final String SAS_DATE_FORMAT = "yyyyMMdd";

    // 客户历史起始号
    public static final Integer LEGACY_CUST_HIST_SEQ = 1;

    public static final Integer CUST_HIST_SEQ_ALL = -1; // 查询所有历史
    public static final Integer CUST_HIST_NO_LATEST = null; // 查询最新历史

    public static final String AUDIT_TAG_OPEN_ACCT = "OPEN_ACCT"; // 开户
    public static final String AUDIT_TAG_CLOSE_ACCT = "CLOSE_ACCT"; // 销户

    public static final String AUDIT_TAG_ACCT_OPEN = "ACCT_OPEN"; // 账户开户
    public static final String AUDIT_TAG_ACCT_CLOSE = "ACCT_CLOSE"; // 账户销户

    //    public static final String AUDIT_TAG_APP = "APP"; // APP修改
    public static final String AUDIT_TAG_XBOSS = "XBOSS"; // XBOSS修改
    public static final String AUDIT_TAG_CRS_CERT = "CRS_CERT"; // 修改合同

    public static final String CONTRACT_FATCA_CRS = "0010000022920200203";
    public static final String CONTRACT_FATCA_CRS_PAPER = "0010000024720200403";
    public static final String CONTRACT_WXHK_ASSOCIATION = "wechatRelation";

    public static final String REMARKS_EKYC_QA_REMARKS = "ekyc_qa_remarks";

    public static final String POPUP_CHECK_LIVE_ADDRESS = "liveAddress";
    public static final String POPUP_CHECK_CONTACT_ADDRESS = "contactAddress";

    public static final Integer INT_DFT_ZERO = 0;
    public static final String SAFE_MONITOR_SCENES = "身份证信息核验";
    public static final String SAFE_MONITOR_ALERT = "错误次数达到上限";
    public static final Integer SAFE_MONITOR_VERIFIED_TYPE = 4; //4，表示交易密码
    public static final String SAFE_MONITOR_SCENN = "4";
    public static final String SAFE_MONITOR_VERIFIED_METHOD = "104"; //安全功能 101短信 102邮箱 103人脸 104身份证信息校验
    public static final String BASE_CONFIG_BUSINESS_TYPE = "201";
    public static final String BASE_CONFIG_SAFE_FILENAME = "safe";
    public static final String BASE_CONFIG_SERVER_NAME = "um";
    public static final String BASE_CONFIG_EPRC_FILENAME = "eprc";
    public static final String BASE_CONFIG_BUSINESS_TYPE_EPRC = "116";

    public static String POST = "POST";
    public static String GET = "GET";

    public static String HK_GSMCODE = "+852";

    public static final Integer WX_FROM_APP = 1;
    public static final Integer WX_FROM_OFFICIAL = 2;
    public static final Integer WX_FROM_PROGRAM = 3;

    public static final String STR_EMPTY = "";

    //登录台KEY相关
    public static final String H5_ACCT_ASSOCIATED = "H5_ACCT_ASSOCIATED";  //完整账户关联+设备绑定
    public static final String H5_WX_INFO = "H5_WX_INFO";   //H5，钱包贷款存WX客户信息
    public static final String H5_DEVICE_BIND = "H5_DEVICE_BIND";  //H5，设备绑定临时登录态
    public static final String H5_CHECK_MOBILE = "H5_CHECK_MOBILE";  //H5，设备绑定临时登录态
    public static final String BUSS_SESSIONID = "bussSessionId";
    public static final String BUSS_ID = "bussId";

    public static interface bussType{
        public static final Integer H5_ACCT_ASSOCIATED = 1;  //完整账户关联+设备绑定
        public static final Integer H5_WX_INFO = 2;  //H5，钱包贷款存WX客户信息
        public static final Integer H5_DEVICE_BIND = 3;  //H5，设备绑定临时登录态
        public static final Integer H5_CHECK_MOBILE = 4;  //H5，手机OTP临时登录态
    }

    public static final Map<Integer, String> BUSSTYPE_MAPPING = new HashMap<>();
    static {
        BUSSTYPE_MAPPING.put(bussType.H5_ACCT_ASSOCIATED, H5_ACCT_ASSOCIATED);
        BUSSTYPE_MAPPING.put(bussType.H5_WX_INFO, H5_WX_INFO);
        BUSSTYPE_MAPPING.put(bussType.H5_CHECK_MOBILE, H5_CHECK_MOBILE);
        BUSSTYPE_MAPPING.put(bussType.H5_DEVICE_BIND, H5_DEVICE_BIND);
    }

    // VB-WPHK接口签名原串sign字段填充值
    public static final String WPHK_RSA_SIGN_PADDING = "00000000";

    public static final String BANKRUPTCY_RESULTS_FILE_NAME = "Bankruptcy List Results.xlsx";
    public static final String BANKRUPTCY_ORDER_FILE_NAME = "Bankruptcy Order List.xlsx";

    public static final String PATRYNUM_ATTRIBUTE_PREFIX = "PATRYNUM_LOCK_";
    /**
     * 基础账户类型
     */
    public static String BASE_ACCOUNT_TYPE = "DP_EC01";
    public static String EASY_ACCOUNT_TYPE = "DP_ES01"; //易存账户类型
    public static String SOUTH_BOUND_ACCOUNT_TPYE = "DP_SS01"; //南向通账户类型

    /**
     * 冻结对象类型
     */
    public enum FrozeObjectType {

        SUBACCOUNT("1"), //子账户
        ACCOUNT("2"), //账户
        CARD("3"), //卡号
        CUSTOMER("4"); //客户号

        private String value;

        FrozeObjectType(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * 认证渠道
     *
     * @author dfenghuang
     */
    public enum AuthChannel {
        ANDROID(1),
        IOS(2),
        SMALL_PROJECT(3),
        OFFICIAL_WX(4);//微信公众号

        private int value;

        AuthChannel(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 平台
     */
    public enum Platform {
        IOS("0"),                       //0 ios
        ANDROID("1"),                   //1 安卓
        H5("2"),                        //2 h5
        WX_APPLETS("3"),                //3 小程序
        PUBLIC_CLOUD("10");             //10 公有云

        private String value;

        Platform(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * 接口授权开关
     */
    public enum AuthInterfaceFlag {

        OFF(0),   //关闭
        ON(1);     //开启

        private int value;

        AuthInterfaceFlag(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 安全认证
     *
     * @author dfenghuang
     */
    public enum SafeVerifiedType {
        USER_INFO_MODIFY(2),
        UP_PWD(3),
        RESET_PWD(4),
        RESET_HAS_SOFT_TOKEN_PWD(42),//有soft token时候的重置密码
        ANTI_FRAUD_FACE_IDENTIFICATION(25),//判断是否需要人脸识别
        FACE_OR_FINGER_VALIDATE(26),
        UP_QUERY_PWD(31),//修改查询密码
        RESET_QUERY_PWD(32),//重置查询密码
        UP_CAR_PWD(49),//实体卡密码修改
        RESET_CAR_PWD(50),//实体卡密码重置
        USER_MOBILE_MODIFY(53),//手机修改
        RESET_LOST_SOFT_TOKEN_PWD(57),//重置交易密码(忘记密码的同时是否丢失softToken)
        DDMC_MOBILE_LOGIN(67),//DDMC手机号登陆
        WX_ACCT_BIND(70),//微信账户绑定
        HKWXPAY_MOBILE_CHECK(72),//香港钱包手机号校验
        HKWXPAY_ASSOCIATION(73),//香港钱包账户关联
        HKWXPAY_BIND_DEVICEID(75),//绑定账户关联设备绑定唯一id
        HKWXPAY_REMOVE_DEVICEID(94),//解除绑定账户关联设备绑定唯一id
        SOUTH_BOUND_PASSWORD_MODIFY(115); //南向通密码修改

        private int value;

        SafeVerifiedType(int value) {
            this.value = value;
        }

        public static final Map<Integer, Integer> mapping = new HashMap<>();

        static {
            mapping.put(1, USER_INFO_MODIFY.value());
            mapping.put(2, UP_PWD.value());
            mapping.put(3, RESET_PWD.value());
            mapping.put(4, FACE_OR_FINGER_VALIDATE.value());
            mapping.put(5, UP_QUERY_PWD.value());
            mapping.put(6, RESET_QUERY_PWD.value());
            mapping.put(8, UP_CAR_PWD.value());
            mapping.put(9, RESET_CAR_PWD.value());
            mapping.put(10, USER_MOBILE_MODIFY.value());
            mapping.put(11, RESET_LOST_SOFT_TOKEN_PWD.value());
            mapping.put(12, DDMC_MOBILE_LOGIN.value());
            mapping.put(13, WX_ACCT_BIND.value());
            mapping.put(14, HKWXPAY_ASSOCIATION.value());
            mapping.put(15, HKWXPAY_MOBILE_CHECK.value());
            mapping.put(16, HKWXPAY_BIND_DEVICEID.value());
            mapping.put(25, ANTI_FRAUD_FACE_IDENTIFICATION.value());
            mapping.put(17, HKWXPAY_ASSOCIATION.value());
            mapping.put(94, HKWXPAY_REMOVE_DEVICEID.value());
            mapping.put(115, SOUTH_BOUND_PASSWORD_MODIFY.value());
        }

        public int value() {
            return value;
        }
    }

    /**
     * 认证方式
     *
     * @author dfenghuang
     */
    public enum AuthWay {
        PWD(1),
        EMAIL(2),
        Mobile(3),
        WechatOpen(4),
        FB(5),
        APPLE(7);

        private int value;

        AuthWay(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 修改类型
     *
     * @author dfenghuang
     */
    public enum ModifyType {
        Mobile(1),
        EMAIL(2),
        Wechat(3),
        FB(4);

        private int value;

        ModifyType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * redis key 前綴
     *
     * @author dfenghuang
     */
    @Deprecated
    public enum RedisPreffix {
        MOBILE_LOGIN("ml_"),
        EMAIL_LOGIN("el_"),
        MOBILE_FIRST_BIND("mfb_"),
        MOBILE_CHANGE_BIND("mcb_"),
        EMAIL_FIRST_BIND("efb_"),
        EMAIL_CHANGE_BIND("ecb_"),
        VLIDATE_CODE_LIMIT_DEVICE("vcld_"),
        VLIDATE_CODE_LIMIT_CONTACTNO("vclc_");

        private String value;

        RedisPreffix(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    //(zh_CN: 中文, zh_HK: 中文-香港, en: 英文)
    public enum Lang {
        ZH_CN("zh-CN"),
        ZH_HK("zh-HK"),
        EN_GB("en-GB");

        private String value;

        Lang(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    public enum MsgTemplate {
        SMS_UNLOCK("vb_um_account_unlock"),
        SMS_ABNORDEVICE_LOGIN("vb_um_account_abnordevice_login"),
        LOGIN_INFO_POST_CHANGE("vb_um_changeinfo_user_info_change"),
        LOGIN_INFO_PRE_CHANGE("vb_um_changeinfo_warn"),
        XBOSS_INFO_CHANGE("vb_um_changeinfo_xbossinfochange"),
        TRANS_PWD_CHANGE_OR_RESET("vb_um_password_trans_pwd_change_or_reset"),
        PWD_LONGTERM_UNMODIFIED("vb_um_password_pwd_longterm_unmodified"),
        CAR_PWD_CHANGE("vb_base_card_manage_modify_card_password_succ"),
        CAR_PWD_RESET("vb_base_card_manage_reset_card_password_succ"),
        AFS_IP_LOGIN("vb_um_account_AFS bad ip_bad ip"),
        AFS_ACCOUNT_LOGIN("vb_um_account_AFS bad ip_At risk account"),
        H5_AFS_IP_LOGIN("vb_um_account_AFS bad ip_dliphmd"),
        H5_AFS_ACCOUNT_LOGIN("vb_um_account_AFS bad ip_dlfxzh"),
        CUST_MOBILE_CHANGE("vb_um"),
        CUST_EMAIL_CHANGE("vb_um"),
        CUST_DOC_CHANGE("vb_um"),
        CUST_BIRTHLAND_CHANGE("vb_um"),
        CUST_CONTACT_ADDR_CHANGE("vb_um"),
        CUST_RESIDENCE_CHANGE("vb_um"),
        CHANNEL_CHANGE("vb_um_switch_Successchanged"),
        AUTHENTICATION_ERROR("vb_um_password_IdentityVerification"),
        SAFE_SECURIRTY_ALERT("vb_common_safe_SecurityAlert"),
        ADDRESS_MANUAL_STATUS("vb_um_changeinfo_chageAddressFlag"),
        ADDRESS_MANUAL_MAIL_STATUS("vb_um_changeinfo_chageAddressFlagEmailReturn"),
        WX_ASSOCIATION("vb_um_account_Accountassociation_association"),    //账户关联 & 绑定成功
        WX_ASSOCIATION_WITH_DEVICE_FAIL("vb_um_account_Accountassociation_AccountAssociationFail"),    //解除账户关联 & 解绑失败
        WX_DISASSOCIATION("vb_um_account_Accountassociation_disassociate"),
        WX_UNASSOCIATION_DISBIND("vb_um_account_Accountassociation_SuccessfulAccountDissociation"),
        WX_DEVICE_BIND_SUCCESS("vb_common_safe_Hfivedevicebinding_bindingsuccess"),
        WX_DEVICE_BIND_FAIL("vb_common_safe_Hfivedevicebinding_bindingfail"),

        WX_REMOVE_DEVICE_BIND("vb_common_safe_Hfivedevicebinding_unbindingsuccess"),//成功解除设备绑定

        placeholder("");


        private String value;

        MsgTemplate(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }

        public static final Map<String, String> mapping = new HashMap<>();

        static {
            mapping.put("1", SMS_UNLOCK.value);
        }
    }

    public enum Action {
        CREATE(1),
        UPDATE(2),
        DELETE(3),
        REPLACE_ALL(4),
        ACTIVATION(5);

        private int value;

        Action(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum BannerType {
        gid(1),
        uid(2),
        mobile(3);

        private Integer value;

        BannerType(Integer value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    public enum NoticeChannels {
        WECHAT("wx"),
        MOBILE("mobile"),
        EMAIL("email"),
        PUSH("push"),
        FACEBOOK("facebook"),
        WHATSAPP("whatsapp"),
        SMS("sms"), // 电话
        MAIL("mail"),
        LETTER("letter"); // 站内信

        private String value;

        NoticeChannels(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    //类型 EMAL--电子邮件;MOBN--手机号码;EN--英文名称;ZH--中文名称;HKID-香港身份证;
    public enum CmqModifyKey {
        EMAILE_CHANGE("EMAL"),
        MOBILE_CHANGE("MOBN"),
        ENNAME_CHANGE("EN"),
        NAME_CHANGE("ZH"),
        HKID_CHANGE("HKID"),
        PAYPW_CHANGE("PAYPW"),
        NOTICE_CHANGE("NOTICE");

        private String value;

        CmqModifyKey(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    //反洗钱黑名单 1.External blacklist 2.Internal blacklist 3.Internal list of sanctioned countries 4.List of country risk 5.MSO 6.Occupation
    public enum SasBlacklist {
        EXTERNAL_BLACKLIST(1),
        INTERNAL_BLACKLIST(2),
        SANCTIONED_COUNTRIES(3),
        RISK_COUNTRY(4),
        MSO(5),
        OCCUPATION(6),
        OECD(7),
        CRS(8),
        BANKRUPTCY(9);

        private int value;

        SasBlacklist(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum CryptState {
        ENCRYPTED,
        DECRYPTED
    }

    /**
     * 用户标签
     */
    public enum UserTagType {
        TAG_TYPE_HKVBSTAFF("1"),
        TAG_TYPE_VIP("2"),
        TAG_TYPE_SPECIAL("3"),
        TAG_TYPE_TENCENT("4"),
        TAG_TYPE_ICBC("5");

        private String value;

        UserTagType(String value) {
            this.value = value;
        }

        public static final Map<String, String> mapping = new HashMap<>();

        static {
            mapping.put("1", "hkvb员工");
            mapping.put("2", "vip用户");
            mapping.put("3", "审核特别账户");
            mapping.put("4", "腾讯员工");
            mapping.put("5", "工行员工");
        }

        public String value() {
            return value;
        }
    }

    /**
     * 特殊账号标志 0-普通用户 1-审核特别账户 2-vip用户
     */
    public enum CustomerSpecialType {
        SPECIAL_TYPE_NORMAL("0"),
        SPECIAL_TYPE_SPECIAL("1"),
        SPECIAL_TYPE_VIP("2");

        private String value;

        CustomerSpecialType(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * 营销触达修改渠道 1-APP 2-xboss 3-客户死亡或破产 4-消息中心 5-OFCA 6-营销邮件一键退订 9-数据初始化
     */
    public enum ChannelSourceType {
        APP(1),
        XBOSS(2),
        CUS_STATUS(3),
        MSG(4),
        OFCA(5),
        UNSUBSCRIBE_EMIAL(6),
        DATA_INIT(9);

        private int value;

        ChannelSourceType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 人工校验地址状态 1-正常 2-无效 3-无效邮件退回
     */
    public enum ManualInvalidAddress {
        NORMAL(1),
        INVALID(2),
        INVALID_MAIL(3);

        private int value;

        ManualInvalidAddress(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 反欺诈上报业务id
     *
     * @author shayneshi
     */
    public enum AntiBusinessType {
        LOGIN("login");

        private String value;

        AntiBusinessType(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * 反欺诈上报结果
     *
     * @author shayneshi
     */
    public enum AntiReportResult {
        SUCCESS("success"),
        FAILED("failed");

        private String value;

        AntiReportResult(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * 登陆渠道
     */
    public enum LoginChannelSource {
        APP("APP"),
        H5("H5"),
        APP_UNLOCK("APP_UNLOCK");

        private String value;

        LoginChannelSource(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    public enum PrivacyChannel {
        APP("1"),
        SMALL_PROJECT("2"),
        OFFICIAL_WX("3");

        private String value;

        PrivacyChannel(String value) {
            this.value = value;
        }

        public static final Map<Integer, String> authChannelMapping = new HashMap<>();

        static {
            authChannelMapping.put(AuthChannel.ANDROID.value, APP.value);
            authChannelMapping.put(AuthChannel.IOS.value, APP.value);
            authChannelMapping.put(AuthChannel.SMALL_PROJECT.value, SMALL_PROJECT.value);
            authChannelMapping.put(AuthChannel.OFFICIAL_WX.value, OFFICIAL_WX.value);
        }

        public String value() {
            return value;
        }
    }

    public enum PrivacyType {
        LOGIN("01"),
        OPEN_PRIVACY_POLICY("02"),
        HK_WX_PAY_ASSOCIATION("03");

        private String value;

        PrivacyType(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * EPRC校验状态 0.空值1.正常2.待客户确认3.客户已确认4.未能确认9.待运行EPRC
     */
    public enum EPRCStatus {
        INITIAL(0),
        NORMAL(1),
        TO_BE_CONFIRMED(2),
        CONFIRMED(3),
        NO_CONFIRM(4),
        EPRC(9);

        private int value;

        EPRCStatus(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 证件类型 1 香港身份证 2.大陆身份证 3.港澳通行证
     */
    public enum IDCardType {
        HK_ID_CARD(1),
        CN_ID_CARD(2),
        HK_MO_PASSPORT(3),
        HK_WORK_VISA(4);

        private int value;

        IDCardType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 即个人旅游（G）、探亲（T）、商务（S）、团队旅游（L）、其他（Q）、逗留（D）
     * 签证（签注）类型 个人旅游（G）、探亲（T）、商务（S）、团队旅游（L）、其他（Q）、逗留（D）
     */
    public enum VisaType {
        PERSONAL_TRAVEL("G"),
        VISIT_RELATIVES("T"),
        BUSINESS("S"),
        GROUP_TRAVEL("L"),
        OTHER("L"),
        STAY("D");

        private String value;

        VisaType(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }


    /**
     * 客户状态
     * 1正常2破产3死亡
     */
    public enum CusStatusType {
        NORMAL(1),
        BANKRUPTCY(2),
        DEATH(3);

        private int value;

        CusStatusType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }

        public static final Map<Integer, String> CusStatusMapping = new HashMap<>();

        static {
            CusStatusMapping.put(CusStatusType.NORMAL.value, "正常");
            CusStatusMapping.put(CusStatusType.BANKRUPTCY.value, "破产");
            CusStatusMapping.put(CusStatusType.DEATH.value, "死亡");
        }
    }

    /**
     * 账户标识
     *
     * @author shayneshi
     */
    public enum AcctFlag {
        BASE_ACCT(1),
        OTHER_ACCT(2);

        private int value;

        AcctFlag(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 账户状态
     *
     * @author shayneshi
     */
    public enum AcctStatus {
        NOMARL("1"),
        CLOSE("2");

        private String value;

        AcctStatus(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    /**
     * 用户状态 1-已登录未开户 2-已开户 3-销户
     */
    public enum UserStatus {
        LOGIN(1),
        OPEN_ACCT(2),
        CLOSE_ACCT(3);

        private int value;

        UserStatus(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }


    /**
     * 反欺诈业务id
     */
    public enum AfsBizType {
        LOGIN(1);

        private int value;

        AfsBizType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 反欺诈scene
     */
    public enum AfsScene {
        H5_LOGIN(4),
        APP_LOGIN(12),
        APP_UNLOCK(5);

        private int value;

        AfsScene(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 反欺诈校验状态 1 未命中规则 2 命中规则 3 未知
     */
    public enum AfsJudgeState {
        NONE(1),
        HIT(2),
        UNKNOW(3);

        private int value;

        AfsJudgeState(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    //ip黑名单
    public static int IP_BLACK = 1;
    //用户、手机、设备黑名单
    public static int USER_BLACK = 2;

    /**
     * 反欺诈建议处理方法
     */
    public enum AfsExtInfo{
        NEED_FACE("need_face"),  //人脸
        NEED_INTERCEPT("need_intercept"), //拦截
        FACE_BACK("face_back"); // 表示开户补回人脸

        private String value;

        AfsExtInfo(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     * 反欺诈命中规则id
     */
    public enum AfsRule{
        IP_BlACK_RULES("ipBlackRule"),
        EU_IP_BlACK_RULES("ipEuropRule"),
        PHONE_BlACK_RULES("phoneBlackRule"),
        SANCTIONS_IP_BlACK_RULES("ipCountryRule"),
        DEVICE_BlACK_RULES("deviceBlackRule"),
        USER_BlACK_RULES("userBlackRule");

        private String value;

        AfsRule(String value) {this.value = value;}

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     * 第三方绑定关系
     *
     * @author jeckiegao
     */
    public enum ThirdBindStatus {
        BIND(1),
        UNBOUND(2);

        private int value;

        ThirdBindStatus(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 邮箱是否校验
     * 1-是 ， 邮箱已校验
     * 0-否 ， 邮箱未校验
     * @author johnwchen
     */
    public enum EmailVerifyStatus{
        VERIFY(1),
        UNVERIFY(0);

        private int value;

        EmailVerifyStatus(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    //(证件信息操作类型，0-查询, 1-新增, 2-修改, 3-删除)
    public enum CredentialsOperateType {
        QUERY(0),
        ADD(1),
        MODIFY(2),
        DELETE(3);

        private int value;

        CredentialsOperateType(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    //(数据列表操作类型，1-设置, 2-删除, 3-覆盖)
    public enum listActionType {
        SET(1),
        DELETE(2),
        // db有，列表没有，就将该条记录从db删除。但是实际部分功能代码未实现此逻辑，例如/user/updateCifInfo接口修改地址列表。
        COVER(3);

        private Integer value;

        listActionType(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return value;
        }
    }

    /**
     * 令牌撤销结果
     * 1-撤销失败
     * 0-撤销成功
     * @author johnwchen
     */
    public enum RevokeResult{
        SUCCESS(0),
        FAILURE(1);

        private int value;

        RevokeResult(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }

    /**
     * 调apple接口返回码
     * 200-成功
     * 400-失败
     * @author johnwchen
     */
    public enum AppleRetCode{
        SUCCESS("200"),
        FAILURE("400");

        private String value;

        AppleRetCode(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }

    public interface ErrorCodeFilter{
        /**
         * 查询对公关联人士，不存在
         */
        String QUERY_RELATEDINFO_NOT_EXISTS = "1033794380";
        /**
         * 同步对公关联人士，不存在
         */
        String SYNC_RELATEDINFO_NOT_EXISTS = "1033794860";
    }

}
