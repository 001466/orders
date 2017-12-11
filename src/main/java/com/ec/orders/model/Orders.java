package com.ec.orders.model;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_name
     *
     * @mbg.generated
     */
    private String customName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_mobile
     *
     * @mbg.generated
     */
    private String customMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_email
     *
     * @mbg.generated
     */
    private String customEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_wechat
     *
     * @mbg.generated
     */
    private String customWechat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_qq
     *
     * @mbg.generated
     */
    private String customQq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_content
     *
     * @mbg.generated
     */
    private String customContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.custom_from
     *
     * @mbg.generated
     */
    private String customFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.product_id
     *
     * @mbg.generated
     */
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.product_branch
     *
     * @mbg.generated
     */
    private String productBranch;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.product_material
     *
     * @mbg.generated
     */
    private String productMaterial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.product_prices
     *
     * @mbg.generated
     */
    private BigDecimal productPrices;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_province
     *
     * @mbg.generated
     */
    private String deliverProvince;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_city
     *
     * @mbg.generated
     */
    private String deliverCity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_county
     *
     * @mbg.generated
     */
    private String deliverCounty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_adderss
     *
     * @mbg.generated
     */
    private String deliverAdderss;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_time
     *
     * @mbg.generated
     */
    private String deliverTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_status
     *
     * @mbg.generated
     */
    private Integer deliverStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_express
     *
     * @mbg.generated
     */
    private String deliverExpress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.deliver_express_id
     *
     * @mbg.generated
     */
    private String deliverExpressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createby
     *
     * @mbg.generated
     */
    private Long createby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createtime
     *
     * @mbg.generated
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createdate
     *
     * @mbg.generated
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createip
     *
     * @mbg.generated
     */
    private String createip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.updateby
     *
     * @mbg.generated
     */
    private Long updateby;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.updatetime
     *
     * @mbg.generated
     */
    private Date updatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.updateip
     *
     * @mbg.generated
     */
    private String updateip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.converted
     *
     * @mbg.generated
     */
    private Integer converted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.type
     *
     * @return the value of orders.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.type
     *
     * @param type the value for orders.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_name
     *
     * @return the value of orders.custom_name
     *
     * @mbg.generated
     */
    public String getCustomName() {
        return customName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_name
     *
     * @param customName the value for orders.custom_name
     *
     * @mbg.generated
     */
    public void setCustomName(String customName) {
        this.customName = customName == null ? null : customName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_mobile
     *
     * @return the value of orders.custom_mobile
     *
     * @mbg.generated
     */
    public String getCustomMobile() {
        return customMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_mobile
     *
     * @param customMobile the value for orders.custom_mobile
     *
     * @mbg.generated
     */
    public void setCustomMobile(String customMobile) {
        this.customMobile = customMobile == null ? null : customMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_email
     *
     * @return the value of orders.custom_email
     *
     * @mbg.generated
     */
    public String getCustomEmail() {
        return customEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_email
     *
     * @param customEmail the value for orders.custom_email
     *
     * @mbg.generated
     */
    public void setCustomEmail(String customEmail) {
        this.customEmail = customEmail == null ? null : customEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_wechat
     *
     * @return the value of orders.custom_wechat
     *
     * @mbg.generated
     */
    public String getCustomWechat() {
        return customWechat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_wechat
     *
     * @param customWechat the value for orders.custom_wechat
     *
     * @mbg.generated
     */
    public void setCustomWechat(String customWechat) {
        this.customWechat = customWechat == null ? null : customWechat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_qq
     *
     * @return the value of orders.custom_qq
     *
     * @mbg.generated
     */
    public String getCustomQq() {
        return customQq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_qq
     *
     * @param customQq the value for orders.custom_qq
     *
     * @mbg.generated
     */
    public void setCustomQq(String customQq) {
        this.customQq = customQq == null ? null : customQq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_content
     *
     * @return the value of orders.custom_content
     *
     * @mbg.generated
     */
    public String getCustomContent() {
        return customContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_content
     *
     * @param customContent the value for orders.custom_content
     *
     * @mbg.generated
     */
    public void setCustomContent(String customContent) {
        this.customContent = customContent == null ? null : customContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.custom_from
     *
     * @return the value of orders.custom_from
     *
     * @mbg.generated
     */
    public String getCustomFrom() {
        return customFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.custom_from
     *
     * @param customFrom the value for orders.custom_from
     *
     * @mbg.generated
     */
    public void setCustomFrom(String customFrom) {
        this.customFrom = customFrom == null ? null : customFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.product_id
     *
     * @return the value of orders.product_id
     *
     * @mbg.generated
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.product_id
     *
     * @param productId the value for orders.product_id
     *
     * @mbg.generated
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.product_branch
     *
     * @return the value of orders.product_branch
     *
     * @mbg.generated
     */
    public String getProductBranch() {
        return productBranch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.product_branch
     *
     * @param productBranch the value for orders.product_branch
     *
     * @mbg.generated
     */
    public void setProductBranch(String productBranch) {
        this.productBranch = productBranch == null ? null : productBranch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.product_material
     *
     * @return the value of orders.product_material
     *
     * @mbg.generated
     */
    public String getProductMaterial() {
        return productMaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.product_material
     *
     * @param productMaterial the value for orders.product_material
     *
     * @mbg.generated
     */
    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial == null ? null : productMaterial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.product_prices
     *
     * @return the value of orders.product_prices
     *
     * @mbg.generated
     */
    public BigDecimal getProductPrices() {
        return productPrices;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.product_prices
     *
     * @param productPrices the value for orders.product_prices
     *
     * @mbg.generated
     */
    public void setProductPrices(BigDecimal productPrices) {
        this.productPrices = productPrices;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_province
     *
     * @return the value of orders.deliver_province
     *
     * @mbg.generated
     */
    public String getDeliverProvince() {
        return deliverProvince;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_province
     *
     * @param deliverProvince the value for orders.deliver_province
     *
     * @mbg.generated
     */
    public void setDeliverProvince(String deliverProvince) {
        this.deliverProvince = deliverProvince == null ? null : deliverProvince.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_city
     *
     * @return the value of orders.deliver_city
     *
     * @mbg.generated
     */
    public String getDeliverCity() {
        return deliverCity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_city
     *
     * @param deliverCity the value for orders.deliver_city
     *
     * @mbg.generated
     */
    public void setDeliverCity(String deliverCity) {
        this.deliverCity = deliverCity == null ? null : deliverCity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_county
     *
     * @return the value of orders.deliver_county
     *
     * @mbg.generated
     */
    public String getDeliverCounty() {
        return deliverCounty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_county
     *
     * @param deliverCounty the value for orders.deliver_county
     *
     * @mbg.generated
     */
    public void setDeliverCounty(String deliverCounty) {
        this.deliverCounty = deliverCounty == null ? null : deliverCounty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_adderss
     *
     * @return the value of orders.deliver_adderss
     *
     * @mbg.generated
     */
    public String getDeliverAdderss() {
        return deliverAdderss;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_adderss
     *
     * @param deliverAdderss the value for orders.deliver_adderss
     *
     * @mbg.generated
     */
    public void setDeliverAdderss(String deliverAdderss) {
        this.deliverAdderss = deliverAdderss == null ? null : deliverAdderss.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_time
     *
     * @return the value of orders.deliver_time
     *
     * @mbg.generated
     */
    public String getDeliverTime() {
        return deliverTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_time
     *
     * @param deliverTime the value for orders.deliver_time
     *
     * @mbg.generated
     */
    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime == null ? null : deliverTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_status
     *
     * @return the value of orders.deliver_status
     *
     * @mbg.generated
     */
    public Integer getDeliverStatus() {
        return deliverStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_status
     *
     * @param deliverStatus the value for orders.deliver_status
     *
     * @mbg.generated
     */
    public void setDeliverStatus(Integer deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_express
     *
     * @return the value of orders.deliver_express
     *
     * @mbg.generated
     */
    public String getDeliverExpress() {
        return deliverExpress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_express
     *
     * @param deliverExpress the value for orders.deliver_express
     *
     * @mbg.generated
     */
    public void setDeliverExpress(String deliverExpress) {
        this.deliverExpress = deliverExpress == null ? null : deliverExpress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.deliver_express_id
     *
     * @return the value of orders.deliver_express_id
     *
     * @mbg.generated
     */
    public String getDeliverExpressId() {
        return deliverExpressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.deliver_express_id
     *
     * @param deliverExpressId the value for orders.deliver_express_id
     *
     * @mbg.generated
     */
    public void setDeliverExpressId(String deliverExpressId) {
        this.deliverExpressId = deliverExpressId == null ? null : deliverExpressId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createby
     *
     * @return the value of orders.createby
     *
     * @mbg.generated
     */
    public Long getCreateby() {
        return createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createby
     *
     * @param createby the value for orders.createby
     *
     * @mbg.generated
     */
    public void setCreateby(Long createby) {
        this.createby = createby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createtime
     *
     * @return the value of orders.createtime
     *
     * @mbg.generated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createtime
     *
     * @param createtime the value for orders.createtime
     *
     * @mbg.generated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createdate
     *
     * @return the value of orders.createdate
     *
     * @mbg.generated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createdate
     *
     * @param createdate the value for orders.createdate
     *
     * @mbg.generated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createip
     *
     * @return the value of orders.createip
     *
     * @mbg.generated
     */
    public String getCreateip() {
        return createip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createip
     *
     * @param createip the value for orders.createip
     *
     * @mbg.generated
     */
    public void setCreateip(String createip) {
        this.createip = createip == null ? null : createip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.updateby
     *
     * @return the value of orders.updateby
     *
     * @mbg.generated
     */
    public Long getUpdateby() {
        return updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.updateby
     *
     * @param updateby the value for orders.updateby
     *
     * @mbg.generated
     */
    public void setUpdateby(Long updateby) {
        this.updateby = updateby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.updatetime
     *
     * @return the value of orders.updatetime
     *
     * @mbg.generated
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.updatetime
     *
     * @param updatetime the value for orders.updatetime
     *
     * @mbg.generated
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.updateip
     *
     * @return the value of orders.updateip
     *
     * @mbg.generated
     */
    public String getUpdateip() {
        return updateip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.updateip
     *
     * @param updateip the value for orders.updateip
     *
     * @mbg.generated
     */
    public void setUpdateip(String updateip) {
        this.updateip = updateip == null ? null : updateip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.converted
     *
     * @return the value of orders.converted
     *
     * @mbg.generated
     */
    public Integer getConverted() {
        return converted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.converted
     *
     * @param converted the value for orders.converted
     *
     * @mbg.generated
     */
    public void setConverted(Integer converted) {
        this.converted = converted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orders other = (Orders) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getCustomName() == null ? other.getCustomName() == null : this.getCustomName().equals(other.getCustomName()))
            && (this.getCustomMobile() == null ? other.getCustomMobile() == null : this.getCustomMobile().equals(other.getCustomMobile()))
            && (this.getCustomEmail() == null ? other.getCustomEmail() == null : this.getCustomEmail().equals(other.getCustomEmail()))
            && (this.getCustomWechat() == null ? other.getCustomWechat() == null : this.getCustomWechat().equals(other.getCustomWechat()))
            && (this.getCustomQq() == null ? other.getCustomQq() == null : this.getCustomQq().equals(other.getCustomQq()))
            && (this.getCustomContent() == null ? other.getCustomContent() == null : this.getCustomContent().equals(other.getCustomContent()))
            && (this.getCustomFrom() == null ? other.getCustomFrom() == null : this.getCustomFrom().equals(other.getCustomFrom()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductBranch() == null ? other.getProductBranch() == null : this.getProductBranch().equals(other.getProductBranch()))
            && (this.getProductMaterial() == null ? other.getProductMaterial() == null : this.getProductMaterial().equals(other.getProductMaterial()))
            && (this.getProductPrices() == null ? other.getProductPrices() == null : this.getProductPrices().equals(other.getProductPrices()))
            && (this.getDeliverProvince() == null ? other.getDeliverProvince() == null : this.getDeliverProvince().equals(other.getDeliverProvince()))
            && (this.getDeliverCity() == null ? other.getDeliverCity() == null : this.getDeliverCity().equals(other.getDeliverCity()))
            && (this.getDeliverCounty() == null ? other.getDeliverCounty() == null : this.getDeliverCounty().equals(other.getDeliverCounty()))
            && (this.getDeliverAdderss() == null ? other.getDeliverAdderss() == null : this.getDeliverAdderss().equals(other.getDeliverAdderss()))
            && (this.getDeliverTime() == null ? other.getDeliverTime() == null : this.getDeliverTime().equals(other.getDeliverTime()))
            && (this.getDeliverStatus() == null ? other.getDeliverStatus() == null : this.getDeliverStatus().equals(other.getDeliverStatus()))
            && (this.getDeliverExpress() == null ? other.getDeliverExpress() == null : this.getDeliverExpress().equals(other.getDeliverExpress()))
            && (this.getDeliverExpressId() == null ? other.getDeliverExpressId() == null : this.getDeliverExpressId().equals(other.getDeliverExpressId()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreatedate() == null ? other.getCreatedate() == null : this.getCreatedate().equals(other.getCreatedate()))
            && (this.getCreateip() == null ? other.getCreateip() == null : this.getCreateip().equals(other.getCreateip()))
            && (this.getUpdateby() == null ? other.getUpdateby() == null : this.getUpdateby().equals(other.getUpdateby()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getUpdateip() == null ? other.getUpdateip() == null : this.getUpdateip().equals(other.getUpdateip()))
            && (this.getConverted() == null ? other.getConverted() == null : this.getConverted().equals(other.getConverted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getCustomName() == null) ? 0 : getCustomName().hashCode());
        result = prime * result + ((getCustomMobile() == null) ? 0 : getCustomMobile().hashCode());
        result = prime * result + ((getCustomEmail() == null) ? 0 : getCustomEmail().hashCode());
        result = prime * result + ((getCustomWechat() == null) ? 0 : getCustomWechat().hashCode());
        result = prime * result + ((getCustomQq() == null) ? 0 : getCustomQq().hashCode());
        result = prime * result + ((getCustomContent() == null) ? 0 : getCustomContent().hashCode());
        result = prime * result + ((getCustomFrom() == null) ? 0 : getCustomFrom().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductBranch() == null) ? 0 : getProductBranch().hashCode());
        result = prime * result + ((getProductMaterial() == null) ? 0 : getProductMaterial().hashCode());
        result = prime * result + ((getProductPrices() == null) ? 0 : getProductPrices().hashCode());
        result = prime * result + ((getDeliverProvince() == null) ? 0 : getDeliverProvince().hashCode());
        result = prime * result + ((getDeliverCity() == null) ? 0 : getDeliverCity().hashCode());
        result = prime * result + ((getDeliverCounty() == null) ? 0 : getDeliverCounty().hashCode());
        result = prime * result + ((getDeliverAdderss() == null) ? 0 : getDeliverAdderss().hashCode());
        result = prime * result + ((getDeliverTime() == null) ? 0 : getDeliverTime().hashCode());
        result = prime * result + ((getDeliverStatus() == null) ? 0 : getDeliverStatus().hashCode());
        result = prime * result + ((getDeliverExpress() == null) ? 0 : getDeliverExpress().hashCode());
        result = prime * result + ((getDeliverExpressId() == null) ? 0 : getDeliverExpressId().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreatedate() == null) ? 0 : getCreatedate().hashCode());
        result = prime * result + ((getCreateip() == null) ? 0 : getCreateip().hashCode());
        result = prime * result + ((getUpdateby() == null) ? 0 : getUpdateby().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getUpdateip() == null) ? 0 : getUpdateip().hashCode());
        result = prime * result + ((getConverted() == null) ? 0 : getConverted().hashCode());
        return result;
    }
}