# AuditApi

All URIs are relative to */alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAuditEntriesForAuditApp**](AuditApi.md#deleteAuditEntriesForAuditApp) | **DELETE** /audit-applications/{auditApplicationId}/audit-entries | Permanently delete audit entries for an audit application
[**deleteAuditEntry**](AuditApi.md#deleteAuditEntry) | **DELETE** /audit-applications/{auditApplicationId}/audit-entries/{auditEntryId} | Permanently delete an audit entry
[**getAuditApp**](AuditApi.md#getAuditApp) | **GET** /audit-applications/{auditApplicationId} | Get audit application info
[**getAuditEntry**](AuditApi.md#getAuditEntry) | **GET** /audit-applications/{auditApplicationId}/audit-entries/{auditEntryId} | Get audit entry
[**listAuditApps**](AuditApi.md#listAuditApps) | **GET** /audit-applications | List audit applications
[**listAuditEntriesForAuditApp**](AuditApi.md#listAuditEntriesForAuditApp) | **GET** /audit-applications/{auditApplicationId}/audit-entries | List audit entries for an audit application
[**listAuditEntriesForNode**](AuditApi.md#listAuditEntriesForNode) | **GET** /nodes/{nodeId}/audit-entries | List audit entries for a node
[**updateAuditApp**](AuditApi.md#updateAuditApp) | **PUT** /audit-applications/{auditApplicationId} | Update audit application info

<a name="deleteAuditEntriesForAuditApp"></a>
# **deleteAuditEntriesForAuditApp**
> deleteAuditEntriesForAuditApp(auditApplicationId, where)

Permanently delete audit entries for an audit application

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Permanently delete audit entries for an audit application **auditApplicationId**.  The **where** clause must be specified, either with an inclusive time period or for an inclusive range of ids. The delete is within the context of the given audit application.  For example:  *   &#x60;&#x60;&#x60;where&#x3D;(createdAt BETWEEN (&#x27;2017-06-02T12:13:51.593+01:00&#x27; , &#x27;2017-06-04T10:05:16.536+01:00&#x27;))&#x60;&#x60;&#x60; *   &#x60;&#x60;&#x60;where&#x3D;(id BETWEEN (&#x27;1234&#x27;, &#x27;4321&#x27;))&#x60;&#x60;&#x60;  You must have admin rights to delete audit information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditApplicationId = "auditApplicationId_example"; // String | The identifier of an audit application.
String where = "where_example"; // String | Audit entries to permanently delete for an audit application, given an inclusive time period or range of ids. For example:  *   ```where=(createdAt BETWEEN ('2017-06-02T12:13:51.593+01:00' , '2017-06-04T10:05:16.536+01:00'))``` *   ```where=(id BETWEEN ('1234', '4321'))``` 
try {
    apiInstance.deleteAuditEntriesForAuditApp(auditApplicationId, where);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#deleteAuditEntriesForAuditApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditApplicationId** | **String**| The identifier of an audit application. |
 **where** | **String**| Audit entries to permanently delete for an audit application, given an inclusive time period or range of ids. For example:  *   &#x60;&#x60;&#x60;where&#x3D;(createdAt BETWEEN (&#x27;2017-06-02T12:13:51.593+01:00&#x27; , &#x27;2017-06-04T10:05:16.536+01:00&#x27;))&#x60;&#x60;&#x60; *   &#x60;&#x60;&#x60;where&#x3D;(id BETWEEN (&#x27;1234&#x27;, &#x27;4321&#x27;))&#x60;&#x60;&#x60;  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteAuditEntry"></a>
# **deleteAuditEntry**
> deleteAuditEntry(auditApplicationId, auditEntryId)

Permanently delete an audit entry

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Permanently delete a single audit entry **auditEntryId**.  You must have admin rights to delete audit information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditApplicationId = "auditApplicationId_example"; // String | The identifier of an audit application.
String auditEntryId = "auditEntryId_example"; // String | The identifier of an audit entry.
try {
    apiInstance.deleteAuditEntry(auditApplicationId, auditEntryId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#deleteAuditEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditApplicationId** | **String**| The identifier of an audit application. |
 **auditEntryId** | **String**| The identifier of an audit entry. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuditApp"></a>
# **getAuditApp**
> AuditApp getAuditApp(auditApplicationId, fields, include)

Get audit application info

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Get status of an audit application **auditApplicationId**.  You must have admin rights to retrieve audit information.  You can use the **include** parameter to return the minimum and/or maximum audit record id for the application. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditApplicationId = "auditApplicationId_example"; // String | The identifier of an audit application.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
List<String> include = Arrays.asList("include_example"); // List<String> | Also include the current minimum and/or maximum audit entry ids for the application. The following optional fields can be requested: * max * min 
try {
    AuditApp result = apiInstance.getAuditApp(auditApplicationId, fields, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditApplicationId** | **String**| The identifier of an audit application. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Also include the current minimum and/or maximum audit entry ids for the application. The following optional fields can be requested: * max * min  | [optional]

### Return type

[**AuditApp**](AuditApp.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuditEntry"></a>
# **getAuditEntry**
> AuditEntryEntry getAuditEntry(auditApplicationId, auditEntryId, fields)

Get audit entry

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets audit entry **auditEntryId**.  You must have admin rights to access audit information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditApplicationId = "auditApplicationId_example"; // String | The identifier of an audit application.
String auditEntryId = "auditEntryId_example"; // String | The identifier of an audit entry.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    AuditEntryEntry result = apiInstance.getAuditEntry(auditApplicationId, auditEntryId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditApplicationId** | **String**| The identifier of an audit application. |
 **auditEntryId** | **String**| The identifier of an audit entry. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**AuditEntryEntry**](AuditEntryEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAuditApps"></a>
# **listAuditApps**
> AuditAppPaging listAuditApps(skipCount, maxItems, fields)

List audit applications

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of audit applications in this repository.  This list may include pre-configured audit applications, if enabled, such as:  * alfresco-access * CMISChangeLog * Alfresco Tagging Service * Alfresco Sync Service (used by Enterprise Cloud Sync)  You must have admin rights to retrieve audit information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    AuditAppPaging result = apiInstance.listAuditApps(skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#listAuditApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**AuditAppPaging**](AuditAppPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAuditEntriesForAuditApp"></a>
# **listAuditEntriesForAuditApp**
> AuditEntryPaging listAuditEntriesForAuditApp(auditApplicationId, skipCount, omitTotalItems, orderBy, maxItems, where, include, fields)

List audit entries for an audit application

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of audit entries for audit application **auditApplicationId**.  You can use the **include** parameter to return additional **values** information.  The list can be filtered by one or more of: * **createdByUser** person id * **createdAt** inclusive time period * **id** inclusive range of ids * **valuesKey** audit entry values contains the exact matching key * **valuesValue** audit entry values contains the exact matching value  The default sort order is **createdAt** ascending, but you can use an optional **ASC** or **DESC** modifier to specify an ascending or descending sort order.  For example, specifying &#x60;&#x60;&#x60;orderBy&#x3D;createdAt DESC&#x60;&#x60;&#x60; returns audit entries in descending **createdAt** order.  You must have admin rights to retrieve audit information. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditApplicationId = "auditApplicationId_example"; // String | The identifier of an audit application.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Boolean omitTotalItems = false; // Boolean | A boolean to control if the response provides the total numbers of items in the collection. If not supplied then the default value is false. 
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
String where = "where_example"; // String | Optionally filter the list. Here are some examples:  *   ```where=(createdByUser='jbloggs')```  *   ```where=(id BETWEEN ('1234', '4321'))```  *   ```where=(createdAt BETWEEN ('2017-06-02T12:13:51.593+01:00' , '2017-06-04T10:05:16.536+01:00'))```  *   ```where=(createdByUser='jbloggs' and createdAt BETWEEN ('2017-06-02T12:13:51.593+01:00' , '2017-06-04T10:05:16.536+01:00'))```  *   ```where=(valuesKey='/alfresco-access/login/user')```  *   ```where=(valuesKey='/alfresco-access/transaction/action' and valuesValue='DELETE')``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the audit entry. The following optional fields can be requested: * values 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    AuditEntryPaging result = apiInstance.listAuditEntriesForAuditApp(auditApplicationId, skipCount, omitTotalItems, orderBy, maxItems, where, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#listAuditEntriesForAuditApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditApplicationId** | **String**| The identifier of an audit application. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **omitTotalItems** | **Boolean**| A boolean to control if the response provides the total numbers of items in the collection. If not supplied then the default value is false.  | [optional] [default to false]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **where** | **String**| Optionally filter the list. Here are some examples:  *   &#x60;&#x60;&#x60;where&#x3D;(createdByUser&#x3D;&#x27;jbloggs&#x27;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(id BETWEEN (&#x27;1234&#x27;, &#x27;4321&#x27;))&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(createdAt BETWEEN (&#x27;2017-06-02T12:13:51.593+01:00&#x27; , &#x27;2017-06-04T10:05:16.536+01:00&#x27;))&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(createdByUser&#x3D;&#x27;jbloggs&#x27; and createdAt BETWEEN (&#x27;2017-06-02T12:13:51.593+01:00&#x27; , &#x27;2017-06-04T10:05:16.536+01:00&#x27;))&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(valuesKey&#x3D;&#x27;/alfresco-access/login/user&#x27;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(valuesKey&#x3D;&#x27;/alfresco-access/transaction/action&#x27; and valuesValue&#x3D;&#x27;DELETE&#x27;)&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the audit entry. The following optional fields can be requested: * values  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**AuditEntryPaging**](AuditEntryPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAuditEntriesForNode"></a>
# **listAuditEntriesForNode**
> AuditEntryPaging listAuditEntriesForNode(nodeId, skipCount, orderBy, maxItems, where, include, fields)

List audit entries for a node

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Gets a list of audit entries for node **nodeId**.  The list can be filtered by **createdByUser** and for a given inclusive time period.  The default sort order is **createdAt** ascending, but you can use an optional **ASC** or **DESC** modifier to specify an ascending or descending sort order.  For example, specifying &#x60;&#x60;&#x60;orderBy&#x3D;createdAt DESC&#x60;&#x60;&#x60; returns audit entries in descending **createdAt** order.  This relies on the pre-configured &#x27;alfresco-access&#x27; audit application. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String nodeId = "nodeId_example"; // String | The identifier of a node.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
String where = "where_example"; // String | Optionally filter the list. Here are some examples:  *   ```where=(createdByUser='-me-')```  *   ```where=(createdAt BETWEEN ('2017-06-02T12:13:51.593+01:00' , '2017-06-04T10:05:16.536+01:00'))```  *   ```where=(createdByUser='jbloggs' and createdAt BETWEEN ('2017-06-02T12:13:51.593+01:00' , '2017-06-04T10:05:16.536+01:00'))``` 
List<String> include = Arrays.asList("include_example"); // List<String> | Returns additional information about the audit entry. The following optional fields can be requested: * values 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    AuditEntryPaging result = apiInstance.listAuditEntriesForNode(nodeId, skipCount, orderBy, maxItems, where, include, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#listAuditEntriesForNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| The identifier of a node. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **where** | **String**| Optionally filter the list. Here are some examples:  *   &#x60;&#x60;&#x60;where&#x3D;(createdByUser&#x3D;&#x27;-me-&#x27;)&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(createdAt BETWEEN (&#x27;2017-06-02T12:13:51.593+01:00&#x27; , &#x27;2017-06-04T10:05:16.536+01:00&#x27;))&#x60;&#x60;&#x60;  *   &#x60;&#x60;&#x60;where&#x3D;(createdByUser&#x3D;&#x27;jbloggs&#x27; and createdAt BETWEEN (&#x27;2017-06-02T12:13:51.593+01:00&#x27; , &#x27;2017-06-04T10:05:16.536+01:00&#x27;))&#x60;&#x60;&#x60;  | [optional]
 **include** | [**List&lt;String&gt;**](String.md)| Returns additional information about the audit entry. The following optional fields can be requested: * values  | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**AuditEntryPaging**](AuditEntryPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAuditApp"></a>
# **updateAuditApp**
> AuditApp updateAuditApp(body, auditApplicationId, fields)

Update audit application info

**Note:** this endpoint is available in Alfresco 5.2.2 and newer versions.  Disable or re-enable the audit application **auditApplicationId**.  New audit entries will not be created for a disabled audit application until it is re-enabled (and system-wide auditing is also enabled).  Note, it is still possible to query &amp;/or delete any existing audit entries even if auditing is disabled for the audit application.  You must have admin rights to update audit application. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
AuditBodyUpdate body = new AuditBodyUpdate(); // AuditBodyUpdate | The audit application to update.
String auditApplicationId = "auditApplicationId_example"; // String | The identifier of an audit application.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    AuditApp result = apiInstance.updateAuditApp(body, auditApplicationId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#updateAuditApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AuditBodyUpdate**](AuditBodyUpdate.md)| The audit application to update. |
 **auditApplicationId** | **String**| The identifier of an audit application. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**AuditApp**](AuditApp.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

