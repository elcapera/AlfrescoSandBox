package ch.elcapera.alffresco.wmo.alfresco;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.PeopleApi;
import io.swagger.client.auth.HttpBasicAuth;
import io.swagger.client.model.PersonPaging;

public class GetPeopleList {
    public static void main(String[] args) {
        String url = null;
        String username = null;
        String password = null;
        if (args.length < 3) {
            System.out.println("Usage: java -jar elca-wmo.jar <URL> <username> <password>");
            //return;
            System.out.println("try to use localhost");
            url = "http://localhost:8080/alfresco/api/-default-/public/alfresco/versions/1";
            username = "admin";
            password = "admin";
        }else {
            url = args[0];
            username = args[1];
            password = args[2];
        }

        //url = "http://localhost:8080/alfresco/api/-default-/public/alfresco/versions/1";
        //username = "admin";
        //password = "admin";

        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Set the base URL for the Alfresco server
        defaultClient.setBasePath(url);
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");

        basicAuth.setUsername(username);
        basicAuth.setPassword(password);

        PeopleApi apiInstance = new PeopleApi();
        //ActionBodyExec body = new Peo(); // ActionBodyExec | Action execution details
        try {
            PersonPaging result = apiInstance.listPeople( 0, 100,null,null,null);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActionsApi#actionExec");
            e.printStackTrace();
        }

        try {
            // Call a method from the API
            // E.g., YourResponse response = apiInstance.someApiMethod();
            // System.out.println(response);
        } catch (Exception e) {
            System.err.println("Exception when calling API: " + e.getMessage());
        }
    }
}