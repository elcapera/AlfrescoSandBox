# RenditionsApi

All URIs are relative to */alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRendition**](RenditionsApi.md#createRendition) | **POST** /nodes/{nodeId}/renditions | Create rendition
[**deleteRendition**](RenditionsApi.md#deleteRendition) | **DELETE** /nodes/{nodeId}/renditions/{renditionId} | Delete rendition
[**getRendition**](RenditionsApi.md#getRendition) | **GET** /nodes/{nodeId}/renditions/{renditionId} | Get rendition information
[**getRenditionContent**](RenditionsApi.md#getRenditionContent) | **GET** /nodes/{nodeId}/renditions/{renditionId}/content | Get rendition content
[**listRenditions**](RenditionsApi.md#listRenditions) | **GET** /nodes/{nodeId}/renditions | List renditions
[**requestRenditionDirectAccessUrl**](RenditionsApi.md#requestRenditionDirectAccessUrl) | **POST** /nodes/{nodeId}/renditions/{renditionId}/request-direct-access-url | Generate a direct access content URL

<a name="createRendition"></a>
# **createRendition**
> createRendition(body, nodeId)

Create rendition

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  An asynchronous request to create a rendition for file **nodeId**.  The rendition is specified by name **id** in the request body: &#x60;&#x60;&#x60;JSON {   \&quot;id\&quot;:\&quot;doclib\&quot; } &#x60;&#x60;&#x60;  Multiple names may be specified as a comma separated list or using a list format: &#x60;&#x60;&#x60;JSON [   {      \&quot;id\&quot;: \&quot;doclib\&quot;   },   {      \&quot;id\&quot;: \&quot;avatar\&quot;   } ] &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RenditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RenditionsApi apiInstance = new RenditionsApi();
RenditionBodyCreate body = new RenditionBodyCreate(); // RenditionBodyCreate | The rendition \"id\".
String nodeId = "nodeId_example"; // String | The identifier of a node.
try {
    apiInstance.createRendition(body, nodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#createRendition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RenditionBodyCreate**](RenditionBodyCreate.md)| The rendition \&quot;id\&quot;. |
 **nodeId** | **String**| The identifier of a node. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRendition"></a>
# **deleteRendition**
> deleteRendition(nodeId, renditionId)

Delete rendition

**Note:** this endpoint is available in Alfresco 7.1.1 and newer versions.  Delete the rendition identified by **renditionId** of **nodeId**.  If the rendition is successfully deleted then the content for that rendition node will be cleared. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RenditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
try {
    apiInstance.deleteRendition(nodeId, renditionId);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#deleteRendition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRendition"></a>
# **getRendition**
> RenditionEntry getRendition(nodeId, renditionId)

Get rendition information

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition information for **renditionId** of file **nodeId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RenditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
try {
    RenditionEntry result = apiInstance.getRendition(nodeId, renditionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#getRendition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |

### Return type

[**RenditionEntry**](RenditionEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRenditionContent"></a>
# **getRenditionContent**
> File getRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, range, placeholder)

Get rendition content

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets the rendition content for **renditionId** of file **nodeId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RenditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
Boolean attachment = true; // Boolean | **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response. 
OffsetDateTime ifModifiedSince = new OffsetDateTime(); // OffsetDateTime | Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, `Wed, 09 Mar 2016 16:56:34 GMT`. 
String range = "range_example"; // String | The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes=1-10. 
Boolean placeholder = false; // Boolean | If **true** and there is no rendition for this **nodeId** and **renditionId**, then the placeholder image for the mime type of this rendition is returned, rather than a 404 response. 
try {
    File result = apiInstance.getRenditionContent(nodeId, renditionId, attachment, ifModifiedSince, range, placeholder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#getRenditionContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |
 **attachment** | **Boolean**| **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false**  is ignored, and the attachment will be returned in the response.  | [optional] [default to true]
 **ifModifiedSince** | **OffsetDateTime**| Only returns the content if it has been modified since the date provided. Use the date format defined by HTTP. For example, &#x60;Wed, 09 Mar 2016 16:56:34 GMT&#x60;.  | [optional]
 **range** | **String**| The Range header indicates the part of a document that the server should return. Single part request supported, for example: bytes&#x3D;1-10.  | [optional]
 **placeholder** | **Boolean**| If **true** and there is no rendition for this **nodeId** and **renditionId**, then the placeholder image for the mime type of this rendition is returned, rather than a 404 response.  | [optional] [default to false]

### Return type

[**File**](File.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="listRenditions"></a>
# **listRenditions**
> RenditionPaging listRenditions(nodeId, where)

List renditions

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Gets a list of the rendition information for each rendition of the the file **nodeId**, including the rendition id.  EachÂ rendition returned has a **status**: CREATED means it is availableÂ to view or download, NOT_CREATED means the rendition can be requested.  You can use the **where** parameter to filter the returned renditions by **status**. For example, the following **where** clause will return just the CREATED renditions:  &#x60;&#x60;&#x60; (status&#x3D;&#x27;CREATED&#x27;) &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RenditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate.
try {
    RenditionPaging result = apiInstance.listRenditions(nodeId, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#listRenditions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]

### Return type

[**RenditionPaging**](RenditionPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="requestRenditionDirectAccessUrl"></a>
# **requestRenditionDirectAccessUrl**
> DirectAccessUrlEntry requestRenditionDirectAccessUrl(nodeId, renditionId, body)

Generate a direct access content URL

**Note:** this endpoint is available in Alfresco 7.1 and newer versions. Generate a direct access content url for the given **nodeId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RenditionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RenditionsApi apiInstance = new RenditionsApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
String renditionId = "renditionId_example"; // String | The name of a thumbnail rendition, for example *doclib*, or *pdf*.
DirectAccessUrlBodyCreate body = new DirectAccessUrlBodyCreate(); // DirectAccessUrlBodyCreate | Direct Access URL options and flags.  Note: It is up to the actual ContentStore implementation if it can fulfil this request or not.  The **attachment** flag controls the download method of the generated URL. It defaults  to **true**, meaning the value for the Content Disposition response header will be **attachment**.  **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false** is ignored, and the attachment will be returned in the response. 
try {
    DirectAccessUrlEntry result = apiInstance.requestRenditionDirectAccessUrl(nodeId, renditionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenditionsApi#requestRenditionDirectAccessUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **renditionId** | **String**| The name of a thumbnail rendition, for example *doclib*, or *pdf*. |
 **body** | [**DirectAccessUrlBodyCreate**](DirectAccessUrlBodyCreate.md)| Direct Access URL options and flags.  Note: It is up to the actual ContentStore implementation if it can fulfil this request or not.  The **attachment** flag controls the download method of the generated URL. It defaults  to **true**, meaning the value for the Content Disposition response header will be **attachment**.  **true** enables a web browser to download the file as an attachment. **false** means a web browser may preview the file in a new tab or window.  You can only set this parameter to **false** if the content type of the file is in the supported list; for example, certain image files and PDF files.  If the content type is not supported for preview, then a value of **false** is ignored, and the attachment will be returned in the response.  | [optional]

### Return type

[**DirectAccessUrlEntry**](DirectAccessUrlEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

