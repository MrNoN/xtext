package org.eclipse.xtext.xbase.tests.linking;

import com.google.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.junit.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.tests.AbstractXbaseTestCase;

@SuppressWarnings("all")
public class JvmModelBasedLinkingTest extends AbstractXbaseTestCase {
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder0;
  
  @Inject
  private TypeReferences refs;
  
  @Inject
  private ValidationTestHelper _validationTestHelper2;
  
  public void testLinkToParameter() throws Exception {
    {
      XExpression _expression = this.expression("x", false);
      final XExpression expr = _expression;
      Resource _eResource = expr.eResource();
      final Resource resource = _eResource;
      resource.eSetDeliver(false);
      EList<EObject> _contents = resource.getContents();
      final Function1<JvmGenericType,Void> _function = new Function1<JvmGenericType,Void>() {
          public Void apply(final JvmGenericType it) {
            Void _xblockexpression = null;
            {
              EList<JvmMember> _members = it.getMembers();
              JvmTypeReference _stringType = JvmModelBasedLinkingTest.this.stringType(expr);
              final Function1<JvmOperation,Void> _function_1 = new Function1<JvmOperation,Void>() {
                  public Void apply(final JvmOperation it_1) {
                    Void _xblockexpression_1 = null;
                    {
                      EList<JvmFormalParameter> _parameters = it_1.getParameters();
                      JvmTypeReference _stringType_1 = JvmModelBasedLinkingTest.this.stringType(expr);
                      JvmFormalParameter _parameter = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toParameter(expr, "x", _stringType_1);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      JvmModelBasedLinkingTest.this._jvmTypesBuilder0.associate(expr, it_1);
                      _xblockexpression_1 = (null);
                    }
                    return _xblockexpression_1;
                  }
                };
              JvmOperation _method = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toMethod(expr, "doStuff", _stringType, _function_1);
              CollectionExtensions.<JvmMember>operator_add(_members, _method);
              _xblockexpression = (null);
            }
            return _xblockexpression;
          }
        };
      JvmGenericType _clazz = this._jvmTypesBuilder0.toClazz(expr, "Foo", _function);
      CollectionExtensions.<EObject>operator_add(_contents, _clazz);
      this._validationTestHelper2.assertNoErrors(expr);
    }
  }
  
  public void testLinkToParameter_1() throws Exception {
    {
      XExpression _expression = this.expression("x", false);
      final XFeatureCall expr = ((XFeatureCall) _expression);
      Resource _eResource = expr.eResource();
      final Resource resource = _eResource;
      resource.eSetDeliver(false);
      EList<EObject> _contents = resource.getContents();
      final Function1<JvmGenericType,Void> _function = new Function1<JvmGenericType,Void>() {
          public Void apply(final JvmGenericType it) {
            Void _xblockexpression = null;
            {
              EList<JvmMember> _members = it.getMembers();
              JvmTypeReference _stringType = JvmModelBasedLinkingTest.this.stringType(expr);
              JvmField _field = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toField(expr, "x", _stringType);
              CollectionExtensions.<JvmMember>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              JvmTypeReference _stringType_1 = JvmModelBasedLinkingTest.this.stringType(expr);
              final Function1<JvmOperation,Void> _function_1 = new Function1<JvmOperation,Void>() {
                  public Void apply(final JvmOperation it_1) {
                    Void _xblockexpression_1 = null;
                    {
                      EList<JvmFormalParameter> _parameters = it_1.getParameters();
                      JvmTypeReference _stringType_2 = JvmModelBasedLinkingTest.this.stringType(expr);
                      JvmFormalParameter _parameter = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toParameter(expr, "x", _stringType_2);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      JvmModelBasedLinkingTest.this._jvmTypesBuilder0.associate(expr, it_1);
                      _xblockexpression_1 = (null);
                    }
                    return _xblockexpression_1;
                  }
                };
              JvmOperation _method = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toMethod(expr, "doStuff", _stringType_1, _function_1);
              CollectionExtensions.<JvmMember>operator_add(_members_1, _method);
              _xblockexpression = (null);
            }
            return _xblockexpression;
          }
        };
      JvmGenericType _clazz = this._jvmTypesBuilder0.toClazz(expr, "Foo", _function);
      CollectionExtensions.<EObject>operator_add(_contents, _clazz);
      this._validationTestHelper2.assertNoErrors(expr);
      JvmIdentifiableElement _feature = expr.getFeature();
      Assert.assertTrue((_feature instanceof org.eclipse.xtext.common.types.JvmFormalParameter));
    }
  }
  
