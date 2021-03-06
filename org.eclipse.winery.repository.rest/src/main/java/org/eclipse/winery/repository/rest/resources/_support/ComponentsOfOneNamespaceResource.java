/*******************************************************************************
 * Copyright (c) 2016 University of Stuttgart.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and the Apache License 2.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v20.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Lukas Harzenetter - initial API and implementation
 *******************************************************************************/

package org.eclipse.winery.repository.rest.resources._support;

import javax.ws.rs.DELETE;
import javax.ws.rs.core.Response;

import org.eclipse.winery.common.ids.definitions.DefinitionsChildId;
import org.eclipse.winery.repository.rest.RestUtils;

public class ComponentsOfOneNamespaceResource {

	private final Class<? extends AbstractComponentsResource> containerClass;
	private final String namespace;

	public ComponentsOfOneNamespaceResource(Class<? extends AbstractComponentsResource> containerClass, String namespace) {
		this.containerClass = containerClass;
		this.namespace = namespace;
	}

	@DELETE
	public Response delete() {
		Class<? extends DefinitionsChildId> idClass = RestUtils.getComponentIdClassForComponentContainer(this.containerClass);
		return RestUtils.delete(idClass, namespace);
	}
}
