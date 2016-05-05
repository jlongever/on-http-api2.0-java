package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Action object
 **/

@ApiModel(description = "Action object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:18.953-04:00")
public class Action   {
  


  public enum CommandEnum {
    CANCEL("cancel");

    private String value;

    CommandEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CommandEnum command = null;
  private Object options = null;

  
  /**
   * Command to execute
   **/
  
  @ApiModelProperty(required = true, value = "Command to execute")
  @JsonProperty("command")
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
  @JsonProperty("options")
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

