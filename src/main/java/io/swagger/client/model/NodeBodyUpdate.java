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
import io.swagger.client.model.PermissionsBody;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * NodeBodyUpdate
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class NodeBodyUpdate {
  @SerializedName("name")
  private String name = null;

  @SerializedName("nodeType")
  private String nodeType = null;

  @SerializedName("aspectNames")
  private List<String> aspectNames = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("permissions")
  private PermissionsBody permissions = null;

  public NodeBodyUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name must not contain spaces or the following special characters: * \&quot; &lt; &gt; \\ / ? : and |. The character . must not be used at the end of the name. 
   * @return name
  **/
  @Schema(description = "The name must not contain spaces or the following special characters: * \" < > \\ / ? : and |. The character . must not be used at the end of the name. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeBodyUpdate nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(description = "")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public NodeBodyUpdate aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public NodeBodyUpdate addAspectNamesItem(String aspectNamesItem) {
    if (this.aspectNames == null) {
      this.aspectNames = new ArrayList<String>();
    }
    this.aspectNames.add(aspectNamesItem);
    return this;
  }

   /**
   * Get aspectNames
   * @return aspectNames
  **/
  @Schema(description = "")
  public List<String> getAspectNames() {
    return aspectNames;
  }

  public void setAspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
  }

  public NodeBodyUpdate properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public NodeBodyUpdate putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public NodeBodyUpdate permissions(PermissionsBody permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public PermissionsBody getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsBody permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyUpdate nodeBodyUpdate = (NodeBodyUpdate) o;
    return Objects.equals(this.name, nodeBodyUpdate.name) &&
        Objects.equals(this.nodeType, nodeBodyUpdate.nodeType) &&
        Objects.equals(this.aspectNames, nodeBodyUpdate.aspectNames) &&
        Objects.equals(this.properties, nodeBodyUpdate.properties) &&
        Objects.equals(this.permissions, nodeBodyUpdate.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nodeType, aspectNames, properties, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
