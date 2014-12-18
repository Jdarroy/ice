/*******************************************************************************
 * Copyright (c) 2013, 2014 UT-Battelle, LLC.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Initial API and implementation and/or initial documentation - Jay Jay Billings,
 *   Jordan H. Deyton, Dasha Gorin, Alexander J. McCaskey, Taylor Patterson,
 *   Claire Saunders, Matthew Wang, Anna Wojtowicz
 *******************************************************************************/
package org.eclipse.ice.io.serializable;

import java.net.URI;

import org.eclipse.ice.datastructures.ICEObject.ICEObject;
import org.eclipse.ice.datastructures.form.Form;

/**
 * The IWriter interface defines the functionality needed to write an ICE
 * internal object representation to file . It also allows clients to search for
 * a given pattern and replace it with a provided value.
 * 
 * @author Alex McCaskey
 *
 */
public interface IWriter {

	/**
	 * This method lets clients write a Form to a specific file format.
	 * 
	 * @param formToWrite
	 *            The Form to persist to file.
	 * @param uri
	 *            The URI of the file to be written.
	 */
	public void write(Form formToWrite, URI fileURI);

	/**
	 * This method provides clients with a basic search and replace
	 * functionality. Realizations of this method should search the file with
	 * given URI for all occurrences of the given regular expression, and
	 * replace it with the given value.
	 * 
	 * @param regex
	 *            The regular expression to search.
	 * @param value
	 *            The value that should replace all occurrences of the given
	 *            regular expression.
	 */
	public void replace(URI fileURI, String regex, String value);

	/**
	 * This method is used by the IOService to store unique references of
	 * IWriters. It is used as the key in the IOService's IWriter mapping.
	 * 
	 * @return The String name of this IWriter.
	 */
	public String getWriterType();

}
