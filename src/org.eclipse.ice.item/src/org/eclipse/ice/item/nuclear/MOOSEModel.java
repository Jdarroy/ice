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
package org.eclipse.ice.item.nuclear;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ice.datastructures.form.AdaptiveTreeComposite;
import org.eclipse.ice.datastructures.form.AllowedValueType;
import org.eclipse.ice.datastructures.form.DataComponent;
import org.eclipse.ice.datastructures.form.Entry;
import org.eclipse.ice.datastructures.form.Form;
import org.eclipse.ice.datastructures.form.FormStatus;
import org.eclipse.ice.datastructures.form.TreeComposite;
import org.eclipse.ice.datastructures.updateableComposite.Component;
import org.eclipse.ice.item.Item;
import org.eclipse.ice.item.ItemType;
import org.eclipse.ice.item.utilities.moose.MOOSEFileHandler;

/**
 * <!-- begin-UML-doc -->
 * <p>
 * An MOOSE Item for creating MOOSE input files. This Item expects to find the
 * input templates generated from MOOSE in the ${workspace}/MOOSE directory. The
 * templates can be generated from a MOOSE application by running
 * "./application --yaml > application.yaml" from the application's build
 * directory.
 * </p>
 * <p>
 * This class' Item builder defaults the MOOSE-based application to null,
 * forcing the user to select the app. Once an app is selected, reviewEntries()
 * is triggered and loads the YAML spec. If the Item was imported from an input
 * file, any data from the input file is consolidated with the YAML file in the
 * reviewEntries() method as well.
 * </p>
 * <p>
 * It is not, in general, necessary to subclass this Item and all
 * reconfiguration can be done by the builder by setting the executable name
 * since the only thing that changes from application to application is the YAML
 * input file.
 * </p>
 * <!-- end-UML-doc -->
 * 
 * @author bkj, w5q, aqw
 * @generated 
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
@XmlRootElement(name = "MOOSEModel")
public class MOOSEModel extends Item {

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * A MOOSEFileHandler for manipulating MOOSE files.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@XmlTransient
	@Transient
	private MOOSEFileHandler handler;

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * The identification number of the DataComponent containing the output file
	 * name.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@XmlTransient
	@Transient
	public static final int fileDataComponentId = 1;

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * The identification number of the TreeComposite containing the MOOSE input
	 * tree.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@XmlTransient
	@Transient
	public static final int mooseTreeCompositeId = 2;

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * The process tag for writing the MOOSE output file.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	@XmlTransient
	@Transient
	protected static final String mooseProcessActionString = "Write MOOSE File";

	/**
	 * The array of mooseApps available for this model.
	 */
	@XmlTransient
	@Transient
	protected ArrayList<String> mooseApps;

	/**
	 * The currently loaded MOOSE-based application.
	 */
	@XmlTransient
	@Transient
	protected String loadedApp;

	/**
	 * An ArrayList of TreeComposites, constructed from the top-level children
	 * of the YAML spec (ie. children directly beneath the root). Used for easy
	 * cross-reference across multiple methods.
	 */
	@XmlTransient
	@Transient
	private ArrayList<TreeComposite> topLevelYamlTrees = null;

	/**
	 * An ArrayList of TreeComposites, constructed from the top-level children
	 * of the input data (ie. children directly beneath the root). Used for easy
	 * cross-reference across multiple methods.
	 */
	@XmlTransient
	@Transient
	private ArrayList<TreeComposite> topLevelInputTrees = null;

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * The constructor.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public MOOSEModel() {
		// begin-user-code
		this(null);
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * The constructor with a project space in which files should be
	 * manipulated.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @param projectSpace
	 *            <p>
	 *            The Eclipse project where files should be stored and from
	 *            which they should be retrieved.
	 *            </p>
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public MOOSEModel(IProject projectSpace) {
		// begin-user-code

		// Call super
		super(projectSpace);

		// Instantiate the file handler for MOOSE files
		handler = new MOOSEFileHandler();

		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * This operation creates the MOOSE input file.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @param actionName
	 *            <p>
	 *            The name of action that should be performed using the
	 *            processed Form data.
	 *            </p>
	 * @return <p>
	 *         The status of the Item after processing the Form and executing
	 *         the action. It returns FormStatus.InfoError if it is unable to
	 *         run for any reason, including being asked to run actions that are
	 *         not in the list of available actions.
	 *         </p>
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public FormStatus process(String actionName) {
		// begin-user-code

		// Local Declarations
		FormStatus retStatus = FormStatus.InfoError;
		Entry outputFileEntry = ((DataComponent) form
				.getComponent(fileDataComponentId))
				.retrieveEntry("Output File Name");
		String outputFilename = outputFileEntry.getValue();
		String outputFilePath;
		TreeComposite modelTree = (TreeComposite) form
				.getComponent(mooseTreeCompositeId);
		ArrayList<TreeComposite> modelChildren = new ArrayList<TreeComposite>();

		// Check that the process is something that we will do and that the Item
		// is enabled
		if (mooseProcessActionString.equals(actionName) && isEnabled()) {
			// Get the file location
			outputFilePath = project.getFile(outputFilename).getLocation()
					.toOSString();
			// Load the tree list
			for (int i = 0; i < modelTree.getNumberOfChildren(); i++) {
				modelChildren.add(modelTree.getChildAtIndex(i));
			}
			// Dump the file
			handler.dumpInputFile(outputFilePath, modelChildren);
			// Update the project space
			try {
				project.refreshLocal(IResource.DEPTH_INFINITE, null);
			} catch (CoreException e) {
				// Complain
				System.out.println("MOOSEModel Exception: Unable to refresh "
						+ "project space after creating output file!");
				e.printStackTrace();
			}
			// Update the status
			retStatus = FormStatus.Processed;
		} else {
			// Otherwise, punt it up to the parent to see if it can handle it.
			retStatus = super.process(actionName);
		}

		// Reset the status and return. It should only be updated if the Item is
		// enabled.
		if (isEnabled()) {
			status = retStatus;
			return retStatus;
		} else {
			return FormStatus.Unacceptable;
		}
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * This operation sets up the Form for the MOOSEModel. The Form contains a
	 * DataComponent with id=1 that contains Entries for the names of the MOOSE
	 * application for which input should be modeled and for the output file and
	 * a TreeComposite with id=2 that contains the MOOSE input tree.
	 * </p>
	 * <p>
	 * The Entries in the DataComponent are named "MOOSE-Based Application" with
	 * id = 1 and "Output File Name" with id=2. The TreeComposite is empty.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void setupForm() {
		// begin-user-code

		// Local Declarations
		Entry mooseAppEntry;
		String selectAppText = "Select MOOSE app";

		// Create the Form
		form = new Form();

		// Create the Data Component
		DataComponent fileDataComponent = new DataComponent();
		fileDataComponent.setId(fileDataComponentId);
		fileDataComponent.setName("Output File Parameters");
		fileDataComponent.setDescription("Global parameters for the output "
				+ "file that ICE will create.");
		form.addComponent(fileDataComponent);

		// Add the default dummy text to the list of available apps
		mooseApps = new ArrayList<String>();
		mooseApps.add(selectAppText);

		// Get the list of MOOSE configuration files available to ICE, if
		// possible, before creating the app Entry.
		if (project != null && project.isAccessible()) {
			// Get the MOOSE folder
			IFolder mooseFolder = project.getFolder("MOOSE");
			// Get the files from it if it exists
			if (mooseFolder.exists()) {
				try {
					IResource[] resources = mooseFolder.members();
					// Check the resources and retrieve the .yaml files
					for (IResource resource : resources) {
						if (resource.getType() == IResource.FILE
								&& resource.getProjectRelativePath()
										.lastSegment().contains(".yaml")) {
							String[] splitName = resource.getName()
									.split("\\.");
							// Only add the app name, not the file extension
							mooseApps.add(splitName[0]);
						}
					}
				} catch (CoreException e) {
					// Complain
					e.printStackTrace();
				}
			}
		}

		// Only load up the Entry if some MOOSE apps were discovered.
		if (!mooseApps.isEmpty()) {
			// Set the default as null, which will default to "Select MOOSE app"
			// from the Entry's list of allowed values when Entry.getValue() is
			// called. This is done intentionally to force the user to select an
			// app when importing an Item
			loadedApp = null;
			// Create the MOOSE application Entry. Add all of the files if any
			// were
			// found.
			mooseAppEntry = new Entry() {
				protected void setup() {
					allowedValues = mooseApps;
					allowedValueType = AllowedValueType.Discrete;
					defaultValue = loadedApp;
				}
			};
		} else {
			mooseAppEntry = new Entry() {
				protected void setup() {
					defaultValue = "No MOOSE apps were found.";
				}
			};
		}
		mooseAppEntry.setId(1);
		mooseAppEntry.setName("MOOSE-Based Application");
		mooseAppEntry.setDescription("The name of the MOOSE-based application "
				+ "for which you would like to create an input file.");
		// Add it to the DataComponent
		fileDataComponent.addEntry(mooseAppEntry);

		// Create the output file Entry
		Entry outputFileEntry = new Entry() {
			protected void setup() {
				defaultValue = "mooseModel.i";
			}
		};
		outputFileEntry.setId(2);
		outputFileEntry.setName("Output File Name");
		outputFileEntry.setDescription("The file name of the output file, "
				+ "including extension.");
		// Add it to the DataComponent
		fileDataComponent.addEntry(outputFileEntry);

		// Create the TreeComposite
		TreeComposite mooseDataTree = new TreeComposite();
		mooseDataTree.setId(mooseTreeCompositeId);
		mooseDataTree
				.setDescription("The tree of input data for this problem.");
		mooseDataTree.setName("Input Data");
		form.addComponent(mooseDataTree);

		return;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * This operation is used to setup the name and description of the model.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void setupItemInfo() {
		// begin-user-code

		// Local Declarations
		String desc = "This item builds models for "
				+ "MOOSE-based applications for "
				+ "nuclear energy modeling and simulation.";

		// Describe the Item
		setName("MOOSE Model Builder");
		setDescription(desc);
		itemType = ItemType.Model;

		// Setup the action list. Remove key-value pair support.
		allowedActions.remove(taggedExportActionString);
		// Add MOOSE GetPot export action
		allowedActions.add(mooseProcessActionString);

		return;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * This operation loads the contents of the TreeComposite from the MOOSE
	 * data. It is called when a MOOSE-based application has been accepted and
	 * the entries are reviewed. It will only load the Form if the project space
	 * exists - so that it can find the files - and if the Form has been
	 * previously configured. It compares the executable name passed to this
	 * function with the files in the project directory and looks for a match
	 * with the name "executuableName.yaml" that it can load. It throws an
	 * IOException if it cannot find a match.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @param mooseExecutableName
	 *            <p>
	 *            The name of the MOOSE executable whose YAML input
	 *            specification should be loaded into the Form's TreeComposite.
	 *            </p>
	 * @throws IOException
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected void loadTreeContents(String mooseExecutableName)
			throws IOException {
		// begin-user-code

		// Local Declarations
		ArrayList<TreeComposite> mooseBlocks;
		TreeComposite mooseParentTree = (TreeComposite) form
				.getComponent(mooseTreeCompositeId), tmpParentTree;

		// Load the file from the project space if possible
		if (project != null && project.isAccessible()) {

			// Get the MOOSE folder
			IFolder mooseFolder = project.getFolder("MOOSE");

			// Assume the folder always exists for now. Later, add some code to
			// create it and add the data files from the internal store,
			// searching it again for the file.

			// Get the file
			IFile modelFile = mooseFolder
					.getFile(mooseExecutableName + ".yaml");
			// Load the tree if the file exists
			if (modelFile.exists()) {
				// Create the temporary
				tmpParentTree = new TreeComposite();
				tmpParentTree.setId(mooseTreeCompositeId);
				tmpParentTree
						.setDescription("The tree of input data for this problem.");
				tmpParentTree.setName("Input Data");
				// Load the file handler
				handler = new MOOSEFileHandler();
				// And the file
				mooseBlocks = handler.loadYAML(modelFile.getLocation()
						.toOSString());
				// Add the blocks to the parent tree composite
				for (TreeComposite block : mooseBlocks) {
					tmpParentTree.setNextChild(block);
				}
				// Copy the temporary into the parent. This is the cleanest way
				// to clear out the parent completely.
				mooseParentTree.copy(tmpParentTree);
			} else {
				// Complain
				throw new IOException("MOOSEModel Exception: Executable file, "
						+ mooseExecutableName + ".yaml" + ", not available!");
			}
		} else {
			// Complain
			throw new IOException(
					"MOOSEModel Exception: Project space not available!");
		}
		return;
		// end-user-code
	}

	/**
	 * <!-- begin-UML-doc -->
	 * <p>
	 * This operation reviews the Entries in the MOOSEModel to determine
	 * primarily if the underlying MOOSE-app file has changed and load it.
	 * </p>
	 * <!-- end-UML-doc -->
	 * 
	 * @param preparedForm
	 *            The form prepared for review.
	 * @return The Form's status if the review was successful or not.
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	protected FormStatus reviewEntries(Form preparedForm) {
		// begin-user-code

		// Local Declarations
		FormStatus retStatus = FormStatus.InfoError;
		DataComponent mooseFileComponent;
		String oldLoadedApp = loadedApp;

		// Get the MOOSE file information, if available
		mooseFileComponent = (DataComponent) preparedForm.getComponent(1);
		if (mooseFileComponent != null) {
			Entry mooseSpecFileEntry = mooseFileComponent
					.retrieveEntry("MOOSE-Based Application");
			// Load the MOOSE-based application if it is different than the one
			// currently loaded.
			if (mooseSpecFileEntry != null) {
				if (loadedApp == null || // True with new MOOSE Model Builder
						!loadedApp.equals(mooseSpecFileEntry.getValue())) {
					// Get the app name
					loadedApp = mooseSpecFileEntry.getValue();

					// If it's the dummy default text, do nothing and stop here
					if ("Select MOOSE app".equals(loadedApp)) {
						return FormStatus.ReadyToProcess;
					}

					// Grab a clone of the old form's TreeComposite with data
					// imported into it
					TreeComposite inputTree = (TreeComposite) preparedForm
							.getComponent(mooseTreeCompositeId).clone();

					// Re-load the Form's tree based on the YAML spec
					try {
						loadTreeContents(loadedApp);
					} catch (IOException e) {
						e.printStackTrace();
					}

					// Get the empty YAML TreeComposite
					TreeComposite yamlTree = (TreeComposite) form
							.getComponent(mooseTreeCompositeId);

					// Merge the input tree into the YAML spec
					mergeTrees(inputTree, yamlTree, oldLoadedApp);

				}
				// Update the status
				retStatus = FormStatus.ReadyToProcess;
			}
		}

		return retStatus;
		// end-user-code
	}

	/**
	 * This method is responsible for merging the TreeComposite of imported
	 * MOOSE data from an input file, with the corresponding YAML spec for that
	 * MOOSE application.
	 * 
	 * We will construct three HashMaps: one for the YAML tree, one for the
	 * input tree, and one for the exemplar children of the YAML tree. All Maps
	 * will be keyed on a tree's pathname relative to the root. (For the sake
	 * semantics here, any reference to "top-level" trees is referring to the
	 * trees directly beneath the root.)
	 * 
	 * Then, we will traverse the input map (this includes all children,
	 * subchildren, etc.) and copy over any applicable exemplar children from
	 * the exemplar map. Once all exemplar children are set in the input tree,
	 * then we will copy over the top-level trees (trees right below the root)
	 * from the input map into the YAML map.
	 * 
	 * @param inputTree
	 *            The TreeComposite of imported MOOSE file data.
	 * @param yamlTree
	 *            The TreeComposite loaded from the MOOSE YAML spec.
	 * @param oldLoadedApp
	 *            The name of the previously loaded app, or null if there was
	 *            none.
	 */
	private void mergeTrees(TreeComposite inputTree, TreeComposite yamlTree,
			String oldLoadedApp) {

		// Local declarations
		TreeComposite child = null;

		// Store the input tree's top-level children in an ArrayList
		// for reference
		topLevelInputTrees = new ArrayList<TreeComposite>();
		inputTree.resetChildIterator();
		while ((child = inputTree.getNextChild()) != null) {
			topLevelInputTrees.add(child);
		}

		// Store the YAML tree's top-level children in an ArrayList
		// for reference
		topLevelYamlTrees = new ArrayList<TreeComposite>();
		yamlTree.resetChildIterator();
		while ((child = yamlTree.getNextChild()) != null) {
			topLevelYamlTrees.add(child);
		}

		// First, we'll begin by creating a HashMap of the YAML tree
		HashMap<String, TreeComposite> yamlMap = 
				(HashMap<String, TreeComposite>) buildYamlMap(yamlTree);

		// Then, create a HashMap of all the input trees
		HashMap<String, TreeComposite> inputMap = 
				(HashMap<String, TreeComposite>) buildInputMap(inputTree);

		// Lastly, now create a HashMap of the exemplar children
		// defined in the YAML spec tree
		HashMap<String, TreeComposite> exemplarMap = 
				(HashMap<String, TreeComposite>) buildExemplarMap(yamlTree);

		// Now we loop over the input map, and look for matches in
		// the exemplar map, so that all children, subchildren, etc.
		// will have their child exemplars set correctly
		setChildExemplars(inputMap, exemplarMap);

		// Now walk through the input tree again, this time
		// copying over the nodes from the input tree into the YAML
		// tree
		mergeInputIntoYaml(inputMap, yamlMap, yamlTree, oldLoadedApp);

		// Lastly, set the blank child exemplar on the tree root so
		// that the user can add custom blocks at the top level of
		// the tree
		TreeComposite formTree = (TreeComposite) form
				.getComponent(mooseTreeCompositeId);
		addBlankChildExemplar(formTree);
		
		return;
	}

	/**
	 * This utility method is is responsible for tracking the YAML spec of the
	 * previously loaded MOOSE app, for cross-reference purposes. This method is
	 * similar to the {@link #loadTreeContents(String)
	 * MOOSEModel.loadTreeConents(...)} method, but instead returns the loaded
	 * TreeComposite, instead of setting it on the Form. Returns null if the
	 * YAML spec could not be loaded.
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param oldExecutableName
	 *            The name of the old YAML spec to be loaded.
	 * @return A TreeComposite structure loaded from the specified YAML file.
	 * @throws IOException
	 */
	private TreeComposite loadOldTreeContents(String oldExecutableName)
			throws IOException {
		// begin-user-code

		// Local Declarations
		ArrayList<TreeComposite> mooseBlocks;
		TreeComposite oldYamlTree = null;

		// Load the file from the project space if possible
		if (project != null && project.isAccessible()) {

			// Get the MOOSE folder
			IFolder mooseFolder = project.getFolder("MOOSE");

			// Assume the folder always exists for now. Later, add some code to
			// create it and add the data files from the internal store,
			// searching it again for the file.

			// Get the file
			IFile modelFile = mooseFolder.getFile(oldExecutableName + ".yaml");
			// Load the tree if the file exists
			if (modelFile.exists()) {
				// Load the file handler
				handler = new MOOSEFileHandler();
				// And the file
				mooseBlocks = handler.loadYAML(modelFile.getLocation()
						.toOSString());
				// Add the blocks to the parent tree composite
				oldYamlTree = new TreeComposite();
				for (TreeComposite block : mooseBlocks) {
					oldYamlTree.setNextChild(block);
				}

			} else {
				// Complain
				throw new IOException("MOOSEModel Exception: Executable file, "
						+ oldExecutableName + ".yaml" + ", not available!");
			}
		} else {
			// Complain
			throw new IOException(
					"MOOSEModel Exception: Project space not available!");
		}
		return oldYamlTree;
		// end-user-code
	}

	/**
	 * This operation is responsible for loading a MOOSE input file into the
	 * Form's TreeComposite (id=2). It expects the input to be in the MOOSE's
	 * GetPot format.
	 * 
	 * @param input
	 *            The name of the input input file, including the file extension
	 *            (ex. "bison.i", "raven.i", etc.)
	 */
	@Override
	public void loadInput(String input) {

		// Local Declarations
		IFile inputFile = project.getFile(input);

		// Setup a new Tree in which we'll construct, and then eventually use
		// to replace the Form's TreeComposite
		TreeComposite newMooseTree = new TreeComposite();
		newMooseTree.setId(mooseTreeCompositeId);
		newMooseTree.setDescription("The tree of input data for this problem.");
		newMooseTree.setName("Input Data");
		// Note: we can't simply use the original tree as copying data into it
		// won't retain sibling references. Sibling references need to be set
		// properly for the purpose of traversing the tree efficiently (and the
		// only way to set siblings is using TreeComposite.setNextChild()).

		// Load the input file and construct a TreeComposite Component
		ArrayList<TreeComposite> blockTrees = handler.loadFromGetPot(inputFile
				.getLocation().toOSString());

		for (TreeComposite block : blockTrees) {
			// Clone the block
			TreeComposite blockClone = (TreeComposite) block.clone();
			// Set the parent and sibling references correctly
			blockClone.setActive(true);
			blockClone.setParent(newMooseTree);
			newMooseTree.setNextChild(blockClone);
		}

		// Now walk through the tree, setting all child dataNodes as active
		setActiveDataNodes(newMooseTree);

		// Set the new MOOSE TreeComposite as the Form's
		form.removeComponent(2);
		form.addComponent(newMooseTree);

		return;
	}

	/**
	 * This utility method is responsible for taking in a TreeComposite loaded
	 * from a MOOSE YAML spec, and constructs a Map of all its nodes, keyed on a
	 * String pathname (relative to the root).
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param yamlTree
	 *            The TreeComposite loaded from a MOOSE YAML spec.
	 * @return A Map containing all the YAML tree's nodes, keyed on pathname.
	 */
	private Map<String, TreeComposite> buildYamlMap(TreeComposite yamlTree) {

		// Local declarations
		HashMap<String, TreeComposite> yamlMap = new HashMap<String, TreeComposite>();

		// Create an empty stack for TreeComposites
		Stack<TreeComposite> treeStack = new Stack<TreeComposite>();
		treeStack.push(null);

		// Push the top level TreeComposites from the YAML spec
		// first on top
		for (TreeComposite topLevelTree : topLevelYamlTrees) {
			treeStack.push(topLevelTree);
		}

		// Pop one of the top-level trees off to start.
		TreeComposite tree = treeStack.pop();

		while (tree != null) {
			// Put the tree in the Map, keyed on path name
			yamlMap.put(tree.getName(), tree);
			// Pop the next tree off the stack
			tree = treeStack.pop();
		}

		return yamlMap;
	}

	/**
	 * This utility method is responsible for taking a TreeComposite loaded from
	 * a MOOSE input file, and constructs a Map of all its nodes keyed on a
	 * String pathname (relative to the root).
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param inputTree
	 *            The TreeComposite loaded from an input MOOSE file.
	 * @return A Map containing all the nodes of the input tree, keyed on
	 *         pathname.
	 */
	private Map<String, TreeComposite> buildInputMap(TreeComposite inputTree) {

		// Local declarations
		Map<String, TreeComposite> inputMap = new HashMap<String, TreeComposite>();
		ArrayList<TreeComposite> children = new ArrayList<TreeComposite>();
		TreeComposite tree = null;
		String treeName = "";
		int prevNameIndex = -1;

		// Create an empty stack for TreeComposites
		Stack<TreeComposite> treeStack = new Stack<TreeComposite>();
		treeStack.push(null);

		// Push the top level TreeComposites from the input file
		// first on top
		for (TreeComposite topLevelTree : topLevelInputTrees) {
			treeStack.push(topLevelTree);
		}

		// Pop one of the top-level trees off to start.
		tree = treeStack.pop();

		while (tree != null) {

			// Append to the tree name
			treeName += "/" + tree.getName();
			// Put the tree in the Map, keyed on path name
			inputMap.put(
					(treeName.startsWith("/") ? treeName.substring(1,
							treeName.length()) : treeName), tree);

			// Clear the children list in case there are any
			// from a previous tree
			children.clear();

			// Check if this tree has children
			if (tree.getNumberOfChildren() > 0) {

				// Construct the list of this node's children
				for (int i = 0; i < tree.getNumberOfChildren(); i++) {
					children.add(tree.getChildAtIndex(i));
				}

				// Push children to the top of the tree stack
				for (int i = (children.size() - 1); i >= 0; i--) {
					treeStack.push(children.get(i));
				}
			}

			// If the next tree in the stack is a top-level tree,
			// clear the path name
			if (topLevelInputTrees.contains(treeStack.peek())) {
				treeName = "";
			}

			// Otherwise, if the current tree didn't have children
			// to push onto the stack, remove the last "part" of the
			// path name, as we'll be going back up one level
			else if (children.isEmpty()) {
				prevNameIndex = treeName.indexOf("/" + tree.getName());
				treeName = treeName.substring(0, prevNameIndex);
			}

			// Pop the next tree off the stack
			tree = treeStack.pop();
		}

		return inputMap;
	}

	/**
	 * This utility method is responsible for taking in a TreeComposite loaded
	 * from a MOOSE YAML spec, and constructs a Map of all child exemplars
	 * contained in the tree keyed on a String pathname (relative to the root).
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param yamlTree
	 *            The TreeComposite loaded from a YAML spec.
	 * @return A Map containing all the child exemplars of the YAML tree, keyed
	 *         on pathname.
	 */
	private Map<String, TreeComposite> buildExemplarMap(TreeComposite yamlTree) {

		// Local declarations
		ArrayList<TreeComposite> childExemplars;
		HashMap<String, TreeComposite> exemplarMap = new HashMap<String, TreeComposite>();
		TreeComposite tree = null;
		String treeName = "";
		int prevNameIndex = -1;

		// Create an empty stack for TreeComposites
		Stack<TreeComposite> treeStack = new Stack<TreeComposite>();
		treeStack.push(null);

		// Push the top level TreeComposites from the YAML ArrayList
		// first on top
		for (TreeComposite topLevelYamlTree : topLevelYamlTrees) {
			treeStack.push(topLevelYamlTree);
		}

		// Pop one of the top-level trees off to start.
		tree = treeStack.pop();
		while (tree != null) {

			// Append to the tree name
			treeName += "/" + tree.getName();
			// Put the tree in the Map, keyed on path name
			exemplarMap.put(
					(treeName.startsWith("/") ? treeName.substring(1,
							treeName.length()) : treeName), tree);

			// Push child exemplars to the top of the tree stack
			childExemplars = tree.getChildExemplars();
			for (int i = (childExemplars.size() - 1); i >= 0; i--) {
				treeStack.push(childExemplars.get(i));
			}

			// While we're here, append a blank exemplar to the tree (so the
			// user can create custom blocks)
			addBlankChildExemplar(tree);

			// If the next tree in the stack is a top-level tree,
			// clear the path name
			if (topLevelYamlTrees.contains(treeStack.peek())) {
				treeName = "";
			}

			// Otherwise, if the current tree didn't have child
			// exemplars to push onto the stack, remove the last
			// "part" of the path name, as we'll be going back up
			// one level
			else if (childExemplars.isEmpty()) {
				prevNameIndex = treeName.indexOf("/" + tree.getName());
				treeName = treeName.substring(0, prevNameIndex);
			}

			// Pop the next tree off the stack
			tree = treeStack.pop();
		}

		return exemplarMap;
	}

	/**
	 * This method is responsible for append a "blank" TreeComposite to the
	 * input tree's list of child exemplars. This enables a MOOSE user to add
	 * their own, customized blocks.
	 * 
	 * @param tree
	 *            The tree to which a blank child exemplar will be appended.
	 */
	private void addBlankChildExemplar(TreeComposite tree) {

		// Create a blank child exemplar
		TreeComposite blankTree = new TreeComposite();
		blankTree.setName("BlankBlock");
		blankTree
				.setDescription("A customizable block a MOOSE user can create.");
		DataComponent dataNode = new DataComponent();
		blankTree.setActiveDataNode(dataNode);
		blankTree.setActive(true);

		// Add it to the tree
		tree.addChildExemplar(blankTree);

		return;
	}

	/**
	 * This method is responsible for iterating through a HashMap of MOOSE input
	 * data, comparing it to a HashMap of child exemplars, and setting the child
	 * exemplars on input data where appropriate.
	 * 
	 * This method is "smart" enough to also correctly assigned child exemplars
	 * to "wildchar" trees (ie. trees found in the YAML spec as something like
	 * 'Variables/*' but given custom names by the user, like
	 * 'Variables/disp_x').
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param inputMap
	 *            The HashMap of TreeComposites constructed from an imported
	 *            MOOSE input file, and keyed on pathname.
	 * @param exemplarMap
	 *            The HashMap of TreeComposites constructed from the child
	 *            exemplars of a loaded MOOSE YAML spec, and keyed on pathname.
	 */
	private void setChildExemplars(HashMap<String, TreeComposite> inputMap,
			HashMap<String, TreeComposite> exemplarMap) {

		// Local declarations
		TreeComposite inputCur = null;
		int prevNameIndex = -1;
		String parentKey = "";
		DataComponent activeNode;
		TreeType treeType;

		// Iterate through the input map keys
		Set<String> inputKeys = inputMap.keySet();
		for (String key : inputKeys) {

			// Get the tree from the input map
			inputCur = inputMap.get(key);

			// Proceed only if this isn't a top-level tree
			if (!topLevelInputTrees.contains(inputCur)) {

				// Reset our counter, flag, etc.
				int generationsUp = 0;
				boolean foundExemplarMatch = false;

				// Set the active data node
				activeNode = (DataComponent) inputCur.getDataNodes().get(0);
				inputCur.setActiveDataNode(activeNode);

				// Figure out the parent tree's key
				prevNameIndex = key.indexOf("/" + inputCur.getName());
				parentKey = key.substring(0, prevNameIndex);

				// First, using the exemplar map, see if this tree
				// is an exact match to an exemplar child of
				// something
				if (exemplarMap.containsKey(key)) {
					// Simply copy the exemplar children
					inputCur.setChildExemplars(exemplarMap.get(key)
							.getChildExemplars());
					// Lastly, check if this is an
					// AdaptiveTreeComposite and if it is, set the
					// type
					treeType = TreeType.fromString(inputCur.getClass()
							.toString());
					if (treeType != null
							&& treeType == TreeType.AdaptiveTreeComposite) {
						setAdaptiveType((AdaptiveTreeComposite) inputCur);
					}
				}

				// If it's not an exact exemplar match, see if the
				// parent has an exemplar just named "*" (meaning
				// the tree can have a custom name)
				else if (exemplarMap.containsKey(parentKey + "/*")) {
					// Copy the wildchar's exemplar children
					inputCur.setChildExemplars(exemplarMap
							.get(parentKey + "/*").getChildExemplars());
				}
				// Otherwise, things are going to start getting
				// funky now (cue disco ball...). This means that
				// the parent of this tree might also be a custom-
				// named wildchar tree (ie. Block/SubBlock/*/*)
				else {
					// Begin traversing up the tree, looking at the
					// parent's parents until you find an exact
					// match in the exemplar tree (something that
					// isn't a wildchar)
					while (!foundExemplarMatch) {

						// Get the parent's parent's name
						prevNameIndex = parentKey.lastIndexOf("/");
						// Can't go any higher than the root node, so exit. This
						// happens when the input TreeComposite has blocks not
						// defined in the YAML spec.
						if (prevNameIndex == -1) {
							break;
						}
						parentKey = key.substring(0, prevNameIndex);

						// Increase our counter to indicate we've
						// moved on generation up
						generationsUp++;

						// Look for it in the exemplar map
						if (exemplarMap.containsKey(parentKey)) {
							foundExemplarMatch = true;
						}
					}
					// If a match was found, set the exemplars
					if (foundExemplarMatch) {
						// Construct the correct wildchar path
						// to this tree's parent
						String wildcharPath = parentKey;
						for (int i = 0; i < generationsUp; i++) {
							wildcharPath += "/*";
						}
						// Make sure it exists in the exemplar map
						if (exemplarMap.containsKey(wildcharPath)) {
							// Get the parent's exemplar list and
							// set it as
							// this tree's
							inputCur.setChildExemplars(exemplarMap.get(
									wildcharPath).getChildExemplars());
						}
					}
				}
			}
		}
	}

	/**
	 * This utility method is responsible for merging the contents of a HashMap
	 * of an imported MOOSE input data TreeComposite, into a HashMap of a YAML
	 * TreeComposite, where both keys match.
	 * 
	 * In the event that there is no key match for a top-level node, the
	 * previous MOOSE app's YAML TreeComposite is loaded (if there was one), for
	 * comparison. If the "unmatched" TreeComposite is not a relic from the
	 * previously loaded app, then it will be treated as a "custom" tree not
	 * found in the YAML spec (but still probably necessary for execution) and
	 * appended to the end of the YAML TreeComposite.
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param inputMap
	 *            The HashMap of the imported MOOSE data TreeComposite.
	 * @param yamlMap
	 * @param oldLoadedApp
	 */
	private void mergeInputIntoYaml(HashMap<String, TreeComposite> inputMap,
			HashMap<String, TreeComposite> yamlMap, TreeComposite yamlTree,
			String oldLoadedApp) {

		// Local declarations
		TreeComposite inputCur = null, yamlCur = null;
		DataComponent activeNode = null;
		TreeType treeType;
		String key;

		// Iterate through the the top-level trees of the input map
		for (TreeComposite tree : topLevelInputTrees) {

			// Get the key and corresponding tree
			key = tree.getName();
			inputCur = inputMap.get(key);

			// Try to find the key in the new YAML map
			if (yamlMap.containsKey(key)) {
				// Get the matching YAML version
				yamlCur = yamlMap.get(key);
				// Set the exemplar children of the input tree
				inputCur.setChildExemplars(yamlCur.getChildExemplars());
				// Now copy the input tree into the YAML tree (set the "copy in
				// place" flag to true so parent and sibling references are
				// retained)
				yamlCur.copy(inputCur, true);
				// Set the active data node
				activeNode = (DataComponent) yamlCur.getDataNodes().get(0);
				yamlCur.setActiveDataNode(activeNode);

				// Lastly, check if this is an AdaptiveTreeComposite
				// and if it is, set the type
				treeType = TreeType.fromString(yamlCur.getClass().toString());
				if (treeType != null
						&& treeType == TreeType.AdaptiveTreeComposite) {
					setAdaptiveType((AdaptiveTreeComposite) yamlCur);
				}
			}
			// If there's no exact match found in the YAML map, try appending it
			// to the YAML tree anyways (if it's unique)
			else if (topLevelInputTrees.contains(inputCur)) {

				// Check if there was a previously loaded MOOSE app by getting
				// its YAML spec in a HashMap
				HashMap<String, TreeComposite> oldYamlMap = (HashMap<String, TreeComposite>) buildOldYamlMap(oldLoadedApp);

				// Check if a map was successfully created
				if (oldYamlMap != null && !oldYamlMap.isEmpty()) {
					// If there's NO match in the old YAML spec, then inputCur
					// must be a unique/custom block (and isn't just leftover
					// from the last tree), so we can add it
					if (!oldYamlMap.containsKey(inputCur.getName())) {
						yamlTree.setNextChild(inputCur);
					}
				}
				// If there was no previously loaded app, then we can certainly
				// append the current node
				else if (oldYamlMap == null) {
					yamlTree.setNextChild(inputCur);
				}
			}
		}

		return;
	}

	/**
	 * This utility method is responsible for checking if another MOOSE app was
	 * previously loaded, and if so, load the YAML spec into a Map (keyed on
	 * node pathnames).
	 * 
	 * Used exclusively by {@link #mergeInputIntoYaml(HashMap, HashMap, String)
	 * MOOSEModel.mergeInputIntoYaml(...)}
	 * 
	 * @param oldLoadedApp
	 *            Name of the last loaded MOOSE app, or null if there was none.
	 * @return The Map of the previously-loaded YAML TreeComposite (keyed on
	 *         name), or null if no app was previously loaded.
	 */
	private Map<String, TreeComposite> buildOldYamlMap(String oldLoadedApp) {

		// Local declarations
		HashMap<String, TreeComposite> oldYamlMap = null;

		// Check if there was a previously loaded app
		if (oldLoadedApp != null) {

			// Try to load the old YAML spec
			TreeComposite oldYamlTree = null;
			try {
				oldYamlTree = loadOldTreeContents(oldLoadedApp);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Build a HashMap of the old YAML tree's top-level nodes, keyed on
			// the node name
			oldYamlMap = new HashMap<String, TreeComposite>();
			TreeComposite child = null;
			while ((child = oldYamlTree.getNextChild()) != null) {
				oldYamlMap.put(child.getName(), child);
			}

		}

		return oldYamlMap;
	}

	/**
	 * This method will take in a TreeComposite, traverse through all levels of
	 * child, subchild, etc. TreeComposites, and set the active data nodes on
	 * all that have activeDataNode=null. This method requires that all parent,
	 * sibling and child references be set correctly on all TreeComposites to be
	 * successful.
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param tree
	 *            The tree that will have all active data nodes set.
	 */
	private void setActiveDataNodes(TreeComposite tree) {

		// Perform a pre-order traversal of the tree. For each TreeComposite, we
		// should set an active data node if none is already set.

		// Create an empty stack. Put in a null value so we do not hit an
		// EmptyStackException and so we can use a null check in the while loop.
		Stack<TreeComposite> treeStack = new Stack<TreeComposite>();
		treeStack.push(null);
		while (tree != null) {

			// Operate on the next TreeComposite. This sets its active data node
			// if a data node exists and is not already set.
			ArrayList<Component> dataNodes = tree.getDataNodes();
			if (tree.getActiveDataNode() == null && !dataNodes.isEmpty()) {
				tree.setActiveDataNode(dataNodes.get(0));
			}

			// Add all of the current tree's children to the stack in reverse.
			for (int i = tree.getNumberOfChildren() - 1; i >= 0; i--) {
				treeStack.push(tree.getChildAtIndex(i));
			}

			// Get the next TreeComposite in the Stack.
			tree = treeStack.pop();
		}

		return;
	}

	/**
	 * This utility method is responsible for taking in an
	 * AdaptiveTreeComposite, checks the "type" Entry (found in the tree's
	 * DataNode), and setting the AdaptiveTreeComposite.type to be that (if such
	 * a type exists in its typesMap).
	 * 
	 * Used exclusively by {@link #reviewEntries(Form)
	 * MOOSEModel.reviewEntries(...)}.
	 * 
	 * @param tree
	 *            The AdaptiveTreeComposite to set the type of.
	 */
	private void setAdaptiveType(AdaptiveTreeComposite tree) {

		// Local declarations
		DataComponent dataNode;
		ArrayList<Entry> parameters;
		String typeName = "";

		// Get the parameters of the tree
		dataNode = (DataComponent) tree.getDataNodes().get(0);
		parameters = dataNode.retrieveAllEntries();

		// Look for the "type" parameter
		for (Entry currEntry : parameters) {
			if ("type".equals(currEntry.getName())) {
				typeName = currEntry.getValue();
				break;
			}
		}

		// If the type is valid, set it
		if (!typeName.equals(null) && !("").equals(typeName)
				&& !tree.setType(typeName)) {
			System.out.println("MOOSEModel Message: Could not set type: \""
					+ typeName + "\" of AdaptiveTreeComposite "
					+ tree.getName());
		}
		// The active data node will have be re-set as the data nodes
		// list changes upon setting the type
		tree.setActiveDataNode(tree.getDataNodes().get(0));

		return;
	}

	/**
	 * Enumeration to discern if a tree object is an AdaptiveTreeComposite, or
	 * just a TreeComposite. This is an alternative to using instanceof.
	 * 
	 * @author w5q
	 */
	public enum TreeType {

		// The Strings returned by getClass().toString()
		AdaptiveTreeComposite(
				"class org.eclipse.ice.datastructures.form.AdaptiveTreeComposite"), TreeComposite(
				"class org.eclipse.ice.datastructures.form.TreeComposite");

		private final String type;

		/**
		 * Constructor.
		 */
		private TreeType(String toClassString) {
			this.type = toClassString;
			return;
		}

		/**
		 * This method performs a lookup to return a tree type based on an input
		 * string, assumed to be equal to getClass().toString().
		 * 
		 * @param className
		 *            The String returned by getClass().toString()
		 * @return The type associated to the className parameter, or null if
		 *         none matches.
		 */
		public static TreeType fromString(String className) {

			// Default to null
			TreeType type = null;

			// Try to find a match to the className string
			if (AdaptiveTreeComposite.type.equals(className)) {
				type = AdaptiveTreeComposite;
			} else if (TreeComposite.type.equals(className)) {
				type = TreeComposite;
			}

			return type;
		}
	};
}