# ApiApi

All URIs are relative to *http://localhost/api/2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUser**](ApiApi.md#addUser) | **POST** /users | Add a new user 
[**catalogsGet**](ApiApi.md#catalogsGet) | **GET** /catalogs | get list of all catalogs 
[**catalogsIdGet**](ApiApi.md#catalogsIdGet) | **GET** /catalogs/{identifier} | get list of all catalogs 
[**configGet**](ApiApi.md#configGet) | **GET** /config | get server configuration 
[**configPatch**](ApiApi.md#configPatch) | **PATCH** /config | patch/update server configuration 
[**createTag**](ApiApi.md#createTag) | **POST** /tags | Create a new tag
[**deleteTag**](ApiApi.md#deleteTag) | **DELETE** /tags/{tagName} | Delete the specified tag
[**filesDelete**](ApiApi.md#filesDelete) | **DELETE** /files/{fileidentifier} | delete file based on uuid 
[**filesGet**](ApiApi.md#filesGet) | **GET** /files/{fileidentifier} | get file based on uuid or file name 
[**filesGetAll**](ApiApi.md#filesGetAll) | **GET** /files | get all available files 
[**filesMd5Get**](ApiApi.md#filesMd5Get) | **GET** /files/{filename}/md5 | get md5sum based on file name 
[**filesMetadataGet**](ApiApi.md#filesMetadataGet) | **GET** /files/{filename}/metadata | get file metadata by file name 
[**filesPut**](ApiApi.md#filesPut) | **PUT** /files/{fileidentifier} | put file based on filename 
[**getAllTags**](ApiApi.md#getAllTags) | **GET** /tags | Retrieve information about all tags
[**getBootstrap**](ApiApi.md#getBootstrap) | **GET** /tasks/bootstrap.js | get tasks bootstrap.js 
[**getNodesByTag**](ApiApi.md#getNodesByTag) | **GET** /tags/{tagName}/nodes | Retrieve nodes with the specified tag
[**getTag**](ApiApi.md#getTag) | **GET** /tags/{tagName} | Retrieve information about the tag
[**getTasksById**](ApiApi.md#getTasksById) | **GET** /tasks/{identifier} | get specific task 
[**getUser**](ApiApi.md#getUser) | **GET** /users/{name} | Get information about a user 
[**listUsers**](ApiApi.md#listUsers) | **GET** /users | Retrieve a list of users 
[**lookupsDelById**](ApiApi.md#lookupsDelById) | **DELETE** /lookups/{id} | Delete specified lookup details. 
[**lookupsGet**](ApiApi.md#lookupsGet) | **GET** /lookups | find all 
[**lookupsGetById**](ApiApi.md#lookupsGetById) | **GET** /lookups/{id} | lookup id 
[**lookupsPatchById**](ApiApi.md#lookupsPatchById) | **PATCH** /lookups/{id} | Patch specified lookup record 
[**lookupsPost**](ApiApi.md#lookupsPost) | **POST** /lookups | find all 
[**modifyUser**](ApiApi.md#modifyUser) | **PATCH** /users/{name} | Update properties on a user 
[**nodesDelById**](ApiApi.md#nodesDelById) | **DELETE** /nodes/{identifier} | Delete specified node. 
[**nodesDelTagById**](ApiApi.md#nodesDelTagById) | **DELETE** /nodes/{identifier}/tags/{tagName} | Delete a tag from the specified node. 
[**nodesGetAll**](ApiApi.md#nodesGetAll) | **GET** /nodes | List of all nodes or if there are none an empty object 
[**nodesGetById**](ApiApi.md#nodesGetById) | **GET** /nodes/{identifier} | List of all nodes or if there are none an empty object 
[**nodesGetCatalogById**](ApiApi.md#nodesGetCatalogById) | **GET** /nodes/{identifier}/catalogs | Fetch catalog of specified node 
[**nodesGetCatalogSourceById**](ApiApi.md#nodesGetCatalogSourceById) | **GET** /nodes/{identifier}/catalogs/{source} | Fetch catalog of specified node for given source 
[**nodesGetPollersById**](ApiApi.md#nodesGetPollersById) | **GET** /nodes/{identifier}/pollers | Fetch all pollers for specified node 
[**nodesGetSshById**](ApiApi.md#nodesGetSshById) | **GET** /nodes/{identifier}/ssh | get the ssh settings associated with a node. 
[**nodesGetTagsById**](ApiApi.md#nodesGetTagsById) | **GET** /nodes/{identifier}/tags | List of all tags on the node or an empty object if there are none 
[**nodesGetWorkflowById**](ApiApi.md#nodesGetWorkflowById) | **GET** /nodes/{identifier}/workflows | Fetch all workflows for specified node 
[**nodesMasterDelTagById**](ApiApi.md#nodesMasterDelTagById) | **DELETE** /nodes/tags/{tagName} | Delete specified tag from all nodes. 
[**nodesPatchById**](ApiApi.md#nodesPatchById) | **PATCH** /nodes/{identifier} | Patch specified node 
[**nodesPatchTagById**](ApiApi.md#nodesPatchTagById) | **PATCH** /nodes/{identifier}/tags | Patch tags onto specified node 
[**nodesPost**](ApiApi.md#nodesPost) | **POST** /nodes | post 
[**nodesPostSshById**](ApiApi.md#nodesPostSshById) | **POST** /nodes/{identifier}/ssh | set the ssh settings associated with a node. 
[**nodesPostWorkflowById**](ApiApi.md#nodesPostWorkflowById) | **POST** /nodes/{identifier}/workflows | create workflow for specified node 
[**nodesWorkflowActionById**](ApiApi.md#nodesWorkflowActionById) | **PUT** /nodes/{identifier}/workflows/action | Cancel currently running workflows for specified node 
[**obmsDefinitionsGetAll**](ApiApi.md#obmsDefinitionsGetAll) | **GET** /obms/definitions | Get list of possible OBM services 
[**obmsDefinitionsGetByName**](ApiApi.md#obmsDefinitionsGetByName) | **GET** /obms/definitions/{name} | Get the specified OBM service definition 
[**obmsDeleteById**](ApiApi.md#obmsDeleteById) | **DELETE** /obms/{identifier} | Delete the OBM service with the specified identifier 
[**obmsGet**](ApiApi.md#obmsGet) | **GET** /obms | Get list of all OBM service instances 
[**obmsGetById**](ApiApi.md#obmsGetById) | **GET** /obms/{identifier} | get the specified OBM service 
[**obmsPatchById**](ApiApi.md#obmsPatchById) | **PATCH** /obms/{identifier} | patch a single OBM service 
[**obmsPostLed**](ApiApi.md#obmsPostLed) | **POST** /obms/led | Enable or disable identify light on node through OBM (if supported) 
[**obmsPut**](ApiApi.md#obmsPut) | **PUT** /obms | create or update a single OBM service 
[**pollersCurrentDataGet**](ApiApi.md#pollersCurrentDataGet) | **GET** /pollers/{identifier}/data/current | Get latest data for the specific poller 
[**pollersDataGet**](ApiApi.md#pollersDataGet) | **GET** /pollers/{identifier}/data | Get data for the specific poller 
[**pollersDelete**](ApiApi.md#pollersDelete) | **DELETE** /pollers/{identifier} | delete the specified poller 
[**pollersGet**](ApiApi.md#pollersGet) | **GET** /pollers | get list of all pollers 
[**pollersIdGet**](ApiApi.md#pollersIdGet) | **GET** /pollers/{identifier} | Get specifics of the specified poller 
[**pollersLibByIdGet**](ApiApi.md#pollersLibByIdGet) | **GET** /pollers/library/{identifier} | get a single library poller 
[**pollersLibGet**](ApiApi.md#pollersLibGet) | **GET** /pollers/library | get list of possible library pollers 
[**pollersPatch**](ApiApi.md#pollersPatch) | **PATCH** /pollers/{identifier} | patch specifics of the specified poller 
[**pollersPost**](ApiApi.md#pollersPost) | **POST** /pollers | create a poller 
[**postTaskById**](ApiApi.md#postTaskById) | **POST** /tasks/{identifier} | post specific task 
[**postWorkflowById**](ApiApi.md#postWorkflowById) | **POST** /tags/{tagName}/nodes/workflows | create workflow for nodes with the specified tag 
[**profilesGet**](ApiApi.md#profilesGet) | **GET** /profiles | get list of possible profiles 
[**profilesGetLibByName**](ApiApi.md#profilesGetLibByName) | **GET** /profiles/library/{name} | get a single profile&#39;s raw data 
[**profilesGetMetadata**](ApiApi.md#profilesGetMetadata) | **GET** /profiles/metadata | get list of possible profiles from database 
[**profilesGetMetadataByName**](ApiApi.md#profilesGetMetadataByName) | **GET** /profiles/metadata/{name} | get a single profile&#39;s metadata from database 
[**profilesGetSwitchVendor**](ApiApi.md#profilesGetSwitchVendor) | **GET** /profiles/switch/{vendor} | get a single profile 
[**profilesPostSwitchError**](ApiApi.md#profilesPostSwitchError) | **POST** /profiles/switch/error | create a switch error 
[**profilesPutLibByName**](ApiApi.md#profilesPutLibByName) | **PUT** /profiles/library/{name} | put a single profile 
[**removeUser**](ApiApi.md#removeUser) | **DELETE** /users/{name} | Delete a user 
[**schemasGet**](ApiApi.md#schemasGet) | **GET** /schemas | get list of all schemas 
[**schemasIdGet**](ApiApi.md#schemasIdGet) | **GET** /schemas/{identifier} | get a schema by specifying its identifier 
[**skuPackPost**](ApiApi.md#skuPackPost) | **POST** /skus/pack | get list of skus 
[**skusGet**](ApiApi.md#skusGet) | **GET** /skus | get list of skus 
[**skusIdDelete**](ApiApi.md#skusIdDelete) | **DELETE** /skus/{identifier} | Delete specific sku. 
[**skusIdDeletePack**](ApiApi.md#skusIdDeletePack) | **DELETE** /skus/{identifier}/pack | Delete a pack for a specific sku 
[**skusIdGet**](ApiApi.md#skusIdGet) | **GET** /skus/{identifier} | get a single sku 
[**skusIdGetNodes**](ApiApi.md#skusIdGetNodes) | **GET** /skus/{identifier}/nodes | get nodes for specific sku 
[**skusIdPutPack**](ApiApi.md#skusIdPutPack) | **PUT** /skus/{identifier}/pack | put a sku pack to specific sku 
[**skusPatch**](ApiApi.md#skusPatch) | **PATCH** /skus/{identifier} | patch a single sku 
[**skusPost**](ApiApi.md#skusPost) | **POST** /skus | create a sku 
[**skusPut**](ApiApi.md#skusPut) | **PUT** /skus | create or update a sku 
[**templatesGetByName**](ApiApi.md#templatesGetByName) | **GET** /templates/{name} | get a single template 
[**templatesLibDelete**](ApiApi.md#templatesLibDelete) | **DELETE** /templates/library/{name} | delete a single template 
[**templatesLibGet**](ApiApi.md#templatesLibGet) | **GET** /templates/library/{name} | get a single template 
[**templatesLibPut**](ApiApi.md#templatesLibPut) | **PUT** /templates/library/{name} | put a single template 
[**templatesMetaGet**](ApiApi.md#templatesMetaGet) | **GET** /templates/metadata | get list of metadata for all templates 
[**templatesMetaGetByName**](ApiApi.md#templatesMetaGetByName) | **GET** /templates/metadata/{name} | get metadata for a specific template 
[**unimplemented**](ApiApi.md#unimplemented) | **GET** /dhcp | get DHCP lease table 
[**unimplemented_0**](ApiApi.md#unimplemented_0) | **GET** /dhcp/lease/{mac} | fetch lease information for the mac specified 
[**unimplemented_1**](ApiApi.md#unimplemented_1) | **DELETE** /dhcp/lease/{mac} | get list of all catalogs
[**unimplemented_2**](ApiApi.md#unimplemented_2) | **GET** /obms/led | Fetch status of identify light on node through OBM (if supported) 
[**viewsDelete**](ApiApi.md#viewsDelete) | **DELETE** /views/{identifier} | put a single view 
[**viewsGet**](ApiApi.md#viewsGet) | **GET** /views | get all views 
[**viewsGetById**](ApiApi.md#viewsGetById) | **GET** /views/{identifier} | get view with specified identifier 
[**viewsPut**](ApiApi.md#viewsPut) | **PUT** /views/{identifier} | put a single view 
[**workflowsAction**](ApiApi.md#workflowsAction) | **PUT** /workflows/{identifier}/action | Perform the specified action on the selected workflow 
[**workflowsDeleteByInstanceId**](ApiApi.md#workflowsDeleteByInstanceId) | **DELETE** /workflows/{identifier} | Delete the workflow with the specified ID 
[**workflowsDeleteGraphsByName**](ApiApi.md#workflowsDeleteGraphsByName) | **DELETE** /workflows/graphs/{injectableName} | Delete the graph with the specified injectable name 
[**workflowsDeleteTasksByName**](ApiApi.md#workflowsDeleteTasksByName) | **DELETE** /workflows/tasks/{injectableName} | Delete the task with the specified injectable name 
[**workflowsGet**](ApiApi.md#workflowsGet) | **GET** /workflows | Get list of active and past run workflow instances 
[**workflowsGetAllTasks**](ApiApi.md#workflowsGetAllTasks) | **GET** /workflows/tasks | Get list of tasks possible to run in workflows 
[**workflowsGetByInstanceId**](ApiApi.md#workflowsGetByInstanceId) | **GET** /workflows/{identifier} | get a specific workflow 
[**workflowsGetGraphs**](ApiApi.md#workflowsGetGraphs) | **GET** /workflows/graphs | Get list of all graphs 
[**workflowsGetGraphsByName**](ApiApi.md#workflowsGetGraphsByName) | **GET** /workflows/graphs/{injectableName} | Get the graph with the specified injectable name 
[**workflowsGetTasksByName**](ApiApi.md#workflowsGetTasksByName) | **GET** /workflows/tasks/{injectableName} | Get the task with the specified injectable name 
[**workflowsPost**](ApiApi.md#workflowsPost) | **POST** /workflows | Run a new workflow 
[**workflowsPutGraphs**](ApiApi.md#workflowsPutGraphs) | **PUT** /workflows/graphs | Add a graph to the graph library 
[**workflowsPutTask**](ApiApi.md#workflowsPutTask) | **PUT** /workflows/tasks | Add tasks to task library 


<a name="addUser"></a>
# **addUser**
> Object addUser(body)

Add a new user 

Add a new user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
UserObj body = new UserObj(); // UserObj | User information
try {
    Object result = apiInstance.addUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#addUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserObj**](UserObj.md)| User information |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogsGet"></a>
# **catalogsGet**
> VersionsResponse catalogsGet(query)

get list of all catalogs 

The catalogs endpoint returns json data that represent the catalogs of all hardware in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String query = "query_example"; // String | query object to pass through to waterline.
try {
    VersionsResponse result = apiInstance.catalogsGet(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#catalogsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query object to pass through to waterline. | [optional]

### Return type

[**VersionsResponse**](VersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="catalogsIdGet"></a>
# **catalogsIdGet**
> VersionsResponse catalogsIdGet(identifier)

get list of all catalogs 

The catalogs endpoint returns json data that represent the catalogs of all hardware in the system. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | identifier of a catalog
try {
    VersionsResponse result = apiInstance.catalogsIdGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#catalogsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| identifier of a catalog |

### Return type

[**VersionsResponse**](VersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configGet"></a>
# **configGet**
> Object configGet()

get server configuration 

Get server configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.configGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#configGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="configPatch"></a>
# **configPatch**
> Object configPatch(config)

patch/update server configuration 

Patch/update server configuration and then return the patched configuration. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj config = new GenericObj(); // GenericObj | Updated config fields
try {
    Object result = apiInstance.configPatch(config);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#configPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config** | [**GenericObj**](GenericObj.md)| Updated config fields |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTag"></a>
# **createTag**
> Object createTag(body)

Create a new tag

Create a new tag 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | tag creation options
try {
    Object result = apiInstance.createTag(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#createTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| tag creation options |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTag"></a>
# **deleteTag**
> Object deleteTag(tagName)

Delete the specified tag

Delete the specified tag 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String tagName = "tagName_example"; // String | The tag identifier
try {
    Object result = apiInstance.deleteTag(tagName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#deleteTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| The tag identifier |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesDelete"></a>
# **filesDelete**
> filesDelete(fileidentifier)

delete file based on uuid 

Delete a file based on uuid. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String fileidentifier = "fileidentifier_example"; // String | UUID of the file you wish to delete
try {
    apiInstance.filesDelete(fileidentifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#filesDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileidentifier** | **String**| UUID of the file you wish to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesGet"></a>
# **filesGet**
> File filesGet(fileidentifier)

get file based on uuid or file name 

Get file based on uuid or file name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String fileidentifier = "fileidentifier_example"; // String | uuid or file name of a file as provided when you originally stored it.
try {
    File result = apiInstance.filesGet(fileidentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#filesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileidentifier** | **String**| uuid or file name of a file as provided when you originally stored it. |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesGetAll"></a>
# **filesGetAll**
> Object filesGetAll()

get all available files 

Get all available files 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.filesGetAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#filesGetAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesMd5Get"></a>
# **filesMd5Get**
> Object filesMd5Get(filename)

get md5sum based on file name 

Get md5sum based on file name. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String filename = "filename_example"; // String | File name of a file as provided when you originally stored it.
try {
    Object result = apiInstance.filesMd5Get(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#filesMd5Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| File name of a file as provided when you originally stored it. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesMetadataGet"></a>
# **filesMetadataGet**
> Object filesMetadataGet(filename)

get file metadata by file name 

Get file metadata by file name 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String filename = "filename_example"; // String | name of a file as provided when you originally stored it.
try {
    Object result = apiInstance.filesMetadataGet(filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#filesMetadataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| name of a file as provided when you originally stored it. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="filesPut"></a>
# **filesPut**
> String filesPut(fileidentifier)

put file based on filename 

Put file based on filename, returns the uuid of the stored file. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String fileidentifier = "fileidentifier_example"; // String | filename of the file you want to store
try {
    String result = apiInstance.filesPut(fileidentifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#filesPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileidentifier** | **String**| filename of the file you want to store |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="getAllTags"></a>
# **getAllTags**
> List&lt;Object&gt; getAllTags()

Retrieve information about all tags

Retrieve information about all tags 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    List<Object> result = apiInstance.getAllTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getAllTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBootstrap"></a>
# **getBootstrap**
> VersionsResponse getBootstrap(macAddress)

get tasks bootstrap.js 

used internally by the system - get tasks bootstrap.js 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String macAddress = "macAddress_example"; // String | query object to pass through to waterline.
try {
    VersionsResponse result = apiInstance.getBootstrap(macAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getBootstrap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **macAddress** | **String**| query object to pass through to waterline. | [optional]

### Return type

[**VersionsResponse**](VersionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodesByTag"></a>
# **getNodesByTag**
> List&lt;Object&gt; getNodesByTag(tagName)

Retrieve nodes with the specified tag

Retrieve nodes with the specified tag 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String tagName = "tagName_example"; // String | The tag identifier
try {
    List<Object> result = apiInstance.getNodesByTag(tagName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getNodesByTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| The tag identifier |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTag"></a>
# **getTag**
> Object getTag(tagName)

Retrieve information about the tag

Retrieve information about the tag 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String tagName = "tagName_example"; // String | The tag identifier
try {
    Object result = apiInstance.getTag(tagName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| The tag identifier |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTasksById"></a>
# **getTasksById**
> Object getTasksById(identifier)

get specific task 

get specific task 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | task identifier 
try {
    Object result = apiInstance.getTasksById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getTasksById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| task identifier  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> UserObj getUser(name)

Get information about a user 

Get information about a user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | username
try {
    UserObj result = apiInstance.getUser(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| username |

### Return type

[**UserObj**](UserObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> List&lt;UserObj&gt; listUsers()

Retrieve a list of users 

Retrieve a list of users 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    List<UserObj> result = apiInstance.listUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#listUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserObj&gt;**](UserObj.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupsDelById"></a>
# **lookupsDelById**
> lookupsDelById(id)

Delete specified lookup details. 

Delete specified lookup details. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String id = "id_example"; // String | id of the lookup record to delete 
try {
    apiInstance.lookupsDelById(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#lookupsDelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the lookup record to delete  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupsGet"></a>
# **lookupsGet**
> List&lt;Object&gt; lookupsGet(q)

find all 

find all 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String q = "q_example"; // String | query object to pass through to waterline.
try {
    List<Object> result = apiInstance.lookupsGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#lookupsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| query object to pass through to waterline. | [optional]

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupsGetById"></a>
# **lookupsGetById**
> List&lt;Object&gt; lookupsGetById(id)

lookup id 

lookup id 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String id = "id_example"; // String | id of thing to lookup
try {
    List<Object> result = apiInstance.lookupsGetById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#lookupsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of thing to lookup |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupsPatchById"></a>
# **lookupsPatchById**
> Object lookupsPatchById(id, body)

Patch specified lookup record 

Patch specified lookup record 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String id = "id_example"; // String | id of the lookup record to patch. 
GenericObj body = new GenericObj(); // GenericObj | object patches to apply. 
try {
    Object result = apiInstance.lookupsPatchById(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#lookupsPatchById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id of the lookup record to patch.  |
 **body** | [**GenericObj**](GenericObj.md)| object patches to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lookupsPost"></a>
# **lookupsPost**
> Object lookupsPost(body)

find all 

put all 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | lookup record to create
try {
    Object result = apiInstance.lookupsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#lookupsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| lookup record to create |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyUser"></a>
# **modifyUser**
> Object modifyUser(name, body)

Update properties on a user 

Update properties on a user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | username
UserObj body = new UserObj(); // UserObj | User information
try {
    Object result = apiInstance.modifyUser(name, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#modifyUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| username |
 **body** | [**UserObj**](UserObj.md)| User information |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesDelById"></a>
# **nodesDelById**
> nodesDelById(identifier)

Delete specified node. 

Delete specified node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
try {
    apiInstance.nodesDelById(identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesDelById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesDelTagById"></a>
# **nodesDelTagById**
> nodesDelTagById(identifier, tagName)

Delete a tag from the specified node. 

Delete a tag from the specified node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses or unique aliases to identify the node by 
String tagName = "tagName_example"; // String | The name of the tag
try {
    apiInstance.nodesDelTagById(identifier, tagName);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesDelTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses or unique aliases to identify the node by  |
 **tagName** | **String**| The name of the tag |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetAll"></a>
# **nodesGetAll**
> List&lt;Object&gt; nodesGetAll()

List of all nodes or if there are none an empty object 

List of all nodes or if there are none an empty object 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    List<Object> result = apiInstance.nodesGetAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetById"></a>
# **nodesGetById**
> List&lt;Object&gt; nodesGetById(identifier)

List of all nodes or if there are none an empty object 

List of all nodes or if there are none an empty object 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
try {
    List<Object> result = apiInstance.nodesGetById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetCatalogById"></a>
# **nodesGetCatalogById**
> Object nodesGetCatalogById(identifier)

Fetch catalog of specified node 

Fetch catalog of specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
try {
    Object result = apiInstance.nodesGetCatalogById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetCatalogById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetCatalogSourceById"></a>
# **nodesGetCatalogSourceById**
> Object nodesGetCatalogSourceById(identifier, source)

Fetch catalog of specified node for given source 

Fetch catalog of specified node for given source 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
String source = "source_example"; // String | Source catalog name to fetch 
try {
    Object result = apiInstance.nodesGetCatalogSourceById(identifier, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetCatalogSourceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |
 **source** | **String**| Source catalog name to fetch  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetPollersById"></a>
# **nodesGetPollersById**
> Object nodesGetPollersById(identifier)

Fetch all pollers for specified node 

Fetch all pollers for specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
try {
    Object result = apiInstance.nodesGetPollersById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetPollersById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetSshById"></a>
# **nodesGetSshById**
> Object nodesGetSshById(identifier)

get the ssh settings associated with a node. 

get the ssh settings associated with a node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | node id value 
try {
    Object result = apiInstance.nodesGetSshById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetSshById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| node id value  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetTagsById"></a>
# **nodesGetTagsById**
> List&lt;Object&gt; nodesGetTagsById(identifier)

List of all tags on the node or an empty object if there are none 

List of all tags on the node or an empty object if there are none 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses or unique aliases to identify the node by 
try {
    List<Object> result = apiInstance.nodesGetTagsById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetTagsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses or unique aliases to identify the node by  |

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesGetWorkflowById"></a>
# **nodesGetWorkflowById**
> Object nodesGetWorkflowById(identifier, active)

Fetch all workflows for specified node 

Fetch all workflows for specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
Boolean active = true; // Boolean | Filter active workflows 
try {
    Object result = apiInstance.nodesGetWorkflowById(identifier, active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesGetWorkflowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |
 **active** | **Boolean**| Filter active workflows  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesMasterDelTagById"></a>
# **nodesMasterDelTagById**
> nodesMasterDelTagById(tagName)

Delete specified tag from all nodes. 

Delete specified tag from all nodes. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String tagName = "tagName_example"; // String | The tag identifier
try {
    apiInstance.nodesMasterDelTagById(tagName);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesMasterDelTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| The tag identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesPatchById"></a>
# **nodesPatchById**
> Object nodesPatchById(identifier, body)

Patch specified node 

Patch specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
GenericObj body = new GenericObj(); // GenericObj | object patches to apply. 
try {
    Object result = apiInstance.nodesPatchById(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesPatchById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |
 **body** | [**GenericObj**](GenericObj.md)| object patches to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesPatchTagById"></a>
# **nodesPatchTagById**
> Object nodesPatchTagById(identifier, body)

Patch tags onto specified node 

Patch tags onto specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses or unique aliases to identify the node by 
GenericObj body = new GenericObj(); // GenericObj | object patches to apply. 
try {
    Object result = apiInstance.nodesPatchTagById(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesPatchTagById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses or unique aliases to identify the node by  |
 **body** | [**GenericObj**](GenericObj.md)| object patches to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesPost"></a>
# **nodesPost**
> Object nodesPost(identifiers)

post 

post 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj identifiers = new GenericObj(); // GenericObj | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
try {
    Object result = apiInstance.nodesPost(identifiers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifiers** | [**GenericObj**](GenericObj.md)| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesPostSshById"></a>
# **nodesPostSshById**
> nodesPostSshById(identifier, body)

set the ssh settings associated with a node. 

set the ssh settings associated with a node. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
GenericObj body = new GenericObj(); // GenericObj | ssh settings to apply. 
try {
    apiInstance.nodesPostSshById(identifier, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesPostSshById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |
 **body** | [**GenericObj**](GenericObj.md)| ssh settings to apply.  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesPostWorkflowById"></a>
# **nodesPostWorkflowById**
> Object nodesPostWorkflowById(identifier, body, name)

create workflow for specified node 

create workflow for specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
GenericObj body = new GenericObj(); // GenericObj | Workflow name
String name = "name_example"; // String | Workflow name
try {
    Object result = apiInstance.nodesPostWorkflowById(identifier, body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesPostWorkflowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |
 **body** | [**GenericObj**](GenericObj.md)| Workflow name | [optional]
 **name** | **String**| Workflow name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nodesWorkflowActionById"></a>
# **nodesWorkflowActionById**
> Object nodesWorkflowActionById(identifier, action)

Cancel currently running workflows for specified node 

Cancel currently running workflows for specified node 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings. 
Action action = new Action(); // Action | Command to execute on selected workflow
try {
    Object result = apiInstance.nodesWorkflowActionById(identifier, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#nodesWorkflowActionById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Mac addresses and unique aliases to identify the node by, | expect a string or an array of strings.  |
 **action** | [**Action**](Action.md)| Command to execute on selected workflow |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsDefinitionsGetAll"></a>
# **obmsDefinitionsGetAll**
> Object obmsDefinitionsGetAll()

Get list of possible OBM services 

Get list of possible OBM services 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.obmsDefinitionsGetAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsDefinitionsGetAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsDefinitionsGetByName"></a>
# **obmsDefinitionsGetByName**
> Object obmsDefinitionsGetByName(name)

Get the specified OBM service definition 

Get the specified OBM service definition 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | The OBM service definition identifier. 
try {
    Object result = apiInstance.obmsDefinitionsGetByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsDefinitionsGetByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The OBM service definition identifier.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsDeleteById"></a>
# **obmsDeleteById**
> Object obmsDeleteById(identifier)

Delete the OBM service with the specified identifier 

Delete the OBM service with the specified identifier 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The OBM service identifier. 
try {
    Object result = apiInstance.obmsDeleteById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsDeleteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The OBM service identifier.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsGet"></a>
# **obmsGet**
> Object obmsGet(query)

Get list of all OBM service instances 

Get list of all OBM service instances 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String query = "query_example"; // String | query object to pass through to waterline.
try {
    Object result = apiInstance.obmsGet(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query object to pass through to waterline. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsGetById"></a>
# **obmsGetById**
> Object obmsGetById(identifier)

get the specified OBM service 

get the specified OBM service 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The OBM service identifier. 
try {
    Object result = apiInstance.obmsGetById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The OBM service identifier.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsPatchById"></a>
# **obmsPatchById**
> Object obmsPatchById(identifier, body)

patch a single OBM service 

patch a single OBM service 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The OBM service identifier. 
GenericObj body = new GenericObj(); // GenericObj | object patches to apply.
try {
    Object result = apiInstance.obmsPatchById(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsPatchById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The OBM service identifier.  |
 **body** | [**GenericObj**](GenericObj.md)| object patches to apply. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsPostLed"></a>
# **obmsPostLed**
> obmsPostLed(body)

Enable or disable identify light on node through OBM (if supported) 

Enable or disable identify light on node through OBM (if supported) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | foo
try {
    apiInstance.obmsPostLed(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsPostLed");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| foo |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="obmsPut"></a>
# **obmsPut**
> Object obmsPut(body)

create or update a single OBM service 

create or update a single OBM service 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | The OBM service object post to apply. 
try {
    Object result = apiInstance.obmsPut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#obmsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| The OBM service object post to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersCurrentDataGet"></a>
# **pollersCurrentDataGet**
> Object pollersCurrentDataGet(identifier)

Get latest data for the specific poller 

Get latest data for the specific poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | identifier (ip address or NodeId) for the data from a poller 
try {
    Object result = apiInstance.pollersCurrentDataGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersCurrentDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| identifier (ip address or NodeId) for the data from a poller  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersDataGet"></a>
# **pollersDataGet**
> Object pollersDataGet(identifier)

Get data for the specific poller 

Get data for the specific poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | identifier (ip address or NodeId) for the data from a poller 
try {
    Object result = apiInstance.pollersDataGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| identifier (ip address or NodeId) for the data from a poller  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersDelete"></a>
# **pollersDelete**
> pollersDelete(identifier)

delete the specified poller 

delete the specified poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | poller identifier 
try {
    apiInstance.pollersDelete(identifier);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| poller identifier  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersGet"></a>
# **pollersGet**
> Object pollersGet()

get list of all pollers 

get list of all pollers 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.pollersGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersIdGet"></a>
# **pollersIdGet**
> Object pollersIdGet(identifier)

Get specifics of the specified poller 

Get specifics of the specified poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | poller identifier 
try {
    Object result = apiInstance.pollersIdGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| poller identifier  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersLibByIdGet"></a>
# **pollersLibByIdGet**
> Object pollersLibByIdGet(identifier)

get a single library poller 

get a single library poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | library poller identifier 
try {
    Object result = apiInstance.pollersLibByIdGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersLibByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| library poller identifier  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersLibGet"></a>
# **pollersLibGet**
> Object pollersLibGet()

get list of possible library pollers 

get list of possible library pollers 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.pollersLibGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersLibGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersPatch"></a>
# **pollersPatch**
> Object pollersPatch(identifier, content)

patch specifics of the specified poller 

patch specifics of the specified poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | poller identifier 
GenericObj content = new GenericObj(); // GenericObj | foo
try {
    Object result = apiInstance.pollersPatch(identifier, content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| poller identifier  |
 **content** | [**GenericObj**](GenericObj.md)| foo |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pollersPost"></a>
# **pollersPost**
> Object pollersPost(content)

create a poller 

create a poller 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj content = new GenericObj(); // GenericObj | foo
try {
    Object result = apiInstance.pollersPost(content);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#pollersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | [**GenericObj**](GenericObj.md)| foo |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postTaskById"></a>
# **postTaskById**
> Object postTaskById(identifier, body)

post specific task 

post specific task 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | poller identifier 
GenericObj body = new GenericObj(); // GenericObj | obm settings to apply. 
try {
    Object result = apiInstance.postTaskById(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#postTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| poller identifier  |
 **body** | [**GenericObj**](GenericObj.md)| obm settings to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postWorkflowById"></a>
# **postWorkflowById**
> Object postWorkflowById(tagName, body, name)

create workflow for nodes with the specified tag 

create workflow for nodes with the specified tag 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String tagName = "tagName_example"; // String | The tag identifier
GenericObj body = new GenericObj(); // GenericObj | Workflow options
String name = "name_example"; // String | Workflow name
try {
    Object result = apiInstance.postWorkflowById(tagName, body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#postWorkflowById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagName** | **String**| The tag identifier |
 **body** | [**GenericObj**](GenericObj.md)| Workflow options | [optional]
 **name** | **String**| Workflow name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesGet"></a>
# **profilesGet**
> Object profilesGet(macs, mac, ip)

get list of possible profiles 

get list of possible profiles 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
List<String> macs = Arrays.asList("macs_example"); // List<String> | List of valid MAC addresses to lookup 
String mac = "mac_example"; // String | When macs parameter is not passed, passed with IP adds MAC address to lookup 
String ip = "ip_example"; // String | When macs parameters is not passed, passed with MAC adds IP address to lookup 
try {
    Object result = apiInstance.profilesGet(macs, mac, ip);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **macs** | [**List&lt;String&gt;**](String.md)| List of valid MAC addresses to lookup  | [optional]
 **mac** | **String**| When macs parameter is not passed, passed with IP adds MAC address to lookup  | [optional]
 **ip** | **String**| When macs parameters is not passed, passed with MAC adds IP address to lookup  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesGetLibByName"></a>
# **profilesGetLibByName**
> Object profilesGetLibByName(name, scope)

get a single profile&#39;s raw data 

get a single profile&#39;s raw data 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | The profile name. 
String scope = "scope_example"; // String | Profile scope
try {
    Object result = apiInstance.profilesGetLibByName(name, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesGetLibByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The profile name.  |
 **scope** | **String**| Profile scope | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesGetMetadata"></a>
# **profilesGetMetadata**
> Object profilesGetMetadata()

get list of possible profiles from database 

get list of possible profiles from database 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.profilesGetMetadata();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesGetMetadata");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesGetMetadataByName"></a>
# **profilesGetMetadataByName**
> Object profilesGetMetadataByName(name, scope)

get a single profile&#39;s metadata from database 

get a single profile&#39;s metadata from database 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | The profile name. 
String scope = "scope_example"; // String | Profile scope
try {
    Object result = apiInstance.profilesGetMetadataByName(name, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesGetMetadataByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The profile name.  |
 **scope** | **String**| Profile scope | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesGetSwitchVendor"></a>
# **profilesGetSwitchVendor**
> Object profilesGetSwitchVendor(vendor)

get a single profile 

get a single profile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String vendor = "vendor_example"; // String | The switch vendor name. 
try {
    Object result = apiInstance.profilesGetSwitchVendor(vendor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesGetSwitchVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendor** | **String**| The switch vendor name.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesPostSwitchError"></a>
# **profilesPostSwitchError**
> Object profilesPostSwitchError(body)

create a switch error 

create a switch error 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | switch error. 
try {
    Object result = apiInstance.profilesPostSwitchError(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesPostSwitchError");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| switch error.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="profilesPutLibByName"></a>
# **profilesPutLibByName**
> Object profilesPutLibByName(name, scope)

put a single profile 

put a single profile 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | The profile name. 
String scope = "scope_example"; // String | Profile scope
try {
    Object result = apiInstance.profilesPutLibByName(name, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#profilesPutLibByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The profile name.  |
 **scope** | **String**| Profile scope | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="removeUser"></a>
# **removeUser**
> removeUser(name)

Delete a user 

Delete a user 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | username
try {
    apiInstance.removeUser(name);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#removeUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| username |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="schemasGet"></a>
# **schemasGet**
> Object schemasGet()

get list of all schemas 

Get a list of all schemas. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.schemasGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#schemasGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="schemasIdGet"></a>
# **schemasIdGet**
> Object schemasIdGet(identifier)

get a schema by specifying its identifier 

Gets a schema by identifier. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | identifier of a schema
try {
    Object result = apiInstance.schemasIdGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#schemasIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| identifier of a schema |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skuPackPost"></a>
# **skuPackPost**
> Object skuPackPost()

get list of skus 

get list of skus 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.skuPackPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skuPackPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="skusGet"></a>
# **skusGet**
> Object skusGet(query)

get list of skus 

get list of skus 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String query = "query_example"; // String | query object to pass through to waterline.
try {
    Object result = apiInstance.skusGet(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query object to pass through to waterline. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skusIdDelete"></a>
# **skusIdDelete**
> Object skusIdDelete(identifier)

Delete specific sku. 

Delete specific sku. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The sku objectid. 
try {
    Object result = apiInstance.skusIdDelete(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The sku objectid.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skusIdDeletePack"></a>
# **skusIdDeletePack**
> Object skusIdDeletePack(identifier)

Delete a pack for a specific sku 

Delete a pack for a specific sku. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The profile name. 
try {
    Object result = apiInstance.skusIdDeletePack(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusIdDeletePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The profile name.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="skusIdGet"></a>
# **skusIdGet**
> Object skusIdGet(identifier)

get a single sku 

get a single sku 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | objectid of sku 
try {
    Object result = apiInstance.skusIdGet(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| objectid of sku  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skusIdGetNodes"></a>
# **skusIdGetNodes**
> Object skusIdGetNodes(identifier)

get nodes for specific sku 

get nodes for specific sku 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The profile name. 
try {
    Object result = apiInstance.skusIdGetNodes(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusIdGetNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The profile name.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skusIdPutPack"></a>
# **skusIdPutPack**
> Object skusIdPutPack(identifier)

put a sku pack to specific sku 

put a sku pack to specific sku 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The identifier of the sku pack. 
try {
    Object result = apiInstance.skusIdPutPack(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusIdPutPack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The identifier of the sku pack.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="skusPatch"></a>
# **skusPatch**
> Object skusPatch(identifier, body)

patch a single sku 

patch a single sku 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | The sku identifier 
GenericObj body = new GenericObj(); // GenericObj | object patches to apply.
try {
    Object result = apiInstance.skusPatch(identifier, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| The sku identifier  |
 **body** | [**GenericObj**](GenericObj.md)| object patches to apply. |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skusPost"></a>
# **skusPost**
> Object skusPost(body)

create a sku 

create a sku 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | object post to apply. 
try {
    Object result = apiInstance.skusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| object post to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="skusPut"></a>
# **skusPut**
> Object skusPut(body)

create or update a sku 

create or update a sku 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | object post to apply. 
try {
    Object result = apiInstance.skusPut(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#skusPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| object post to apply.  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatesGetByName"></a>
# **templatesGetByName**
> Object templatesGetByName(name)

get a single template 

get a single template 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | template name 
try {
    Object result = apiInstance.templatesGetByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#templatesGetByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| template name  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatesLibDelete"></a>
# **templatesLibDelete**
> templatesLibDelete(name, scope)

delete a single template 

delete a single template 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | objectid of template 
String scope = "global"; // String | template scope 
try {
    apiInstance.templatesLibDelete(name, scope);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#templatesLibDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| objectid of template  |
 **scope** | **String**| template scope  | [optional] [default to global]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatesLibGet"></a>
# **templatesLibGet**
> Object templatesLibGet(name, scope)

get a single template 

get a single template 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | template name 
String scope = "global"; // String | template scope 
try {
    Object result = apiInstance.templatesLibGet(name, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#templatesLibGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| template name  |
 **scope** | **String**| template scope  | [optional] [default to global]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatesLibPut"></a>
# **templatesLibPut**
> Object templatesLibPut(name, scope)

put a single template 

put a single template 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | objectid of template 
String scope = "global"; // String | template scope 
try {
    Object result = apiInstance.templatesLibPut(name, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#templatesLibPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| objectid of template  |
 **scope** | **String**| template scope  | [optional] [default to global]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="templatesMetaGet"></a>
# **templatesMetaGet**
> Object templatesMetaGet()

get list of metadata for all templates 

get list of metadata for all templates 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.templatesMetaGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#templatesMetaGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="templatesMetaGetByName"></a>
# **templatesMetaGetByName**
> Object templatesMetaGetByName(name, scope)

get metadata for a specific template 

get metadata for a specific template 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String name = "name_example"; // String | template name 
String scope = "scope_example"; // String | template scope 
try {
    Object result = apiInstance.templatesMetaGetByName(name, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#templatesMetaGetByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| template name  |
 **scope** | **String**| template scope  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unimplemented"></a>
# **unimplemented**
> List&lt;Lease&gt; unimplemented()

get DHCP lease table 

Fetch the dhcp leases. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    List<Lease> result = apiInstance.unimplemented();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#unimplemented");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Lease&gt;**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unimplemented_0"></a>
# **unimplemented_0**
> List&lt;Lease&gt; unimplemented_0(mac)

fetch lease information for the mac specified 

Fetch lease information for the mac specified. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String mac = "mac_example"; // String | identifier of a mac address
try {
    List<Lease> result = apiInstance.unimplemented_0(mac);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#unimplemented_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mac** | **String**| identifier of a mac address |

### Return type

[**List&lt;Lease&gt;**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unimplemented_1"></a>
# **unimplemented_1**
> List&lt;Lease&gt; unimplemented_1(mac)

get list of all catalogs

Delete the lease for the mac specified and return information about deleted lease. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String mac = "mac_example"; // String | identifier of a mac address
try {
    List<Lease> result = apiInstance.unimplemented_1(mac);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#unimplemented_1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mac** | **String**| identifier of a mac address |

### Return type

[**List&lt;Lease&gt;**](Lease.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unimplemented_2"></a>
# **unimplemented_2**
> Object unimplemented_2(body)

Fetch status of identify light on node through OBM (if supported) 

Fetch status of identify light on node through OBM (if supported) 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | foo
try {
    Object result = apiInstance.unimplemented_2(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#unimplemented_2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| foo |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewsDelete"></a>
# **viewsDelete**
> Object viewsDelete(identifier)

put a single view 

put a single view 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Name of view to delete 
try {
    Object result = apiInstance.viewsDelete(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#viewsDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Name of view to delete  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewsGet"></a>
# **viewsGet**
> Object viewsGet()

get all views 

get all views 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.viewsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#viewsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewsGetById"></a>
# **viewsGetById**
> Object viewsGetById(identifier)

get view with specified identifier 

get view with specified identifier 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Name of view to get 
try {
    Object result = apiInstance.viewsGetById(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#viewsGetById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Name of view to get  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="viewsPut"></a>
# **viewsPut**
> Object viewsPut(identifier)

put a single view 

put a single view 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Name of view to create or update 
try {
    Object result = apiInstance.viewsPut(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#viewsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Name of view to create or update  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, application/octet-stream
 - **Accept**: application/json

<a name="workflowsAction"></a>
# **workflowsAction**
> Object workflowsAction(identifier, action)

Perform the specified action on the selected workflow 

Perform the specified action on the selected workflow 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Workflow identifier 
Action action = new Action(); // Action | Command to execute on selected workflow
try {
    Object result = apiInstance.workflowsAction(identifier, action);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Workflow identifier  |
 **action** | [**Action**](Action.md)| Command to execute on selected workflow |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsDeleteByInstanceId"></a>
# **workflowsDeleteByInstanceId**
> Object workflowsDeleteByInstanceId(identifier)

Delete the workflow with the specified ID 

Delete the workflow with the specified ID 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Workflow ID 
try {
    Object result = apiInstance.workflowsDeleteByInstanceId(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsDeleteByInstanceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Workflow ID  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsDeleteGraphsByName"></a>
# **workflowsDeleteGraphsByName**
> Object workflowsDeleteGraphsByName(injectableName)

Delete the graph with the specified injectable name 

Delete the graph with the specified injectable name 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String injectableName = "injectableName_example"; // String | Graph injectable name 
try {
    Object result = apiInstance.workflowsDeleteGraphsByName(injectableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsDeleteGraphsByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **injectableName** | **String**| Graph injectable name  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsDeleteTasksByName"></a>
# **workflowsDeleteTasksByName**
> Object workflowsDeleteTasksByName(injectableName)

Delete the task with the specified injectable name 

Delete the task with the specified injectable name 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String injectableName = "injectableName_example"; // String | Task injectable name 
try {
    Object result = apiInstance.workflowsDeleteTasksByName(injectableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsDeleteTasksByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **injectableName** | **String**| Task injectable name  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsGet"></a>
# **workflowsGet**
> Object workflowsGet(active)

Get list of active and past run workflow instances 

Get list of active and past run workflow instances 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
Boolean active = true; // Boolean | Filter active workflows 
try {
    Object result = apiInstance.workflowsGet(active);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **active** | **Boolean**| Filter active workflows  | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsGetAllTasks"></a>
# **workflowsGetAllTasks**
> Object workflowsGetAllTasks()

Get list of tasks possible to run in workflows 

Get list of tasks possible to run in workflows 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.workflowsGetAllTasks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsGetAllTasks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsGetByInstanceId"></a>
# **workflowsGetByInstanceId**
> Object workflowsGetByInstanceId(identifier)

get a specific workflow 

get a specific workflow 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String identifier = "identifier_example"; // String | Workflow identifier 
try {
    Object result = apiInstance.workflowsGetByInstanceId(identifier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsGetByInstanceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **String**| Workflow identifier  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsGetGraphs"></a>
# **workflowsGetGraphs**
> Object workflowsGetGraphs()

Get list of all graphs 

Get list of all graphs 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
try {
    Object result = apiInstance.workflowsGetGraphs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsGetGraphs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsGetGraphsByName"></a>
# **workflowsGetGraphsByName**
> Object workflowsGetGraphsByName(injectableName)

Get the graph with the specified injectable name 

Get the graph with the specified injectable name 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String injectableName = "injectableName_example"; // String | Graph injectable name 
try {
    Object result = apiInstance.workflowsGetGraphsByName(injectableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsGetGraphsByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **injectableName** | **String**| Graph injectable name  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsGetTasksByName"></a>
# **workflowsGetTasksByName**
> Object workflowsGetTasksByName(injectableName)

Get the task with the specified injectable name 

Get the task with the specified injectable name 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
String injectableName = "injectableName_example"; // String | Task injectable name 
try {
    Object result = apiInstance.workflowsGetTasksByName(injectableName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsGetTasksByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **injectableName** | **String**| Task injectable name  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsPost"></a>
# **workflowsPost**
> Object workflowsPost(body, name)

Run a new workflow 

Run a new workflow 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | Workflow name
String name = "name_example"; // String | Workflow name
try {
    Object result = apiInstance.workflowsPost(body, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| Workflow name | [optional]
 **name** | **String**| Workflow name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsPutGraphs"></a>
# **workflowsPutGraphs**
> Object workflowsPutGraphs(body)

Add a graph to the graph library 

Add a graph to the graph library 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | Workflow name
try {
    Object result = apiInstance.workflowsPutGraphs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsPutGraphs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| Workflow name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="workflowsPutTask"></a>
# **workflowsPutTask**
> Object workflowsPutTask(body)

Add tasks to task library 

Add tasks to task library 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiApi;


ApiApi apiInstance = new ApiApi();
GenericObj body = new GenericObj(); // GenericObj | Workflow name
try {
    Object result = apiInstance.workflowsPutTask(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiApi#workflowsPutTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GenericObj**](GenericObj.md)| Workflow name | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

