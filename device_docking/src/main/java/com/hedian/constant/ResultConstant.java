package com.hedian.constant;

/**
 * @Description: Result参数枚举
 * @Author: noahw
 * @CreateDate: 2019-01-11 9:38
 * @Version: 1.0.1
 */
public enum ResultConstant {

    //服务异常
    INTERNAL_SERVER_ERROR("20000", "internal.server.error"),

    //接口调用失败
    IFACE_CALL_FAIL("20001", "iface.call.fail"),

    //业务处理成功
    SUCCESS("10000", "success"),

    //token过期或无效(包含未登陆)
    ACCESS_DENIED("30000", "access.denied"),

    //参数错误
    PARAM_ERROR("40001", "param.error"),

    //无操作权限
    PERMISSION_DENIED("30001", "permission.denied"),

    //操作失败
    OPERATE_FAIL("40000", "operation.failed"),
    NO_EXIST("40002", "no.exist"),
    EDIT_FAIL("40003", "edit.fail"),
    IS_EXIST("40001", "is.exist"),
    ADD_FAIL("40004", "add.fail"),
    DELETE_FAIL("40005", "delete.fail"),
    IMPORT_FAIL("40006", "import.fail"),
    FILE_TYPE_ERROR("40007", "file.type.error"),
    CHECK_FAIL("40008", "check.fail"),

    //HTTP方法不支持
    HTTP_METHOD_NOT_SUPPORT("50000", "http.method.not.support"),

    //用户名或密码错误
    USERNAME_PASSWORD_ERROR("30001", "user.password.error"),

    //其他所有错误
    OTHER_ERROE("60000", "other.error"),

    ;
    public String resultCode;
    public String message;

    ResultConstant(String resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
