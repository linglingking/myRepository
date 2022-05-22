package com.wjl.demo.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 产品表
 * </p>
 *
 * @author wjl
 * @since 2022-05-14
 */
@TableName("st_product")
@ApiModel(value = "StProduct对象", description = "产品表")
public class StProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    private String id;

    @ApiModelProperty("产品id")
    private String productId;

    @ApiModelProperty("产品名称")
    private String productName;

    @ApiModelProperty("产品价钱")
    private BigDecimal productPrice;

    @ApiModelProperty("产品类型")
    private String productType;

    @ApiModelProperty("是否必选")
    private Integer packageForceTag;

    @ApiModelProperty("是否默认")
    private Integer packageDefaultTag;

    @ApiModelProperty("产品模式：0-主产品，1-附加产品")
    private String productMode;

    @ApiModelProperty("生效方式:1：立即生效 2：次月生效")
    private String enableTag;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("租户id")
    private String tenantId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    public Integer getPackageForceTag() {
        return packageForceTag;
    }

    public void setPackageForceTag(Integer packageForceTag) {
        this.packageForceTag = packageForceTag;
    }
    public Integer getPackageDefaultTag() {
        return packageDefaultTag;
    }

    public void setPackageDefaultTag(Integer packageDefaultTag) {
        this.packageDefaultTag = packageDefaultTag;
    }
    public String getProductMode() {
        return productMode;
    }

    public void setProductMode(String productMode) {
        this.productMode = productMode;
    }
    public String getEnableTag() {
        return enableTag;
    }

    public void setEnableTag(String enableTag) {
        this.enableTag = enableTag;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "StProduct{" +
            "id=" + id +
            ", productId=" + productId +
            ", productName=" + productName +
            ", productPrice=" + productPrice +
            ", productType=" + productType +
            ", packageForceTag=" + packageForceTag +
            ", packageDefaultTag=" + packageDefaultTag +
            ", productMode=" + productMode +
            ", enableTag=" + enableTag +
            ", description=" + description +
            ", tenantId=" + tenantId +
        "}";
    }
}
