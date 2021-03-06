package org.eclipse.xtend.ide.outline;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.actions.SortOutlineContribution;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.ui.editor.outline.impl.EStructuralFeatureNode;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class XtendOutlineNodeComparator extends SortOutlineContribution.DefaultComparator {
	@Override
	public int getCategory(IOutlineNode node) {
		if(node instanceof XtendFeatureNode) 
			return internalGetCategory(node) + 100 * ((XtendFeatureNode)node).getInheritanceDepth();
		else
			return internalGetCategory(node);
	}
	
	protected int internalGetCategory(IOutlineNode node) {
		if (node instanceof EStructuralFeatureNode) {
			EStructuralFeature feature = ((EStructuralFeatureNode) node).getEStructuralFeature();
			if (feature == XtendPackage.Literals.XTEND_FILE__PACKAGE)
				return 0;
			else
				return 10;
		}
		boolean isStatic = node instanceof XtendFeatureNode && ((XtendFeatureNode) node).isStatic();
		if (node instanceof EObjectNode) {
			EClass eClass = ((EObjectNode) node).getEClass();
			if (eClass == XtendPackage.Literals.XTEND_CLASS)
				return 20;
			if (eClass == XtendPackage.Literals.XTEND_FIELD || eClass == TypesPackage.Literals.JVM_FIELD) 
				return isStatic ? 30 : 50;
			if (eClass == XtendPackage.Literals.XTEND_CONSTRUCTOR || eClass == TypesPackage.Literals.JVM_CONSTRUCTOR)
				return 60;
			if (eClass == XtendPackage.Literals.XTEND_FUNCTION || eClass == TypesPackage.Literals.JVM_OPERATION) {
				if(isStatic) 
					return 40; 
				else 
					return (node instanceof XtendFeatureNode && ((XtendFeatureNode) node).isDispatch()) ? 70 : 80;
			}
		}
		return Integer.MAX_VALUE;
	}

}
