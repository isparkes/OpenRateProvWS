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

import OpenRate.customerinterface.webservices.CreateAliasObject;
import OpenRate.customerinterface.webservices.CreateCustomerObject;
import OpenRate.customerinterface.webservices.CreateERAObject;
import OpenRate.customerinterface.webservices.CreateProductObject;
import OpenRate.customerinterface.webservices.CreateProductsObject;
import OpenRate.customerinterface.webservices.DeleteERAObject;
import OpenRate.customerinterface.webservices.EnquiryMethodReturnTypeObj;
import OpenRate.customerinterface.webservices.GetAliasObject;
import OpenRate.customerinterface.webservices.GetCustomerObject;
import OpenRate.customerinterface.webservices.GetERAObject;
import OpenRate.customerinterface.webservices.GetProductObject;
import OpenRate.customerinterface.webservices.MethodReturnTypeObj;
import OpenRate.customerinterface.webservices.ModifyAliasObject;
import OpenRate.customerinterface.webservices.ModifyCustomerObject;
import OpenRate.customerinterface.webservices.ModifyERAObject;
import OpenRate.customerinterface.webservices.ModifyProductObject;
import javax.jws.WebService;

@WebService(endpointInterface = "OpenRate.WS.OpenRateProvWS")
public class OpenRateProvWSImpl implements OpenRateProvWS {

    @Override
    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
    
 @Override
 public MethodReturnTypeObj createCustomer( String MSN,
                                            String ActivationDate,
                                            String DeactivationDate,
                                            String EffectiveDate)
  {
    MethodReturnTypeObj createCustomerMethodReturnTypeObj;
    CreateCustomerObject createCustomerObject = new CreateCustomerObject();
    createCustomerMethodReturnTypeObj = createCustomerObject.createCustomer(null, MSN, ActivationDate, DeactivationDate, EffectiveDate);

    if ((createCustomerMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+createCustomerMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+createCustomerMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+createCustomerMethodReturnTypeObj.getClientID()+"");
    }

    return createCustomerMethodReturnTypeObj;
  }
    
 /**
  * Get customer operation
  */
  @Override
  public EnquiryMethodReturnTypeObj getCustomer(String MSN,
                                                long CustId,
                                                String EffectiveDate)
  {
    EnquiryMethodReturnTypeObj getCustomerMethodReturnTypeObj;
    GetCustomerObject getCustomerObject = new GetCustomerObject();
    getCustomerMethodReturnTypeObj=getCustomerObject.getCustomer(null,MSN,CustId,EffectiveDate);

    if ((getCustomerMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+getCustomerMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+getCustomerMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+getCustomerMethodReturnTypeObj.getClientID()+"");
    }
    
    return getCustomerMethodReturnTypeObj;
  }
  
 /**
  * Create customer operation
  */
  @Override
  public MethodReturnTypeObj modifyCustomer(String MSN,
                                            long CustId,
                                            String DeactivationDate,
                                            String EffectiveDate)
  {
    MethodReturnTypeObj modifyCustomerMethodReturnTypeObj;
    ModifyCustomerObject modifyCustomerObject = new ModifyCustomerObject();
    modifyCustomerMethodReturnTypeObj = modifyCustomerObject.modifyCustomer(null, MSN, CustId, DeactivationDate, EffectiveDate);

    if ((modifyCustomerMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyCustomerMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyCustomerMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyCustomerMethodReturnTypeObj.getClientID()+"");
    }

    return modifyCustomerMethodReturnTypeObj;
  }

  // ***************************************************************************
  // ********************************** Alias **********************************
  // ***************************************************************************
  
 /**
  * Create Alias operation
  */
    @Override
  public MethodReturnTypeObj createAlias( String MSN,
                            long   CustId,
                            String Alias,
                            String Subscription,
                            String ActivationDate,
                            String DeactivationDate,
                            String EffectiveDate)
  {
    MethodReturnTypeObj createAliasMethodReturnTypeObj;
    CreateAliasObject createAliasObject = new CreateAliasObject();

    createAliasMethodReturnTypeObj = createAliasObject.createAlias(null,MSN,CustId,Alias,Subscription,ActivationDate,DeactivationDate,EffectiveDate);

    if ((createAliasMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+createAliasMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+createAliasMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+createAliasMethodReturnTypeObj.getClientID()+"");
    }

    return createAliasMethodReturnTypeObj;
  }