  public void testLinkToField() throws Exception {
    {
      XExpression _expression = this.expression("x", false);
      final XFeatureCall expr = ((XFeatureCall) _expression);
      Resource _eResource = expr.eResource();
      final Resource resource = _eResource;
      resource.eSetDeliver(false);
      EList<EObject> _contents = resource.getContents();
      final Function1<JvmGenericType,Void> _function = new Function1<JvmGenericType,Void>() {
          public Void apply(final JvmGenericType it) {
            Void _xblockexpression = null;
            {
              EList<JvmMember> _members = it.getMembers();
              JvmTypeReference _stringType = JvmModelBasedLinkingTest.this.stringType(expr);
              JvmField _field = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toField(expr, "x", _stringType);
              CollectionExtensions.<JvmMember>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              JvmTypeReference _stringType_1 = JvmModelBasedLinkingTest.this.stringType(expr);
              final Function1<JvmOperation,Void> _function_1 = new Function1<JvmOperation,Void>() {
                  public Void apply(final JvmOperation it_1) {
                    Void _xblockexpression_1 = null;
                    {
                      EList<JvmFormalParameter> _parameters = it_1.getParameters();
                      JvmTypeReference _stringType_2 = JvmModelBasedLinkingTest.this.stringType(expr);
                      JvmFormalParameter _parameter = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toParameter(expr, "y", _stringType_2);
                      CollectionExtensions.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      JvmModelBasedLinkingTest.this._jvmTypesBuilder0.associate(expr, it_1);
                      _xblockexpression_1 = (null);
                    }
                    return _xblockexpression_1;
                  }
                };
              JvmOperation _method = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toMethod(expr, "doStuff", _stringType_1, _function_1);
              CollectionExtensions.<JvmMember>operator_add(_members_1, _method);
              _xblockexpression = (null);
            }
            return _xblockexpression;
          }
        };
      JvmGenericType _clazz = this._jvmTypesBuilder0.toClazz(expr, "Foo", _function);
      CollectionExtensions.<EObject>operator_add(_contents, _clazz);
      this._validationTestHelper2.assertNoErrors(expr);
      JvmIdentifiableElement _feature = expr.getFeature();
      Assert.assertTrue((_feature instanceof org.eclipse.xtext.common.types.JvmField));
    }
  }
  
  public void testLinkToField_1() throws Exception {
    {
      XExpression _expression = this.expression("x", false);
      final XFeatureCall expr = ((XFeatureCall) _expression);
      Resource _eResource = expr.eResource();
      final Resource resource = _eResource;
      resource.eSetDeliver(false);
      EList<EObject> _contents = resource.getContents();
      final Function1<JvmGenericType,Void> _function = new Function1<JvmGenericType,Void>() {
          public Void apply(final JvmGenericType it) {
            Void _xblockexpression = null;
            {
              EList<JvmMember> _members = it.getMembers();
              JvmTypeReference _stringType = JvmModelBasedLinkingTest.this.stringType(expr);
              JvmField _field = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toField(expr, "x", _stringType);
              CollectionExtensions.<JvmMember>operator_add(_members, _field);
              EList<JvmMember> _members_1 = it.getMembers();
              JvmTypeReference _stringType_1 = JvmModelBasedLinkingTest.this.stringType(expr);
              final Function1<JvmOperation,Void> _function_1 = new Function1<JvmOperation,Void>() {
                  public Void apply(final JvmOperation it_1) {
                    Void _xblockexpression_1 = null;
                    {
                      JvmModelBasedLinkingTest.this._jvmTypesBuilder0.associate(expr, it_1);
                      _xblockexpression_1 = (null);
                    }
                    return _xblockexpression_1;
                  }
                };
              JvmOperation _method = JvmModelBasedLinkingTest.this._jvmTypesBuilder0.toMethod(expr, "getX", _stringType_1, _function_1);
              CollectionExtensions.<JvmMember>operator_add(_members_1, _method);
              _xblockexpression = (null);
            }
            return _xblockexpression;
          }
        };
      JvmGenericType _clazz = this._jvmTypesBuilder0.toClazz(expr, "Foo", _function);
      CollectionExtensions.<EObject>operator_add(_contents, _clazz);
      this._validationTestHelper2.assertNoErrors(expr);
      JvmIdentifiableElement _feature = expr.getFeature();
      Assert.assertTrue((_feature instanceof org.eclipse.xtext.common.types.JvmField));
    }
  }
  
  public JvmTypeReference stringType(final EObject ctx) {
    JvmTypeReference _typeForName = this.refs.getTypeForName(java.lang.String.class, ctx);
    return _typeForName;
  }
}