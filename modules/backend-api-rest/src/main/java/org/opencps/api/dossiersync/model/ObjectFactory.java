//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.02 at 10:08:28 AM ICT 
//


package org.opencps.api.dossiersync.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opencps.api.dossiersync.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opencps.api.dossiersync.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DossierSyncResultsModel }
     * 
     */
    public DossierSyncResultsModel createDossierSyncResultsModel() {
        return new DossierSyncResultsModel();
    }

    /**
     * Create an instance of {@link DossierSyncDataModel }
     * 
     */
    public DossierSyncDataModel createDossierSyncDataModel() {
        return new DossierSyncDataModel();
    }

    /**
     * Create an instance of {@link DossierSyncSendingModel }
     * 
     */
    public DossierSyncSendingModel createDossierSyncSendingModel() {
        return new DossierSyncSendingModel();
    }

}
