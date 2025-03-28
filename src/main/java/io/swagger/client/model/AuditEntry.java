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
import io.swagger.client.model.UserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * AuditEntry
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class AuditEntry {
  @SerializedName("id")
  private String id = null;

  @SerializedName("auditApplicationId")
  private String auditApplicationId = null;

  @SerializedName("createdByUser")
  private UserInfo createdByUser = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("values")
  private Object values = null;

  public AuditEntry id(String id) {
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

  public AuditEntry auditApplicationId(String auditApplicationId) {
    this.auditApplicationId = auditApplicationId;
    return this;
  }

   /**
   * Get auditApplicationId
   * @return auditApplicationId
  **/
  @Schema(required = true, description = "")
  public String getAuditApplicationId() {
    return auditApplicationId;
  }

  public void setAuditApplicationId(String auditApplicationId) {
    this.auditApplicationId = auditApplicationId;
  }

  public AuditEntry createdByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
    return this;
  }

   /**
   * Get createdByUser
   * @return createdByUser
  **/
  @Schema(required = true, description = "")
  public UserInfo getCreatedByUser() {
    return createdByUser;
  }

  public void setCreatedByUser(UserInfo createdByUser) {
    this.createdByUser = createdByUser;
  }

  public AuditEntry createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AuditEntry values(Object values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public Object getValues() {
    return values;
  }

  public void setValues(Object values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditEntry auditEntry = (AuditEntry) o;
    return Objects.equals(this.id, auditEntry.id) &&
        Objects.equals(this.auditApplicationId, auditEntry.auditApplicationId) &&
        Objects.equals(this.createdByUser, auditEntry.createdByUser) &&
        Objects.equals(this.createdAt, auditEntry.createdAt) &&
        Objects.equals(this.values, auditEntry.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, auditApplicationId, createdByUser, createdAt, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditEntry {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    auditApplicationId: ").append(toIndentedString(auditApplicationId)).append("\n");
    sb.append("    createdByUser: ").append(toIndentedString(createdByUser)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
