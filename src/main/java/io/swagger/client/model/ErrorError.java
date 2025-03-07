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
 * ErrorError
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class ErrorError {
  @SerializedName("errorKey")
  private String errorKey = null;

  @SerializedName("statusCode")
  private Integer statusCode = null;

  @SerializedName("briefSummary")
  private String briefSummary = null;

  @SerializedName("stackTrace")
  private String stackTrace = null;

  @SerializedName("descriptionURL")
  private String descriptionURL = null;

  @SerializedName("logId")
  private String logId = null;

  public ErrorError errorKey(String errorKey) {
    this.errorKey = errorKey;
    return this;
  }

   /**
   * Get errorKey
   * @return errorKey
  **/
  @Schema(description = "")
  public String getErrorKey() {
    return errorKey;
  }

  public void setErrorKey(String errorKey) {
    this.errorKey = errorKey;
  }

  public ErrorError statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @Schema(required = true, description = "")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public ErrorError briefSummary(String briefSummary) {
    this.briefSummary = briefSummary;
    return this;
  }

   /**
   * Get briefSummary
   * @return briefSummary
  **/
  @Schema(required = true, description = "")
  public String getBriefSummary() {
    return briefSummary;
  }

  public void setBriefSummary(String briefSummary) {
    this.briefSummary = briefSummary;
  }

  public ErrorError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

   /**
   * Get stackTrace
   * @return stackTrace
  **/
  @Schema(required = true, description = "")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public ErrorError descriptionURL(String descriptionURL) {
    this.descriptionURL = descriptionURL;
    return this;
  }

   /**
   * Get descriptionURL
   * @return descriptionURL
  **/
  @Schema(required = true, description = "")
  public String getDescriptionURL() {
    return descriptionURL;
  }

  public void setDescriptionURL(String descriptionURL) {
    this.descriptionURL = descriptionURL;
  }

  public ErrorError logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * Get logId
   * @return logId
  **/
  @Schema(description = "")
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorError errorError = (ErrorError) o;
    return Objects.equals(this.errorKey, errorError.errorKey) &&
        Objects.equals(this.statusCode, errorError.statusCode) &&
        Objects.equals(this.briefSummary, errorError.briefSummary) &&
        Objects.equals(this.stackTrace, errorError.stackTrace) &&
        Objects.equals(this.descriptionURL, errorError.descriptionURL) &&
        Objects.equals(this.logId, errorError.logId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorKey, statusCode, briefSummary, stackTrace, descriptionURL, logId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorError {\n");
    
    sb.append("    errorKey: ").append(toIndentedString(errorKey)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    briefSummary: ").append(toIndentedString(briefSummary)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    descriptionURL: ").append(toIndentedString(descriptionURL)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
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
