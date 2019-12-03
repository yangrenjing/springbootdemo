package com.yrj.code.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yrj.code.util.Dates;
import lombok.Data;

import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：Yangrj
 * @date ：Created in 2019/12/3 13:59
 * @description：基础实体类
 * @version: 1.0$
 */
@Data
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = -4287607489867805101L;

    public static final String FIELD_OPERATE = "operate";
    public static final String FIELD_OBJECT_VERSION_NUMBER = "versionNumber";
    public static final String FIELD_CREATE_BY = "createBy";
    public static final String FIELD_CREATOR = "creator";
    public static final String FIELD_CREATE_DATE = "createDate";
    public static final String FIELD_UPDATE_BY = "updateBy";
    public static final String FIELD_UPDATER = "updater";
    public static final String FIELD_UPDATE_DATE = "updateDate";


    /**
     * 操作类型，add/update/delete 参考：{@link Constants.Operation}
     */
    @Transient
    private String _operate;

    /**
     * 数据版本号,每发生update则自增,用于实现乐观锁.
     */
    private Long versionNumber;

    //
    // 下面是标准 WHO 字段
    // ----------------------------------------------------------------------------------------------------
    /**
     * 创建人用户名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long createBy;
    /**
     * 创建人名称
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String creator;
    /**
     * 创建时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = Dates.DEFAULT_PATTERN)
    private Date createDate;

    /**
     * 更新人用户名
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long updateBy;
    /**
     * 更新人名称
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String updater;
    /**
     * 更新时间
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = Dates.DEFAULT_PATTERN)
    private Date updateDate;

    /**
     * 其它属性
     */
    @JsonIgnore
    @Transient
    protected Map<String, Object> innerMap = new HashMap<>();

    //
    // 下面是扩展属性字段
    // ----------------------------------------------------------------------------------------------------

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute8;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute9;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String attribute10;
}
