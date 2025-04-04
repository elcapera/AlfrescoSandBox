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

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ActivityPaging;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ActivitiesApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public ActivitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ActivitiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void setHeadersOverrides(Map<String, String> headers) {
        this.headers = headers;
    }

    /**
     * Build call for listActivitiesForPerson
     * @param personId The identifier of a person. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param who A filter to include the user&#x27;s activities only &#x60;me&#x60;, other user&#x27;s activities only &#x60;others&#x60;&#x27;  (optional)
     * @param siteId Include only activity feed entries relating to this site. (optional)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listActivitiesForPersonCall(String personId, Integer skipCount, Integer maxItems, String who, String siteId, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/people/{personId}/activities"
            .replaceAll("\\{" + "personId" + "\\}", apiClient.escapeString(personId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (skipCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipCount", skipCount));
        if (maxItems != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxItems", maxItems));
        if (who != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("who", who));
        if (siteId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("siteId", siteId));
        if (fields != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listActivitiesForPersonValidateBeforeCall(String personId, Integer skipCount, Integer maxItems, String who, String siteId, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new ApiException("Missing the required parameter 'personId' when calling listActivitiesForPerson(Async)");
        }
        
        com.squareup.okhttp.Call call = listActivitiesForPersonCall(personId, skipCount, maxItems, who, siteId, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List activities
     * Gets a list of activities for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     * @param personId The identifier of a person. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param who A filter to include the user&#x27;s activities only &#x60;me&#x60;, other user&#x27;s activities only &#x60;others&#x60;&#x27;  (optional)
     * @param siteId Include only activity feed entries relating to this site. (optional)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return ActivityPaging
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ActivityPaging listActivitiesForPerson(String personId, Integer skipCount, Integer maxItems, String who, String siteId, List<String> fields) throws ApiException {
        ApiResponse<ActivityPaging> resp = listActivitiesForPersonWithHttpInfo(personId, skipCount, maxItems, who, siteId, fields);
        return resp.getData();
    }

    /**
     * List activities
     * Gets a list of activities for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     * @param personId The identifier of a person. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param who A filter to include the user&#x27;s activities only &#x60;me&#x60;, other user&#x27;s activities only &#x60;others&#x60;&#x27;  (optional)
     * @param siteId Include only activity feed entries relating to this site. (optional)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return ApiResponse&lt;ActivityPaging&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ActivityPaging> listActivitiesForPersonWithHttpInfo(String personId, Integer skipCount, Integer maxItems, String who, String siteId, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = listActivitiesForPersonValidateBeforeCall(personId, skipCount, maxItems, who, siteId, fields, null, null);
        Type localVarReturnType = new TypeToken<ActivityPaging>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List activities (asynchronously)
     * Gets a list of activities for person **personId**.  You can use the &#x60;-me-&#x60; string in place of &#x60;&lt;personId&gt;&#x60; to specify the currently authenticated user. 
     * @param personId The identifier of a person. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param who A filter to include the user&#x27;s activities only &#x60;me&#x60;, other user&#x27;s activities only &#x60;others&#x60;&#x27;  (optional)
     * @param siteId Include only activity feed entries relating to this site. (optional)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listActivitiesForPersonAsync(String personId, Integer skipCount, Integer maxItems, String who, String siteId, List<String> fields, final ApiCallback<ActivityPaging> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listActivitiesForPersonValidateBeforeCall(personId, skipCount, maxItems, who, siteId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ActivityPaging>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
