package ch.elcapera.alfresco;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.NodesApi;
import io.swagger.client.auth.HttpBasicAuth;
import io.swagger.client.model.*;

public class AlfrescoNodeExplorer {
    private final NodesApi apiInstance;
    private int countDocuments;
    private int countFolders;
    public AlfrescoNodeExplorer(String url, String username, String password) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Set the base URL for the Alfresco server
        defaultClient.setBasePath(url);

        // Configure HTTP basic authorization
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername(username);
        basicAuth.setPassword(password);

        // Initialize NodesApi
        this.apiInstance = new NodesApi();
    }

    public void exploreNode(String nodeId) {
        try {
            listNodeChildren(nodeId, "*");
        } catch (ApiException e) {
            System.err.println("Exception when calling NodesApi#listNodeChildren: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String url = null;
        String username = null;
        String password = null;
        String nodeId=null;
        if (args.length < 3) {
            System.out.println("Usage: java -jar elca-wmo.jar <URL> <username> <password> <root_id>");
            //return;
            System.out.println("try to use localhost");
            url = "http://localhost:8080/alfresco/api/-default-/public/alfresco/versions/1";
            username = "admin";
            password = "admin";
            nodeId="eefdea52-3a81-467d-a753-b5096866022c";
        }else {
            url = args[0];
            username = args[1];
            password = args[2];
            nodeId = args[3];
        }

        AlfrescoNodeExplorer explorer = new AlfrescoNodeExplorer(url, username, password);
        explorer.exploreNode(nodeId);
    }

    private void listNodeChildren(String nodeId, String level) throws ApiException {
        NodeChildAssociationPaging result = apiInstance.listNodeChildren(nodeId, 0, 10, null, null, null, null, null, null);
        NodeChildAssociationPagingList list = result.getList();

        for (NodeChildAssociationEntry nodeEntry : list.getEntries()) {
            NodeChildAssociation node = nodeEntry.getEntry();
            if (node.isIsFolder()) {
                countFolders ++;
                // If this is a folder, call this method recursively
                System.out.println(level + " Folder # " + countFolders + ":" + node.getId() + " - " + node.getName());
                listNodeChildren(node.getId(), "*" + level);
            } else {
                countDocuments ++;
                // If it's a document, output Node ID and Name
                System.out.println(level + " Document# " + countDocuments + ":"  + node.getId() + " - " + node.getName());

            }
        }
    }
}
