package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.VersionsResponse;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.InlineResponse200;
import io.swagger.client.model.Error;
import io.swagger.client.model.GenericObj;
import io.swagger.client.model.Lease;
import java.io.File;
import io.swagger.client.model.UserObj;
import io.swagger.client.model.Action;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:18.953-04:00")
public class ApiApi {
  private ApiClient apiClient;

  public ApiApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ApiApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * get list of all catalogs
   * The catalogs endpoint returns json data that represent the catalogs of\nall hardware in the system.
   * @param query query object to pass through to waterline.
   * @return VersionsResponse
   */
  public VersionsResponse catalogsGet(String query) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/catalogs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<VersionsResponse> returnType = new GenericType<VersionsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of all catalogs
   * The catalogs endpoint returns json data that represent the catalogs of\nall hardware in the system.
   * @param identifier identifier of a catalog
   * @return VersionsResponse
   */
  public VersionsResponse catalogsIdGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling catalogsIdGet");
     }
     
    // create path and map variables
    String path = "/catalogs/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<VersionsResponse> returnType = new GenericType<VersionsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get server configuration
   * Get server configuration.
   * @return InlineResponse200
   */
  public InlineResponse200 configGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/config".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * patch/update server configuration
   * Patch/update server configuration and then return the patched configuration.
   * @param config Updated config fields
   * @return InlineResponse200
   */
  public InlineResponse200 configPatch(GenericObj config) throws ApiException {
    Object postBody = config;
    
     // verify the required parameter 'config' is set
     if (config == null) {
        throw new ApiException(400, "Missing the required parameter 'config' when calling configPatch");
     }
     
    // create path and map variables
    String path = "/config".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get DHCP lease table
   * Fetch the dhcp leases.
   * @return List<Lease>
   */
  public List<Lease> unimplemented() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/dhcp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<Lease>> returnType = new GenericType<List<Lease>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * fetch lease information for the mac specified
   * Fetch lease information for the mac specified.
   * @param mac identifier of a mac address
   * @return List<Lease>
   */
  public List<Lease> unimplemented_0(String mac) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'mac' is set
     if (mac == null) {
        throw new ApiException(400, "Missing the required parameter 'mac' when calling unimplemented_0");
     }
     
    // create path and map variables
    String path = "/dhcp/lease/{mac}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mac" + "\\}", apiClient.escapeString(mac.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<Lease>> returnType = new GenericType<List<Lease>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of all catalogs
   * Delete the lease for the mac specified and return information about deleted lease.
   * @param mac identifier of a mac address
   * @return List<Lease>
   */
  public List<Lease> unimplemented_1(String mac) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'mac' is set
     if (mac == null) {
        throw new ApiException(400, "Missing the required parameter 'mac' when calling unimplemented_1");
     }
     
    // create path and map variables
    String path = "/dhcp/lease/{mac}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "mac" + "\\}", apiClient.escapeString(mac.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<Lease>> returnType = new GenericType<List<Lease>>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get all available files
   * Get all available files
   * @return InlineResponse200
   */
  public InlineResponse200 filesGetAll() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/files".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get file based on uuid or file name
   * Get file based on uuid or file name.
   * @param fileidentifier uuid or file name of a file as provided when you originally stored it.
   * @return File
   */
  public File filesGet(String fileidentifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fileidentifier' is set
     if (fileidentifier == null) {
        throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesGet");
     }
     
    // create path and map variables
    String path = "/files/{fileidentifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fileidentifier" + "\\}", apiClient.escapeString(fileidentifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<File> returnType = new GenericType<File>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * put file based on filename
   * Put file based on filename, returns the uuid of the stored file.
   * @param fileidentifier filename of the file you want to store
   * @return String
   */
  public String filesPut(String fileidentifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fileidentifier' is set
     if (fileidentifier == null) {
        throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesPut");
     }
     
    // create path and map variables
    String path = "/files/{fileidentifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fileidentifier" + "\\}", apiClient.escapeString(fileidentifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/octet-stream", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<String> returnType = new GenericType<String>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * delete file based on uuid
   * Delete a file based on uuid.
   * @param fileidentifier UUID of the file you wish to delete
   * @return void
   */
  public void filesDelete(String fileidentifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'fileidentifier' is set
     if (fileidentifier == null) {
        throw new ApiException(400, "Missing the required parameter 'fileidentifier' when calling filesDelete");
     }
     
    // create path and map variables
    String path = "/files/{fileidentifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "fileidentifier" + "\\}", apiClient.escapeString(fileidentifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * get md5sum based on file name
   * Get md5sum based on file name.
   * @param filename File name of a file as provided when you originally stored it.
   * @return InlineResponse200
   */
  public InlineResponse200 filesMd5Get(String filename) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'filename' is set
     if (filename == null) {
        throw new ApiException(400, "Missing the required parameter 'filename' when calling filesMd5Get");
     }
     
    // create path and map variables
    String path = "/files/{filename}/md5".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get file metadata by file name
   * Get file metadata by file name
   * @param filename name of a file as provided when you originally stored it.
   * @return InlineResponse200
   */
  public InlineResponse200 filesMetadataGet(String filename) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'filename' is set
     if (filename == null) {
        throw new ApiException(400, "Missing the required parameter 'filename' when calling filesMetadataGet");
     }
     
    // create path and map variables
    String path = "/files/{filename}/metadata".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * find all
   * find all
   * @param q query object to pass through to waterline.
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> lookupsGet(String q) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/lookups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "q", q));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * find all
   * put all
   * @param body lookup record to create
   * @return InlineResponse200
   */
  public InlineResponse200 lookupsPost(GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling lookupsPost");
     }
     
    // create path and map variables
    String path = "/lookups".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * lookup id
   * lookup id
   * @param id id of thing to lookup
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> lookupsGetById(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsGetById");
     }
     
    // create path and map variables
    String path = "/lookups/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete specified lookup details.
   * Delete specified lookup details.
   * @param id id of the lookup record to delete
   * @return void
   */
  public void lookupsDelById(String id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsDelById");
     }
     
    // create path and map variables
    String path = "/lookups/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Patch specified lookup record
   * Patch specified lookup record
   * @param id id of the lookup record to patch.
   * @param body object patches to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 lookupsPatchById(String id, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling lookupsPatchById");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling lookupsPatchById");
     }
     
    // create path and map variables
    String path = "/lookups/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * List of all nodes or if there are none an empty object
   * List of all nodes or if there are none an empty object
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> nodesGetAll() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/nodes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * post
   * post
   * @param identifiers Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesPost(GenericObj identifiers) throws ApiException {
    Object postBody = identifiers;
    
     // verify the required parameter 'identifiers' is set
     if (identifiers == null) {
        throw new ApiException(400, "Missing the required parameter 'identifiers' when calling nodesPost");
     }
     
    // create path and map variables
    String path = "/nodes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete specified tag from all nodes.
   * Delete specified tag from all nodes.
   * @param tagName The tag identifier
   * @return void
   */
  public void nodesMasterDelTagById(String tagName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling nodesMasterDelTagById");
     }
     
    // create path and map variables
    String path = "/nodes/tags/{tagName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * List of all nodes or if there are none an empty object
   * List of all nodes or if there are none an empty object
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> nodesGetById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete specified node.
   * Delete specified node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return void
   */
  public void nodesDelById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesDelById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Patch specified node
   * Patch specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body object patches to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesPatchById(String identifier, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesPatchById");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesPatchById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Fetch catalog of specified node
   * Fetch catalog of specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesGetCatalogById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetCatalogById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/catalogs".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Fetch catalog of specified node for given source
   * Fetch catalog of specified node for given source
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param source Source catalog name to fetch
   * @return InlineResponse200
   */
  public InlineResponse200 nodesGetCatalogSourceById(String identifier, String source) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetCatalogSourceById");
     }
     
     // verify the required parameter 'source' is set
     if (source == null) {
        throw new ApiException(400, "Missing the required parameter 'source' when calling nodesGetCatalogSourceById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/catalogs/{source}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "source" + "\\}", apiClient.escapeString(source.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get the obm settings associated with a node.
   * get the obm settings associated with a node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesGetObmById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetObmById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * set the obm settings associated with a node.
   * set the obm settings associated with a node.
   * @param identifier node id value
   * @param body obm settings to apply.
   * @return void
   */
  public void nodesPostObmById(String identifier, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesPostObmById");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesPostObmById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Fetch status of identify light on node through OBM (if supported)
   * Fetch status of identify light on node through OBM (if supported)
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_2(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_2");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm/identify".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Enable or disable identify light on node through OBM (if supported)
   * Enable or disable identify light on node through OBM (if supported)
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param content foo
   * @return void
   */
  public void nodesPostObmIdById(String identifier, GenericObj content) throws ApiException {
    Object postBody = content;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesPostObmIdById");
     }
     
     // verify the required parameter 'content' is set
     if (content == null) {
        throw new ApiException(400, "Missing the required parameter 'content' when calling nodesPostObmIdById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/obm/identify".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Fetch all pollers for specified node
   * Fetch all pollers for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesGetPollersById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetPollersById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/pollers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * set the ssh settings associated with a node.
   * set the ssh settings associated with a node.
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body ssh settings to apply.
   * @return void
   */
  public void nodesPostSshById(String identifier, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesPostSshById");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesPostSshById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/ssh".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * List of all tags on the node or an empty object if there are none
   * List of all tags on the node or an empty object if there are none
   * @param identifier Mac addresses or unique aliases to identify the node by
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> nodesGetTagsById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetTagsById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Patch tags onto specified node
   * Patch tags onto specified node
   * @param identifier Mac addresses or unique aliases to identify the node by
   * @param body object patches to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesPatchTagById(String identifier, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesPatchTagById");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling nodesPatchTagById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/tags".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a tag from the specified node.
   * Delete a tag from the specified node.
   * @param identifier Mac addresses or unique aliases to identify the node by
   * @param tagName The name of the tag
   * @return void
   */
  public void nodesDelTagById(String identifier, String tagName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesDelTagById");
     }
     
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling nodesDelTagById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/tags/{tagName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Fetch all workflows for specified node
   * Fetch all workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesGetWorkflowById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetWorkflowById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create workflow for specified node
   * create workflow for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @param body Workflow name
   * @param name Workflow name
   * @return InlineResponse200
   */
  public InlineResponse200 nodesPostWorkflowById(String identifier, GenericObj body, String name) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesPostWorkflowById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Fetch currently running workflows for specified node
   * Fetch currently running workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesGetActiveWorkflowById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesGetActiveWorkflowById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows/active".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Cancel currently running workflows for specified node
   * Cancel currently running workflows for specified node
   * @param identifier Mac addresses and unique aliases to identify the node by, |\nexpect a string or an array of strings.
   * @return InlineResponse200
   */
  public InlineResponse200 nodesDelActiveWorkflowById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling nodesDelActiveWorkflowById");
     }
     
    // create path and map variables
    String path = "/nodes/{identifier}/workflows/active".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of possible OBM services
   * get list of possible OBM services
   * @return InlineResponse200
   */
  public InlineResponse200 getObmLib() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/obms/library".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a single OBM service
   * get a single OBM service
   * @param identifier The obm service name.
   * @return InlineResponse200
   */
  public InlineResponse200 getObmLibById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getObmLibById");
     }
     
    // create path and map variables
    String path = "/obms/library/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of all pollers
   * get list of all pollers
   * @return InlineResponse200
   */
  public InlineResponse200 pollersGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/pollers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create a poller
   * create a poller
   * @param content foo
   * @return InlineResponse200
   */
  public InlineResponse200 pollersPost(GenericObj content) throws ApiException {
    Object postBody = content;
    
     // verify the required parameter 'content' is set
     if (content == null) {
        throw new ApiException(400, "Missing the required parameter 'content' when calling pollersPost");
     }
     
    // create path and map variables
    String path = "/pollers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of possible library pollers
   * get list of possible library pollers
   * @return InlineResponse200
   */
  public InlineResponse200 pollersLibGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/pollers/library".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a single library poller
   * get a single library poller
   * @param identifier library poller identifier
   * @return InlineResponse200
   */
  public InlineResponse200 pollersLibByIdGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling pollersLibByIdGet");
     }
     
    // create path and map variables
    String path = "/pollers/library/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get specifics of the specified poller
   * Get specifics of the specified poller
   * @param identifier poller identifier
   * @return InlineResponse200
   */
  public InlineResponse200 pollersIdGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling pollersIdGet");
     }
     
    // create path and map variables
    String path = "/pollers/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * delete the specified poller
   * delete the specified poller
   * @param identifier poller identifier
   * @return void
   */
  public void pollersDelete(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling pollersDelete");
     }
     
    // create path and map variables
    String path = "/pollers/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * patch specifics of the specified poller
   * patch specifics of the specified poller
   * @param identifier poller identifier
   * @param content foo
   * @return InlineResponse200
   */
  public InlineResponse200 pollersPatch(String identifier, GenericObj content) throws ApiException {
    Object postBody = content;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling pollersPatch");
     }
     
     // verify the required parameter 'content' is set
     if (content == null) {
        throw new ApiException(400, "Missing the required parameter 'content' when calling pollersPatch");
     }
     
    // create path and map variables
    String path = "/pollers/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get data for the specific poller
   * Get data for the specific poller
   * @param identifier identifier (ip address or NodeId) for the data from a poller
   * @return InlineResponse200
   */
  public InlineResponse200 pollersDataGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling pollersDataGet");
     }
     
    // create path and map variables
    String path = "/pollers/{identifier}/data".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get latest data for the specific poller
   * Get latest data for the specific poller
   * @param identifier identifier (ip address or NodeId) for the data from a poller
   * @return InlineResponse200
   */
  public InlineResponse200 pollersCurrentDataGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling pollersCurrentDataGet");
     }
     
    // create path and map variables
    String path = "/pollers/{identifier}/data/current".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of possible profiles
   * get list of possible profiles
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_3() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/profiles/library".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a single profile
   * get a single profile
   * @param identifier The profile name.
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_4(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_4");
     }
     
    // create path and map variables
    String path = "/profiles/library/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * put a single profile
   * put a single profile
   * @param identifier The profile name.
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_5(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_5");
     }
     
    // create path and map variables
    String path = "/profiles/library/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of all schemas
   * Get a list of all schemas.
   * @return InlineResponse200
   */
  public InlineResponse200 schemasGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/schemas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a schema by specifying its identifier
   * Gets a schema by identifier.
   * @param identifier identifier of a schema
   * @return InlineResponse200
   */
  public InlineResponse200 schemasIdGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling schemasIdGet");
     }
     
    // create path and map variables
    String path = "/schemas/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of skus
   * get list of skus
   * @param query query object to pass through to waterline.
   * @return InlineResponse200
   */
  public InlineResponse200 skusGet(String query) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/skus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "query", query));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create or update a sku
   * create or update a sku
   * @param body object post to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 skusPut(GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling skusPut");
     }
     
    // create path and map variables
    String path = "/skus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create a sku
   * create a sku
   * @param body object post to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 skusPost(GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling skusPost");
     }
     
    // create path and map variables
    String path = "/skus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of skus
   * get list of skus
   * @return InlineResponse200
   */
  public InlineResponse200 skuPackPost() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/skus/pack".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "multipart/form-data", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a single sku
   * get a single sku
   * @param identifier objectid of sku
   * @return InlineResponse200
   */
  public InlineResponse200 skusIdGet(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdGet");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete specific sku.
   * Delete specific sku.
   * @param identifier The sku objectid.
   * @return InlineResponse200
   */
  public InlineResponse200 skusIdDelete(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdDelete");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * patch a single sku
   * patch a single sku
   * @param identifier The sku identifier
   * @param body object patches to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 skusPatch(String identifier, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusPatch");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling skusPatch");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get nodes for specific sku
   * get nodes for specific sku
   * @param identifier The profile name.
   * @return InlineResponse200
   */
  public InlineResponse200 skusIdGetNodes(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdGetNodes");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}/nodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * post a sku pack to specific sku
   * post a sku pack to specific sku
   * @param identifier The profile name.
   * @return InlineResponse200
   */
  public InlineResponse200 skusIdPutPack(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdPutPack");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}/pack".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a pack for a specific sku
   * Delete a pack for a specific sku.
   * @param identifier The profile name.
   * @return InlineResponse200
   */
  public InlineResponse200 skusIdDeletePack(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling skusIdDeletePack");
     }
     
    // create path and map variables
    String path = "/skus/{identifier}/pack".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve information about all tags
   * Retrieve information about all tags
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> getAllTags() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/tags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Create a new tag
   * Create a new tag
   * @param body tag creation options
   * @return InlineResponse200
   */
  public InlineResponse200 createTag(GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling createTag");
     }
     
    // create path and map variables
    String path = "/tags".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve information about the tag
   * Retrieve information about the tag
   * @param tagName The tag identifier
   * @return InlineResponse200
   */
  public InlineResponse200 getTag(String tagName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling getTag");
     }
     
    // create path and map variables
    String path = "/tags/{tagName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete the specified tag
   * Delete the specified tag
   * @param tagName The tag identifier
   * @return InlineResponse200
   */
  public InlineResponse200 deleteTag(String tagName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling deleteTag");
     }
     
    // create path and map variables
    String path = "/tags/{tagName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve nodes with the specified tag
   * Retrieve nodes with the specified tag
   * @param tagName The tag identifier
   * @return List<InlineResponse200>
   */
  public List<InlineResponse200> getNodesByTag(String tagName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling getNodesByTag");
     }
     
    // create path and map variables
    String path = "/tags/{tagName}/nodes".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<InlineResponse200>> returnType = new GenericType<List<InlineResponse200>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create workflow for nodes with the specified tag
   * create workflow for nodes with the specified tag
   * @param tagName The tag identifier
   * @param body Workflow options
   * @param name Workflow name
   * @return InlineResponse200
   */
  public InlineResponse200 postWorkflowById(String tagName, GenericObj body, String name) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'tagName' is set
     if (tagName == null) {
        throw new ApiException(400, "Missing the required parameter 'tagName' when calling postWorkflowById");
     }
     
    // create path and map variables
    String path = "/tags/{tagName}/nodes/workflows".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get tasks bootstrap.js
   * used internally by the system - get tasks bootstrap.js
   * @param macAddress query object to pass through to waterline.
   * @return VersionsResponse
   */
  public VersionsResponse getBootstrap(String macAddress) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/tasks/bootstrap.js".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "macAddress", macAddress));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<VersionsResponse> returnType = new GenericType<VersionsResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get specific task
   * get specific task
   * @param identifier task identifier
   * @return InlineResponse200
   */
  public InlineResponse200 getTasksById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getTasksById");
     }
     
    // create path and map variables
    String path = "/tasks/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * post specific task
   * post specific task
   * @param identifier poller identifier
   * @param body obm settings to apply.
   * @return InlineResponse200
   */
  public InlineResponse200 postTaskById(String identifier, GenericObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling postTaskById");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling postTaskById");
     }
     
    // create path and map variables
    String path = "/tasks/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get list of possible templates
   * get list of possible templates
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_6() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/templates/library".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a single template
   * get a single template
   * @param identifier template identifier
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_7(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_7");
     }
     
    // create path and map variables
    String path = "/templates/library/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * put a single template
   * put a single template
   * @param identifier objectid of template
   * @return InlineResponse200
   */
  public InlineResponse200 unimplemented_8(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_8");
     }
     
    // create path and map variables
    String path = "/templates/library/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve a list of users
   * Retrieve a list of users
   * @return List<UserObj>
   */
  public List<UserObj> listUsers() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<List<UserObj>> returnType = new GenericType<List<UserObj>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Add a new user
   * Add a new user
   * @param body User information
   * @return InlineResponse200
   */
  public InlineResponse200 addUser(UserObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling addUser");
     }
     
    // create path and map variables
    String path = "/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get information about a user
   * Get information about a user
   * @param name username
   * @return UserObj
   */
  public UserObj getUser(String name) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling getUser");
     }
     
    // create path and map variables
    String path = "/users/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<UserObj> returnType = new GenericType<UserObj>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete a user
   * Delete a user
   * @param name username
   * @return void
   */
  public void removeUser(String name) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling removeUser");
     }
     
    // create path and map variables
    String path = "/users/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * Update properties on a user
   * Update properties on a user
   * @param name username
   * @param body User information
   * @return InlineResponse200
   */
  public InlineResponse200 modifyUser(String name, UserObj body) throws ApiException {
    Object postBody = body;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling modifyUser");
     }
     
     // verify the required parameter 'body' is set
     if (body == null) {
        throw new ApiException(400, "Missing the required parameter 'body' when calling modifyUser");
     }
     
    // create path and map variables
    String path = "/users/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get all views
   * get all views
   * @return InlineResponse200
   */
  public InlineResponse200 viewsGet() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/views".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get view with specified identifier
   * get view with specified identifier
   * @param identifier Name of view to get
   * @return InlineResponse200
   */
  public InlineResponse200 viewsGetById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling viewsGetById");
     }
     
    // create path and map variables
    String path = "/views/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * put a single view
   * put a single view
   * @param identifier Name of view to create or update
   * @return InlineResponse200
   */
  public InlineResponse200 viewsPut(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling viewsPut");
     }
     
    // create path and map variables
    String path = "/views/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "text/plain", "application/octet-stream"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * put a single view
   * put a single view
   * @param identifier Name of view to delete
   * @return InlineResponse200
   */
  public InlineResponse200 viewsDelete(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling viewsDelete");
     }
     
    // create path and map variables
    String path = "/views/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get list of active and past run workflow instances
   * Get list of active and past run workflow instances
   * @param active Filter active workflows
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGet(Boolean active) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "active", active));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Run a new workflow
   * Run a new workflow
   * @param body Workflow name
   * @param name Workflow name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsPost(GenericObj body, String name) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/workflows".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "name", name));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get list of all graphs
   * Get list of all graphs
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGetGraphs() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows/graphs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Add a graph to the graph library
   * Add a graph to the graph library
   * @param body Workflow name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsPutGraphs(GenericObj body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/workflows/graphs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get the graph with the specified injectable name
   * Get the graph with the specified injectable name
   * @param injectableName Graph injectable name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGetGraphsByName(String injectableName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'injectableName' is set
     if (injectableName == null) {
        throw new ApiException(400, "Missing the required parameter 'injectableName' when calling workflowsGetGraphsByName");
     }
     
    // create path and map variables
    String path = "/workflows/graphs/{injectableName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "injectableName" + "\\}", apiClient.escapeString(injectableName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete the graph with the specified injectable name
   * Delete the graph with the specified injectable name
   * @param injectableName Graph injectable name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsDeleteGraphsByName(String injectableName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'injectableName' is set
     if (injectableName == null) {
        throw new ApiException(400, "Missing the required parameter 'injectableName' when calling workflowsDeleteGraphsByName");
     }
     
    // create path and map variables
    String path = "/workflows/graphs/{injectableName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "injectableName" + "\\}", apiClient.escapeString(injectableName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get list of tasks possible to run in workflows
   * Get list of tasks possible to run in workflows
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGetAllTasks() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/workflows/tasks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Add tasks to task library
   * Add tasks to task library
   * @param body Workflow name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsPutTask(GenericObj body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/workflows/tasks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Get the task with the specified injectable name
   * Get the task with the specified injectable name
   * @param injectableName Task injectable name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGetTasksByName(String injectableName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'injectableName' is set
     if (injectableName == null) {
        throw new ApiException(400, "Missing the required parameter 'injectableName' when calling workflowsGetTasksByName");
     }
     
    // create path and map variables
    String path = "/workflows/tasks/{injectableName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "injectableName" + "\\}", apiClient.escapeString(injectableName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete the task with the specified injectable name
   * Delete the task with the specified injectable name
   * @param injectableName Task injectable name
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsDeleteTasksByName(String injectableName) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'injectableName' is set
     if (injectableName == null) {
        throw new ApiException(400, "Missing the required parameter 'injectableName' when calling workflowsDeleteTasksByName");
     }
     
    // create path and map variables
    String path = "/workflows/tasks/{injectableName}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "injectableName" + "\\}", apiClient.escapeString(injectableName.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * get a specific workflow
   * get a specific workflow
   * @param identifier Workflow identifier
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsGetById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling workflowsGetById");
     }
     
    // create path and map variables
    String path = "/workflows/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Delete the workflow with the specified ID
   * Delete the workflow with the specified ID
   * @param identifier Workflow ID
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsDeleteById(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling workflowsDeleteById");
     }
     
    // create path and map variables
    String path = "/workflows/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Perform the specified action on the selected workflow
   * Perform the specified action on the selected workflow
   * @param identifier Workflow identifier
   * @param action Command to execute on selected workflow
   * @return InlineResponse200
   */
  public InlineResponse200 workflowsAction(String identifier, Action action) throws ApiException {
    Object postBody = action;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling workflowsAction");
     }
     
     // verify the required parameter 'action' is set
     if (action == null) {
        throw new ApiException(400, "Missing the required parameter 'action' when calling workflowsAction");
     }
     
    // create path and map variables
    String path = "/workflows/{identifier}/action".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<InlineResponse200> returnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
