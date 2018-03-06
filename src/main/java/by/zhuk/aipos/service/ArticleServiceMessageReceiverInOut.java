/**
 * ArticleServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package by.zhuk.aipos.service;


/**
 *  ArticleServiceMessageReceiverInOut message receiver
 */
public class ArticleServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            ArticleServiceSkeleton skel = (ArticleServiceSkeleton) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getArticlesName".equals(methodName)) {
                    by.zhuk.aipos.service.GetArticlesNameResponse getArticlesNameResponse24 =
                        null;
                    by.zhuk.aipos.service.GetArticlesName wrappedParam = (by.zhuk.aipos.service.GetArticlesName) fromOM(msgContext.getEnvelope()
                                                                                                                                  .getBody()
                                                                                                                                  .getFirstElement(),
                            by.zhuk.aipos.service.GetArticlesName.class);

                    getArticlesNameResponse24 = skel.getArticlesName(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getArticlesNameResponse24, false,
                            new javax.xml.namespace.QName(
                                "http://service.aipos.zhuk.by",
                                "getArticlesNameResponse"));
                } else
                 if ("getArticle".equals(methodName)) {
                    by.zhuk.aipos.service.GetArticleResponse getArticleResponse26 =
                        null;
                    by.zhuk.aipos.service.GetArticle wrappedParam = (by.zhuk.aipos.service.GetArticle) fromOM(msgContext.getEnvelope()
                                                                                                                        .getBody()
                                                                                                                        .getFirstElement(),
                            by.zhuk.aipos.service.GetArticle.class);

                    getArticleResponse26 = skel.getArticle(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getArticleResponse26, false,
                            new javax.xml.namespace.QName(
                                "http://service.aipos.zhuk.by",
                                "getArticleResponse"));
                } else
                 if ("updateArticle".equals(methodName)) {
                    by.zhuk.aipos.service.UpdateArticle wrappedParam = (by.zhuk.aipos.service.UpdateArticle) fromOM(msgContext.getEnvelope()
                                                                                                                              .getBody()
                                                                                                                              .getFirstElement(),
                            by.zhuk.aipos.service.UpdateArticle.class);

                    skel.updateArticle(wrappedParam);

                    envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                } else
                 if ("deleteArticle".equals(methodName)) {
                    by.zhuk.aipos.service.DeleteArticle wrappedParam = (by.zhuk.aipos.service.DeleteArticle) fromOM(msgContext.getEnvelope()
                                                                                                                              .getBody()
                                                                                                                              .getFirstElement(),
                            by.zhuk.aipos.service.DeleteArticle.class);

                    skel.deleteArticle(wrappedParam);

                    envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                } else
                 if ("saveArticle".equals(methodName)) {
                    by.zhuk.aipos.service.SaveArticle wrappedParam = (by.zhuk.aipos.service.SaveArticle) fromOM(msgContext.getEnvelope()
                                                                                                                          .getBody()
                                                                                                                          .getFirstElement(),
                            by.zhuk.aipos.service.SaveArticle.class);

                    skel.saveArticle(wrappedParam);

                    envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (ArticleServiceIOExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                "ArticleServiceIOException");

            org.apache.axis2.AxisFault f = createAxisFault(e);

            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }

            throw f;
        } catch (ArticleServiceFileNotFoundExceptionException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                "ArticleServiceFileNotFoundException");

            org.apache.axis2.AxisFault f = createAxisFault(e);

            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }

            throw f;
        }
        catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.GetArticlesName param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.GetArticlesName.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.GetArticlesNameResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.GetArticlesNameResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.GetArticle param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.GetArticle.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.GetArticleResponse param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.GetArticleResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.ArticleServiceIOException param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.ArticleServiceIOException.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.UpdateArticle param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.UpdateArticle.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.DeleteArticle param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.DeleteArticle.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.SaveArticle param, boolean optimizeContent)
        throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.SaveArticle.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        by.zhuk.aipos.service.ArticleServiceFileNotFoundException param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(by.zhuk.aipos.service.ArticleServiceFileNotFoundException.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        by.zhuk.aipos.service.GetArticlesNameResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    by.zhuk.aipos.service.GetArticlesNameResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private by.zhuk.aipos.service.GetArticlesNameResponse wrapgetArticlesName() {
        by.zhuk.aipos.service.GetArticlesNameResponse wrappedElement = new by.zhuk.aipos.service.GetArticlesNameResponse();

        return wrappedElement;
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        by.zhuk.aipos.service.GetArticleResponse param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    by.zhuk.aipos.service.GetArticleResponse.MY_QNAME, factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private by.zhuk.aipos.service.GetArticleResponse wrapgetArticle() {
        by.zhuk.aipos.service.GetArticleResponse wrappedElement = new by.zhuk.aipos.service.GetArticleResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (by.zhuk.aipos.service.ArticleServiceFileNotFoundException.class.equals(
                        type)) {
                return by.zhuk.aipos.service.ArticleServiceFileNotFoundException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.ArticleServiceIOException.class.equals(
                        type)) {
                return by.zhuk.aipos.service.ArticleServiceIOException.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.DeleteArticle.class.equals(type)) {
                return by.zhuk.aipos.service.DeleteArticle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.GetArticle.class.equals(type)) {
                return by.zhuk.aipos.service.GetArticle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.GetArticleResponse.class.equals(type)) {
                return by.zhuk.aipos.service.GetArticleResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.GetArticlesName.class.equals(type)) {
                return by.zhuk.aipos.service.GetArticlesName.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.GetArticlesNameResponse.class.equals(type)) {
                return by.zhuk.aipos.service.GetArticlesNameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.SaveArticle.class.equals(type)) {
                return by.zhuk.aipos.service.SaveArticle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (by.zhuk.aipos.service.UpdateArticle.class.equals(type)) {
                return by.zhuk.aipos.service.UpdateArticle.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
