package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Catalog;
import io.swagger.client.model.Graphobject;
import io.swagger.client.model.Sku;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Node   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("obmSettings")
  private Object obmSettings = null;

  @SerializedName("ipAddresses")
  private Object ipAddresses = null;

  @SerializedName("workflows")
  private List<Graphobject> workflows = new ArrayList<Graphobject>();

  @SerializedName("catalogs")
  private List<Catalog> catalogs = new ArrayList<Catalog>();

  @SerializedName("sku")
  private Sku sku = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getProfile() {
    return profile;
  }
  public void setProfile(String profile) {
    this.profile = profile;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getObmSettings() {
    return obmSettings;
  }
  public void setObmSettings(Object obmSettings) {
    this.obmSettings = obmSettings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getIpAddresses() {
    return ipAddresses;
  }
  public void setIpAddresses(Object ipAddresses) {
    this.ipAddresses = ipAddresses;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Graphobject> getWorkflows() {
    return workflows;
  }
  public void setWorkflows(List<Graphobject> workflows) {
    this.workflows = workflows;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Catalog> getCatalogs() {
    return catalogs;
  }
  public void setCatalogs(List<Catalog> catalogs) {
    this.catalogs = catalogs;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Sku getSku() {
    return sku;
  }
  public void setSku(Sku sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(id, node.id) &&
        Objects.equals(profile, node.profile) &&
        Objects.equals(name, node.name) &&
        Objects.equals(obmSettings, node.obmSettings) &&
        Objects.equals(ipAddresses, node.ipAddresses) &&
        Objects.equals(workflows, node.workflows) &&
        Objects.equals(catalogs, node.catalogs) &&
        Objects.equals(sku, node.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profile, name, obmSettings, ipAddresses, workflows, catalogs, sku);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    obmSettings: ").append(toIndentedString(obmSettings)).append("\n");
    sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
    sb.append("    catalogs: ").append(toIndentedString(catalogs)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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
