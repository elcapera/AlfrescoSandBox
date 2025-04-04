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
 * Response object holding storage properties related data for given content. 
 */
@Schema(description = "Response object holding storage properties related data for given content. ")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class ContentStorageInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("storageProperties")
  private Map<String, String> storageProperties = null;

  public ContentStorageInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Content type property identifier (e.g. cm:content). Inside this object only colon (&#x27;:&#x27;) delimiter for namespace-prefix will be used. 
   * @return id
  **/
  @Schema(required = true, description = "Content type property identifier (e.g. cm:content). Inside this object only colon (':') delimiter for namespace-prefix will be used. ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContentStorageInfo storageProperties(Map<String, String> storageProperties) {
    this.storageProperties = storageProperties;
    return this;
  }

  public ContentStorageInfo putStoragePropertiesItem(String key, String storagePropertiesItem) {
    if (this.storageProperties == null) {
      this.storageProperties = new HashMap<String, String>();
    }
    this.storageProperties.put(key, storagePropertiesItem);
    return this;
  }

   /**
   * A map (String-String) of storage properties for given content. 
   * @return storageProperties
  **/
  @Schema(description = "A map (String-String) of storage properties for given content. ")
  public Map<String, String> getStorageProperties() {
    return storageProperties;
  }

  public void setStorageProperties(Map<String, String> storageProperties) {
    this.storageProperties = storageProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentStorageInfo contentStorageInfo = (ContentStorageInfo) o;
    return Objects.equals(this.id, contentStorageInfo.id) &&
        Objects.equals(this.storageProperties, contentStorageInfo.storageProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, storageProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentStorageInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    storageProperties: ").append(toIndentedString(storageProperties)).append("\n");
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
