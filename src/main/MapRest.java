/*******************************************************************************
 * Copyright (c) 2017, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
 package eda.map;

 import java.util.Properties;
 
 import javax.ws.rs.GET;
 import javax.ws.rs.Path;
 import javax.ws.rs.Produces;
 import javax.ws.rs.core.MediaType;
 
 @Path("coordinates")
 public class MapRest {
 
     @GET
     @Produces(MediaType.APPLICATION_JSON)
     public String getCoordinates() {
        /* return JSON string in the form of:

            {"geometry": {"type": "Point", "coordinates": [120.13613239701596, -14.145290254725987]}, "type": "Feature", "properties": {}}

            from kafka with the coordinates of the container.

        */
        return "";
     }
 
 }