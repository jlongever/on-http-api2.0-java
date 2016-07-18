# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ApiApi;

import java.io.File;
import java.util.*;

public class ApiApiExample {

    public static void main(String[] args) {
        
        ApiApi apiInstance = new ApiApi();
        UserObj body = new UserObj(); // UserObj | User information
        try {
            Object result = apiInstance.addUser(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#addUser");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**addUser**](docs/ApiApi.md#addUser) | **POST** /users | Add a new user 
*ApiApi* | [**catalogsGet**](docs/ApiApi.md#catalogsGet) | **GET** /catalogs | get list of all catalogs 
*ApiApi* | [**catalogsIdGet**](docs/ApiApi.md#catalogsIdGet) | **GET** /catalogs/{identifier} | get list of all catalogs 
*ApiApi* | [**configGet**](docs/ApiApi.md#configGet) | **GET** /config | get server configuration 
*ApiApi* | [**configPatch**](docs/ApiApi.md#configPatch) | **PATCH** /config | patch/update server configuration 
*ApiApi* | [**createTag**](docs/ApiApi.md#createTag) | **POST** /tags | Create a new tag
*ApiApi* | [**deleteTag**](docs/ApiApi.md#deleteTag) | **DELETE** /tags/{tagName} | Delete the specified tag
*ApiApi* | [**filesDelete**](docs/ApiApi.md#filesDelete) | **DELETE** /files/{fileidentifier} | delete file based on uuid 
*ApiApi* | [**filesGet**](docs/ApiApi.md#filesGet) | **GET** /files/{fileidentifier} | get file based on uuid or file name 
*ApiApi* | [**filesGetAll**](docs/ApiApi.md#filesGetAll) | **GET** /files | get all available files 
*ApiApi* | [**filesMd5Get**](docs/ApiApi.md#filesMd5Get) | **GET** /files/{filename}/md5 | get md5sum based on file name 
*ApiApi* | [**filesMetadataGet**](docs/ApiApi.md#filesMetadataGet) | **GET** /files/{filename}/metadata | get file metadata by file name 
*ApiApi* | [**filesPut**](docs/ApiApi.md#filesPut) | **PUT** /files/{fileidentifier} | put file based on filename 
*ApiApi* | [**getAllTags**](docs/ApiApi.md#getAllTags) | **GET** /tags | Retrieve information about all tags
*ApiApi* | [**getBootstrap**](docs/ApiApi.md#getBootstrap) | **GET** /tasks/bootstrap.js | get tasks bootstrap.js 
*ApiApi* | [**getNodesByTag**](docs/ApiApi.md#getNodesByTag) | **GET** /tags/{tagName}/nodes | Retrieve nodes with the specified tag
*ApiApi* | [**getTag**](docs/ApiApi.md#getTag) | **GET** /tags/{tagName} | Retrieve information about the tag
*ApiApi* | [**getTasksById**](docs/ApiApi.md#getTasksById) | **GET** /tasks/{identifier} | get specific task 
*ApiApi* | [**getUser**](docs/ApiApi.md#getUser) | **GET** /users/{name} | Get information about a user 
*ApiApi* | [**listUsers**](docs/ApiApi.md#listUsers) | **GET** /users | Retrieve a list of users 
*ApiApi* | [**lookupsDelById**](docs/ApiApi.md#lookupsDelById) | **DELETE** /lookups/{id} | Delete specified lookup details. 
*ApiApi* | [**lookupsGet**](docs/ApiApi.md#lookupsGet) | **GET** /lookups | find all 
*ApiApi* | [**lookupsGetById**](docs/ApiApi.md#lookupsGetById) | **GET** /lookups/{id} | lookup id 
*ApiApi* | [**lookupsPatchById**](docs/ApiApi.md#lookupsPatchById) | **PATCH** /lookups/{id} | Patch specified lookup record 
*ApiApi* | [**lookupsPost**](docs/ApiApi.md#lookupsPost) | **POST** /lookups | find all 
*ApiApi* | [**modifyUser**](docs/ApiApi.md#modifyUser) | **PATCH** /users/{name} | Update properties on a user 
*ApiApi* | [**nodesDelById**](docs/ApiApi.md#nodesDelById) | **DELETE** /nodes/{identifier} | Delete specified node. 
*ApiApi* | [**nodesDelTagById**](docs/ApiApi.md#nodesDelTagById) | **DELETE** /nodes/{identifier}/tags/{tagName} | Delete a tag from the specified node. 
*ApiApi* | [**nodesGetAll**](docs/ApiApi.md#nodesGetAll) | **GET** /nodes | List of all nodes or if there are none an empty object 
*ApiApi* | [**nodesGetById**](docs/ApiApi.md#nodesGetById) | **GET** /nodes/{identifier} | List of all nodes or if there are none an empty object 
*ApiApi* | [**nodesGetCatalogById**](docs/ApiApi.md#nodesGetCatalogById) | **GET** /nodes/{identifier}/catalogs | Fetch catalog of specified node 
*ApiApi* | [**nodesGetCatalogSourceById**](docs/ApiApi.md#nodesGetCatalogSourceById) | **GET** /nodes/{identifier}/catalogs/{source} | Fetch catalog of specified node for given source 
*ApiApi* | [**nodesGetPollersById**](docs/ApiApi.md#nodesGetPollersById) | **GET** /nodes/{identifier}/pollers | Fetch all pollers for specified node 
*ApiApi* | [**nodesGetSshById**](docs/ApiApi.md#nodesGetSshById) | **GET** /nodes/{identifier}/ssh | get the ssh settings associated with a node. 
*ApiApi* | [**nodesGetTagsById**](docs/ApiApi.md#nodesGetTagsById) | **GET** /nodes/{identifier}/tags | List of all tags on the node or an empty object if there are none 
*ApiApi* | [**nodesGetWorkflowById**](docs/ApiApi.md#nodesGetWorkflowById) | **GET** /nodes/{identifier}/workflows | Fetch all workflows for specified node 
*ApiApi* | [**nodesMasterDelTagById**](docs/ApiApi.md#nodesMasterDelTagById) | **DELETE** /nodes/tags/{tagName} | Delete specified tag from all nodes. 
*ApiApi* | [**nodesPatchById**](docs/ApiApi.md#nodesPatchById) | **PATCH** /nodes/{identifier} | Patch specified node 
*ApiApi* | [**nodesPatchTagById**](docs/ApiApi.md#nodesPatchTagById) | **PATCH** /nodes/{identifier}/tags | Patch tags onto specified node 
*ApiApi* | [**nodesPost**](docs/ApiApi.md#nodesPost) | **POST** /nodes | post 
*ApiApi* | [**nodesPostSshById**](docs/ApiApi.md#nodesPostSshById) | **POST** /nodes/{identifier}/ssh | set the ssh settings associated with a node. 
*ApiApi* | [**nodesPostWorkflowById**](docs/ApiApi.md#nodesPostWorkflowById) | **POST** /nodes/{identifier}/workflows | create workflow for specified node 
*ApiApi* | [**nodesWorkflowActionById**](docs/ApiApi.md#nodesWorkflowActionById) | **PUT** /nodes/{identifier}/workflows/action | Cancel currently running workflows for specified node 
*ApiApi* | [**obmsDefinitionsGetAll**](docs/ApiApi.md#obmsDefinitionsGetAll) | **GET** /obms/definitions | Get list of possible OBM services 
*ApiApi* | [**obmsDefinitionsGetByName**](docs/ApiApi.md#obmsDefinitionsGetByName) | **GET** /obms/definitions/{name} | Get the specified OBM service definition 
*ApiApi* | [**obmsDeleteById**](docs/ApiApi.md#obmsDeleteById) | **DELETE** /obms/{identifier} | Delete the OBM service with the specified identifier 
*ApiApi* | [**obmsGet**](docs/ApiApi.md#obmsGet) | **GET** /obms | Get list of all OBM service instances 
*ApiApi* | [**obmsGetById**](docs/ApiApi.md#obmsGetById) | **GET** /obms/{identifier} | get the specified OBM service 
*ApiApi* | [**obmsPatchById**](docs/ApiApi.md#obmsPatchById) | **PATCH** /obms/{identifier} | patch a single OBM service 
*ApiApi* | [**obmsPostLed**](docs/ApiApi.md#obmsPostLed) | **POST** /obms/led | Enable or disable identify light on node through OBM (if supported) 
*ApiApi* | [**obmsPut**](docs/ApiApi.md#obmsPut) | **PUT** /obms | create or update a single OBM service 
*ApiApi* | [**pollersCurrentDataGet**](docs/ApiApi.md#pollersCurrentDataGet) | **GET** /pollers/{identifier}/data/current | Get latest data for the specific poller 
*ApiApi* | [**pollersDataGet**](docs/ApiApi.md#pollersDataGet) | **GET** /pollers/{identifier}/data | Get data for the specific poller 
*ApiApi* | [**pollersDelete**](docs/ApiApi.md#pollersDelete) | **DELETE** /pollers/{identifier} | delete the specified poller 
*ApiApi* | [**pollersGet**](docs/ApiApi.md#pollersGet) | **GET** /pollers | get list of all pollers 
*ApiApi* | [**pollersIdGet**](docs/ApiApi.md#pollersIdGet) | **GET** /pollers/{identifier} | Get specifics of the specified poller 
*ApiApi* | [**pollersLibByIdGet**](docs/ApiApi.md#pollersLibByIdGet) | **GET** /pollers/library/{identifier} | get a single library poller 
*ApiApi* | [**pollersLibGet**](docs/ApiApi.md#pollersLibGet) | **GET** /pollers/library | get list of possible library pollers 
*ApiApi* | [**pollersPatch**](docs/ApiApi.md#pollersPatch) | **PATCH** /pollers/{identifier} | patch specifics of the specified poller 
*ApiApi* | [**pollersPost**](docs/ApiApi.md#pollersPost) | **POST** /pollers | create a poller 
*ApiApi* | [**postTaskById**](docs/ApiApi.md#postTaskById) | **POST** /tasks/{identifier} | post specific task 
*ApiApi* | [**postWorkflowById**](docs/ApiApi.md#postWorkflowById) | **POST** /tags/{tagName}/nodes/workflows | create workflow for nodes with the specified tag 
*ApiApi* | [**profilesGet**](docs/ApiApi.md#profilesGet) | **GET** /profiles | get list of possible profiles 
*ApiApi* | [**profilesGetLibByName**](docs/ApiApi.md#profilesGetLibByName) | **GET** /profiles/library/{name} | get a single profile&#39;s raw data 
*ApiApi* | [**profilesGetMetadata**](docs/ApiApi.md#profilesGetMetadata) | **GET** /profiles/metadata | get list of possible profiles from database 
*ApiApi* | [**profilesGetMetadataByName**](docs/ApiApi.md#profilesGetMetadataByName) | **GET** /profiles/metadata/{name} | get a single profile&#39;s metadata from database 
*ApiApi* | [**profilesGetSwitchVendor**](docs/ApiApi.md#profilesGetSwitchVendor) | **GET** /profiles/switch/{vendor} | get a single profile 
*ApiApi* | [**profilesPostSwitchError**](docs/ApiApi.md#profilesPostSwitchError) | **POST** /profiles/switch/error | create a switch error 
*ApiApi* | [**profilesPutLibByName**](docs/ApiApi.md#profilesPutLibByName) | **PUT** /profiles/library/{name} | put a single profile 
*ApiApi* | [**removeUser**](docs/ApiApi.md#removeUser) | **DELETE** /users/{name} | Delete a user 
*ApiApi* | [**schemasGet**](docs/ApiApi.md#schemasGet) | **GET** /schemas | get list of all schemas 
*ApiApi* | [**schemasIdGet**](docs/ApiApi.md#schemasIdGet) | **GET** /schemas/{identifier} | get a schema by specifying its identifier 
*ApiApi* | [**skuPackPost**](docs/ApiApi.md#skuPackPost) | **POST** /skus/pack | get list of skus 
*ApiApi* | [**skusGet**](docs/ApiApi.md#skusGet) | **GET** /skus | get list of skus 
*ApiApi* | [**skusIdDelete**](docs/ApiApi.md#skusIdDelete) | **DELETE** /skus/{identifier} | Delete specific sku. 
*ApiApi* | [**skusIdDeletePack**](docs/ApiApi.md#skusIdDeletePack) | **DELETE** /skus/{identifier}/pack | Delete a pack for a specific sku 
*ApiApi* | [**skusIdGet**](docs/ApiApi.md#skusIdGet) | **GET** /skus/{identifier} | get a single sku 
*ApiApi* | [**skusIdGetNodes**](docs/ApiApi.md#skusIdGetNodes) | **GET** /skus/{identifier}/nodes | get nodes for specific sku 
*ApiApi* | [**skusIdPutPack**](docs/ApiApi.md#skusIdPutPack) | **PUT** /skus/{identifier}/pack | put a sku pack to specific sku 
*ApiApi* | [**skusPatch**](docs/ApiApi.md#skusPatch) | **PATCH** /skus/{identifier} | patch a single sku 
*ApiApi* | [**skusPost**](docs/ApiApi.md#skusPost) | **POST** /skus | create a sku 
*ApiApi* | [**skusPut**](docs/ApiApi.md#skusPut) | **PUT** /skus | create or update a sku 
*ApiApi* | [**templatesGetByName**](docs/ApiApi.md#templatesGetByName) | **GET** /templates/{name} | get a single template 
*ApiApi* | [**templatesLibDelete**](docs/ApiApi.md#templatesLibDelete) | **DELETE** /templates/library/{name} | delete a single template 
*ApiApi* | [**templatesLibGet**](docs/ApiApi.md#templatesLibGet) | **GET** /templates/library/{name} | get a single template 
*ApiApi* | [**templatesLibPut**](docs/ApiApi.md#templatesLibPut) | **PUT** /templates/library/{name} | put a single template 
*ApiApi* | [**templatesMetaGet**](docs/ApiApi.md#templatesMetaGet) | **GET** /templates/metadata | get list of metadata for all templates 
*ApiApi* | [**templatesMetaGetByName**](docs/ApiApi.md#templatesMetaGetByName) | **GET** /templates/metadata/{name} | get metadata for a specific template 
*ApiApi* | [**unimplemented**](docs/ApiApi.md#unimplemented) | **GET** /dhcp | get DHCP lease table 
*ApiApi* | [**unimplemented_0**](docs/ApiApi.md#unimplemented_0) | **GET** /dhcp/lease/{mac} | fetch lease information for the mac specified 
*ApiApi* | [**unimplemented_1**](docs/ApiApi.md#unimplemented_1) | **DELETE** /dhcp/lease/{mac} | get list of all catalogs
*ApiApi* | [**unimplemented_2**](docs/ApiApi.md#unimplemented_2) | **GET** /obms/led | Fetch status of identify light on node through OBM (if supported) 
*ApiApi* | [**viewsDelete**](docs/ApiApi.md#viewsDelete) | **DELETE** /views/{identifier} | put a single view 
*ApiApi* | [**viewsGet**](docs/ApiApi.md#viewsGet) | **GET** /views | get all views 
*ApiApi* | [**viewsGetById**](docs/ApiApi.md#viewsGetById) | **GET** /views/{identifier} | get view with specified identifier 
*ApiApi* | [**viewsPut**](docs/ApiApi.md#viewsPut) | **PUT** /views/{identifier} | put a single view 
*ApiApi* | [**workflowsAction**](docs/ApiApi.md#workflowsAction) | **PUT** /workflows/{identifier}/action | Perform the specified action on the selected workflow 
*ApiApi* | [**workflowsDeleteByInstanceId**](docs/ApiApi.md#workflowsDeleteByInstanceId) | **DELETE** /workflows/{identifier} | Delete the workflow with the specified ID 
*ApiApi* | [**workflowsDeleteGraphsByName**](docs/ApiApi.md#workflowsDeleteGraphsByName) | **DELETE** /workflows/graphs/{injectableName} | Delete the graph with the specified injectable name 
*ApiApi* | [**workflowsDeleteTasksByName**](docs/ApiApi.md#workflowsDeleteTasksByName) | **DELETE** /workflows/tasks/{injectableName} | Delete the task with the specified injectable name 
*ApiApi* | [**workflowsGet**](docs/ApiApi.md#workflowsGet) | **GET** /workflows | Get list of active and past run workflow instances 
*ApiApi* | [**workflowsGetAllTasks**](docs/ApiApi.md#workflowsGetAllTasks) | **GET** /workflows/tasks | Get list of tasks possible to run in workflows 
*ApiApi* | [**workflowsGetByInstanceId**](docs/ApiApi.md#workflowsGetByInstanceId) | **GET** /workflows/{identifier} | get a specific workflow 
*ApiApi* | [**workflowsGetGraphs**](docs/ApiApi.md#workflowsGetGraphs) | **GET** /workflows/graphs | Get list of all graphs 
*ApiApi* | [**workflowsGetGraphsByName**](docs/ApiApi.md#workflowsGetGraphsByName) | **GET** /workflows/graphs/{injectableName} | Get the graph with the specified injectable name 
*ApiApi* | [**workflowsGetTasksByName**](docs/ApiApi.md#workflowsGetTasksByName) | **GET** /workflows/tasks/{injectableName} | Get the task with the specified injectable name 
*ApiApi* | [**workflowsPost**](docs/ApiApi.md#workflowsPost) | **POST** /workflows | Run a new workflow 
*ApiApi* | [**workflowsPutGraphs**](docs/ApiApi.md#workflowsPutGraphs) | **PUT** /workflows/graphs | Add a graph to the graph library 
*ApiApi* | [**workflowsPutTask**](docs/ApiApi.md#workflowsPutTask) | **PUT** /workflows/tasks | Add tasks to task library 


## Documentation for Models

 - [Action](docs/Action.md)
 - [Catalog](docs/Catalog.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [GenericObj](docs/GenericObj.md)
 - [Graphobject](docs/Graphobject.md)
 - [Lease](docs/Lease.md)
 - [Node](docs/Node.md)
 - [Sku](docs/Sku.md)
 - [UserObj](docs/UserObj.md)
 - [VersionsResponse](docs/VersionsResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



