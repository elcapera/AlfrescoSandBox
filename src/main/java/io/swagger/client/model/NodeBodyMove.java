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
/**
 * NodeBodyMove
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class NodeBodyMove {
  @SerializedName("targetParentId")
  private String targetParentId = null;

  @SerializedName("name")
  private String name = null;

  public NodeBodyMove targetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
    return this;
  }

   /**
   * Get targetParentId
   * @return targetParentId
  **/
  @Schema(required = true, description = "")
  public String getTargetParentId() {
    return targetParentId;
  }

  public void setTargetParentId(String targetParentId) {
    this.targetParentId = targetParentId;
  }

  public NodeBodyMove name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeBodyMove nodeBodyMove = (NodeBodyMove) o;
    return Objects.equals(this.targetParentId, nodeBodyMove.targetParentId) &&
        Objects.equals(this.name, nodeBodyMove.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetParentId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeBodyMove {\n");
    
    sb.append("    targetParentId: ").append(toIndentedString(targetParentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
