/*
 * Alfresco Content Services REST API
 * **Core API**  Provides access to the core features of Alfresco Content Services. 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Constraint
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class Constraint {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("parameters")
  private Map<String, Object> parameters = null;

  public Constraint id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Constraint type(String type) {
    this.type = type;
    return this;
  }

   /**
   * the type of the constraint
   * @return type
  **/
  @Schema(description = "the type of the constraint")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Constraint title(String title) {
    this.title = title;
    return this;
  }

   /**
   * the human-readable constraint title
   * @return title
  **/
  @Schema(description = "the human-readable constraint title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Constraint description(String description) {
    this.description = description;
    return this;
  }

   /**
   * the human-readable constraint description
   * @return description
  **/
  @Schema(description = "the human-readable constraint description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Constraint parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  public Constraint putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<String, Object>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @Schema(description = "")
  public Map<String, Object> getParameters() {
    return parameters;
  }

  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Constraint constraint = (Constraint) o;
    return Objects.equals(this.id, constraint.id) &&
        Objects.equals(this.type, constraint.type) &&
        Objects.equals(this.title, constraint.title) &&
        Objects.equals(this.description, constraint.description) &&
        Objects.equals(this.parameters, constraint.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, title, description, parameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraint {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
