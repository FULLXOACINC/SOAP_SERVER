/**
 * ArticleServiceFileNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:20 GMT)
 */
package by.zhuk.aipos.service;

public class ArticleServiceFileNotFoundExceptionException extends java.lang.Exception {
    private static final long serialVersionUID = 1520197333936L;
    private by.zhuk.aipos.service.ArticleServiceFileNotFoundException faultMessage;

    public ArticleServiceFileNotFoundExceptionException() {
        super("ArticleServiceFileNotFoundExceptionException");
    }

    public ArticleServiceFileNotFoundExceptionException(java.lang.String s) {
        super(s);
    }

    public ArticleServiceFileNotFoundExceptionException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public ArticleServiceFileNotFoundExceptionException(
        java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        by.zhuk.aipos.service.ArticleServiceFileNotFoundException msg) {
        faultMessage = msg;
    }

    public by.zhuk.aipos.service.ArticleServiceFileNotFoundException getFaultMessage() {
        return faultMessage;
    }
}
