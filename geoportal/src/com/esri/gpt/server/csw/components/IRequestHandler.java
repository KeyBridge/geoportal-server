/*
 * Copyright 2015 Esri, Inc..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.esri.gpt.server.csw.components;

import javax.servlet.http.HttpServletRequest;

/**
 * Request handler definition.
 */
public interface IRequestHandler {

    /** properties ============================================================== */
    /**
     * Gets the operation context.
     * @return the operation context
     */
    OperationContext getOperationContext();
    
    /**
     * Handles a URL based request (HTTP GET).
     * @param request the HTTP request
     * @return operation response
     * @throws Exception if a processing exception occurs
     */
    OperationResponse handleGet(HttpServletRequest request) throws Exception;

    /**
     * Handles an XML based request (normally HTTP POST).
     * @param xml the XML
     * @return operation response
     * @throws Exception if a processing exception occurs
     */
    OperationResponse handleXML(String xml) throws Exception;
    
}
