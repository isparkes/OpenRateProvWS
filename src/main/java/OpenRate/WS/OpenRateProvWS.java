/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
// START SNIPPET: service
package OpenRate.WS;

import OpenRate.customerinterface.webservices.EnquiryMethodReturnTypeObj;
import OpenRate.customerinterface.webservices.MethodReturnTypeObj;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface OpenRateProvWS {
    String sayHi(@WebParam(name="userName") String text);
    
 /**
  * Create customer operation
  */
  @WebMethod(operationName = "createCustomer")
  public MethodReturnTypeObj createCustomer(@WebParam(name = "MSN") String MSN,
                            @WebParam(name = "ActivationDate") String ActivationDate,
                            @WebParam(name = "DeactivationDate") String DeactivationDate,
                            @WebParam(name = "EffectiveDate") String EffectiveDate);   
 /**
  * Get customer operation
  */
  @WebMethod(operationName = "getCustomer")
  public EnquiryMethodReturnTypeObj getCustomer(@WebParam(name = "MSN") String MSN,
                            @WebParam(name = "CustId") long CustId,
                            @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Create customer operation
  */
  @WebMethod(operationName = "modifyCustomer")
  public MethodReturnTypeObj modifyCustomer(@WebParam(name = "MSN") String MSN,
                            @WebParam(name = "CustId") long CustId,
                            @WebParam(name = "DeactivationDate") String DeactivationDate,
                            @WebParam(name = "EffectiveDate") String EffectiveDate);

  // ***************************************************************************
  // ********************************** Alias **********************************
  // ***************************************************************************
  
 /**
  * Create Alias operation
  */
  @WebMethod(operationName = "createAlias")
  public MethodReturnTypeObj createAlias(@WebParam(name = "MSN")  String MSN,
                            @WebParam(name = "CustId")            long   CustId,
                            @WebParam(name = "Alias")             String Alias,
                            @WebParam(name = "Subscription")      String Subscription,
                            @WebParam(name = "ActivationDate")    String ActivationDate,
                            @WebParam(name = "DeactivationDate")  String DeactivationDate,
                            @WebParam(name = "EffectiveDate")     String EffectiveDate);

 /**
  * Get Alias operation
  */
  @WebMethod(operationName = "getAlias")
  public EnquiryMethodReturnTypeObj getAlias(@WebParam(name = "MSN") String MSN,
                            @WebParam(name = "CustId") long CustId,
                            @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Modify Alias operation
  */
  @WebMethod(operationName = "modifyAlias")
  public MethodReturnTypeObj modifyAlias(@WebParam(name = "MSN") String MSN,
                            @WebParam(name = "CustId") long CustId,
                            @WebParam(name = "Alias") String Alias,
                            @WebParam(name = "DeactivationDate") String DeactivationDate,
                            @WebParam(name = "EffectiveDate") String EffectiveDate);

  // ***************************************************************************
  // ********************************* Product *********************************
  // ***************************************************************************
  
 /**
  * Create product operation
  */
  @WebMethod(operationName = "createProduct")
  public MethodReturnTypeObj createProduct(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "ProductName") String ProductName,
          @WebParam(name = "SubscriptionID") String SubscriptionID,
          @WebParam(name = "ServiceID") String ServiceID,
          @WebParam(name = "ActivationDate") String ActivationDate,
          @WebParam(name = "DeactivationDate") String DeactivationDate,
          @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Create products operation
  */
  @WebMethod(operationName = "createProducts")
  public MethodReturnTypeObj createProducts(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "ProductName") String[] ProductName,
          @WebParam(name = "SubscriptionID") String SubscriptionID,
          @WebParam(name = "ServiceID") String ServiceID,
          @WebParam(name = "ActivationDate") String ActivationDate,
          @WebParam(name = "DeactivationDate") String DeactivationDate,
          @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Get Product operation
  */
  @WebMethod(operationName = "getProduct")
  public MethodReturnTypeObj getProduct(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "EffectiveDate") String EffectiveDate);
  
 /**
  * Modify product operation
  */
  @WebMethod(operationName = "modifyProduct")
  public MethodReturnTypeObj modifyProduct(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "ProductName") String ProductName,
          @WebParam(name = "SubscriptionID") String SubscriptionID,
          @WebParam(name = "ActivationDate") String ActivationDate,
          @WebParam(name = "DeactivationDate") String DeactivationDate,
          @WebParam(name = "EffectiveDate") String EffectiveDate);

  // ***************************************************************************
  // *********************************** ERA ***********************************
  // ***************************************************************************
  
 /**
  * Create ERA operation
  */
  @WebMethod(operationName = "createERA")
  public MethodReturnTypeObj createERA(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "ERAName") String ERAName,
          @WebParam(name = "ERAValue") String ERAValue,
          @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Modify ERA operation
  */
  @WebMethod(operationName = "modifyERA")
  public MethodReturnTypeObj modifyERA(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "ERAName") String ERAName,
          @WebParam(name = "ERAValue") String ERAValue,
          @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Delete ERA operation
  */
  @WebMethod(operationName = "deleteERA")
  public MethodReturnTypeObj deleteERA(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "ERAName") String ERAName,
          @WebParam(name = "EffectiveDate") String EffectiveDate);

 /**
  * Get ERA operation
  */
  @WebMethod(operationName = "getERA")
  public MethodReturnTypeObj getERA(@WebParam(name = "MSN") String MSN,
          @WebParam(name = "CustID") long CustID,
          @WebParam(name = "EffectiveDate") String EffectiveDate);
  
// END SNIPPET: service
}