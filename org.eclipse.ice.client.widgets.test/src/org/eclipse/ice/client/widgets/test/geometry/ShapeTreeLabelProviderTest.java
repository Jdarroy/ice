/*******************************************************************************
 * Copyright (c) 2012, 2014 UT-Battelle, LLC.
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
package org.eclipse.ice.client.widgets.test.geometry;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.eavp.viz.service.modeling.AbstractView;
import org.eclipse.eavp.viz.service.modeling.ShapeController;
import org.eclipse.eavp.viz.service.modeling.ShapeMesh;
import org.eclipse.eavp.viz.service.geometry.shapes.OperatorType;
import org.eclipse.eavp.viz.service.geometry.shapes.ShapeType;
import org.eclipse.eavp.viz.service.geometry.widgets.ShapeTreeLabelProvider;
import org.junit.Test;

/**
 * <p>
 * Tests ShapeTreeLabelProvider
 * </p>
 * 
 * @author Andrew P. Belt
 */
public class ShapeTreeLabelProviderTest {
	/**
	 * <p>
	 * Checks that ShapeTreeLabelProvider can be created and initialized
	 * properly
	 * </p>
	 * 
	 */
	@Test
	public void checkCreation() {

		// Create a new ShapeTreeLabelProvider and dispose it
		// Currently there are no assertions to check, but we can make
		// sure they're created without throwing exceptions.

		ShapeTreeLabelProvider labelProvider = new ShapeTreeLabelProvider();
		labelProvider.dispose();

	}

	/**
	 * <p>
	 * Checks that ShapeTreeLabelProvider returns expected images
	 * <span style="font-family:Serif;"></span>
	 * </p>
	 * 
	 */
	@Test
	public void checkGetImage() {

		ShapeTreeLabelProvider labelProvider = new ShapeTreeLabelProvider();

		// Any input should produce a null return value

		// Create a shape
		ShapeMesh geometryModel = new ShapeMesh();
		AbstractView geometryView = new AbstractView();
		ShapeController geometryShape = new ShapeController(geometryModel, geometryView);

		ShapeController cube1 = (ShapeController) geometryShape.clone();
		cube1.setProperty("Type", ShapeType.Cube.toString());
		ShapeController intersection1 = (ShapeController) geometryShape.clone();
		intersection1.setProperty("Operator",
				OperatorType.Intersection.toString());

		assertNull(labelProvider.getImage(cube1));
		assertNull(labelProvider.getImage(intersection1));
		assertNull(labelProvider.getImage(null));

	}

	/**
	 * <p>
	 * Checks that the getText operation returns valid names
	 * </p>
	 * 
	 */
	@Test
	public void checkGetText() {

		ShapeTreeLabelProvider labelProvider = new ShapeTreeLabelProvider();

		// Create some named shapes

		// Create a shape
		ShapeMesh geometryModel = new ShapeMesh();
		AbstractView geometryView = new AbstractView();
		ShapeController geometryShape = new ShapeController(geometryModel, geometryView);

		ShapeController cube1 = (ShapeController) geometryShape.clone();
		cube1.setProperty("Type", ShapeType.Cube.toString());

		ShapeController union1 = (ShapeController) geometryShape.clone();
		union1.setProperty("Operator", OperatorType.Union.toString());
		ShapeController intersection1 = (ShapeController) geometryShape.clone();
		intersection1.setProperty("Operator",
				OperatorType.Intersection.toString());

		cube1.setProperty("Name", "KUB");

		intersection1.setProperty("Name", "INTRASECSION");

		union1.setProperty("Name", "Not a name");
		union1.setProperty("Id", "1111");

		// Check that the ShapeTreeLabelProvider returns the correct names
		// with the format "<name> <id>"

		String expectedCube1Text = cube1.getProperty("Name") + " "
				+ cube1.getProperty("Id");
		assertTrue(labelProvider.getText(cube1).equals(expectedCube1Text));

		String expectedIntersection1Text = intersection1.getProperty("Name")
				+ " " + intersection1.getProperty("Id");
		assertTrue(labelProvider.getText(intersection1)
				.equals(expectedIntersection1Text));

		String expectedUnion1Text = union1.getProperty("Name") + " "
				+ union1.getProperty("Id");
		assertTrue(labelProvider.getText(union1).equals(expectedUnion1Text));

		// Check a null parameter

		assertNull(labelProvider.getText(null));

		// Check a non-ICEObject parameter

		assertNull(labelProvider.getText(new Object()));

	}
}