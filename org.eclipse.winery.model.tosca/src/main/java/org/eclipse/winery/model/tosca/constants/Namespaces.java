/*******************************************************************************
 * Copyright (c) 2013-2014 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Oliver Kopp - initial API and implementation
 *******************************************************************************/
package org.eclipse.winery.model.tosca.constants;

import java.util.Arrays;
import java.util.List;

import javax.xml.XMLConstants;

/**
 * Defines namespace constants not available in Java7's XMLConstants
 */
public class Namespaces {

    public static final String EXAMPLE_NAMESPACE_URI = "http://www.example.org";
    
    public static final String TOSCA_NAMESPACE = "http://docs.oasis-open.org/tosca/ns/2011/12";
    public static final String TOSCA_WINERY_EXTENSIONS_NAMESPACE = "http://www.opentosca.org/winery/extensions/tosca/2013/02/12";
    
    public static final String URI_BPMN20_MODEL = "http://www.omg.org/spec/BPMN/20100524/MODEL";
    public static final String URI_BPMN4TOSCA_20 = "http://www.opentosca.org/bpmn4tosca";
    public static final String URI_BPEL20_ABSTRACT = "http://docs.oasis-open.org/wsbpel/2.0/process/abstract";
    public static final String URI_BPEL20_EXECUTABLE = "http://docs.oasis-open.org/wsbpel/2.0/process/executable";
    public static final String URI_OPENTOSCA_NODETYPE = "http://www.opentosca.org/nodetypes";
    
    // XML Schema namespace is defined at Java7's XMLConstants.W3C_XML_SCHEMA_NS_URI
    public static final String W3C_XML_SCHEMA_NS_URI = XMLConstants.W3C_XML_SCHEMA_NS_URI;
    public static final String W3C_NAMESPACE_URI = "http://www.w3.org/XML/1998/namespace";

    public static List<String> getDisallowedNamespaces() {
        return Arrays.asList(TOSCA_NAMESPACE, TOSCA_WINERY_EXTENSIONS_NAMESPACE, W3C_NAMESPACE_URI, W3C_XML_SCHEMA_NS_URI, URI_BPEL20_ABSTRACT, URI_BPEL20_EXECUTABLE);
    }
}
