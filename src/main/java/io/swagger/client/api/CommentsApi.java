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


import io.swagger.client.model.CommentBody;
import io.swagger.client.model.CommentEntry;
import io.swagger.client.model.CommentPaging;
import io.swagger.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsApi {
    private ApiClient apiClient;
    private Map<String, String> headers;

    public CommentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommentsApi(ApiClient apiClient) {
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
     * Build call for createComment
     * @param body The comment text. Note that you can also provide a list of comments. (required)
     * @param nodeId The identifier of a node. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCommentCall(CommentBody body, String nodeId, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/nodes/{nodeId}/comments"
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createCommentValidateBeforeCall(CommentBody body, String nodeId, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createComment(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling createComment(Async)");
        }
        
        com.squareup.okhttp.Call call = createCommentCall(body, nodeId, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a comment
     * Creates a comment on node **nodeId**. You specify the comment in a JSON body like this:  &#x60;&#x60;&#x60;JSON {   \&quot;content\&quot;: \&quot;This is a comment\&quot; } &#x60;&#x60;&#x60;  **Note:** You can create more than one comment by specifying a list of comments in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;content\&quot;: \&quot;This is a comment\&quot;   },   {     \&quot;content\&quot;: \&quot;This is another comment\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     * @param body The comment text. Note that you can also provide a list of comments. (required)
     * @param nodeId The identifier of a node. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return CommentEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentEntry createComment(CommentBody body, String nodeId, List<String> fields) throws ApiException {
        ApiResponse<CommentEntry> resp = createCommentWithHttpInfo(body, nodeId, fields);
        return resp.getData();
    }

    /**
     * Create a comment
     * Creates a comment on node **nodeId**. You specify the comment in a JSON body like this:  &#x60;&#x60;&#x60;JSON {   \&quot;content\&quot;: \&quot;This is a comment\&quot; } &#x60;&#x60;&#x60;  **Note:** You can create more than one comment by specifying a list of comments in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;content\&quot;: \&quot;This is a comment\&quot;   },   {     \&quot;content\&quot;: \&quot;This is another comment\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     * @param body The comment text. Note that you can also provide a list of comments. (required)
     * @param nodeId The identifier of a node. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return ApiResponse&lt;CommentEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentEntry> createCommentWithHttpInfo(CommentBody body, String nodeId, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = createCommentValidateBeforeCall(body, nodeId, fields, null, null);
        Type localVarReturnType = new TypeToken<CommentEntry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a comment (asynchronously)
     * Creates a comment on node **nodeId**. You specify the comment in a JSON body like this:  &#x60;&#x60;&#x60;JSON {   \&quot;content\&quot;: \&quot;This is a comment\&quot; } &#x60;&#x60;&#x60;  **Note:** You can create more than one comment by specifying a list of comments in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;content\&quot;: \&quot;This is a comment\&quot;   },   {     \&quot;content\&quot;: \&quot;This is another comment\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {           ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     * @param body The comment text. Note that you can also provide a list of comments. (required)
     * @param nodeId The identifier of a node. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createCommentAsync(CommentBody body, String nodeId, List<String> fields, final ApiCallback<CommentEntry> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createCommentValidateBeforeCall(body, nodeId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentEntry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteComment
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCommentCall(String nodeId, String commentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/nodes/{nodeId}/comments/{commentId}"
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()))
            .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCommentValidateBeforeCall(String nodeId, String commentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling deleteComment(Async)");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling deleteComment(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteCommentCall(nodeId, commentId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a comment
     * Deletes the comment **commentId** from node **nodeId**.
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteComment(String nodeId, String commentId) throws ApiException {
        deleteCommentWithHttpInfo(nodeId, commentId);
    }

    /**
     * Delete a comment
     * Deletes the comment **commentId** from node **nodeId**.
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCommentWithHttpInfo(String nodeId, String commentId) throws ApiException {
        com.squareup.okhttp.Call call = deleteCommentValidateBeforeCall(nodeId, commentId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a comment (asynchronously)
     * Deletes the comment **commentId** from node **nodeId**.
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCommentAsync(String nodeId, String commentId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCommentValidateBeforeCall(nodeId, commentId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listComments
     * @param nodeId The identifier of a node. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCommentsCall(String nodeId, Integer skipCount, Integer maxItems, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/nodes/{nodeId}/comments"
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (skipCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skipCount", skipCount));
        if (maxItems != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxItems", maxItems));
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
    private com.squareup.okhttp.Call listCommentsValidateBeforeCall(String nodeId, Integer skipCount, Integer maxItems, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling listComments(Async)");
        }
        
        com.squareup.okhttp.Call call = listCommentsCall(nodeId, skipCount, maxItems, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List comments
     * Gets a list of comments for the node **nodeId**, sorted chronologically with the newest comment first.
     * @param nodeId The identifier of a node. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return CommentPaging
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentPaging listComments(String nodeId, Integer skipCount, Integer maxItems, List<String> fields) throws ApiException {
        ApiResponse<CommentPaging> resp = listCommentsWithHttpInfo(nodeId, skipCount, maxItems, fields);
        return resp.getData();
    }

    /**
     * List comments
     * Gets a list of comments for the node **nodeId**, sorted chronologically with the newest comment first.
     * @param nodeId The identifier of a node. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return ApiResponse&lt;CommentPaging&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentPaging> listCommentsWithHttpInfo(String nodeId, Integer skipCount, Integer maxItems, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = listCommentsValidateBeforeCall(nodeId, skipCount, maxItems, fields, null, null);
        Type localVarReturnType = new TypeToken<CommentPaging>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List comments (asynchronously)
     * Gets a list of comments for the node **nodeId**, sorted chronologically with the newest comment first.
     * @param nodeId The identifier of a node. (required)
     * @param skipCount The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0.  (optional, default to 0)
     * @param maxItems The maximum number of items to return in the list. If not supplied then the default value is 100.  (optional, default to 100)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCommentsAsync(String nodeId, Integer skipCount, Integer maxItems, List<String> fields, final ApiCallback<CommentPaging> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCommentsValidateBeforeCall(nodeId, skipCount, maxItems, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentPaging>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateComment
     * @param body The JSON representing the comment to be updated. (required)
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCommentCall(CommentBody body, String nodeId, String commentId, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/nodes/{nodeId}/comments/{commentId}"
            .replaceAll("\\{" + "nodeId" + "\\}", apiClient.escapeString(nodeId.toString()))
            .replaceAll("\\{" + "commentId" + "\\}", apiClient.escapeString(commentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateCommentValidateBeforeCall(CommentBody body, String nodeId, String commentId, List<String> fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateComment(Async)");
        }
        // verify the required parameter 'nodeId' is set
        if (nodeId == null) {
            throw new ApiException("Missing the required parameter 'nodeId' when calling updateComment(Async)");
        }
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new ApiException("Missing the required parameter 'commentId' when calling updateComment(Async)");
        }
        
        com.squareup.okhttp.Call call = updateCommentCall(body, nodeId, commentId, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a comment
     * Updates an existing comment **commentId** on node **nodeId**.
     * @param body The JSON representing the comment to be updated. (required)
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return CommentEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CommentEntry updateComment(CommentBody body, String nodeId, String commentId, List<String> fields) throws ApiException {
        ApiResponse<CommentEntry> resp = updateCommentWithHttpInfo(body, nodeId, commentId, fields);
        return resp.getData();
    }

    /**
     * Update a comment
     * Updates an existing comment **commentId** on node **nodeId**.
     * @param body The JSON representing the comment to be updated. (required)
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @return ApiResponse&lt;CommentEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CommentEntry> updateCommentWithHttpInfo(CommentBody body, String nodeId, String commentId, List<String> fields) throws ApiException {
        com.squareup.okhttp.Call call = updateCommentValidateBeforeCall(body, nodeId, commentId, fields, null, null);
        Type localVarReturnType = new TypeToken<CommentEntry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a comment (asynchronously)
     * Updates an existing comment **commentId** on node **nodeId**.
     * @param body The JSON representing the comment to be updated. (required)
     * @param nodeId The identifier of a node. (required)
     * @param commentId The identifier of a comment. (required)
     * @param fields A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCommentAsync(CommentBody body, String nodeId, String commentId, List<String> fields, final ApiCallback<CommentEntry> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCommentValidateBeforeCall(body, nodeId, commentId, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CommentEntry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
