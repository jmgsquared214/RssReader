package com.nerdydirtyit.demo.rssreader.client;

import com.nerdydirtyit.demo.rssreader.shared.FieldVerifier;
import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * GWT JUnit tests must extend GWTTestCase.
 */
public class RssReaderTest extends GWTTestCase {

  /**
   * Must refer to a valid module that sources this class.
   */
  public String getModuleName() {
    return "com.nerdydirtyit.demo.rssreader.RssReaderJUnit";
  }
}
