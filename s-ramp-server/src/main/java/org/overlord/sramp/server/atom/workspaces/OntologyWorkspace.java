/*
 * Copyright 2011 JBoss Inc
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
package org.overlord.sramp.server.atom.workspaces;

import org.jboss.resteasy.plugins.providers.atom.Category;
import org.jboss.resteasy.plugins.providers.atom.app.AppCategories;
import org.jboss.resteasy.plugins.providers.atom.app.AppCollection;
import org.overlord.sramp.atom.MediaType;
import org.overlord.sramp.atom.SrampAtomConstants;

/**
 * Models the custom ontology workspace.  This workspace is not defined by the
 * S-RAMP specification (the spec is silent regarding how to manage ontologies).
 *
 * @author eric.wittmann@redhat.com
 */
public class OntologyWorkspace extends AbstractWorkspace {

	private static final long serialVersionUID = -1353321140809507853L;

	/**
	 * Constructor.
	 * @param hrefBase
	 */
	public OntologyWorkspace(String hrefBase) {
		super(hrefBase, "Ontology Model"); //$NON-NLS-1$
	}

	/**
	 * @see org.overlord.sramp.common.server.atom.workspaces.AbstractWorkspace#configureWorkspace()
	 */
	@Override
	protected void configureWorkspace() {
		AppCollection collection = addCollection("/s-ramp/ontology", "Ontology Objects", MediaType.APPLICATION_RDF_XML); //$NON-NLS-1$ //$NON-NLS-2$

		AppCategories categories = new AppCategories();
		categories.setFixed(true);
		collection.getCategories().add(categories);

		Category category = new Category();
		category.setScheme(SrampAtomConstants.URN_X_S_RAMP_V1_TYPE);
		category.setTerm("ontology"); //$NON-NLS-1$
		category.setLabel("Ontology"); //$NON-NLS-1$
		categories.getCategory().add(category);
	}
}
