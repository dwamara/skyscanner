/*
 * Copyright 2014-2016 OpenEstate.org.
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
package com.dwitech.eap.skyscanner.adaptor.boundary;

import com.dwitech.eap.skyscanner.adaptor.control.RequestMethod;
import com.dwitech.eap.skyscanner.adaptor.control.Response;
import org.apache.commons.io.IOUtils;

import javax.ejb.Stateless;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Stateless
public class ExternalServiceCaller {
    public Response sendRequest(String url, RequestMethod method) throws IOException {
        method = method == null ? RequestMethod.GET : method;

        HttpURLConnection connection = null;
        InputStream responseInput = null;

        try {
            // create connection
            connection = (HttpURLConnection) (new URL(url)).openConnection();
            connection.setRequestMethod(method.name());
            connection.setRequestProperty("Content-Type", APPLICATION_JSON + "; charset=" + getEncoding().toLowerCase());
            connection.setRequestProperty("Content-Language", "en-US");
            connection.setRequestProperty("Accept", APPLICATION_JSON);
            connection.setUseCaches(false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            // read response into string
            responseInput = new BufferedInputStream(connection.getInputStream());
            return new Response(connection, IOUtils.toString(responseInput, getEncoding()));
        } finally {
            IOUtils.closeQuietly(responseInput);
            IOUtils.close(connection);
        }
    }

    private String getEncoding() {
        return "UTF-8";
    }
}
