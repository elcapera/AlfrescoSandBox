# TagsApi

All URIs are relative to */alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTagForNode**](TagsApi.md#createTagForNode) | **POST** /nodes/{nodeId}/tags | Create a tag for a node
[**deleteTagFromNode**](TagsApi.md#deleteTagFromNode) | **DELETE** /nodes/{nodeId}/tags/{tagId} | Delete a tag from a node
[**getTag**](TagsApi.md#getTag) | **GET** /tags/{tagId} | Get a tag
[**listTags**](TagsApi.md#listTags) | **GET** /tags | List tags
[**listTagsForNode**](TagsApi.md#listTagsForNode) | **GET** /nodes/{nodeId}/tags | List tags for a node
[**updateTag**](TagsApi.md#updateTag) | **PUT** /tags/{tagId} | Update a tag

<a name="createTagForNode"></a>
# **createTagForNode**
> TagEntry createTagForNode(body, nodeId, fields)

Create a tag for a node

Creates a tag on the node **nodeId**. You specify the tag in a JSON body like this:  &#x60;&#x60;&#x60;JSON {   \&quot;tag\&quot;:\&quot;test-tag-1\&quot; } &#x60;&#x60;&#x60;  **Note:** You can create more than one tag by specifying a list of tags in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;tag\&quot;:\&quot;test-tag-1\&quot;   },   {     \&quot;tag\&quot;:\&quot;test-tag-2\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {          ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TagsApi apiInstance = new TagsApi();
TagBody body = new TagBody(); // TagBody | The new tag
String nodeId = "nodeId_example"; // String | The identifier of a node.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    TagEntry result = apiInstance.createTagForNode(body, nodeId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#createTagForNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagBody**](TagBody.md)| The new tag |
 **nodeId** | **String**| The identifier of a node. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TagEntry**](TagEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagFromNode"></a>
# **deleteTagFromNode**
> deleteTagFromNode(nodeId, tagId)

Delete a tag from a node

Deletes tag **tagId** from node **nodeId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TagsApi apiInstance = new TagsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String tagId = "tagId_example"; // String | The identifier of a tag.
try {
    apiInstance.deleteTagFromNode(nodeId, tagId);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#deleteTagFromNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **tagId** | **String**| The identifier of a tag. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> TagEntry getTag(tagId, fields)

Get a tag

Get a specific tag with **tagId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TagsApi apiInstance = new TagsApi();
String tagId = "tagId_example"; // String | The identifier of a tag.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    TagEntry result = apiInstance.getTag(tagId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| The identifier of a tag. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TagEntry**](TagEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTags"></a>
# **listTags**
> TagPaging listTags(skipCount, maxItems, fields, include)

List tags

Gets a list of tags in this repository.  You can use the **include** parameter to return additional **values** information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TagsApi apiInstance = new TagsApi();
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the tag. The following optional fields can be requested: * count 
try {
    TagPaging result = apiInstance.listTags(skipCount, maxItems, fields, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#listTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the tag. The following optional fields can be requested: * count  | [optional]

### Return type

[**TagPaging**](TagPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listTagsForNode"></a>
# **listTagsForNode**
> TagPaging listTagsForNode(nodeId, skipCount, maxItems, fields)

List tags for a node

Gets a list of tags for node **nodeId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TagsApi apiInstance = new TagsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    TagPaging result = apiInstance.listTagsForNode(nodeId, skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#listTagsForNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TagPaging**](TagPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateTag"></a>
# **updateTag**
> TagEntry updateTag(body, tagId, fields)

Update a tag

Updates the tag **tagId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TagsApi apiInstance = new TagsApi();
TagBody body = new TagBody(); // TagBody | The updated tag
String tagId = "tagId_example"; // String | The identifier of a tag.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    TagEntry result = apiInstance.updateTag(body, tagId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#updateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TagBody**](TagBody.md)| The updated tag |
 **tagId** | **String**| The identifier of a tag. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**TagEntry**](TagEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

