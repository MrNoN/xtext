/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtend2.ui.contentassist;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.util.ITextRegion;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class ImportOrganizingProposal extends ConfigurableCompletionProposal {

	protected ITextRegion importRegion;

	protected String organizedImportSection;

	protected ContentProposalAppendable appendable;

	public ImportOrganizingProposal(ContentProposalAppendable appendable, int replacementOffset, int replacementLength,
			int cursorPosition, Image image, StyledString displayString) {
		super(appendable.toString(), replacementOffset, replacementLength, cursorPosition, image, displayString, null, null);
		this.appendable = appendable;
	}

	@Override
	public void apply(IDocument document) {
		try {
			super.apply(document);
			appendable.insertNewImports();
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

}