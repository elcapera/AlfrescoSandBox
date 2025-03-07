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
import io.swagger.client.model.ContentInfo;
import io.swagger.client.model.PathInfo;
import io.swagger.client.model.UserInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * SharedLink
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2025-03-04T08:19:38.842344610Z[GMT]")

public class SharedLink {
  @SerializedName("id")
  private String id = null;

  @SerializedName("expiresAt")
  private OffsetDateTime expiresAt = null;

  @SerializedName("nodeId")
  private String nodeId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("modifiedAt")
  private OffsetDateTime modifiedAt = null;

  @SerializedName("modifiedByUser")
  private UserInfo modifiedByUser = null;

  @SerializedName("sharedByUser")
  private UserInfo sharedByUser = null;

  @SerializedName("content")
  private ContentInfo content = null;

  @SerializedName("allowableOperations")
  private List<String> allowableOperations = null;

  @SerializedName("allowableOperationsOnTarget")
  private List<String> allowableOperationsOnTarget = null;

  @SerializedName("isFavorite")
  private Boolean isFavorite = null;

  @SerializedName("properties")
  private Object properties = null;

  @SerializedName("aspectNames")
  private List<String> aspectNames = null;

  @SerializedName("path")
  private PathInfo path = null;

  public SharedLink id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SharedLink expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @Schema(description = "")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public SharedLink nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @Schema(description = "")
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }

  public SharedLink name(String name) {
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

  public SharedLink title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SharedLink description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SharedLink modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public SharedLink modifiedByUser(UserInfo modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
    return this;
  }

   /**
   * Get modifiedByUser
   * @return modifiedByUser
  **/
  @Schema(description = "")
  public UserInfo getModifiedByUser() {
    return modifiedByUser;
  }

  public void setModifiedByUser(UserInfo modifiedByUser) {
    this.modifiedByUser = modifiedByUser;
  }

  public SharedLink sharedByUser(UserInfo sharedByUser) {
    this.sharedByUser = sharedByUser;
    return this;
  }

   /**
   * Get sharedByUser
   * @return sharedByUser
  **/
  @Schema(description = "")
  public UserInfo getSharedByUser() {
    return sharedByUser;
  }

  public void setSharedByUser(UserInfo sharedByUser) {
    this.sharedByUser = sharedByUser;
  }

  public SharedLink content(ContentInfo content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public ContentInfo getContent() {
    return content;
  }

  public void setContent(ContentInfo content) {
    this.content = content;
  }

  public SharedLink allowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
    return this;
  }

  public SharedLink addAllowableOperationsItem(String allowableOperationsItem) {
    if (this.allowableOperations == null) {
      this.allowableOperations = new ArrayList<String>();
    }
    this.allowableOperations.add(allowableOperationsItem);
    return this;
  }

   /**
   * The allowable operations for the Quickshare link itself. See allowableOperationsOnTarget for the allowable operations pertaining to the linked content node. 
   * @return allowableOperations
  **/
  @Schema(description = "The allowable operations for the Quickshare link itself. See allowableOperationsOnTarget for the allowable operations pertaining to the linked content node. ")
  public List<String> getAllowableOperations() {
    return allowableOperations;
  }

  public void setAllowableOperations(List<String> allowableOperations) {
    this.allowableOperations = allowableOperations;
  }

  public SharedLink allowableOperationsOnTarget(List<String> allowableOperationsOnTarget) {
    this.allowableOperationsOnTarget = allowableOperationsOnTarget;
    return this;
  }

  public SharedLink addAllowableOperationsOnTargetItem(String allowableOperationsOnTargetItem) {
    if (this.allowableOperationsOnTarget == null) {
      this.allowableOperationsOnTarget = new ArrayList<String>();
    }
    this.allowableOperationsOnTarget.add(allowableOperationsOnTargetItem);
    return this;
  }

   /**
   * The allowable operations for the content node being shared. 
   * @return allowableOperationsOnTarget
  **/
  @Schema(description = "The allowable operations for the content node being shared. ")
  public List<String> getAllowableOperationsOnTarget() {
    return allowableOperationsOnTarget;
  }

  public void setAllowableOperationsOnTarget(List<String> allowableOperationsOnTarget) {
    this.allowableOperationsOnTarget = allowableOperationsOnTarget;
  }

  public SharedLink isFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
    return this;
  }

   /**
   * Get isFavorite
   * @return isFavorite
  **/
  @Schema(description = "")
  public Boolean isIsFavorite() {
    return isFavorite;
  }

  public void setIsFavorite(Boolean isFavorite) {
    this.isFavorite = isFavorite;
  }

  public SharedLink properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * A subset of the target node&#x27;s properties, system properties and properties already available in the SharedLink are excluded. 
   * @return properties
  **/
  @Schema(description = "A subset of the target node's properties, system properties and properties already available in the SharedLink are excluded. ")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public SharedLink aspectNames(List<String> aspectNames) {
    this.aspectNames = aspectNames;
    return this;
  }

  public SharedLink addAspectNamesItem(String aspectNamesItem) {
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

  public SharedLink path(PathInfo path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public PathInfo getPath() {
    return path;
  }

  public void setPath(PathInfo path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedLink sharedLink = (SharedLink) o;
    return Objects.equals(this.id, sharedLink.id) &&
        Objects.equals(this.expiresAt, sharedLink.expiresAt) &&
        Objects.equals(this.nodeId, sharedLink.nodeId) &&
        Objects.equals(this.name, sharedLink.name) &&
        Objects.equals(this.title, sharedLink.title) &&
        Objects.equals(this.description, sharedLink.description) &&
        Objects.equals(this.modifiedAt, sharedLink.modifiedAt) &&
        Objects.equals(this.modifiedByUser, sharedLink.modifiedByUser) &&
        Objects.equals(this.sharedByUser, sharedLink.sharedByUser) &&
        Objects.equals(this.content, sharedLink.content) &&
        Objects.equals(this.allowableOperations, sharedLink.allowableOperations) &&
        Objects.equals(this.allowableOperationsOnTarget, sharedLink.allowableOperationsOnTarget) &&
        Objects.equals(this.isFavorite, sharedLink.isFavorite) &&
        Objects.equals(this.properties, sharedLink.properties) &&
        Objects.equals(this.aspectNames, sharedLink.aspectNames) &&
        Objects.equals(this.path, sharedLink.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, expiresAt, nodeId, name, title, description, modifiedAt, modifiedByUser, sharedByUser, content, allowableOperations, allowableOperationsOnTarget, isFavorite, properties, aspectNames, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    modifiedByUser: ").append(toIndentedString(modifiedByUser)).append("\n");
    sb.append("    sharedByUser: ").append(toIndentedString(sharedByUser)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    allowableOperations: ").append(toIndentedString(allowableOperations)).append("\n");
    sb.append("    allowableOperationsOnTarget: ").append(toIndentedString(allowableOperationsOnTarget)).append("\n");
    sb.append("    isFavorite: ").append(toIndentedString(isFavorite)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    aspectNames: ").append(toIndentedString(aspectNames)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
