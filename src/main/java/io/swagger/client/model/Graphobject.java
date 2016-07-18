package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Node;

import com.google.gson.annotations.SerializedName;




@ApiModel(description = "")
public class Graphobject   {
  
  @SerializedName("id")
  private String id = null;

  @SerializedName("instanceid")
  private String instanceid = null;

  @SerializedName("context")
  private Object context = null;

  @SerializedName("definition")
  private Object definition = null;

  @SerializedName("tasks")
  private Object tasks = null;

  @SerializedName("node")
  private Node node = null;

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
  public String getInstanceid() {
    return instanceid;
  }
  public void setInstanceid(String instanceid) {
    this.instanceid = instanceid;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getContext() {
    return context;
  }
  public void setContext(Object context) {
    this.context = context;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getDefinition() {
    return definition;
  }
  public void setDefinition(Object definition) {
    this.definition = definition;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Object getTasks() {
    return tasks;
  }
  public void setTasks(Object tasks) {
    this.tasks = tasks;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Node getNode() {
    return node;
  }
  public void setNode(Node node) {
    this.node = node;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Graphobject graphobject = (Graphobject) o;
    return Objects.equals(id, graphobject.id) &&
        Objects.equals(instanceid, graphobject.instanceid) &&
        Objects.equals(context, graphobject.context) &&
        Objects.equals(definition, graphobject.definition) &&
        Objects.equals(tasks, graphobject.tasks) &&
        Objects.equals(node, graphobject.node);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instanceid, context, definition, tasks, node);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Graphobject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceid: ").append(toIndentedString(instanceid)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