 /**
  * Get Alias operation
  */
    @Override
  public EnquiryMethodReturnTypeObj getAlias(String MSN,
                            long CustId,
                            String EffectiveDate)
  {
    EnquiryMethodReturnTypeObj getAliasMethodReturnTypeObj;
    GetAliasObject getAliasObject = new GetAliasObject();

    getAliasMethodReturnTypeObj=getAliasObject.GetAlias(null,MSN,CustId,EffectiveDate);

    if ((getAliasMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+getAliasMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+getAliasMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+getAliasMethodReturnTypeObj.getClientID()+"");
    }

    return getAliasMethodReturnTypeObj;
  }

 /**
  * Modify Alias operation
  */
    @Override
  public MethodReturnTypeObj modifyAlias(String MSN,
                            long CustId,
                            String Alias,
                            String DeactivationDate,
                            String EffectiveDate)
  {
    MethodReturnTypeObj modifyAliasMethodReturnTypeObj;
    ModifyAliasObject modifyAliasObject = new ModifyAliasObject();

    modifyAliasMethodReturnTypeObj = modifyAliasObject.modifyAlias(null,MSN,CustId,Alias,DeactivationDate,EffectiveDate);

    if ((modifyAliasMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyAliasMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyAliasMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyAliasMethodReturnTypeObj.getClientID()+"");
    }

    return modifyAliasMethodReturnTypeObj;
  }

  // ***************************************************************************
  // ********************************* Product *********************************
  // ***************************************************************************
  
 /**
  * Create product operation
  */
    @Override
  public MethodReturnTypeObj createProduct(String MSN,
          long CustID,
          String ProductName,
          String SubscriptionID,
          String ServiceID,
          String ActivationDate,
          String DeactivationDate,
          String EffectiveDate)
  {
    MethodReturnTypeObj createProductMethodReturnTypeObj;
    CreateProductObject createProductObject = new CreateProductObject();
    createProductMethodReturnTypeObj = createProductObject.createProduct(null,MSN,CustID,ProductName,SubscriptionID,ServiceID,ActivationDate,DeactivationDate,EffectiveDate);

    if ((createProductMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+createProductMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+createProductMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+createProductMethodReturnTypeObj.getClientID()+"");
    }

    return createProductMethodReturnTypeObj;
  }

 /**
  * Create products operation
  */
  @Override
  public MethodReturnTypeObj createProducts(String MSN,
          long CustID,
          String[] ProductName,
          String SubscriptionID,
          String ServiceID,
          String ActivationDate,
          String DeactivationDate,
          String EffectiveDate)
  {
    MethodReturnTypeObj createProductMethodReturnTypeObj;
    CreateProductsObject createProductsObject = new CreateProductsObject();
    createProductMethodReturnTypeObj = createProductsObject.createProducts(null,MSN,CustID,ProductName,SubscriptionID,ServiceID,ActivationDate,DeactivationDate,EffectiveDate);

    if ((createProductMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+createProductMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+createProductMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+createProductMethodReturnTypeObj.getClientID()+"");
    }

    return createProductMethodReturnTypeObj;
  }

 /**
  * Get Product operation
  */
  @Override
  public MethodReturnTypeObj getProduct(String MSN,
          long CustID,
          String EffectiveDate)
  {
    MethodReturnTypeObj modifyERAMethodReturnTypeObj;
    GetProductObject getProductObject = new GetProductObject();
    modifyERAMethodReturnTypeObj = getProductObject.GetProduct(null, MSN, CustID, EffectiveDate);

    if ((modifyERAMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyERAMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyERAMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyERAMethodReturnTypeObj.getClientID()+"");
    }

    return modifyERAMethodReturnTypeObj;
  }
  
