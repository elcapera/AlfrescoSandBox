# SitesApi

All URIs are relative to */alfresco/api/-default-/public/alfresco/versions/1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approveSiteMembershipRequest**](SitesApi.md#approveSiteMembershipRequest) | **POST** /sites/{siteId}/site-membership-requests/{inviteeId}/approve | Approve a site membership request
[**createSite**](SitesApi.md#createSite) | **POST** /sites | Create a site
[**createSiteGroupMembership**](SitesApi.md#createSiteGroupMembership) | **POST** /sites/{siteId}/group-members | Create a site membership for group
[**createSiteMembership**](SitesApi.md#createSiteMembership) | **POST** /sites/{siteId}/members | Create a site membership
[**createSiteMembershipRequestForPerson**](SitesApi.md#createSiteMembershipRequestForPerson) | **POST** /people/{personId}/site-membership-requests | Create a site membership request
[**deleteSite**](SitesApi.md#deleteSite) | **DELETE** /sites/{siteId} | Delete a site
[**deleteSiteGroupMembership**](SitesApi.md#deleteSiteGroupMembership) | **DELETE** /sites/{siteId}/group-members/{groupId} | Delete a group membership for site
[**deleteSiteMembership**](SitesApi.md#deleteSiteMembership) | **DELETE** /sites/{siteId}/members/{personId} | Delete a site membership
[**deleteSiteMembershipForPerson**](SitesApi.md#deleteSiteMembershipForPerson) | **DELETE** /people/{personId}/sites/{siteId} | Delete a site membership
[**deleteSiteMembershipRequestForPerson**](SitesApi.md#deleteSiteMembershipRequestForPerson) | **DELETE** /people/{personId}/site-membership-requests/{siteId} | Delete a site membership request
[**getSite**](SitesApi.md#getSite) | **GET** /sites/{siteId} | Get a site
[**getSiteContainer**](SitesApi.md#getSiteContainer) | **GET** /sites/{siteId}/containers/{containerId} | Get a site container
[**getSiteGroupMembership**](SitesApi.md#getSiteGroupMembership) | **GET** /sites/{siteId}/group-members/{groupId} | Get information about site membership of group
[**getSiteMembership**](SitesApi.md#getSiteMembership) | **GET** /sites/{siteId}/members/{personId} | Get a site membership
[**getSiteMembershipForPerson**](SitesApi.md#getSiteMembershipForPerson) | **GET** /people/{personId}/sites/{siteId} | Get a site membership
[**getSiteMembershipRequestForPerson**](SitesApi.md#getSiteMembershipRequestForPerson) | **GET** /people/{personId}/site-membership-requests/{siteId} | Get a site membership request
[**getSiteMembershipRequests**](SitesApi.md#getSiteMembershipRequests) | **GET** /site-membership-requests | Get site membership requests
[**listSiteContainers**](SitesApi.md#listSiteContainers) | **GET** /sites/{siteId}/containers | List site containers
[**listSiteGroups**](SitesApi.md#listSiteGroups) | **GET** /sites/{siteId}/group-members | List group membership for site
[**listSiteMembershipRequestsForPerson**](SitesApi.md#listSiteMembershipRequestsForPerson) | **GET** /people/{personId}/site-membership-requests | List site membership requests
[**listSiteMemberships**](SitesApi.md#listSiteMemberships) | **GET** /sites/{siteId}/members | List site memberships
[**listSiteMembershipsForPerson**](SitesApi.md#listSiteMembershipsForPerson) | **GET** /people/{personId}/sites | List site memberships
[**listSites**](SitesApi.md#listSites) | **GET** /sites | List sites
[**rejectSiteMembershipRequest**](SitesApi.md#rejectSiteMembershipRequest) | **POST** /sites/{siteId}/site-membership-requests/{inviteeId}/reject | Reject a site membership request
[**updateSite**](SitesApi.md#updateSite) | **PUT** /sites/{siteId} | Update a site
[**updateSiteGroupMembership**](SitesApi.md#updateSiteGroupMembership) | **PUT** /sites/{siteId}/group-members/{groupId} | Update site membership of group
[**updateSiteMembership**](SitesApi.md#updateSiteMembership) | **PUT** /sites/{siteId}/members/{personId} | Update a site membership
[**updateSiteMembershipRequestForPerson**](SitesApi.md#updateSiteMembershipRequestForPerson) | **PUT** /people/{personId}/site-membership-requests/{siteId} | Update a site membership request

<a name="approveSiteMembershipRequest"></a>
# **approveSiteMembershipRequest**
> approveSiteMembershipRequest(siteId, inviteeId, body)

Approve a site membership request

Approve a site membership request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String inviteeId = "inviteeId_example"; // String | The invitee user name.
SiteMembershipApprovalBody body = new SiteMembershipApprovalBody(); // SiteMembershipApprovalBody | Accepting a request to join, optionally, allows assignment of a role to the user. 
try {
    apiInstance.approveSiteMembershipRequest(siteId, inviteeId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#approveSiteMembershipRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **inviteeId** | **String**| The invitee user name. |
 **body** | [**SiteMembershipApprovalBody**](SiteMembershipApprovalBody.md)| Accepting a request to join, optionally, allows assignment of a role to the user.  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSite"></a>
# **createSite**
> SiteEntry createSite(body, skipConfiguration, skipAddToFavorites, fields)

Create a site

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Creates a default site with the given details.  Unless explicitly specified, the site id will be generated from the site title. The site id must be unique and only contain alphanumeric and/or dash characters.  Note: the id of a site cannot be updated once the site has been created.  For example, to create a public site called \&quot;Marketing\&quot; the following body could be used: &#x60;&#x60;&#x60;JSON {   \&quot;title\&quot;: \&quot;Marketing\&quot;,   \&quot;visibility\&quot;: \&quot;PUBLIC\&quot; } &#x60;&#x60;&#x60;  The creation of the (surf) configuration files required by Share can be skipped via the **skipConfiguration** query parameter.  **Note:** if skipped then such a site will **not** work within Share.  The addition of the site to the user&#x27;s site favorites can be skipped via the **skipAddToFavorites** query parameter.  The creator will be added as a member with Site Manager role.  When you create a site, a container called **documentLibrary** is created for you in the new site. This container is the root folder for content stored in the site. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteBodyCreate body = new SiteBodyCreate(); // SiteBodyCreate | The site details
Boolean skipConfiguration = false; // Boolean | Flag to indicate whether the Share-specific (surf) configuration files for the site should not be created.
Boolean skipAddToFavorites = false; // Boolean | Flag to indicate whether the site should not be added to the user's site favorites.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteEntry result = apiInstance.createSite(body, skipConfiguration, skipAddToFavorites, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#createSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteBodyCreate**](SiteBodyCreate.md)| The site details |
 **skipConfiguration** | **Boolean**| Flag to indicate whether the Share-specific (surf) configuration files for the site should not be created. | [optional] [default to false]
 **skipAddToFavorites** | **Boolean**| Flag to indicate whether the site should not be added to the user&#x27;s site favorites. | [optional] [default to false]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteEntry**](SiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSiteGroupMembership"></a>
# **createSiteGroupMembership**
> SiteGroupEntry createSiteGroupMembership(body, siteId, fields)

Create a site membership for group

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Creates a site membership for group **groupId** on site **siteId**. You can set the **role** to one of four types: * SiteConsumer * SiteCollaborator * SiteContributor * SiteManager **Note:** You can create more than one site membership by specifying a list of group in the JSON body like this:  &#x60;&#x60;&#x60;JSON   [    {      \&quot;role\&quot;: \&quot;SiteConsumer\&quot;,      \&quot;id\&quot;: \&quot;authorityId\&quot;    },    {      \&quot;role\&quot;: \&quot;SiteConsumer\&quot;,      \&quot;id\&quot;: \&quot;authorityId\&quot;    }   ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example: &#x60;&#x60;&#x60;JSON   {     \&quot;list\&quot;: {       \&quot;pagination\&quot;: {         \&quot;count\&quot;: 2,         \&quot;hasMoreItems\&quot;: false,         \&quot;totalItems\&quot;: 2,         \&quot;skipCount\&quot;: 0,         \&quot;maxItems\&quot;: 100       },       \&quot;entries\&quot;: [         {           \&quot;entry\&quot;: {             ...           }         },         {           \&quot;entry\&quot;: {             ...           }         }       ]     }   } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteMembershipBodyCreate body = new SiteMembershipBodyCreate(); // SiteMembershipBodyCreate | The group to add and their role
String siteId = "siteId_example"; // String | The identifier of a site.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteGroupEntry result = apiInstance.createSiteGroupMembership(body, siteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#createSiteGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteMembershipBodyCreate**](SiteMembershipBodyCreate.md)| The group to add and their role |
 **siteId** | **String**| The identifier of a site. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteGroupEntry**](SiteGroupEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSiteMembership"></a>
# **createSiteMembership**
> SiteMemberEntry createSiteMembership(body, siteId, fields)

Create a site membership

Creates a site membership for person **personId** on site **siteId**.  You can set the **role** to one of four types:  * SiteConsumer * SiteCollaborator * SiteContributor * SiteManager  **Note:** You can create more than one site membership by specifying a list of people in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;role\&quot;: \&quot;SiteConsumer\&quot;,     \&quot;id\&quot;: \&quot;joe\&quot;   },   {     \&quot;role\&quot;: \&quot;SiteConsumer\&quot;,     \&quot;id\&quot;: \&quot;fred\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteMembershipBodyCreate body = new SiteMembershipBodyCreate(); // SiteMembershipBodyCreate | The person to add and their role
String siteId = "siteId_example"; // String | The identifier of a site.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMemberEntry result = apiInstance.createSiteMembership(body, siteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#createSiteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteMembershipBodyCreate**](SiteMembershipBodyCreate.md)| The person to add and their role |
 **siteId** | **String**| The identifier of a site. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMemberEntry**](SiteMemberEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSiteMembershipRequestForPerson"></a>
# **createSiteMembershipRequestForPerson**
> SiteMembershipRequestEntry createSiteMembershipRequestForPerson(body, personId, fields)

Create a site membership request

Create a site membership request for yourself on the site with the identifier of **id**, specified in the JSON body. The result of the request differs depending on the type of site.  * For a **public** site, you join the site immediately as a SiteConsumer. * For a **moderated** site, your request is added to the site membership request list. The request waits for approval from the Site Manager. * You cannot request membership of a **private** site. Members are invited by the site administrator.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.   **Note:** You can create site membership requests for more than one site by specifying a list of sites in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;message\&quot;: \&quot;Please can you add me\&quot;,     \&quot;id\&quot;: \&quot;test-site-1\&quot;,     \&quot;title\&quot;: \&quot;Request for test site 1\&quot;,   },   {     \&quot;message\&quot;: \&quot;Please can you add me\&quot;,     \&quot;id\&quot;: \&quot;test-site-2\&quot;,     \&quot;title\&quot;: \&quot;Request for test site 2\&quot;,   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteMembershipRequestBodyCreate body = new SiteMembershipRequestBodyCreate(); // SiteMembershipRequestBodyCreate | Site membership request details
String personId = "personId_example"; // String | The identifier of a person.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMembershipRequestEntry result = apiInstance.createSiteMembershipRequestForPerson(body, personId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#createSiteMembershipRequestForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteMembershipRequestBodyCreate**](SiteMembershipRequestBodyCreate.md)| Site membership request details |
 **personId** | **String**| The identifier of a person. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMembershipRequestEntry**](SiteMembershipRequestEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSite"></a>
# **deleteSite**
> deleteSite(siteId, permanent)

Delete a site

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Deletes the site with **siteId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
Boolean permanent = false; // Boolean | Flag to indicate whether the site should be permanently deleted i.e. bypass the trashcan.
try {
    apiInstance.deleteSite(siteId, permanent);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#deleteSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **permanent** | **Boolean**| Flag to indicate whether the site should be permanently deleted i.e. bypass the trashcan. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSiteGroupMembership"></a>
# **deleteSiteGroupMembership**
> deleteSiteGroupMembership(siteId, groupId)

Delete a group membership for site

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Deletes group **groupId** as a member of site **siteId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String groupId = "groupId_example"; // String | The identifier of a group.
try {
    apiInstance.deleteSiteGroupMembership(siteId, groupId);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#deleteSiteGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **groupId** | **String**| The identifier of a group. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSiteMembership"></a>
# **deleteSiteMembership**
> deleteSiteMembership(siteId, personId)

Delete a site membership

Deletes person **personId** as a member of site **siteId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String personId = "personId_example"; // String | The identifier of a person.
try {
    apiInstance.deleteSiteMembership(siteId, personId);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#deleteSiteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **personId** | **String**| The identifier of a person. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSiteMembershipForPerson"></a>
# **deleteSiteMembershipForPerson**
> deleteSiteMembershipForPerson(personId, siteId)

Delete a site membership

Deletes person **personId** as a member of site **siteId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String personId = "personId_example"; // String | The identifier of a person.
String siteId = "siteId_example"; // String | The identifier of a site.
try {
    apiInstance.deleteSiteMembershipForPerson(personId, siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#deleteSiteMembershipForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteSiteMembershipRequestForPerson"></a>
# **deleteSiteMembershipRequestForPerson**
> deleteSiteMembershipRequestForPerson(personId, siteId)

Delete a site membership request

Deletes the site membership request to site **siteId** for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String personId = "personId_example"; // String | The identifier of a person.
String siteId = "siteId_example"; // String | The identifier of a site.
try {
    apiInstance.deleteSiteMembershipRequestForPerson(personId, siteId);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#deleteSiteMembershipRequestForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSite"></a>
# **getSite**
> SiteEntry getSite(siteId, relations, fields)

Get a site

Gets information for site **siteId**.  You can use the **relations** parameter to include one or more related entities in a single response and so reduce network traffic.  The entity types in Alfresco are organized in a tree structure. The **sites** entity has two children, **containers** and **members**. The following relations parameter returns all the container and member objects related to the site **siteId**:  &#x60;&#x60;&#x60; containers,members &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
List<String> relations = Arrays.asList("relations_example"); // List<String> | Use the relations parameter to include one or more related entities in a single response.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteEntry result = apiInstance.getSite(siteId, relations, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **relations** | [**List&lt;String&gt;**](String.md)| Use the relations parameter to include one or more related entities in a single response. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteEntry**](SiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSiteContainer"></a>
# **getSiteContainer**
> SiteContainerEntry getSiteContainer(siteId, containerId, fields)

Get a site container

Gets information on the container **containerId** in site **siteId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String containerId = "containerId_example"; // String | The unique identifier of a site container.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteContainerEntry result = apiInstance.getSiteContainer(siteId, containerId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSiteContainer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **containerId** | **String**| The unique identifier of a site container. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteContainerEntry**](SiteContainerEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSiteGroupMembership"></a>
# **getSiteGroupMembership**
> SiteGroupEntry getSiteGroupMembership(siteId, groupId, fields)

Get information about site membership of group

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Gets site membership information for group **groupId** on site **siteId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String groupId = "groupId_example"; // String | The identifier of a group.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteGroupEntry result = apiInstance.getSiteGroupMembership(siteId, groupId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSiteGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **groupId** | **String**| The identifier of a group. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteGroupEntry**](SiteGroupEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSiteMembership"></a>
# **getSiteMembership**
> SiteMemberEntry getSiteMembership(siteId, personId, fields)

Get a site membership

Gets site membership information for person **personId** on site **siteId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String personId = "personId_example"; // String | The identifier of a person.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMemberEntry result = apiInstance.getSiteMembership(siteId, personId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSiteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **personId** | **String**| The identifier of a person. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMemberEntry**](SiteMemberEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSiteMembershipForPerson"></a>
# **getSiteMembershipForPerson**
> SiteRoleEntry getSiteMembershipForPerson(personId, siteId)

Get a site membership

Gets site membership information for person **personId** on site **siteId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String personId = "personId_example"; // String | The identifier of a person.
String siteId = "siteId_example"; // String | The identifier of a site.
try {
    SiteRoleEntry result = apiInstance.getSiteMembershipForPerson(personId, siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSiteMembershipForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |

### Return type

[**SiteRoleEntry**](SiteRoleEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSiteMembershipRequestForPerson"></a>
# **getSiteMembershipRequestForPerson**
> SiteMembershipRequestEntry getSiteMembershipRequestForPerson(personId, siteId, fields)

Get a site membership request

Gets the site membership request for site **siteId** for person **personId**, if one exists.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String personId = "personId_example"; // String | The identifier of a person.
String siteId = "siteId_example"; // String | The identifier of a site.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMembershipRequestEntry result = apiInstance.getSiteMembershipRequestForPerson(personId, siteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSiteMembershipRequestForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMembershipRequestEntry**](SiteMembershipRequestEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSiteMembershipRequests"></a>
# **getSiteMembershipRequests**
> SiteMembershipRequestWithPersonPaging getSiteMembershipRequests(skipCount, maxItems, where, fields)

Get site membership requests

Get the list of site membership requests the user can action.  You can use the **where** parameter to filter the returned site membership requests by **siteId**. For example:  &#x60;&#x60;&#x60; (siteId&#x3D;mySite) &#x60;&#x60;&#x60;  The **where** parameter can also be used to filter by ***personId***. For example:  &#x60;&#x60;&#x60; where&#x3D;(personId&#x3D;person) &#x60;&#x60;&#x60;  This may be combined with the siteId filter, as shown below:  &#x60;&#x60;&#x60; where&#x3D;(siteId&#x3D;mySite AND personId&#x3D;person) &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMembershipRequestWithPersonPaging result = apiInstance.getSiteMembershipRequests(skipCount, maxItems, where, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#getSiteMembershipRequests");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMembershipRequestWithPersonPaging**](SiteMembershipRequestWithPersonPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSiteContainers"></a>
# **listSiteContainers**
> SiteContainerPaging listSiteContainers(siteId, skipCount, maxItems, fields)

List site containers

Gets a list of containers for the site **siteId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteContainerPaging result = apiInstance.listSiteContainers(siteId, skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#listSiteContainers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteContainerPaging**](SiteContainerPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSiteGroups"></a>
# **listSiteGroups**
> SiteGroupPaging listSiteGroups(siteId, skipCount, maxItems, fields)

List group membership for site

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Gets a list of group membership for site **siteId**. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteGroupPaging result = apiInstance.listSiteGroups(siteId, skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#listSiteGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteGroupPaging**](SiteGroupPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSiteMembershipRequestsForPerson"></a>
# **listSiteMembershipRequestsForPerson**
> SiteMembershipRequestPaging listSiteMembershipRequestsForPerson(personId, skipCount, maxItems, fields)

List site membership requests

Gets a list of the current site membership requests for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String personId = "personId_example"; // String | The identifier of a person.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMembershipRequestPaging result = apiInstance.listSiteMembershipRequestsForPerson(personId, skipCount, maxItems, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#listSiteMembershipRequestsForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMembershipRequestPaging**](SiteMembershipRequestPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSiteMemberships"></a>
# **listSiteMemberships**
> SiteMemberPaging listSiteMemberships(siteId, skipCount, maxItems, fields, where)

List site memberships

Gets a list of site memberships for site **siteId**.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
String where = "where_example"; // String | Optionally filter the list. *   ```where=(isMemberOfGroup=false|true)``` 
try {
    SiteMemberPaging result = apiInstance.listSiteMemberships(siteId, skipCount, maxItems, fields, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#listSiteMemberships");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **where** | **String**| Optionally filter the list. *   &#x60;&#x60;&#x60;where&#x3D;(isMemberOfGroup&#x3D;false|true)&#x60;&#x60;&#x60;  | [optional]

### Return type

[**SiteMemberPaging**](SiteMemberPaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSiteMembershipsForPerson"></a>
# **listSiteMembershipsForPerson**
> SiteRolePaging listSiteMembershipsForPerson(personId, skipCount, maxItems, orderBy, relations, fields, where)

List site memberships

Gets a list of site membership information for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  You can use the **where** parameter to filter the returned sites by **visibility** or site **preset**.  Example to filter by **visibility**, use any one of:  &#x60;&#x60;&#x60; (visibility&#x3D;&#x27;PRIVATE&#x27;) (visibility&#x3D;&#x27;PUBLIC&#x27;) (visibility&#x3D;&#x27;MODERATED&#x27;) &#x60;&#x60;&#x60;  Example to filter by site **preset**:  &#x60;&#x60;&#x60; (preset&#x3D;&#x27;site-dashboard&#x27;) &#x60;&#x60;&#x60;  The default sort order for the returned list is for sites to be sorted by ascending title. You can override the default by using the **orderBy** parameter. You can specify one or more of the following fields in the **orderBy** parameter: * id * title * role 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String personId = "personId_example"; // String | The identifier of a person.
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
List<String> relations = Arrays.asList("relations_example"); // List<String> | Use the relations parameter to include one or more related entities in a single response.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate.
try {
    SiteRolePaging result = apiInstance.listSiteMembershipsForPerson(personId, skipCount, maxItems, orderBy, relations, fields, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#listSiteMembershipsForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **personId** | **String**| The identifier of a person. |
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **relations** | [**List&lt;String&gt;**](String.md)| Use the relations parameter to include one or more related entities in a single response. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]

### Return type

[**SiteRolePaging**](SiteRolePaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listSites"></a>
# **listSites**
> SitePaging listSites(skipCount, maxItems, orderBy, relations, fields, where)

List sites

Gets a list of sites in this repository.  You can use the **where** parameter to filter the returned sites by **visibility** or site **preset**.  Example to filter by **visibility**, use any one of:  &#x60;&#x60;&#x60; (visibility&#x3D;&#x27;PRIVATE&#x27;) (visibility&#x3D;&#x27;PUBLIC&#x27;) (visibility&#x3D;&#x27;MODERATED&#x27;) &#x60;&#x60;&#x60;  Example to filter by site **preset**:  &#x60;&#x60;&#x60; (preset&#x3D;&#x27;site-dashboard&#x27;) &#x60;&#x60;&#x60;  The default sort order for the returned list is for sites to be sorted by ascending title. You can override the default by using the **orderBy** parameter. You can specify one or more of the following fields in the **orderBy** parameter: * id * title * description  You can use the **relations** parameter to include one or more related entities in a single response and so reduce network traffic.  The entity types in Alfresco are organized in a tree structure. The **sites** entity has two children, **containers** and **members**. The following relations parameter returns all the container and member objects related to each site:  &#x60;&#x60;&#x60; containers,members &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
Integer skipCount = 0; // Integer | The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. 
Integer maxItems = 100; // Integer | The maximum number of items to return in the list. If not supplied then the default value is 100. 
List<String> orderBy = Arrays.asList("orderBy_example"); // List<String> | A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. 
List<String> relations = Arrays.asList("relations_example"); // List<String> | Use the relations parameter to include one or more related entities in a single response.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
String where = "where_example"; // String | A string to restrict the returned objects by using a predicate.
try {
    SitePaging result = apiInstance.listSites(skipCount, maxItems, orderBy, relations, fields, where);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#listSites");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **skipCount** | **Integer**| The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  | [optional] [default to 0] [enum: 0]
 **maxItems** | **Integer**| The maximum number of items to return in the list. If not supplied then the default value is 100.  | [optional] [default to 100] [enum: 1]
 **orderBy** | [**List&lt;String&gt;**](String.md)| A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally ascending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field.  | [optional]
 **relations** | [**List&lt;String&gt;**](String.md)| Use the relations parameter to include one or more related entities in a single response. | [optional]
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]
 **where** | **String**| A string to restrict the returned objects by using a predicate. | [optional]

### Return type

[**SitePaging**](SitePaging.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rejectSiteMembershipRequest"></a>
# **rejectSiteMembershipRequest**
> rejectSiteMembershipRequest(siteId, inviteeId, body)

Reject a site membership request

Reject a site membership request. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
String siteId = "siteId_example"; // String | The identifier of a site.
String inviteeId = "inviteeId_example"; // String | The invitee user name.
SiteMembershipRejectionBody body = new SiteMembershipRejectionBody(); // SiteMembershipRejectionBody | Rejecting a request to join, optionally, allows the inclusion of comment. 
try {
    apiInstance.rejectSiteMembershipRequest(siteId, inviteeId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#rejectSiteMembershipRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | **String**| The identifier of a site. |
 **inviteeId** | **String**| The invitee user name. |
 **body** | [**SiteMembershipRejectionBody**](SiteMembershipRejectionBody.md)| Rejecting a request to join, optionally, allows the inclusion of comment.  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSite"></a>
# **updateSite**
> SiteEntry updateSite(body, siteId, fields)

Update a site

**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Update the details for the given site **siteId**. Site Manager or otherwise a (site) admin can update title, description or visibility.  Note: the id of a site cannot be updated once the site has been created. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteBodyUpdate body = new SiteBodyUpdate(); // SiteBodyUpdate | The site information to update.
String siteId = "siteId_example"; // String | The identifier of a site.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteEntry result = apiInstance.updateSite(body, siteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#updateSite");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteBodyUpdate**](SiteBodyUpdate.md)| The site information to update. |
 **siteId** | **String**| The identifier of a site. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteEntry**](SiteEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteGroupMembership"></a>
# **updateSiteGroupMembership**
> SiteGroupEntry updateSiteGroupMembership(body, siteId, groupId, fields)

Update site membership of group

**Note:** this endpoint is available in Alfresco 7.0.0 and newer versions.  Update the membership of person **groupId** in site **siteId**. You can set the **role** to one of four types: * SiteConsumer * SiteCollaborator * SiteContributor * SiteManager 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteMembershipBodyUpdate body = new SiteMembershipBodyUpdate(); // SiteMembershipBodyUpdate | The groupId new role
String siteId = "siteId_example"; // String | The identifier of a site.
String groupId = "groupId_example"; // String | The identifier of a group.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteGroupEntry result = apiInstance.updateSiteGroupMembership(body, siteId, groupId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#updateSiteGroupMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteMembershipBodyUpdate**](SiteMembershipBodyUpdate.md)| The groupId new role |
 **siteId** | **String**| The identifier of a site. |
 **groupId** | **String**| The identifier of a group. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteGroupEntry**](SiteGroupEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteMembership"></a>
# **updateSiteMembership**
> SiteMemberEntry updateSiteMembership(body, siteId, personId, fields)

Update a site membership

Update the membership of person **personId** in site **siteId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user.  You can set the **role** to one of four types:  * SiteConsumer * SiteCollaborator * SiteContributor * SiteManager 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteMembershipBodyUpdate body = new SiteMembershipBodyUpdate(); // SiteMembershipBodyUpdate | The persons new role
String siteId = "siteId_example"; // String | The identifier of a site.
String personId = "personId_example"; // String | The identifier of a person.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMemberEntry result = apiInstance.updateSiteMembership(body, siteId, personId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#updateSiteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteMembershipBodyUpdate**](SiteMembershipBodyUpdate.md)| The persons new role |
 **siteId** | **String**| The identifier of a site. |
 **personId** | **String**| The identifier of a person. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMemberEntry**](SiteMemberEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSiteMembershipRequestForPerson"></a>
# **updateSiteMembershipRequestForPerson**
> SiteMembershipRequestEntry updateSiteMembershipRequestForPerson(body, personId, siteId, fields)

Update a site membership request

Updates the message for the site membership request to site **siteId** for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SitesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SitesApi apiInstance = new SitesApi();
SiteMembershipRequestBodyUpdate body = new SiteMembershipRequestBodyUpdate(); // SiteMembershipRequestBodyUpdate | The new message to display
String personId = "personId_example"; // String | The identifier of a person.
String siteId = "siteId_example"; // String | The identifier of a site.
List<String> fields = Arrays.asList("fields_example"); // List<String> | A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. 
try {
    SiteMembershipRequestEntry result = apiInstance.updateSiteMembershipRequestForPerson(body, personId, siteId, fields);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SitesApi#updateSiteMembershipRequestForPerson");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SiteMembershipRequestBodyUpdate**](SiteMembershipRequestBodyUpdate.md)| The new message to display |
 **personId** | **String**| The identifier of a person. |
 **siteId** | **String**| The identifier of a site. |
 **fields** | [**List&lt;String&gt;**](String.md)| A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  | [optional]

### Return type

[**SiteMembershipRequestEntry**](SiteMembershipRequestEntry.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

