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
 * Request object holding archive content related paramteres for given content. 
 */
@Schema(description = "Request object holding archive content related paramteres for given content. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class ArchiveContentRequest {
  @SerializedName("archiveParams")
  private Map<String, String> archiveParams = null;

  public ArchiveContentRequest archiveParams(Map<String, String> archiveParams) {
    this.archiveParams = archiveParams;
    return this;
  }

  public ArchiveContentRequest putArchiveParamsItem(String key, String archiveParamsItem) {
    if (this.archiveParams == null) {
      this.archiveParams = new HashMap<String, String>();
    }
    this.archiveParams.put(key, archiveParamsItem);
    return this;
  }

   /**
   * Optional map (String-String) of archive request properties for given content. 
   * @return archiveParams
  **/
  @Schema(description = "Optional map (String-String) of archive request properties for given content. ")
  public Map<String, String> getArchiveParams() {
    return archiveParams;
  }

  public void setArchiveParams(Map<String, String> archiveParams) {
    this.archiveParams = archiveParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchiveContentRequest archiveContentRequest = (ArchiveContentRequest) o;
    return Objects.equals(this.archiveParams, archiveContentRequest.archiveParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchiveContentRequest {\n");
    
    sb.append("    archiveParams: ").append(toIndentedString(archiveParams)).append("\n");
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
