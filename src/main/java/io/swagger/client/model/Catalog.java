package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Node;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Catalog   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("node")
  private Node node = null;

  @SerializedName("data")
  private Object data = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Node getNode() {
    return node;
  }
  public void setNode(Node node) {
    this.node = node;
  }

  /**
   * arbitrary json object
   **/
  @ApiModelProperty(value = "arbitrary json object")
  public Object getData() {
    return data;
  }
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Catalog catalog = (Catalog) o;
    return Objects.equals(id, catalog.id) &&
        Objects.equals(source, catalog.source) &&
        Objects.equals(node, catalog.node) &&
        Objects.equals(data, catalog.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, node, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Catalog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
