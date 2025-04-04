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

import io.swagger.client.model.Error;
import io.swagger.client.model.TagBody;
import io.swagger.client.model.TagEntry;
import io.swagger.client.model.TagPaging;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TagsApi
 */
@Ignore
public class TagsApiTest {

    private final TagsApi api = new TagsApi();

    /**
     * Create a tag for a node
     *
     * Creates a tag on the node **nodeId**. You specify the tag in a JSON body like this:  &#x60;&#x60;&#x60;JSON {   \&quot;tag\&quot;:\&quot;test-tag-1\&quot; } &#x60;&#x60;&#x60;  **Note:** You can create more than one tag by specifying a list of tags in the JSON body like this:  &#x60;&#x60;&#x60;JSON [   {     \&quot;tag\&quot;:\&quot;test-tag-1\&quot;   },   {     \&quot;tag\&quot;:\&quot;test-tag-2\&quot;   } ] &#x60;&#x60;&#x60; If you specify a list as input, then a paginated list rather than an entry is returned in the response body. For example:  &#x60;&#x60;&#x60;JSON {   \&quot;list\&quot;: {     \&quot;pagination\&quot;: {       \&quot;count\&quot;: 2,       \&quot;hasMoreItems\&quot;: false,       \&quot;totalItems\&quot;: 2,       \&quot;skipCount\&quot;: 0,       \&quot;maxItems\&quot;: 100     },     \&quot;entries\&quot;: [       {         \&quot;entry\&quot;: {           ...         }       },       {         \&quot;entry\&quot;: {          ...         }       }     ]   } } &#x60;&#x60;&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTagForNodeTest() throws Exception {
        TagBody body = null;
        String nodeId = null;
        List<String> fields = null;
        TagEntry response = api.createTagForNode(body, nodeId, fields);

        // TODO: test validations
    }
    /**
     * Delete a tag from a node
     *
     * Deletes tag **tagId** from node **nodeId**.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteTagFromNodeTest() throws Exception {
        String nodeId = null;
        String tagId = null;
        api.deleteTagFromNode(nodeId, tagId);

        // TODO: test validations
    }
    /**
     * Get a tag
     *
     * Get a specific tag with **tagId**.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTagTest() throws Exception {
        String tagId = null;
        List<String> fields = null;
        TagEntry response = api.getTag(tagId, fields);

        // TODO: test validations
    }
    /**
     * List tags
     *
     * Gets a list of tags in this repository.  You can use the **include** parameter to return additional **values** information. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listTagsTest() throws Exception {
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> fields = null;
        List<String> include = null;
        TagPaging response = api.listTags(skipCount, maxItems, fields, include);

        // TODO: test validations
    }
    /**
     * List tags for a node
     *
     * Gets a list of tags for node **nodeId**.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listTagsForNodeTest() throws Exception {
        String nodeId = null;
        Integer skipCount = null;
        Integer maxItems = null;
        List<String> fields = null;
        TagPaging response = api.listTagsForNode(nodeId, skipCount, maxItems, fields);

        // TODO: test validations
    }
    /**
     * Update a tag
     *
     * Updates the tag **tagId**.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateTagTest() throws Exception {
        TagBody body = null;
        String tagId = null;
        List<String> fields = null;
        TagEntry response = api.updateTag(body, tagId, fields);

        // TODO: test validations
    }
}
