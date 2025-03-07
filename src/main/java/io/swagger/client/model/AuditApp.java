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
 * AuditApp
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class AuditApp {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("isEnabled")
  private Boolean isEnabled = true;

  @SerializedName("maxEntryId")
  private Integer maxEntryId = null;

  @SerializedName("minEntryId")
  private Integer minEntryId = null;

  public AuditApp id(String id) {
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

  public AuditApp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditApp isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Get isEnabled
   * @return isEnabled
  **/
  @Schema(description = "")
  public Boolean isIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public AuditApp maxEntryId(Integer maxEntryId) {
    this.maxEntryId = maxEntryId;
    return this;
  }

   /**
   * Get maxEntryId
   * @return maxEntryId
  **/
  @Schema(description = "")
  public Integer getMaxEntryId() {
    return maxEntryId;
  }

  public void setMaxEntryId(Integer maxEntryId) {
    this.maxEntryId = maxEntryId;
  }

  public AuditApp minEntryId(Integer minEntryId) {
    this.minEntryId = minEntryId;
    return this;
  }

   /**
   * Get minEntryId
   * @return minEntryId
  **/
  @Schema(description = "")
  public Integer getMinEntryId() {
    return minEntryId;
  }

  public void setMinEntryId(Integer minEntryId) {
    this.minEntryId = minEntryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditApp auditApp = (AuditApp) o;
    return Objects.equals(this.id, auditApp.id) &&
        Objects.equals(this.name, auditApp.name) &&
        Objects.equals(this.isEnabled, auditApp.isEnabled) &&
        Objects.equals(this.maxEntryId, auditApp.maxEntryId) &&
        Objects.equals(this.minEntryId, auditApp.minEntryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isEnabled, maxEntryId, minEntryId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditApp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    maxEntryId: ").append(toIndentedString(maxEntryId)).append("\n");
    sb.append("    minEntryId: ").append(toIndentedString(minEntryId)).append("\n");
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
