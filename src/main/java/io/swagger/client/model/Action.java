package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import com.google.gson.annotations.SerializedName;




/**
 * Action object
 **/
@ApiModel(description = "Action object")
public class Action   {
  

public enum CommandEnum {
  @SerializedName(""cancel"")
  CANCEL(""cancel"");

  private String value;

  CommandEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  @SerializedName("command")
  private CommandEnum command = null;

  @SerializedName("options")
  private Object options = null;

  /**
   * Command to execute
   **/
  @ApiModelProperty(required = true, value = "Command to execute")
  public CommandEnum getCommand() {
    return command;
  }
  public void setCommand(CommandEnum command) {
    this.command = command;
  }

  /**
   * Command options object
   **/
  @ApiModelProperty(value = "Command options object")
  public Object getOptions() {
    return options;
  }
  public void setOptions(Object options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action action = (Action) o;
    return Objects.equals(command, action.command) &&
        Objects.equals(options, action.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