 /**
  * Modify product operation
  */
  @Override
  public MethodReturnTypeObj modifyProduct(String MSN,
          long CustID,
          String ProductName,
          String SubscriptionID,
          String ActivationDate,
          String DeactivationDate,
          String EffectiveDate)
  {
    MethodReturnTypeObj modifyProductMethodReturnTypeObj;
    ModifyProductObject modifyProductObject = new ModifyProductObject();
    modifyProductMethodReturnTypeObj = modifyProductObject.modifyProduct(null,MSN,CustID,ProductName,SubscriptionID,ActivationDate,DeactivationDate,EffectiveDate);

    if ((modifyProductMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyProductMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyProductMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyProductMethodReturnTypeObj.getClientID()+"");
    }

    return modifyProductMethodReturnTypeObj;
  }

  // ***************************************************************************
  // *********************************** ERA ***********************************
  // ***************************************************************************
  
 /**
  * Create ERA operation
  */
    @Override
  public MethodReturnTypeObj createERA( String MSN,
                                        long CustID,
                                        String ERAName,
                                        String ERAValue,
                                        String EffectiveDate)
  {
    MethodReturnTypeObj createERAMethodReturnTypeObj;
    CreateERAObject createERAObject = new CreateERAObject();
    createERAMethodReturnTypeObj = createERAObject.createERA(null, MSN, CustID, ERAName, ERAValue, EffectiveDate);

    if ((createERAMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+createERAMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+createERAMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+createERAMethodReturnTypeObj.getClientID()+"");
    }

    return createERAMethodReturnTypeObj;
  }

 /**
  * Modify ERA operation
  */
    @Override
  public MethodReturnTypeObj modifyERA( String MSN,
                                        long CustID,
                                        String ERAName,
                                        String ERAValue,
                                        String EffectiveDate)
  {
    MethodReturnTypeObj modifyERAMethodReturnTypeObj;
    ModifyERAObject modifyERAObject = new ModifyERAObject();
    modifyERAMethodReturnTypeObj = modifyERAObject.modifyERA(null, MSN, CustID, ERAName, ERAValue, EffectiveDate);

    if ((modifyERAMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyERAMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyERAMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyERAMethodReturnTypeObj.getClientID()+"");
    }

    return modifyERAMethodReturnTypeObj;
  }

 /**
  * Delete ERA operation
  */
    @Override
  public MethodReturnTypeObj deleteERA( String MSN,
                                        long CustID,
                                        String ERAName,
                                        String EffectiveDate)
  {
    MethodReturnTypeObj modifyERAMethodReturnTypeObj;
    DeleteERAObject deleteERAObject = new DeleteERAObject();
    modifyERAMethodReturnTypeObj = deleteERAObject.deleteERA(null, MSN, CustID, ERAName, EffectiveDate);

    if ((modifyERAMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyERAMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyERAMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyERAMethodReturnTypeObj.getClientID()+"");
    }

    return modifyERAMethodReturnTypeObj;
  }

 /**
  * Get ERA operation
  */
  @Override
  public MethodReturnTypeObj getERA(String MSN,
                                    long CustID,
                                    String EffectiveDate)
  {
    MethodReturnTypeObj modifyERAMethodReturnTypeObj;
    GetERAObject getERAObject = new GetERAObject();
    modifyERAMethodReturnTypeObj = getERAObject.GetERA(null, MSN, CustID, EffectiveDate);

    if ((modifyERAMethodReturnTypeObj.getReturnCode() != 0))
    {
      System.out.println(" EXIT ERROR :"+modifyERAMethodReturnTypeObj.getReturnCode()+"");
      System.out.println(" MESSAGE :"+modifyERAMethodReturnTypeObj.getMessage()+"");
      System.out.println(" CUST ID :"+modifyERAMethodReturnTypeObj.getClientID()+"");
    }

    return modifyERAMethodReturnTypeObj;
  }
}
// END SNIPPET: service
