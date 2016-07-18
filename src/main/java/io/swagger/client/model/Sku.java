package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Node;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Sku   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rules")
  private Object rules = null;

  @SerializedName("nodes")
  private List<Node> nodes = new ArrayList<Node>();

  @SerializedName("discoveryGraphName")
  private String discoveryGraphName = null;

  @SerializedName("discoveryGraphOptions")
  private Object discoveryGraphOptions = null;

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
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getRules() {
    return rules;
  }
  public void setRules(Object rules) {
    this.rules = rules;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<Node> getNodes() {
    return nodes;
  }
  public void setNodes(List<Node> nodes) {
    this.nodes = nodes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDiscoveryGraphName() {
    return discoveryGraphName;
  }
  public void setDiscoveryGraphName(String discoveryGraphName) {
    this.discoveryGraphName = discoveryGraphName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getDiscoveryGraphOptions() {
    return discoveryGraphOptions;
  }
  public void setDiscoveryGraphOptions(Object discoveryGraphOptions) {
    this.discoveryGraphOptions = discoveryGraphOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sku sku = (Sku) o;
    return Objects.equals(id, sku.id) &&
        Objects.equals(name, sku.name) &&
        Objects.equals(rules, sku.rules) &&
        Objects.equals(nodes, sku.nodes) &&
        Objects.equals(discoveryGraphName, sku.discoveryGraphName) &&
        Objects.equals(discoveryGraphOptions, sku.discoveryGraphOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, rules, nodes, discoveryGraphName, discoveryGraphOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sku {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    discoveryGraphName: ").append(toIndentedString(discoveryGraphName)).append("\n");
    sb.append("    discoveryGraphOptions: ").append(toIndentedString(discoveryGraphOptions)).append("\n");
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
