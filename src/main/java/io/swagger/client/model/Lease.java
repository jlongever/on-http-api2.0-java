package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Lease   {
  
  @SerializedName("mac")
  private String mac = null;

  @SerializedName("ipAddress")
  private String ipAddress = null;

  @SerializedName("reservationTimer")
  private Integer reservationTimer = null;

  @SerializedName("reservationExpiresAt")
  private Long reservationExpiresAt = null;

  @SerializedName("renewalTimer")
  private Integer renewalTimer = null;

  @SerializedName("rebindingTimer")
  private Integer rebindingTimer = null;

  @SerializedName("expirationTimer")
  private Integer expirationTimer = null;

  @SerializedName("renewalExpiresAt")
  private Long renewalExpiresAt = null;

  @SerializedName("rebindExpiresAt")
  private Long rebindExpiresAt = null;

  @SerializedName("leaseExpiresAt")
  private Long leaseExpiresAt = null;

  @SerializedName("boundFlag")
  private Boolean boundFlag = null;

  @SerializedName("reservedFlag")
  private Boolean reservedFlag = null;

  @SerializedName("reserveTimer")
  private String reserveTimer = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMac() {
    return mac;
  }
  public void setMac(String mac) {
    this.mac = mac;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getIpAddress() {
    return ipAddress;
  }
  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getReservationTimer() {
    return reservationTimer;
  }
  public void setReservationTimer(Integer reservationTimer) {
    this.reservationTimer = reservationTimer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getReservationExpiresAt() {
    return reservationExpiresAt;
  }
  public void setReservationExpiresAt(Long reservationExpiresAt) {
    this.reservationExpiresAt = reservationExpiresAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRenewalTimer() {
    return renewalTimer;
  }
  public void setRenewalTimer(Integer renewalTimer) {
    this.renewalTimer = renewalTimer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRebindingTimer() {
    return rebindingTimer;
  }
  public void setRebindingTimer(Integer rebindingTimer) {
    this.rebindingTimer = rebindingTimer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getExpirationTimer() {
    return expirationTimer;
  }
  public void setExpirationTimer(Integer expirationTimer) {
    this.expirationTimer = expirationTimer;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRenewalExpiresAt() {
    return renewalExpiresAt;
  }
  public void setRenewalExpiresAt(Long renewalExpiresAt) {
    this.renewalExpiresAt = renewalExpiresAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getRebindExpiresAt() {
    return rebindExpiresAt;
  }
  public void setRebindExpiresAt(Long rebindExpiresAt) {
    this.rebindExpiresAt = rebindExpiresAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getLeaseExpiresAt() {
    return leaseExpiresAt;
  }
  public void setLeaseExpiresAt(Long leaseExpiresAt) {
    this.leaseExpiresAt = leaseExpiresAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBoundFlag() {
    return boundFlag;
  }
  public void setBoundFlag(Boolean boundFlag) {
    this.boundFlag = boundFlag;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getReservedFlag() {
    return reservedFlag;
  }
  public void setReservedFlag(Boolean reservedFlag) {
    this.reservedFlag = reservedFlag;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getReserveTimer() {
    return reserveTimer;
  }
  public void setReserveTimer(String reserveTimer) {
    this.reserveTimer = reserveTimer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lease lease = (Lease) o;
    return Objects.equals(mac, lease.mac) &&
        Objects.equals(ipAddress, lease.ipAddress) &&
        Objects.equals(reservationTimer, lease.reservationTimer) &&
        Objects.equals(reservationExpiresAt, lease.reservationExpiresAt) &&
        Objects.equals(renewalTimer, lease.renewalTimer) &&
        Objects.equals(rebindingTimer, lease.rebindingTimer) &&
        Objects.equals(expirationTimer, lease.expirationTimer) &&
        Objects.equals(renewalExpiresAt, lease.renewalExpiresAt) &&
        Objects.equals(rebindExpiresAt, lease.rebindExpiresAt) &&
        Objects.equals(leaseExpiresAt, lease.leaseExpiresAt) &&
        Objects.equals(boundFlag, lease.boundFlag) &&
        Objects.equals(reservedFlag, lease.reservedFlag) &&
        Objects.equals(reserveTimer, lease.reserveTimer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mac, ipAddress, reservationTimer, reservationExpiresAt, renewalTimer, rebindingTimer, expirationTimer, renewalExpiresAt, rebindExpiresAt, leaseExpiresAt, boundFlag, reservedFlag, reserveTimer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lease {\n");
    
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    reservationTimer: ").append(toIndentedString(reservationTimer)).append("\n");
    sb.append("    reservationExpiresAt: ").append(toIndentedString(reservationExpiresAt)).append("\n");
    sb.append("    renewalTimer: ").append(toIndentedString(renewalTimer)).append("\n");
    sb.append("    rebindingTimer: ").append(toIndentedString(rebindingTimer)).append("\n");
    sb.append("    expirationTimer: ").append(toIndentedString(expirationTimer)).append("\n");
    sb.append("    renewalExpiresAt: ").append(toIndentedString(renewalExpiresAt)).append("\n");
    sb.append("    rebindExpiresAt: ").append(toIndentedString(rebindExpiresAt)).append("\n");
    sb.append("    leaseExpiresAt: ").append(toIndentedString(leaseExpiresAt)).append("\n");
    sb.append("    boundFlag: ").append(toIndentedString(boundFlag)).append("\n");
    sb.append("    reservedFlag: ").append(toIndentedString(reservedFlag)).append("\n");
    sb.append("    reserveTimer: ").append(toIndentedString(reserveTimer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
