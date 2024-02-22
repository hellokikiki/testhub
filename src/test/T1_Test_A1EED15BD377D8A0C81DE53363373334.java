/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.datatransform.adapters.DataTransformAction;
import com.ibm.rational.test.lt.datatransform.adapters.IDataTransform;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.IHTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.http.vp.impl.HTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SuppressWarnings("all")
public class T1_Test_A1EED15BD377D8A0C81DE53363373334 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(40);
	private DataVar[] vars = new DataVar[20];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public T1_Test_A1EED15BD377D8A0C81DE53363373334(IContainer container, String invocationId) {
		super(container, "t1", invocationId, "A1EED15BD377D8A0C81DE53363373334", "/RPTProject01/Tests/t1.testsuite", "C:/RPT11_WS01/RPTProject01/Tests/t1.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(dataTransform(this));
	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(confCon_6(this));
	this.add(confCon_7(this));
	this.add(confCon_8(this));
	this.add(confCon_9(this));
	this.add(confCon_10(this));
	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: T1_Test_A1EED15BD377D8A0C81DE53363373334 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private KAction dataTransform(IContainer parent) {
		DataTransformAction action = 
			new DataTransformAction(parent, "Data Transform Action");

		action.setMapFile("A1EED15BD377D8A0C81DE53363373334");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.JsonAdapterVERSION_0

		return action;
	}
private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EED15BD3A52A34C81DE53363373334");	
			vars[0] = new DataVar("t1_Host", "cloud.ibm.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("t1_Host_1", "www.ibm.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("t1_Host_2", "login.ibm.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("t1_Host_3", "www-api.ibm.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("t1_Host_4", "www.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("t1_Host_5", "adservice.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("t1_Host_6", "id.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("t1_Host_7", "play.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("t1_Host_8", "apis.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[9] = new DataVar("t1_Host_9", "ogs.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[10] = new DataVar("t1_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[11] = new DataVar("t1_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[12] = new DataVar("t1_Host_3_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[13] = new DataVar("t1_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[14] = new DataVar("t1_Host_6_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[15] = new DataVar("t1_Host_5_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[16] = new DataVar("t1_Host_7_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[17] = new DataVar("t1_Host_8_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[18] = new DataVar("t1_Host_9_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[19] = new DataVar("t1_Host_4_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[4].getValue()== null?"www.google.com": (String)vars[4].getValue()),  // host name
					Integer.parseInt((String)(vars[19].getValue()== null?"443": (String)vars[19].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"www.google.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[9].getValue()== null?"ogs.google.com": (String)vars[9].getValue()),  // host name
					Integer.parseInt((String)(vars[18].getValue()== null?"443": (String)vars[18].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"ogs.google.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_3(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[8].getValue()== null?"apis.google.com": (String)vars[8].getValue()),  // host name
					Integer.parseInt((String)(vars[17].getValue()== null?"443": (String)vars[17].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"apis.google.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_4(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_4",
					(String)(vars[7].getValue()== null?"play.google.com": (String)vars[7].getValue()),  // host name
					Integer.parseInt((String)(vars[16].getValue()== null?"443": (String)vars[16].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"play.google.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_5(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[5].getValue()== null?"adservice.google.com": (String)vars[5].getValue()),  // host name
					Integer.parseInt((String)(vars[15].getValue()== null?"443": (String)vars[15].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"adservice.google.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_6(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_6",
					(String)(vars[6].getValue()== null?"id.google.com": (String)vars[6].getValue()),  // host name
					Integer.parseInt((String)(vars[14].getValue()== null?"443": (String)vars[14].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"id.google.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_7(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_7",
					(String)(vars[1].getValue()== null?"www.ibm.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[13].getValue()== null?"443": (String)vars[13].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"www.ibm.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_8(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_8",
					(String)(vars[3].getValue()== null?"www-api.ibm.com": (String)vars[3].getValue()),  // host name
					Integer.parseInt((String)(vars[12].getValue()== null?"443": (String)vars[12].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"www-api.ibm.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_9(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_9",
					(String)(vars[2].getValue()== null?"login.ibm.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[11].getValue()== null?"443": (String)vars[11].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"login.ibm.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_10(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_10",
					(String)(vars[0].getValue()== null?"cloud.ibm.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[10].getValue()== null?"443": (String)vars[10].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"cloud.ibm.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EED15BD3CB4FD7C81DE53363373334");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Google", "A1EED15BD3CB4FD7C81DE53363373334") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EED15BD3C905E0C81DE53363373334", false, true,
						"Config_1", "/",	"/", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_2(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204",	"/gen_204?s=webhp&t=cap&atyp=csi&ei=iQTXZdapBqjT5NoPydm08Ao&rt=wsrt.2009,cbt.29,hst.29&opi=89978449", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "m=cdos,cr,hsm,jsa,mb4ZUb,d,csi,cEt90b,SNUn3,qddgKe,sTsDMc,dtl0hd,eHDfl",	"/xjs/_/js/k=xjs.hd.en.nbg1aI_6hHw.O/am=AAAAABAAAAAAAAAAAAAAAABAAAAAgBDoJxwCsAECAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGBITABpBCcBAAAJogqgAAAAAAAAAQGiAEEHhAAAIAeACiADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY/d=1/ed=1/dg=2/rs=ACT90oFv1VK1wl-MFrVrb5RnoT3U1Cxa1w/ee=AfeaP:TkrAjf;Afksuc:wMx0R;BMxAGc:E5bFse;BgS6mb:fidj5d;BjwMce:cXX2Wb;CxXAWb:YyRLvc;DULqB:RKfG5c;Dkk6ge:wJqrrd;DpcR3d:zL72xf;EABSZ:MXZt9d;ESrPQc:mNTJvc;EVNhjf:pw70Gc;EmZ2Bf:zr1jrb;EnlcNd:WeHg4;Erl4fe:FloWmf,FloWmf;F9mqte:UoRcbe;Fmv9Nc:O1Tzwc;G0KhTb:LIaoZ;G6wU6e:hPyGBb;GleZL:J1A7Od;HMDDWe:G8QUdb;HqeXPd:cmbnH;IBADCc:RYquRb;IoGlCf:b5lhvb;IsdWVc:qzxzOb;JXS8fb:Qj0suc;JbMT3:M25sS;JsbNhc:Xd8iUd;KOxcK:OZqGte;KQzWid:ZMKkN;KcokUb:KiuZBf;KeeMUb:HiPxjc;KpRAue:Tia57b;LBgRLc:XVMNvd;LEikZe:byfTOb,lsjVmc;LsNahb:ucGLNb;Me32dd:MEeYgc;NPKaK:PVlQOd;NSEoX:lazG7b;Np8Qkd:Dpx6qc;Nyt6ic:jn2sGd;OgagBe:cNTe0;Oj465e:KG2eXe,KG2eXe;OohIYe:mpEAQb;Pjplud:EEDORb,PoEs9b;Q1Ow7b:x5CSu;QGR0gd:Mlhmy;R4IIIb:QWfeKf;R9Ulx:CR7Ufe;RDNBlf:zPRCJb;SLtqO:Kh1xYe;SMDL4c:fTfGO,pnvXVc;SNUn3:ZwDk9d,x8cHvb;ShpF6e:N0pvGc;TxfV6d:YORN0b;U96pRd:FsR04;UDrY1c:eps46d;UVmjEd:EesRsb;UyG7Kb:wQd0G;V2HTTe:RolTY;VGRfx:VFqbr;VN6jIc:ddQyuf;VOcgDe:YquhTb;VsAqSb:PGf2Re;VxQ32b:k0XsBb;WCEKNd:I46Hvd;WDGyFe:jcVOxd;Wfmdue:g3MJlb;XUezZ:sa7lqb;YV5bee:IvPZ6d;ZMvdv:PHFPjb;ZWEUA:afR4Cf;a56pNe:JEfCwb;aAJE9c:WHW6Ef;aZ61od:arTwJ;bFZ6gf:RsDQqe;bcPXSc:gSZLJb;cEt90b:ws9Tlc;cFTWae:gT8qnd;coJ8e:KvoW8;dIoSBb:ZgGg9b;dLlj2:Qqt3Gf;daB6be:lMxGPd;dtl0hd:lLQWFe;eBAeSb:Ck63tb;eBZ5Nd:audvde;eHDfl:ofjVkb;eO3lse:nFClrf;fWLTFc:TVBJbf;g8nkx:U4MzKc;gaub4:TN6bMe;gtVSi:ekUOYd;h3MYod:cEt90b;hK67qb:QWEO5b;heHB1:sFczq;hjRo6e:F62sG;iFQyKf:QIhFr,vfuNJf;imqimf:jKGL2e;io8t5d:sgY6Zb;jY0zg:Q6tNgc;k2Qxcb:XY51pe;kCQyJ:ueyPK;kMFpHd:OTA3Ae;kbAm9d:MkHyGd;lkq0A:JyBE3e;nAFL3:NTMZac,s39S4;oGtAuc:sOXFj;oSUNyd:fTfGO,fTfGO,pnvXVc;oUlnpc:RagDlc;okUaUd:wItadb;pKJiXd:VCenhc;pNsl2d:j9Yuyc;pXdRYb:JKoKVe;pj82le:mg5CW;qZx2Fc:j0xrE;qaS3gd:yiLg6e;qavrXe:zQzcXe;qddgKe:d7YSfd,x4FYXe;rQSrae:C6D5Fc;sP4Vbe:VwDzFe;sTsDMc:kHVSUb;tH4IIe:Ymry6;tosKvd:ZCqP3;trZL0b:qY8PFe;uY49fb:COQbmf;uuQkY:u2V3ud;vGrMZ:lPJJ0c;vfVwPd:lcrkwe;w3bZCb:ZPGaIb;w4rSdf:XKiZ9;w9w86d:dt4g2b;wQlYve:aLUfP;wR5FRb:TtcOte;wV5Pjc:L8KGxe;whEZac:F4AmNb;xBbsrc:NEW1Qc;yGxLoc:FmAr0c;yxTchf:KUM7Z;z97YGf:oug9te;zOsCQe:Ko78Df;zaIgPb:Qtpxbd/m=cdos,cr,hsm,jsa,mb4ZUb,d,csi,cEt90b,SNUn3,qddgKe,sTsDMc,dtl0hd,eHDfl", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "googlelogo_color_272x92dp.png",	"/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png", true, false), 95, 100, "A1EED15BD3DE62A0C81DE53363373334", 3);
				httpParallel.addRequest(1, request_5(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "desktop_searchbox_sprites318_hr.webp",	"/images/searchbox/desktop_searchbox_sprites318_hr.webp", true, false), 65, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(2, request_6(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "search",	"/complete/search?q&cp=0&client=gws-wiz&xssi=t&gs_pcrt=2&hl=en&authuser=0&psi=iQTXZdapBqjT5NoPydm08Ao.1708590217636&dpr=1.25&nolsbt=1", true, false), 191, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(3, request_7(this, false, "A1EED15BD406F9B9C81DE53363373334", false, false,
						"Config_1", "m=B2qlPe,DhPYme,GU4Gab,MpJwZc,NzU6V,UUJqVe,Wo3n8,aa,abd,async,epYOx,ifl,ms4mZb,mu,pHXghd,q0xTif,s39S4,sOXFj,sb_wiz,sf,sonic,spch",	"/xjs/_/js/k=xjs.hd.en.nbg1aI_6hHw.O/ck=xjs.hd.NxBHBRUVsMY.L.W.O/am=AAAAABAAAAAAAAAAAAAAAABAAAAAgBDoJxwCsAECAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGBITABpBCcBAAAJogqgAAAAAAAAAQGiAEEHhAAAIAeACiADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY/d=1/exm=SNUn3,cEt90b,cdos,cr,csi,d,dtl0hd,eHDfl,hsm,jsa,mb4ZUb,qddgKe,sTsDMc/ed=1/dg=2/ujg=1/rs=ACT90oHrYxxCkD_3Sh696pbKODnGv8W1sA/ee=AfeaP:TkrAjf;Afksuc:wMx0R;BMxAGc:E5bFse;BgS6mb:fidj5d;BjwMce:cXX2Wb;CxXAWb:YyRLvc;DULqB:RKfG5c;Dkk6ge:wJqrrd;DpcR3d:zL72xf;EABSZ:MXZt9d;ESrPQc:mNTJvc;EVNhjf:pw70Gc;EmZ2Bf:zr1jrb;EnlcNd:WeHg4;Erl4fe:FloWmf;F9mqte:UoRcbe;Fmv9Nc:O1Tzwc;G0KhTb:LIaoZ;G6wU6e:hPyGBb;GleZL:J1A7Od;HMDDWe:G8QUdb;HqeXPd:cmbnH;IBADCc:RYquRb;IoGlCf:b5lhvb;IsdWVc:qzxzOb;JXS8fb:Qj0suc;JbMT3:M25sS;JsbNhc:Xd8iUd;KOxcK:OZqGte;KQzWid:ZMKkN;KcokUb:KiuZBf;KeeMUb:HiPxjc;KpRAue:Tia57b;LBgRLc:XVMNvd;LEikZe:byfTOb,lsjVmc;LsNahb:ucGLNb;Me32dd:MEeYgc;NPKaK:PVlQOd;NSEoX:lazG7b;Np8Qkd:Dpx6qc;Nyt6ic:jn2sGd;OgagBe:cNTe0;Oj465e:KG2eXe;OohIYe:mpEAQb;Pjplud:EEDORb,PoEs9b;Q1Ow7b:x5CSu;QGR0gd:Mlhmy;R4IIIb:QWfeKf;R9Ulx:CR7Ufe;RDNBlf:zPRCJb;SLtqO:Kh1xYe;SMDL4c:fTfGO,pnvXVc;SNUn3:ZwDk9d,x8cHvb;ShpF6e:N0pvGc;TxfV6d:YORN0b;U96pRd:FsR04;UDrY1c:eps46d;UVmjEd:EesRsb;UyG7Kb:wQd0G;V2HTTe:RolTY;VGRfx:VFqbr;VN6jIc:ddQyuf;VOcgDe:YquhTb;VsAqSb:PGf2Re;VxQ32b:k0XsBb;WCEKNd:I46Hvd;WDGyFe:jcVOxd;Wfmdue:g3MJlb;XUezZ:sa7lqb;YV5bee:IvPZ6d;ZMvdv:PHFPjb;ZWEUA:afR4Cf;a56pNe:JEfCwb;aAJE9c:WHW6Ef;aZ61od:arTwJ;bFZ6gf:RsDQqe;bcPXSc:gSZLJb;cEt90b:ws9Tlc;cFTWae:gT8qnd;coJ8e:KvoW8;dIoSBb:ZgGg9b;dLlj2:Qqt3Gf;daB6be:lMxGPd;dtl0hd:lLQWFe;eBAeSb:Ck63tb;eBZ5Nd:audvde;eHDfl:ofjVkb;eO3lse:nFClrf;fWLTFc:TVBJbf;g8nkx:U4MzKc;gaub4:TN6bMe;gtVSi:ekUOYd;h3MYod:cEt90b;hK67qb:QWEO5b;heHB1:sFczq;hjRo6e:F62sG;iFQyKf:QIhFr,vfuNJf;imqimf:jKGL2e;io8t5d:sgY6Zb;jY0zg:Q6tNgc;k2Qxcb:XY51pe;kCQyJ:ueyPK;kMFpHd:OTA3Ae;kbAm9d:MkHyGd;lkq0A:JyBE3e;nAFL3:NTMZac,s39S4;oGtAuc:sOXFj;oSUNyd:fTfGO,pnvXVc;oUlnpc:RagDlc;okUaUd:wItadb;pKJiXd:VCenhc;pNsl2d:j9Yuyc;pXdRYb:JKoKVe;pj82le:mg5CW;qZx2Fc:j0xrE;qaS3gd:yiLg6e;qavrXe:zQzcXe;qddgKe:d7YSfd,x4FYXe;rQSrae:C6D5Fc;sP4Vbe:VwDzFe;sTsDMc:kHVSUb;tH4IIe:Ymry6;tosKvd:ZCqP3;trZL0b:qY8PFe;uY49fb:COQbmf;uuQkY:u2V3ud;vGrMZ:lPJJ0c;vfVwPd:lcrkwe;w3bZCb:ZPGaIb;w4rSdf:XKiZ9;w9w86d:dt4g2b;wQlYve:aLUfP;wR5FRb:TtcOte;wV5Pjc:L8KGxe;whEZac:F4AmNb;xBbsrc:NEW1Qc;yGxLoc:FmAr0c;yxTchf:KUM7Z;z97YGf:oug9te;zOsCQe:Ko78Df;zaIgPb:Qtpxbd/m=B2qlPe,DhPYme,GU4Gab,MpJwZc,NzU6V,UUJqVe,Wo3n8,aa,abd,async,epYOx,ifl,ms4mZb,mu,pHXghd,q0xTif,s39S4,sOXFj,sb_wiz,sf,sonic,spch?xjs=s1", true, false), 49, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(4, request_8(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "rs=ACT90oHrYxxCkD_3Sh696pbKODnGv8W1sA",	"/xjs/_/js/md=3/k=xjs.hd.en.nbg1aI_6hHw.O/ck=xjs.hd.NxBHBRUVsMY.L.W.O/am=AAAAABAAAAAAAAAAAAAAAABAAAAAgBDoJxwCsAECAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGBITABpBCcBAAAJogqgAAAAAAAAAQGiAEEHhAAAIAeACiADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY/rs=ACT90oHrYxxCkD_3Sh696pbKODnGv8W1sA", true, false), 1046, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(0, request_9(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "client_204",	"/client_204?atyp=i&biw=1488&bih=750&dpr=1.25&ei=iQTXZdapBqjT5NoPydm08Ao&opi=89978449", true, false), 843, 100, "A1EED15BD406F9C7C81DE53363373334", 3);
				httpParallel.addRequest(1, request_10(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "gen_204{1}",	"/gen_204?s=webhp&t=aft&atyp=csi&ei=iQTXZdapBqjT5NoPydm08Ao&rt=wsrt.2009,aft.1932,afti.1932,cbt.29,hst.29,prt.121&wh=750&imn=11&ima=2&imad=0&imac=0&imf=0&aft=1&aftp=750&opi=89978449", true, false), 449, 100, "A1EED15BD40BB437C81DE53363373334", 3);
				httpParallel.addRequest(0, request_11(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204{2}",	"/gen_204?atyp=csi&ei=iQTXZdapBqjT5NoPydm08Ao&s=webhp&t=all&wh=750&imn=11&ima=2&imad=0&imac=0&imf=0&aft=1&aftp=750&adh=&cls=0.0005233672461055803&ime=1&imex=1&imeh=9&imeha=0&imehb=0&imea=0&imeb=0&imel=0&imed=0&scp=0&mem=ujhs.6,tjhs.8,jhsl.4295,dm.8&nv=ne.1,feid.6fbbdccf-0e0b-41ff-a387-51bb7ba006c6&hp=&sys=hc.4&p=bs.true&rt=hst.29,cbt.29,aft.1932,afti.1932,prt.121,xjses.287,xjsee.360,xjs.360,dcl.365,aftqf.1933,lcp.133,fcp.133,wsrt.2009,cst.1887,dnst.0,rqst.124,rspt.29,sslt.1886,rqstt.1914,unt.25,cstt.27,dit.2134&zx=1708590219111&opi=89978449", true, false), 456, 100, "A1EED15BD40BB437C81DE53363373334", 3);
				httpParallel.addRequest(3, request_12(this, false, "A1EED15BD406F9B9C81DE53363373334", false, false,
						"Config_1", "m=syjq",	"/xjs/_/ss/k=xjs.hd.NxBHBRUVsMY.L.W.O/am=AAAAABAAAAAAAAAAAAAAAABAAAAAABDAJxwAsAEAAAAAAAAgAACACAAAACAEgAGAgAAAAAAAAACBITABpBCMBAAAJogqgAAAAAAAAAACiAEEHhAAAIAeACCADCAIAAAAAAAAAAQAAAAAYAAAAAAAAAAAAAAAAIAAAACAAgAAAAAAAAAAAAAAACA/d=0/dg=2/rs=ACT90oHPrSu8Y-HfgeUwJCXT9nlgGz8enA/m=syjq?xjs=s3", true, false), 626, 100, "A1EED15BD48C7CF0C81DE53363373334", 3);
				httpParallel.addRequest(4, request_13(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "m=sy17i,P10Owf,synb,sy168,sy169,gSZvdb,sysg,sysl,sysm,WlNQGd,syn9,syt3,syt5,nabPbb,syna,sync,synd,syne,syng,DPreE,syjq,sysf,sysh,CnSW2d,kQvlef,syt4,fXO0xe",	"/xjs/_/js/k=xjs.hd.en.nbg1aI_6hHw.O/am=AAAAAAAAAAAAAAAAAAAAAABAAAAAgBAoAAACAAACAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGAAQABgBAQBAAAAAAoAAAAAAAAAAQGAAAAAAAAAIAeAAgADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY/d=0/dg=2/rs=ACT90oGOFNSPYUY23cX5-q0BHEawBHsCdw/m=sy17i,P10Owf,synb,sy168,sy169,gSZvdb,sysg,sysl,sysm,WlNQGd,syn9,syt3,syt5,nabPbb,syna,sync,synd,syne,syng,DPreE,syjq,sysf,sysh,CnSW2d,kQvlef,syt4,fXO0xe?xjs=s3", true, false), 627, 100, "A1EED15BD48C7CF0C81DE53363373334", 3);
				httpParallel.addRequest(1, request_14(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "gen_204{3}",	"/gen_204?atyp=i&ei=iQTXZdapBqjT5NoPydm08Ao&dt19=2&zx=1708590220241&opi=89978449", true, false), 5, 100, "A1EED15BD48EEF06C81DE53363373334", 3);
				httpParallel.addRequest(0, request_15(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204{4}",	"/gen_204?atyp=csi&ei=iQTXZdapBqjT5NoPydm08Ao&s=promo&rt=hpbas.3068&zx=1708590220243&opi=89978449", true, false), 10, 100, "A1EED15BD48EEF06C81DE53363373334", 3);
				httpParallel.addRequest(2, request_16(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "client_204{1}",	"/client_204?cs=1&opi=89978449", true, false), 10, 100, "A1EED15BD48EEF06C81DE53363373334", 3);
				httpParallel.addRequest(1, request_17(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "hpba",	"/async/hpba?vet=10ahUKEwiWktTHwr6EAxWoKVkFHcksDa4Qj-0KCB0..i&ei=iQTXZdapBqjT5NoPydm08Ao&opi=89978449&yv=3&cs=0&async=_ck:xjs.hd.NxBHBRUVsMY.L.W.O,_k:xjs.hd.en.nbg1aI_6hHw.O,_am:AAAAABAAAAAAAAAAAAAAAABAAAAAgBDoJxwCsAECAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGBITABpBCcBAAAJogqgAAAAAAAAAQGiAEEHhAAAIAeACiADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY,_csss:ACT90oHPrSu8Y-HfgeUwJCXT9nlgGz8enA,_fmt:prog,_id:a3JU5b", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_18(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "m=syej,aLUfP",	"/xjs/_/js/k=xjs.hd.en.nbg1aI_6hHw.O/am=AAAAAAAAAAAAAAAAAAAAAABAAAAAgBAoAAACAAACAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGAAQABgBAQBAAAAAAoAAAAAAAAAAQGAAAAAAAAAIAeAAgADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY/d=0/dg=2/rs=ACT90oGOFNSPYUY23cX5-q0BHEawBHsCdw/m=syej,aLUfP?xjs=s3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_19(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "gen_204{5}",	"/gen_204?atyp=csi&ei=jATXZca9EKCg5NoPmeOX2AI&s=async&astyp=hpba&ima=0&imn=0&mem=ujhs.6,tjhs.8,jhsl.4295,dm.8&nv=ne.1,feid.6fbbdccf-0e0b-41ff-a387-51bb7ba006c6&hp=&rt=ttfb.64,st.73,bs.27,aaft.74,acrt.74,art.75&zx=1708590220319&opi=89978449", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_20(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "gen_204{6}",	"/gen_204?atyp=csi&ei=iQTXZdapBqjT5NoPydm08Ao&s=promo&rt=hpbas.3068,hpbarr.77&zx=1708590220320&opi=89978449", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_21(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "m=kMFpHd,sy8e,bm51tf",	"/xjs/_/js/k=xjs.hd.en.nbg1aI_6hHw.O/am=AAAAAAAAAAAAAAAAAAAAAABAAAAAgBAoAAACAAACAAAAAwkgAAjACsAoUCAEgAGAggAPZQIAMAGAAQABgBAQBAAAAAAoAAAAAAAAAAQGAAAAAAAAAIAeAAgADCAIUAIEAAAAIA9AcMBBagIAAAAAAAAAAAAIQIJguCCBggACAAAAAAAAAAAAAKk0UWEY/d=0/dg=2/rs=ACT90oGOFNSPYUY23cX5-q0BHEawBHsCdw/m=kMFpHd,sy8e,bm51tf?xjs=s3", true, false), 14, 100, "A1EED15BD491392AC81DE53363373334", 3);
				httpParallel.addRequest(5, request_22(this, false, "A1EED15BD4C82660C81DE53363373334", true, false,
						"Config_2", "callout",	"/widget/callout?prid=19037050&pgid=19037049&puid=9ceb59a7585b55bd&cce=1&dc=1&origin=https%3A%2F%2Fwww.google.com&cn=callout&pid=1&spid=538&hl=en", true, false), 3166, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(6, request_23(this, false, "A1EED15BD4CA70C1C81DE53363373334", true, false,
						"Config_3", "cb=gapi.loaded_0",	"/_/scs/abc-static/_/js/k=gapi.gapi.en.sY-PcpVhgWw.O/m=gapi_iframes,googleapis_client/rt=j/sv=1/d=1/ed=1/rs=AHpOoo9Rvk-uuNpxhdO70m878GpubWGzeQ/cb=gapi.loaded_0", true, false), 3179, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(2, request_24(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "ic_wahlberg_product_core_48.png8.png",	"/images/hpp/ic_wahlberg_product_core_48.png8.png", true, false), 430, 100, "A1EED15BD4CA70CFC81DE53363373334", 3);
				httpParallel.addRequest(2, request_25(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "gen_204{7}",	"/gen_204?use_corp=on&atyp=i&zx=1708590221688&ogsr=1&ei=iQTXZaeaB8eC0_gP_smmkAU&ct=7&cad=i&id=19037050&loc=webhp&prid=538&ogd=com&ogprm=up&ap=1&vis=1", true, false), 172, 100, "A1EED15BD4CA717BC81DE53363373334", 3);
				httpParallel.addRequest(7, request_26(this, false, "A1EED15BD4CA72C6C81DE53363373334", false, false,
						"Config_4", "log",	"/log?format=json&hasfast=true", true, false), 4206, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
				httpParallel.addRequest(2, request_27(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "gen_204{8}",	"/gen_204?atyp=i&ct=psnt&cad=&nt=navigate&ei=iQTXZdapBqjT5NoPydm08Ao&zx=1708590222613&opi=89978449", true, false), 368, 100, "A1EED15BD4CA72D4C81DE53363373334", 3);
				httpParallel.addRequest(1, request_28(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "favicon.ico",	"/favicon.ico", true, false), 373, 100, "A1EED15BD4CA72D4C81DE53363373334", 3);
				httpParallel.addRequest(8, request_29(this, false, "A1EED15BD4CF2B40C81DE53363373334", true, false,
						"Config_4", "log{1}",	"/log?format=json&hasfast=true&authuser=0", true, false), 402, 100, "A1EED15BD4CA720EC81DE53363373334", 3);
				httpParallel.addRequest(7, request_30(this, false, "A1EED15BD4CA72C6C81DE53363373334", false, false,
						"Config_4", "log{2}",	"/log?format=json&hasfast=true&authuser=0", true, false), 4, 100, "A1EED15BD4CF2B4EC81DE53363373334", 3);
				httpParallel.addRequest(7, request_31(this, false, "A1EED15BD4CA72C6C81DE53363373334", true, false,
						"Config_4", "log{3}",	"/log?format=json&hasfast=true", true, false), 426, 100, "A1EED15BD4D19CBDC81DE53363373334", 3);
				httpParallel.addRequest(9, request_32(this, false, "A1EED15BD4D19E17C81DE53363373334", true, false,
						"Config_5", "ui",	"/adsid/google/ui", true, false), 5474, 100, "A1EED15BD3D031E1C81DE53363373334", 2);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD3D031E1C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-prefers-reduced-motion", "reduce", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[0], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[1], "&atyp=(.*?)&", 1, 1, 0, 0, false, "atyp_30", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[2], " src=\"(.*?)\"", 1, 1, 0, 0, false, "src", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[3], "\\?prid=(.*?)\\\\", 1, 1, 0, 0, false, "prid_3", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[4], "\\\\u0026pgid=(.*?)\\\\", 1, 1, 0, 0, false, "u0026pgid", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[5], "\\\\u0026puid=(.*?)\\\\", 1, 1, 0, 0, false, "u0026puid", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[6], "\\\\u0026cce=(.*?)\\\\", 1, 1, 0, 0, false, "u0026cce", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[7], "\\\\u0026dc=(.*?)\"", 1, 1, 0, 0, false, "u0026dc", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[8], "\\?use_corp=(.*?)&", 1, 1, 0, 0, false, "use_corp_2", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[9], "\\?utm_source=(.*?)_", 1, 1, 0, 0, false, "utm_source", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[10], ";hl=(.*?)-", 1, 1, 0, 0, false, "hl_32", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[11], "<[[^>].]*?name=\"sca_esv\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[12], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"ei\"[^>]*>", 1, 1, 0, 0, false, "value_2", null, 0, false);
	harvestContainer_1.addHarvestInstruction ("resp_content", dcVars[13], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"iflsig\"[^>]*>", 1, 1, 0, 0, false, "value_3", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_123", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD3D031E4C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD3D9A7B0C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_uri", 35, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_uri", 28, 3, true, (IDCCoreVar)dcVars[1], false, "atyp", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_112", null, 0, false);
	subContainer_2.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_122", null, 0, false);
	subContainer_2.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD3D9A7B3C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1EED15BD3D9A828C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_0);

	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD3DE62A0C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[14], "\\?atyp=(.*?)&", 1, 1, 0, 0, false, "atyp_31", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[15], "\\?format=(.*?)&", 1, 1, 0, 0, false, "format_5", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_content", dcVars[16], "&hasfast=(.*?)\"", 1, 1, 0, 0, false, "hasfast_5", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_5 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_111", null, 0, false);
	subContainer_3.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_uri", 0, 2345, false, (IDCCoreVar)dcVars[2], false, "Google_url", null, 0, false);
	subContainer_3.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_121", null, 0, false);
	subContainer_3.addSubInstruction(sub_7);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD3DE62A3C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD3F65770C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_110", null, 0, false);
	subContainer_4.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_120", null, 0, false);
	subContainer_4.addSubInstruction(sub_9);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD3F65773C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD3F8A16EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_10 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_109", null, 0, false);
	subContainer_5.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_119", null, 0, false);
	subContainer_5.addSubInstruction(sub_11);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD3F8A171C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/webp");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD404884EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_6 = new DataSub();
	reqAction.addDataSub(subContainer_6);

		ISubRule sub_12 = new SubRule("req_uri", 59, 2, true, (IDCCoreVar)dcVars[10], false, "hl", null, 0, false);
	subContainer_6.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_108", null, 0, false);
	subContainer_6.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_118", null, 0, false);
	subContainer_6.addSubInstruction(sub_14);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4048851C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD406F9C7C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[17], "&v=(.*?)\"", 1, 1, 0, 0, false, "v_4", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_15 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_107", null, 0, false);
	subContainer_7.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_117", null, 0, false);
	subContainer_7.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD406F9CAC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4096A55C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_17 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_106", null, 0, false);
	subContainer_8.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_116", null, 0, false);
	subContainer_8.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4096A58C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD40BB437C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_19 = new SubRule("req_uri", 48, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_9.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_uri", 17, 1, true, (IDCCoreVar)dcVars[14], false, "atyp", null, 0, false);
	subContainer_9.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_105", null, 0, false);
	subContainer_9.addSubInstruction(sub_21);
		ISubRule sub_22 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_115", null, 0, false);
	subContainer_9.addSubInstruction(sub_22);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD40BB43AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD40BB4EAC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_23 = new SubRule("req_uri", 35, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_10.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_uri", 28, 3, true, (IDCCoreVar)dcVars[1], false, "atyp", null, 0, false);
	subContainer_10.addSubInstruction(sub_24);
		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_104", null, 0, false);
	subContainer_10.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_114", null, 0, false);
	subContainer_10.addSubInstruction(sub_26);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD40BB4EDC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1EED15BD40BB562C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_1);

	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD48C7CF0C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_27 = new SubRule("req_uri", 21, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_11.addSubInstruction(sub_27);
		ISubRule sub_28 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[1], false, "atyp", null, 0, false);
	subContainer_11.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_103", null, 0, false);
	subContainer_11.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_113", null, 0, false);
	subContainer_11.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD48C7CF3C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1EED15BD48EEE00C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_2);

	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD48EEE47C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_31 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_102", null, 0, false);
	subContainer_12.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_112", null, 0, false);
	subContainer_12.addSubInstruction(sub_32);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD48EEE4AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD48EEF06C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_33 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_101", null, 0, false);
	subContainer_13.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_111", null, 0, false);
	subContainer_13.addSubInstruction(sub_34);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD48EEF09C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD48EEFC5C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_35 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_14.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[14], false, "atyp", null, 0, false);
	subContainer_14.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_100", null, 0, false);
	subContainer_14.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_110", null, 0, false);
	subContainer_14.addSubInstruction(sub_38);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD48EEFC8C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1EED15BD48EF039C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_3);

	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD48EF080C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_39 = new SubRule("req_uri", 21, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_15.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[1], false, "atyp", null, 0, false);
	subContainer_15.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_99", null, 0, false);
	subContainer_15.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_109", null, 0, false);
	subContainer_15.addSubInstruction(sub_42);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD48EF083C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_5(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1EED15BD48EF0F4C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_4);

	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD48EF13BC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_43 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_98", null, 0, false);
	subContainer_16.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_108", null, 0, false);
	subContainer_16.addSubInstruction(sub_44);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD40BB437C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD48EF13EC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD491383FC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_17 = new DataSub();
	reqAction.addDataSub(subContainer_17);

		ISubRule sub_45 = new SubRule("req_uri", 64, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_17.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_97", null, 0, false);
	subContainer_17.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_107", null, 0, false);
	subContainer_17.addSubInstruction(sub_47);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4913842C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD491392AC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_48 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_96", null, 0, false);
	subContainer_18.addSubInstruction(sub_48);
		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_106", null, 0, false);
	subContainer_18.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD491392DC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD493A931C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_19 = new DataSub();
	reqAction.addDataSub(subContainer_19);

		ISubRule sub_50 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[1], false, "atyp", null, 0, false);
	subContainer_19.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_95", null, 0, false);
	subContainer_19.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_105", null, 0, false);
	subContainer_19.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD493A934C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_6(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1EED15BD493A9A5C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_5);

	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD493A9ECC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_53 = new SubRule("req_uri", 21, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_20.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[1], false, "atyp", null, 0, false);
	subContainer_20.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_94", null, 0, false);
	subContainer_20.addSubInstruction(sub_55);
		ISubRule sub_56 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_104", null, 0, false);
	subContainer_20.addSubInstruction(sub_56);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD493A9EFC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_7(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1EED15BD493AA60C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_6);

	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD493AAA7C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(20);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_57 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_93", null, 0, false);
	subContainer_21.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_103", null, 0, false);
	subContainer_21.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD493AAAAC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4C8266EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "ogs.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "iframe", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[18], ";id=(.*?)&", 1, 1, 0, 0, false, "id_2", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[19], ";ct=(.*?)&", 1, 1, 0, 0, false, "ct_10", null, 0, false);
	IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_59 = new SubRule("req_uri", 142, 2, true, (IDCCoreVar)dcVars[10], false, "hl", null, 0, false);
	subContainer_22.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_uri", 75, 1, true, (IDCCoreVar)dcVars[7], false, "dc", null, 0, false);
	subContainer_22.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_uri", 70, 1, true, (IDCCoreVar)dcVars[6], false, "cce", null, 0, false);
	subContainer_22.addSubInstruction(sub_61);
		ISubRule sub_62 = new SubRule("req_uri", 49, 16, true, (IDCCoreVar)dcVars[5], false, "puid", null, 0, false);
	subContainer_22.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_uri", 35, 8, true, (IDCCoreVar)dcVars[4], false, "pgid", null, 0, false);
	subContainer_22.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_uri", 21, 8, true, (IDCCoreVar)dcVars[3], false, "prid", null, 0, false);
	subContainer_22.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_92", null, 0, false);
	subContainer_22.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[9], false, "Host_102", null, 0, false);
	subContainer_22.addSubInstruction(sub_66);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4C82671C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CA70CFC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "apis.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_67 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_91", null, 0, false);
	subContainer_23.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[8], false, "Host_101", null, 0, false);
	subContainer_23.addSubInstruction(sub_68);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CA70D2C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CA717BC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://ogs.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_100", null, 0, false);
	subContainer_24.addSubInstruction(sub_69);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CA717EC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CA720EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_25 = new DataSub();
	reqAction.addDataSub(subContainer_25);

		ISubRule sub_70 = new SubRule("req_uri", 93, 8, true, (IDCCoreVar)dcVars[18], false, "id", null, 0, false);
	subContainer_25.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_uri", 82, 1, true, (IDCCoreVar)dcVars[19], false, "ct", null, 0, false);
	subContainer_25.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_uri", 26, 1, true, (IDCCoreVar)dcVars[14], false, "atyp", null, 0, false);
	subContainer_25.addSubInstruction(sub_72);
		ISubRule sub_73 = new SubRule("req_uri", 18, 2, true, (IDCCoreVar)dcVars[8], false, "use_corp", null, 0, false);
	subContainer_25.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_90", null, 0, false);
	subContainer_25.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_99", null, 0, false);
	subContainer_25.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4C8266EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD491383FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CA7211C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CA72D4C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "play.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1423", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[20], "\",([[^\",].]*?)\\]", 1, 1, 0, 0, false, ",", null, 0, false);
	IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_76 = new SubRule("req_uri", 25, 4, true, (IDCCoreVar)dcVars[16], false, "hasfast", null, 0, false);
	subContainer_26.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_uri", 12, 4, true, (IDCCoreVar)dcVars[15], false, "format", null, 0, false);
	subContainer_26.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_89", null, 0, false);
	subContainer_26.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[7], false, "Host_98", null, 0, false);
	subContainer_26.addSubInstruction(sub_79);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD48EF13BC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA720EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CA72D7C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("[[1,null,null,null,null,null,null,null,null,null,[null,null,");
strBuf_1.append("null,null,\"en\",null,null,null,[[[\"Not A(Brand\",\"99\"],[\"Micro");
strBuf_1.append("soft Edge\",\"121\"],[\"Chromium\",\"121\"]],0,\"Windows\",\"7.0.0\",\"x");
strBuf_1.append("86\",\"\",\"121.0.2277.128\"],[1,0,0,0,0]]],373,[[\"1708590220274\"");
strBuf_1.append(",null,null,null,null,null,null,\"[108,40400,538,1,\\\"608189437");
strBuf_1.append(".0\\\",\\\"iQTXZaeaB8eC0_gP_smmkAU\\\",null,null,null,\\\"en\\\",\\\"USA");
strBuf_1.append("\\\",0,8,5109,null,0,0,null,\\\"og-b9a3739c-f28f-4394-a403-aa34b");
strBuf_1.append("3a706fd\\\",null,null,null,null,null,null,null,0,null,null,nul");
strBuf_1.append("l,19037050,null,null,null,null,0,[1],1,null,null,null,null,n");
strBuf_1.append("ull,null,null,null,null,null,null,[0,2],null,null,null,null,");
strBuf_1.append("0,null,[2,5,\\\"bi\\\",39],null,null,0,0,1]\",null,null,null,null");
strBuf_1.append(",null,null,28800,[null,null,null,\"[null,null,[3701290]]\"],nu");
strBuf_1.append("ll,null,null,null,1],[\"1708590220279\",null,null,null,null,nu");
strBuf_1.append("ll,null,\"[107,40400,538,1,\\\"608189437.0\\\",\\\"iQTXZaeaB8eC0_gP");
strBuf_1.append("_smmkAU\\\",null,null,null,\\\"en\\\",\\\"USA\\\",0,8,5114,null,0,0,nu");
strBuf_1.append("ll,\\\"og-b9a3739c-f28f-4394-a403-aa34b3a706fd\\\",null,null,nul");
strBuf_1.append("l,null,null,null,null,8,null,null,null,19037050,null,null,nu");
strBuf_1.append("ll,null,0,[2],2,null,null,null,null,null,null,null,null,null");
strBuf_1.append(",null,null,[0,2],null,null,null,null,0,null,[2,5,\\\"bi\\\",39],");
strBuf_1.append("null,null,0,0,1]\",null,null,null,null,null,null,28800,[null,");
strBuf_1.append("null,null,\"[null,null,[3701290]]\"],null,null,null,null,2]],\"");
strBuf_1.append("1708590221275\",null,null,null,null,null,null,null,null,null,");
strBuf_1.append("null,null,null,null,[[null,[null,null,null,null,null,null,nu");
strBuf_1.append("ll,null,null,null,null,null,122505695]],9]]");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1EED15BD4CCE1A8C81DE53363373334", postData, requestData_1, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_7);

	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CCE1FFC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_80 = new SubRule("req_uri", 44, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_27.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[14], false, "atyp", null, 0, false);
	subContainer_27.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_88", null, 0, false);
	subContainer_27.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_97", null, 0, false);
	subContainer_27.addSubInstruction(sub_83);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA72D4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA720EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CCE202C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CCE2B2C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_28 = new DataSub();
	reqAction.addDataSub(subContainer_28);

		ISubRule sub_84 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_87", null, 0, false);
	subContainer_28.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_96", null, 0, false);
	subContainer_28.addSubInstruction(sub_85);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA72D4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CCE1FFC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CCE2B5C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/x-icon");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4CF2B4EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "play.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Access-Control-Request-Method", "POST", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Access-Control-Request-Headers", "x-goog-authuser", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://ogs.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://ogs.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_86 = new SubRule("req_uri", 25, 4, true, (IDCCoreVar)dcVars[16], false, "hasfast", null, 0, false);
	subContainer_29.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_uri", 12, 4, true, (IDCCoreVar)dcVars[15], false, "format", null, 0, false);
	subContainer_29.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[7], false, "Host_95", null, 0, false);
	subContainer_29.addSubInstruction(sub_88);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"OPTIONS",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4CF2B51C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4D19CBDC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(18);
					
		headers.add(new RequestHeaderData("Host", "play.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "447", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Goog-AuthUser", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://ogs.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://ogs.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_9(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_89 = new SubRule("req_uri", 25, 4, true, (IDCCoreVar)dcVars[16], false, "hasfast", null, 0, false);
	subContainer_30.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_uri", 12, 4, true, (IDCCoreVar)dcVars[15], false, "format", null, 0, false);
	subContainer_30.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_X-Goog-AuthUser_1", 0, 1, false, (IDCCoreVar)dcVars[20], false, "x-goog-authuser", null, 0, false);
	subContainer_30.addSubInstruction(sub_91);
		ISubRule sub_92 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[7], false, "Host_94", null, 0, false);
	subContainer_30.addSubInstruction(sub_92);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA72D4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CCE1FFC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA72D4C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4D19CC0C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("[[1,null,null,null,null,null,null,null,null,null,[null,null,");
strBuf_2.append("null,null,\"en\",null,\"boq_onegooglehttpserver_20240220.03_p0\"");
strBuf_2.append(",null,null,[1,0,0,0,0]]],729,[[\"1708590221996\",null,null,nul");
strBuf_2.append("l,null,null,null,\"[[[70881],538,[]]]\",null,null,null,null,nu");
strBuf_2.append("ll,null,28800,null,null,null,null,null,1]],\"1708590221996\",n");
strBuf_2.append("ull,null,null,null,null,null,null,null,null,null,null,null,n");
strBuf_2.append("ull,[[null,[null,null,null,null,null,null,null,null,null,nul");
strBuf_2.append("l,null,null,128566913]],9]]");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1EED15BD4D19D21C81DE53363373334", postData, requestData_2, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_8);

	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4D19D6CC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "play.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "1435", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_10(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_93 = new SubRule("req_uri", 25, 4, true, (IDCCoreVar)dcVars[16], false, "hasfast", null, 0, false);
	subContainer_31.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_uri", 12, 4, true, (IDCCoreVar)dcVars[15], false, "format", null, 0, false);
	subContainer_31.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_86", null, 0, false);
	subContainer_31.addSubInstruction(sub_95);
		ISubRule sub_96 = new SubRule("req_hdr_Host_1", 0, 15, false, (IDCCoreVar)vars[7], false, "Host_93", null, 0, false);
	subContainer_31.addSubInstruction(sub_96);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA72D4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3DE62A0C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CCE1FFC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4D19D6FC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_10(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("[[1,null,null,null,null,null,null,null,null,null,[null,null,");
strBuf_3.append("null,null,\"en\",null,null,null,[[[\"Not A(Brand\",\"99\"],[\"Micro");
strBuf_3.append("soft Edge\",\"121\"],[\"Chromium\",\"121\"]],0,\"Windows\",\"7.0.0\",\"x");
strBuf_3.append("86\",\"\",\"121.0.2277.128\"],[1,0,0,0,0]]],373,[[\"1708590221686\"");
strBuf_3.append(",null,null,null,null,null,null,\"[109,40400,538,1,\\\"608189437");
strBuf_3.append(".0\\\",\\\"iQTXZaeaB8eC0_gP_smmkAU\\\",null,null,null,\\\"en\\\",\\\"USA");
strBuf_3.append("\\\",0,8,6521,null,0,0,null,\\\"og-b9a3739c-f28f-4394-a403-aa34b");
strBuf_3.append("3a706fd\\\",null,null,null,null,null,null,null,32936,null,null");
strBuf_3.append(",null,19037050,null,null,null,null,0,[3],3,null,null,null,nu");
strBuf_3.append("ll,null,null,null,null,null,null,null,[0,2],null,null,null,n");
strBuf_3.append("ull,0,null,[2,5,\\\"bi\\\",39],null,null,0,0,1]\",null,null,null,");
strBuf_3.append("null,null,null,28800,[null,null,null,\"[null,null,[3701290]]\"");
strBuf_3.append("],null,null,null,null,3],[\"1708590221689\",null,null,null,nul");
strBuf_3.append("l,null,null,\"[36,40400,538,1,\\\"608189437.0\\\",\\\"iQTXZaeaB8eC0");
strBuf_3.append("_gP_smmkAU\\\",null,null,null,\\\"en\\\",\\\"USA\\\",0,8,6523,null,0,0");
strBuf_3.append(",null,\\\"og-b9a3739c-f28f-4394-a403-aa34b3a706fd\\\",null,null,");
strBuf_3.append("null,null,1415,null,null,32938,null,null,null,19037050,null,");
strBuf_3.append("null,null,null,null,null,4,-1,null,null,null,76,256,1087,145");
strBuf_3.append("7,null,null,null,[0,2,1,0,0],null,null,null,null,0,null,[2,5");
strBuf_3.append(",\\\"bi\\\",39],null,null,0,0,1]\",null,null,null,null,null,null,");
strBuf_3.append("28800,[null,null,null,\"[null,null,[3701290]]\"],null,null,nul");
strBuf_3.append("l,null,4]],\"1708590223306\",null,null,null,null,null,null,nul");
strBuf_3.append("l,null,null,null,null,null,null,[[null,[null,null,null,null,");
strBuf_3.append("null,null,null,null,null,null,null,null,122505695]],9]]");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1EED15BD4D19DCCC81DE53363373334", postData, requestData_3, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_9);

	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4D19E25C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "adservice.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_97 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_85", null, 0, false);
	subContainer_32.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[5], false, "Host_92", null, 0, false);
	subContainer_32.addSubInstruction(sub_98);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CA72D4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD3D031E1C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4CCE1FFC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4D19E28C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(1735, 1, parent, parent, "A1EED15BD4D8CB6AC81DE53363373334");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "IBM DevOps Test Performance - Google Search", "A1EED15BD4D8CB6AC81DE53363373334") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_33(this, true, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "gen_204{11}",	"/gen_204?atyp=i&ei=iQTXZdapBqjT5NoPydm08Ao&ct=slh&v=t1&m=HV&pv=0.4249947537920342&me=1:1708590217295,V,0,0,1488,750:0,B,750:0,N,1,iQTXZdapBqjT5NoPydm08Ao:0,R,1,1,0,0,1488,750:2952,x:16484,e,U&zx=1708590236731&opi=89978449", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_34(this, false, "A1EED15BD3C905E0C81DE53363373334", false, true,
						"Config_1", "search{28}",	"/search?q=IBM+DevOps+Test+Performance&sca_esv=dcfe5edb8f188ebf&source=hp&ei=iQTXZdapBqjT5NoPydm08Ao&iflsig=ANes7DEAAAAAZdcSmYh873iPFmtl2Oj-sWRFEmClYsG4&ved=0ahUKEwiWktTHwr6EAxWoKVkFHcksDa4Q4dUDCA8&uact=5&oq=IBM+DevOps+Test+Performance&gs_lp=Egdnd3Mtd2l6IhtJQk0gRGV2T3BzIFRlc3QgUGVyZm9ybWFuY2UyBRAhGKABMgUQIRigAUjLQFAAWMwycAB4AJABAJgBvAGgAbYOqgEEMjQuM7gBA8gBAPgBAcICCxAAGIAEGLEDGIMBwgIREC4YgAQYsQMYgwEYxwEY0QPCAgsQLhiABBixAxiDAcICDhAuGIAEGLEDGMcBGNEDwgIOEAAYgAQYigUYsQMYgwHCAgUQLhiABMICCBAAGIAEGLEDwgIREC4YgwEYxwEYsQMY0QMYgATCAgsQLhiABBjHARjRA8ICBRAAGIAEwgIGEAAYFhgewgILEAAYgAQYigUYhgPCAgUQIRifBQ&sclient=gws-wiz", true, false), 1, 100, "A1EED15BD4D8CB6EC81DE53363373334", 3);
				httpParallel.addRequest(0, request_35(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "googlelogo_color_92x30dp.png",	"/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png", true, false), 133, 100, "A1EED15BD4D8CC2EC81DE53363373334", 3);
				httpParallel.addRequest(1, request_36(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204{12}",	"/gen_204?s=web&t=aft&atyp=csi&ei=nATXZfbCLtiYptQP0Lm46AM&rt=wsrt.97,aft.327,afti.327,afts.308,frts.312,frvt.327,hst.81,prt.350,sct.253&frtp=1052&imn=22&ima=1&imad=1&imac=1&wh=750&aft=1&aftp=750&opi=89978449", true, false), 60, 100, "A1EED15BD4D8CC2EC81DE53363373334", 3);
				httpParallel.addRequest(1, request_37(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "m=attn,cdos,cr,gwc,hsm,jsa,mb4ZUb,d,csi,cEt90b,SNUn3,qddgKe,sTsDMc,dtl0hd,eHDfl",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=ACAAACoQAAAAAAAAAAAAAACAAAAAAKHQNRMOAdgAAeBLACABhAAEYIUeCgqEADAAUBDw-U8AAAAAAIQJCAwA4QJIITgIAACYIKoAsgM-AAAAQGA_QAwg8ICAAABwIH6ABYEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=1/ed=1/dg=2/rs=ACT90oGZX6PkAXZ2yLvUDy1HzHGsvIgTOg/ee=AfeaP:TkrAjf;Afksuc:wMx0R;BMxAGc:E5bFse;BgS6mb:fidj5d;BjwMce:cXX2Wb;CxXAWb:YyRLvc;DULqB:RKfG5c;Dkk6ge:wJqrrd;DpcR3d:zL72xf;EABSZ:MXZt9d;ESrPQc:mNTJvc;EVNhjf:pw70Gc;EmZ2Bf:zr1jrb;EnlcNd:WeHg4;Erl4fe:FloWmf,FloWmf;F9mqte:UoRcbe;Fmv9Nc:O1Tzwc;G0KhTb:LIaoZ;G6wU6e:hPyGBb;GleZL:J1A7Od;HMDDWe:G8QUdb;HqeXPd:cmbnH;IBADCc:RYquRb;IoGlCf:b5lhvb;IsdWVc:qzxzOb;JXS8fb:Qj0suc;JbMT3:M25sS;JsbNhc:Xd8iUd;KOxcK:OZqGte;KQzWid:ZMKkN;KcokUb:KiuZBf;KeeMUb:HiPxjc;KpRAue:Tia57b;LBgRLc:XVMNvd;LEikZe:byfTOb,lsjVmc;LsNahb:ucGLNb;Me32dd:MEeYgc;NPKaK:PVlQOd;NSEoX:lazG7b;Np8Qkd:Dpx6qc;Nyt6ic:jn2sGd;OgagBe:cNTe0;Oj465e:KG2eXe,KG2eXe;OohIYe:mpEAQb;Pjplud:EEDORb,PoEs9b;PqHfGe:im2cZe;Q1Ow7b:x5CSu;QGR0gd:Mlhmy;R2kc8b:ALJqWb;R4IIIb:QWfeKf;R9Ulx:CR7Ufe;RDNBlf:zPRCJb;SLtqO:Kh1xYe;SMDL4c:fTfGO,pnvXVc;SNUn3:ZwDk9d,x8cHvb;ShpF6e:N0pvGc;TxfV6d:YORN0b;U96pRd:FsR04;UDrY1c:eps46d;UVmjEd:EesRsb;UyG7Kb:wQd0G;V2HTTe:RolTY;VGRfx:VFqbr;VN6jIc:ddQyuf;VOcgDe:YquhTb;VsAqSb:PGf2Re;VxQ32b:k0XsBb;WCEKNd:I46Hvd;WDGyFe:jcVOxd;Wfmdue:g3MJlb;XUezZ:sa7lqb;YV5bee:IvPZ6d;ZMvdv:PHFPjb;ZWEUA:afR4Cf;a56pNe:JEfCwb;aAJE9c:WHW6Ef;aZ61od:arTwJ;bFZ6gf:RsDQqe;bcPXSc:gSZLJb;cEt90b:ws9Tlc;cFTWae:gT8qnd;coJ8e:KvoW8;dIoSBb:ZgGg9b;dLlj2:Qqt3Gf;daB6be:lMxGPd;dtl0hd:lLQWFe;eBAeSb:Ck63tb;eBZ5Nd:audvde;eHDfl:ofjVkb;eO3lse:nFClrf;fWLTFc:TVBJbf;g8nkx:U4MzKc;gaub4:TN6bMe;gtVSi:ekUOYd;h3MYod:cEt90b;hK67qb:QWEO5b;heHB1:sFczq;hjRo6e:F62sG;iFQyKf:QIhFr,vfuNJf;imqimf:jKGL2e;io8t5d:sgY6Zb;jY0zg:Q6tNgc;k2Qxcb:XY51pe;kCQyJ:ueyPK;kMFpHd:OTA3Ae;kbAm9d:MkHyGd;lkq0A:JyBE3e;nAFL3:NTMZac,s39S4;oGtAuc:sOXFj;oSUNyd:fTfGO,fTfGO,pnvXVc;oUlnpc:RagDlc;okUaUd:wItadb;pKJiXd:VCenhc;pNsl2d:j9Yuyc;pXdRYb:JKoKVe;pj82le:mg5CW;qGV2uc:HHi04c;qZx2Fc:j0xrE;qaS3gd:yiLg6e;qavrXe:zQzcXe;qddgKe:d7YSfd,x4FYXe;rQSrae:C6D5Fc;sP4Vbe:VwDzFe;sTsDMc:kHVSUb;tH4IIe:Ymry6;tosKvd:ZCqP3;trZL0b:qY8PFe;uY49fb:COQbmf;uknmt:GkPrzb;uuQkY:u2V3ud;vGrMZ:lPJJ0c;vfVwPd:lcrkwe;w3bZCb:ZPGaIb;w4rSdf:XKiZ9;w9w86d:dt4g2b;wQlYve:aLUfP;wR5FRb:TtcOte;wV5Pjc:L8KGxe;whEZac:F4AmNb;xBbsrc:NEW1Qc;xbe2wc:uRMPBc;yGxLoc:FmAr0c;yxTchf:KUM7Z;z97YGf:oug9te;zOsCQe:Ko78Df;zaIgPb:Qtpxbd/m=attn,cdos,cr,gwc,hsm,jsa,mb4ZUb,d,csi,cEt90b,SNUn3,qddgKe,sTsDMc,dtl0hd,eHDfl", true, false), 56, 100, "A1EED15BD4DD844CC81DE53363373334", 3);
				httpParallel.addRequest(1, request_38(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204{13}",	"/gen_204?atyp=csi&ei=nATXZfbCLtiYptQP0Lm46AM&s=web&t=all&frtp=1052&imn=22&ima=1&imad=1&imac=1&wh=750&aft=1&aftp=750&adh=tv.533.3000335693359,t.533.3000335693359&ime=0&imex=0&imeh=0&imeha=0&imehb=0&imea=0&imeb=0&imel=0&imed=0&scp=0&fld=1687&mem=ujhs.21,tjhs.25,jhsl.4295,dm.8&nv=ne.2,feid.6fbbdccf-0e0b-41ff-a387-51bb7ba006c6&hp=&sys=hc.4&p=bs.false&rt=hst.81,sct.253,frts.312,frvt.327,prt.350,afti.327,afts.308,aft.327,aftqf.363,xjsls.386,dcl.388,xjses.589,xjsee.639,xjs.639,lcp.306,fcp.116,wsrt.97,cst.0,dnst.0,rqst.394,rspt.310,rqstt.13,unt.10,cstt.10,dit.485&zx=1708590237474&opi=89978449", true, false), 117, 100, "A1EED15BD4DD850FC81DE53363373334", 3);
				httpParallel.addRequest(1, request_39(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "search{29}",	"/complete/search?q&cp=0&client=gws-wiz-serp&xssi=t&gs_pcrt=2&hl=en&authuser=0&pq=IBM%20DevOps%20Test%20Performance&psi=nATXZfbCLtiYptQP0Lm46AM.1708590237529&dpr=1.25&nolsbt=1", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_40(this, false, "A1EED15BD4048840C81DE53363373334", false, false,
						"Config_1", "search{30}",	"/complete/search?q=IBM%20DevOps%20Test%20Performance&cp=0&client=gws-wiz-serp&xssi=t&gs_pcrt=3&hl=en&authuser=0&pq=IBM%20DevOps%20Test%20Performance&psi=nATXZfbCLtiYptQP0Lm46AM.1708590237529&dpr=1.25&ofp=EAEyigEKNQozV2hhdCBpcyB0aGUgdXNlIG9mIElCTSByYXRpb25hbCBwZXJmb3JtYW5jZSB0ZXN0ZXI_CiYKJFdoYXQgYXJlIHRoZSBiZW5lZml0cyBvZiBJQk0gRGV2T3BzPwomCiRXaGF0IGlzIHRoZSBsaWZlY3ljbGUgb2YgSUJNIERldk9wcz8Q5AI", true, false), 50, 100, "A1EED15BD4E4AF17C81DE53363373334", 3);
				httpParallel.addRequest(2, request_41(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "m=Eox39d,GElbSc,HYSCof,Zby8rf,fcDBE,pHXghd",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/ck=xjs.s.2yvZtZxi1-o.L.W.O/am=ACAAACoQAAAAAAAAAAAAAACAAAAAAKHQNRMOAdgAAeBLACABhAAEYIUeCgqEADAAUBDw-U8AAAAAAIQJCAwA4QJIITgIAACYIKoAsgM-AAAAQGA_QAwg8ICAAABwIH6ABYEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=1/exm=SNUn3,attn,cEt90b,cdos,cr,csi,d,dtl0hd,eHDfl,gwc,hsm,jsa,mb4ZUb,qddgKe,sTsDMc/excm=ABxRVc,AD6AIb,AOTkuc,B0xr7b,CX5LId,FmnE6b,FuQWyc,G4tpde,JxE93,KYXthe,KiXlnd,NsEUGe,Oa7Qpb,Ok4XMd,PoJj8d,SKZSKc,TO0csb,U3Ovcc,UbcHRb,UiPhkb,VL58m,VZLyBe,WFRJOb,WxJ6g,XHo6qe,YuNOCb,ZGLUZ,ZcOm0d,ZrXR8b,adn7N,bXyZdf,cKV22c,eTv59e,f26on,fNMhz,i5w0Yc,jkRPje,kCkfUb,kOSi0d,oOTiFc,qngJBf,rL2AR,sU6eaf,tOQULd,tlA71,tzTB5,y25qZb,yChgtb,ypVg7e,zoFt6e/ed=1/dg=2/ujg=1/rs=ACT90oF5fm_jhQfWdKJzwgF6EtOEjP-O9A/ee=AfeaP:TkrAjf;Afksuc:wMx0R;BMxAGc:E5bFse;BgS6mb:fidj5d;BjwMce:cXX2Wb;CxXAWb:YyRLvc;DULqB:RKfG5c;Dkk6ge:wJqrrd;DpcR3d:zL72xf;EABSZ:MXZt9d;ESrPQc:mNTJvc;EVNhjf:pw70Gc;EmZ2Bf:zr1jrb;EnlcNd:WeHg4;Erl4fe:FloWmf;F9mqte:UoRcbe;Fmv9Nc:O1Tzwc;G0KhTb:LIaoZ;G6wU6e:hPyGBb;GleZL:J1A7Od;HMDDWe:G8QUdb;HqeXPd:cmbnH;IBADCc:RYquRb;IoGlCf:b5lhvb;IsdWVc:qzxzOb;JXS8fb:Qj0suc;JbMT3:M25sS;JsbNhc:Xd8iUd;KOxcK:OZqGte;KQzWid:ZMKkN;KcokUb:KiuZBf;KeeMUb:HiPxjc;KpRAue:Tia57b;LBgRLc:XVMNvd;LEikZe:byfTOb,lsjVmc;LsNahb:ucGLNb;Me32dd:MEeYgc;NPKaK:PVlQOd;NSEoX:lazG7b;Np8Qkd:Dpx6qc;Nyt6ic:jn2sGd;OgagBe:cNTe0;Oj465e:KG2eXe;OohIYe:mpEAQb;Pjplud:EEDORb,PoEs9b;PqHfGe:im2cZe;Q1Ow7b:x5CSu;QGR0gd:Mlhmy;R2kc8b:ALJqWb;R4IIIb:QWfeKf;R9Ulx:CR7Ufe;RDNBlf:zPRCJb;SLtqO:Kh1xYe;SMDL4c:fTfGO,pnvXVc;SNUn3:ZwDk9d,x8cHvb;ShpF6e:N0pvGc;TxfV6d:YORN0b;U96pRd:FsR04;UDrY1c:eps46d;UVmjEd:EesRsb;UyG7Kb:wQd0G;V2HTTe:RolTY;VGRfx:VFqbr;VN6jIc:ddQyuf;VOcgDe:YquhTb;VsAqSb:PGf2Re;VxQ32b:k0XsBb;WCEKNd:I46Hvd;WDGyFe:jcVOxd;Wfmdue:g3MJlb;XUezZ:sa7lqb;YV5bee:IvPZ6d;ZMvdv:PHFPjb;ZWEUA:afR4Cf;a56pNe:JEfCwb;aAJE9c:WHW6Ef;aZ61od:arTwJ;bFZ6gf:RsDQqe;bcPXSc:gSZLJb;cEt90b:ws9Tlc;cFTWae:gT8qnd;coJ8e:KvoW8;dIoSBb:ZgGg9b;dLlj2:Qqt3Gf;daB6be:lMxGPd;dtl0hd:lLQWFe;eBAeSb:Ck63tb;eBZ5Nd:audvde;eHDfl:ofjVkb;eO3lse:nFClrf;fWLTFc:TVBJbf;g8nkx:U4MzKc;gaub4:TN6bMe;gtVSi:ekUOYd;h3MYod:cEt90b;hK67qb:QWEO5b;heHB1:sFczq;hjRo6e:F62sG;iFQyKf:QIhFr,vfuNJf;imqimf:jKGL2e;io8t5d:sgY6Zb;jY0zg:Q6tNgc;k2Qxcb:XY51pe;kCQyJ:ueyPK;kMFpHd:OTA3Ae;kbAm9d:MkHyGd;lkq0A:JyBE3e;nAFL3:NTMZac,s39S4;oGtAuc:sOXFj;oSUNyd:fTfGO,pnvXVc;oUlnpc:RagDlc;okUaUd:wItadb;pKJiXd:VCenhc;pNsl2d:j9Yuyc;pXdRYb:JKoKVe;pj82le:mg5CW;qGV2uc:HHi04c;qZx2Fc:j0xrE;qaS3gd:yiLg6e;qavrXe:zQzcXe;qddgKe:d7YSfd,x4FYXe;rQSrae:C6D5Fc;sP4Vbe:VwDzFe;sTsDMc:kHVSUb;tH4IIe:Ymry6;tosKvd:ZCqP3;trZL0b:qY8PFe;uY49fb:COQbmf;uknmt:GkPrzb;uuQkY:u2V3ud;vGrMZ:lPJJ0c;vfVwPd:lcrkwe;w3bZCb:ZPGaIb;w4rSdf:XKiZ9;w9w86d:dt4g2b;wQlYve:aLUfP;wR5FRb:TtcOte;wV5Pjc:L8KGxe;whEZac:F4AmNb;xBbsrc:NEW1Qc;xbe2wc:uRMPBc;yGxLoc:FmAr0c;yxTchf:KUM7Z;z97YGf:oug9te;zOsCQe:Ko78Df;zaIgPb:Qtpxbd/m=Eox39d,GElbSc,HYSCof,Zby8rf,fcDBE,pHXghd?xjs=s1", true, false), 54, 100, "A1EED15BD4E4AF17C81DE53363373334", 3);
				httpParallel.addRequest(3, request_42(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "rs=ACT90oF5fm_jhQfWdKJzwgF6EtOEjP-O9A",	"/xjs/_/js/md=3/k=xjs.s.en_US.TsusYybIbwg.O/ck=xjs.s.2yvZtZxi1-o.L.W.O/am=ACAAACoQAAAAAAAAAAAAAACAAAAAAKHQNRMOAdgAAeBLACABhAAEYIUeCgqEADAAUBDw-U8AAAAAAIQJCAwA4QJIITgIAACYIKoAsgM-AAAAQGA_QAwg8ICAAABwIH6ABYEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/rs=ACT90oF5fm_jhQfWdKJzwgF6EtOEjP-O9A", true, false), 54, 100, "A1EED15BD4E4AF17C81DE53363373334", 3);
				httpParallel.addRequest(4, request_43(this, false, "A1EED15BD406F9B9C81DE53363373334", false, false,
						"Config_1", "client_204{2}",	"/client_204?atyp=i&biw=1488&bih=750&dpr=1.25&ei=nATXZfbCLtiYptQP0Lm46AM&opi=89978449", true, false), 87, 100, "A1EED15BD4E4AF17C81DE53363373334", 3);
				httpParallel.addRequest(1, request_44(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "m=Da4hkd,EO13pd,EkevXb,GU4Gab,Gg40M,IX53Tb,KHourd,MpJwZc,RJ1Nyd,RagDlc,T5VV,UUJqVe,Wo3n8,aD8OEe,aDVF7,aa,abd,async,bgd,epYOx,foot,gOTY1,k6GQw,kyn,lli,msmzHf,mu,ogmBcd,q0xTif,rhYw1b,s39S4,sOXFj,sYEX8b,sb_wiz,sf,sonic,spch,tl,xfmZMb",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/ck=xjs.s.2yvZtZxi1-o.L.W.O/am=ACAAACoQAAAAAAAAAAAAAACAAAAAAKHQNRMOAdgAAeBLACABhAAEYIUeCgqEADAAUBDw-U8AAAAAAIQJCAwA4QJIITgIAACYIKoAsgM-AAAAQGA_QAwg8ICAAABwIH6ABYEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=1/exm=Eox39d,GElbSc,HYSCof,SNUn3,Zby8rf,attn,cEt90b,cdos,cr,csi,d,dtl0hd,eHDfl,fcDBE,gwc,hsm,jsa,mb4ZUb,pHXghd,qddgKe,sTsDMc/excm=ABxRVc,AD6AIb,AOTkuc,B0xr7b,CX5LId,FmnE6b,FuQWyc,G4tpde,JxE93,KYXthe,KiXlnd,NsEUGe,Oa7Qpb,Ok4XMd,PoJj8d,SKZSKc,TO0csb,U3Ovcc,UbcHRb,UiPhkb,VL58m,VZLyBe,WFRJOb,WxJ6g,XHo6qe,YuNOCb,ZGLUZ,ZcOm0d,ZrXR8b,adn7N,bXyZdf,cKV22c,eTv59e,f26on,fNMhz,i5w0Yc,jkRPje,kCkfUb,kOSi0d,oOTiFc,qngJBf,rL2AR,sU6eaf,tOQULd,tlA71,tzTB5,y25qZb,yChgtb,ypVg7e,zoFt6e/ed=1/dg=2/ujg=1/rs=ACT90oF5fm_jhQfWdKJzwgF6EtOEjP-O9A/ee=AfeaP:TkrAjf;Afksuc:wMx0R;BMxAGc:E5bFse;BgS6mb:fidj5d;BjwMce:cXX2Wb;CxXAWb:YyRLvc;DULqB:RKfG5c;Dkk6ge:wJqrrd;DpcR3d:zL72xf;EABSZ:MXZt9d;ESrPQc:mNTJvc;EVNhjf:pw70Gc;EmZ2Bf:zr1jrb;EnlcNd:WeHg4;Erl4fe:FloWmf;F9mqte:UoRcbe;Fmv9Nc:O1Tzwc;G0KhTb:LIaoZ;G6wU6e:hPyGBb;GleZL:J1A7Od;HMDDWe:G8QUdb;HqeXPd:cmbnH;IBADCc:RYquRb;IoGlCf:b5lhvb;IsdWVc:qzxzOb;JXS8fb:Qj0suc;JbMT3:M25sS;JsbNhc:Xd8iUd;KOxcK:OZqGte;KQzWid:ZMKkN;KcokUb:KiuZBf;KeeMUb:HiPxjc;KpRAue:Tia57b;LBgRLc:XVMNvd;LEikZe:byfTOb,lsjVmc;LsNahb:ucGLNb;Me32dd:MEeYgc;NPKaK:PVlQOd;NSEoX:lazG7b;Np8Qkd:Dpx6qc;Nyt6ic:jn2sGd;OgagBe:cNTe0;Oj465e:KG2eXe;OohIYe:mpEAQb;Pjplud:EEDORb,PoEs9b;PqHfGe:im2cZe;Q1Ow7b:x5CSu;QGR0gd:Mlhmy;R2kc8b:ALJqWb;R4IIIb:QWfeKf;R9Ulx:CR7Ufe;RDNBlf:zPRCJb;SLtqO:Kh1xYe;SMDL4c:fTfGO,pnvXVc;SNUn3:ZwDk9d,x8cHvb;ShpF6e:N0pvGc;TxfV6d:YORN0b;U96pRd:FsR04;UDrY1c:eps46d;UVmjEd:EesRsb;UyG7Kb:wQd0G;V2HTTe:RolTY;VGRfx:VFqbr;VN6jIc:ddQyuf;VOcgDe:YquhTb;VsAqSb:PGf2Re;VxQ32b:k0XsBb;WCEKNd:I46Hvd;WDGyFe:jcVOxd;Wfmdue:g3MJlb;XUezZ:sa7lqb;YV5bee:IvPZ6d;ZMvdv:PHFPjb;ZWEUA:afR4Cf;a56pNe:JEfCwb;aAJE9c:WHW6Ef;aZ61od:arTwJ;bFZ6gf:RsDQqe;bcPXSc:gSZLJb;cEt90b:ws9Tlc;cFTWae:gT8qnd;coJ8e:KvoW8;dIoSBb:ZgGg9b;dLlj2:Qqt3Gf;daB6be:lMxGPd;dtl0hd:lLQWFe;eBAeSb:Ck63tb;eBZ5Nd:audvde;eHDfl:ofjVkb;eO3lse:nFClrf;fWLTFc:TVBJbf;g8nkx:U4MzKc;gaub4:TN6bMe;gtVSi:ekUOYd;h3MYod:cEt90b;hK67qb:QWEO5b;heHB1:sFczq;hjRo6e:F62sG;iFQyKf:QIhFr,vfuNJf;imqimf:jKGL2e;io8t5d:sgY6Zb;jY0zg:Q6tNgc;k2Qxcb:XY51pe;kCQyJ:ueyPK;kMFpHd:OTA3Ae;kbAm9d:MkHyGd;lkq0A:JyBE3e;nAFL3:NTMZac,s39S4;oGtAuc:sOXFj;oSUNyd:fTfGO,pnvXVc;oUlnpc:RagDlc;okUaUd:wItadb;pKJiXd:VCenhc;pNsl2d:j9Yuyc;pXdRYb:JKoKVe;pj82le:mg5CW;qGV2uc:HHi04c;qZx2Fc:j0xrE;qaS3gd:yiLg6e;qavrXe:zQzcXe;qddgKe:d7YSfd,x4FYXe;rQSrae:C6D5Fc;sP4Vbe:VwDzFe;sTsDMc:kHVSUb;tH4IIe:Ymry6;tosKvd:ZCqP3;trZL0b:qY8PFe;uY49fb:COQbmf;uknmt:GkPrzb;uuQkY:u2V3ud;vGrMZ:lPJJ0c;vfVwPd:lcrkwe;w3bZCb:ZPGaIb;w4rSdf:XKiZ9;w9w86d:dt4g2b;wQlYve:aLUfP;wR5FRb:TtcOte;wV5Pjc:L8KGxe;whEZac:F4AmNb;xBbsrc:NEW1Qc;xbe2wc:uRMPBc;yGxLoc:FmAr0c;yxTchf:KUM7Z;z97YGf:oug9te;zOsCQe:Ko78Df;zaIgPb:Qtpxbd/m=Da4hkd,EO13pd,EkevXb,GU4Gab,Gg40M,IX53Tb,KHourd,MpJwZc,RJ1Nyd,RagDlc,T5VV,UUJqVe,Wo3n8,aD8OEe,aDVF7,aa,abd,async,bgd,epYOx,foot,gOTY1,k6GQw,kyn,lli,msmzHf,mu,ogmBcd,q0xTif,rhYw1b,s39S4,sOXFj,sYEX8b,sb_wiz,sf,sonic,spch,tl,xfmZMb?xjs=s2", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_45(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "m=eTVOC,Pq506,AjRVIe,tE6Rzd,phecbc,q28gvc,g0Ekse,jtFQAf,bIMMof,ARtdse,z2eFcc,QzraZb,I9JIjc,nzu4Ud,gGYzg,TnJGKb,SnmExf,sy109,sylg,sylh,syli,sylj,syj6,syjp,sy1d8,syip,syit,sy1d9,syj3,syjl,syjm,syk1,sy1da,sy1db,sykz,syiv,sykx,syl0,syi7,syjc,syjv,sykt,sykv,syl4,sylt,sylu,sylv,sylw,sylx,syly,sylz,sym0,sym1,sym2,sym3,sym4,sym5,sym6,sym7,sym8,sym9,syma,symb,symc,symd,syme,symf,symg,symh,symi,symj,symk,syhs,syml,symm,symn,symo,symp,symq,syl1,syl2,syl6,syl8,syla,syj7,synd,syne,sy1er,syir,syx4,sywz,syx5,syin,syx6,syx7,syx8,synb,syif,syww,sywx,syjz,syn2,synp,sywy,syx0,sylm,syln,sy1em,sy1en,syia,syix,sy1eo,sy1ep,sy1eq,sywi,sywj,sywk,sywl,sywm,sywn,sywp,sywq,sywr,syws,sywt,sywu,syk4,sywh,sywv",	"/xjs/_/ss/k=xjs.s.2yvZtZxi1-o.L.W.O/am=ACAAACoQAAAAAAAAAAAAAACAAAAAACAAMBMOANgAAOBJAAAABAAAQIQAAACEADAAEBAAAAAAAAAAAAQACAwAAQJIIRgIAACYIKoAsgMAAAAAACAAQAwg8ICAAABgAAAABIAcIAgAAAAAAAAAAgAAAAAAAwAAAAAAAAAAAAAAAAAAAABQAAAAAAAAAAAAAAAAABA/d=0/dg=2/rs=ACT90oFUALUssgLEVflv8f9pvOW6k4w6Sg/m=eTVOC,Pq506,AjRVIe,tE6Rzd,phecbc,q28gvc,g0Ekse,jtFQAf,bIMMof,ARtdse,z2eFcc,QzraZb,I9JIjc,nzu4Ud,gGYzg,TnJGKb,SnmExf,sy109,sylg,sylh,syli,sylj,syj6,syjp,sy1d8,syip,syit,sy1d9,syj3,syjl,syjm,syk1,sy1da,sy1db,sykz,syiv,sykx,syl0,syi7,syjc,syjv,sykt,sykv,syl4,sylt,sylu,sylv,sylw,sylx,syly,sylz,sym0,sym1,sym2,sym3,sym4,sym5,sym6,sym7,sym8,sym9,syma,symb,symc,symd,syme,symf,symg,symh,symi,symj,symk,syhs,syml,symm,symn,symo,symp,symq,syl1,syl2,syl6,syl8,syla,syj7,synd,syne,sy1er,syir,syx4,sywz,syx5,syin,syx6,syx7,syx8,synb,syif,syww,sywx,syjz,syn2,synp,sywy,syx0,sylm,syln,sy1em,sy1en,syia,syix,sy1eo,sy1ep,sy1eq,sywi,sywj,sywk,sywl,sywm,sywn,sywp,sywq,sywr,syws,sywt,sywu,syk4,sywh,sywv?xjs=s3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_46(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "m=uKlGbf,sy1zd,sy3ci,DpX64d,sy3cj,EufiNb,syuh,P10Owf,syoc,syoj,syot,gSZvdb,sy594,vTw9Fc,sy15k,sy15j,syd1,sy15r,sy15q,sy15x,sy1bi,sy15u,sy1cd,sy1cc,sy1cf,sy1cg,M8IzD,syey,BYwJlf,sys3,sys5,VEbNoe,eTVOC,Pq506,kpAr,AjRVIe,tE6Rzd,phecbc,q28gvc,g0Ekse,jtFQAf,rKbWof,bIMMof,ARtdse,syhc,sy1zn,sy1zo,p2I2Je,z2eFcc,QzraZb,I9JIjc,nzu4Ud,gGYzg,FjjTod,TnJGKb,SnmExf,syof,syih,syjk,sy109,sy10v,sy10w,Mbif2,sylg,sylh,syl5,syli,sylj,syte,sy130,sy12h,sy127,sy12v,sy12o,sy12w,sy12x,sy131,sy132,sy12k,sy12y,sy13v,sy13u,syj6,syjp,sy1d8,syip,syit,syja,syjy,sy1d9,syj3,syjl,syjm,syk1,sy1da,sy1db,sy1k5,sy1fd,sy1k9,sy1mb,sy1ma,sy1mo,sy1mp,sy1my,sy1ry,sy1wn,sy1zg,sy1zp,syie,sy1zu,sy22b,syiw,sy22f,sy1zq,sy1zs,sy1zt,sy1zv,sy1zy,sy1zz,sy200,sy204,sy203,sy201,sy206,sy208,sy209,sy20a,sy20c,sy20k,sykz,syiv,sykx,syl0,syt4,sy20j,sy20i,syi7,syi8,syj8,syjc,syjv,sykq,sykr,sykt,sykv,sy20q,sy20p,sy20s,sy20t,sy20u,sy20v,syl4,sylt,sylu,sylv,sylw,sylx,syly,sylz,sym0,sym1,sym2,sym3,sym4,sym5,sym6,sym7,sym8,sym9,syma,symb,symc,symd,syme,symf,symg,symh,symi,symj,symk,syhs,syml,symm,symn,symo,symp,symq,sy20w,sy20z,sy210,sy20x,sy211,sy212,sy213,syl1,sy215,syl2,syl6,syl8,syla,sy216,sy217,sy218,syj7,synd,syne,syus,sy219,sy1er,sy1zi,sy21b,sy21c,sy21d,sy21e,sy21f,syir,syx4,sywz,syx5,syin,syx6,symr,syx7,syx8,synb,sy21h,sy21i,sy21j,sy21g,sy21a,sy21k,sy1ha,sy21s,syif,syjb,syjx,syww,sywx,syjz,syn2,synp,sywy,syx0,syxt,sy1h4,sy1h5,sy1hb,sy1hd,sy1he,sy20o,sy21p,sy21r,sy21t,sy21u,sy21z,sy220,sy221,sy222,sylm,syln,sytv,sytw,sylk,syll,syoe,sy226,sy225,sy227,sylp,sylq,sylr,syls,syrb,syrc,sytr,sy229,sy228,sy22a,sy22c,sy22d,sy22e,sy22g,sy1em,sy1en,syia,syix,sy1eo,sy1ep,sy1eq,sy1yx,sy1yw,sy1yz,sy1zw,sywi,sywj,sywk,sywl,sywm,sywn,sywp,sywq,sywr,syws,sywt,sywu,sy21l,syk4,sywh,sy21m,sy21n,sy21o,sy22i,sy22j,sy22h,sygr,sy214,sy21q,sy22l,sy22m,sy22k,sy22n,sy22o,sy22p,sy22q,sy22r,sy22s,sy22u,sy22t,sy22v,sy12j,sy12s,sy22w,sy22x,sy22y,sy22z,sy230,syk9,sy231,sy232,sy233,sywv,sy234,sy235,exgaYe,sy5f8,sy5r4,SC7lYd,sy1n1,sy3r7,bpec7b,sy28p,qcH9Lc,sy2qt,sy3cu,YFicMc",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=AAAAAAAAAAAAAAAAAAAAAACAAAAAAKHQBQAAAQAAAQACACABhAAEYAUeCgqEADAAUBDw-U8AAAAAAIQJAAwA4AIAISAIAAAAAKAAAAA-AAAAQGA_AAAAAAAAAABwIH6AAQEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=0/dg=2/rs=ACT90oEpxiagflsSK1R1b_vEgGMUIe-0Cw/m=uKlGbf,sy1zd,sy3ci,DpX64d,sy3cj,EufiNb,syuh,P10Owf,syoc,syoj,syot,gSZvdb,sy594,vTw9Fc,sy15k,sy15j,syd1,sy15r,sy15q,sy15x,sy1bi,sy15u,sy1cd,sy1cc,sy1cf,sy1cg,M8IzD,syey,BYwJlf,sys3,sys5,VEbNoe,eTVOC,Pq506,kpAr,AjRVIe,tE6Rzd,phecbc,q28gvc,g0Ekse,jtFQAf,rKbWof,bIMMof,ARtdse,syhc,sy1zn,sy1zo,p2I2Je,z2eFcc,QzraZb,I9JIjc,nzu4Ud,gGYzg,FjjTod,TnJGKb,SnmExf,syof,syih,syjk,sy109,sy10v,sy10w,Mbif2,sylg,sylh,syl5,syli,sylj,syte,sy130,sy12h,sy127,sy12v,sy12o,sy12w,sy12x,sy131,sy132,sy12k,sy12y,sy13v,sy13u,syj6,syjp,sy1d8,syip,syit,syja,syjy,sy1d9,syj3,syjl,syjm,syk1,sy1da,sy1db,sy1k5,sy1fd,sy1k9,sy1mb,sy1ma,sy1mo,sy1mp,sy1my,sy1ry,sy1wn,sy1zg,sy1zp,syie,sy1zu,sy22b,syiw,sy22f,sy1zq,sy1zs,sy1zt,sy1zv,sy1zy,sy1zz,sy200,sy204,sy203,sy201,sy206,sy208,sy209,sy20a,sy20c,sy20k,sykz,syiv,sykx,syl0,syt4,sy20j,sy20i,syi7,syi8,syj8,syjc,syjv,sykq,sykr,sykt,sykv,sy20q,sy20p,sy20s,sy20t,sy20u,sy20v,syl4,sylt,sylu,sylv,sylw,sylx,syly,sylz,sym0,sym1,sym2,sym3,sym4,sym5,sym6,sym7,sym8,sym9,syma,symb,symc,symd,syme,symf,symg,symh,symi,symj,symk,syhs,syml,symm,symn,symo,symp,symq,sy20w,sy20z,sy210,sy20x,sy211,sy212,sy213,syl1,sy215,syl2,syl6,syl8,syla,sy216,sy217,sy218,syj7,synd,syne,syus,sy219,sy1er,sy1zi,sy21b,sy21c,sy21d,sy21e,sy21f,syir,syx4,sywz,syx5,syin,syx6,symr,syx7,syx8,synb,sy21h,sy21i,sy21j,sy21g,sy21a,sy21k,sy1ha,sy21s,syif,syjb,syjx,syww,sywx,syjz,syn2,synp,sywy,syx0,syxt,sy1h4,sy1h5,sy1hb,sy1hd,sy1he,sy20o,sy21p,sy21r,sy21t,sy21u,sy21z,sy220,sy221,sy222,sylm,syln,sytv,sytw,sylk,syll,syoe,sy226,sy225,sy227,sylp,sylq,sylr,syls,syrb,syrc,sytr,sy229,sy228,sy22a,sy22c,sy22d,sy22e,sy22g,sy1em,sy1en,syia,syix,sy1eo,sy1ep,sy1eq,sy1yx,sy1yw,sy1yz,sy1zw,sywi,sywj,sywk,sywl,sywm,sywn,sywp,sywq,sywr,syws,sywt,sywu,sy21l,syk4,sywh,sy21m,sy21n,sy21o,sy22i,sy22j,sy22h,sygr,sy214,sy21q,sy22l,sy22m,sy22k,sy22n,sy22o,sy22p,sy22q,sy22r,sy22s,sy22u,sy22t,sy22v,sy12j,sy12s,sy22w,sy22x,sy22y,sy22z,sy230,syk9,sy231,sy232,sy233,sywv,sy234,sy235,exgaYe,sy5f8,sy5r4,SC7lYd,sy1n1,sy3r7,bpec7b,sy28p,qcH9Lc,sy2qt,sy3cu,YFicMc?xjs=s3", true, false), 47, 100, "A1EED15BD4EBDBBEC81DE53363373334", 3);
				httpParallel.addRequest(2, request_47(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "bgasy",	"/async/bgasy?ei=nATXZfbCLtiYptQP0Lm46AM&opi=89978449&sca_esv=dcfe5edb8f188ebf&yv=3&cs=0&async=_fmt:jspb", true, false), 51, 100, "A1EED15BD4EBDBBEC81DE53363373334", 3);
				httpParallel.addRequest(4, request_48(this, false, "A1EED15BD406F9B9C81DE53363373334", true, false,
						"Config_1", "gen_204{14}",	"/gen_204?atyp=i&ct=phandle&cad=0,det:0&ei=nATXZfbCLtiYptQP0Lm46AM&zx=1708590237842&opi=89978449", true, false), 54, 100, "A1EED15BD4EBDBBEC81DE53363373334", 3);
				httpParallel.addRequest(0, request_49(this, false, "A1EED15BD4048840C81DE53363373334", true, false,
						"Config_1", "gen_204{15}",	"/gen_204?atyp=i&ei=nATXZfbCLtiYptQP0Lm46AM&dt19=2&zx=1708590237864&opi=89978449", true, false), 2, 100, "A1EED15BD55265EBC81DE53363373334", 3);
				httpParallel.addRequest(2, request_50(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "px.gif",	"/images/phd/px.gif", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_51(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "m=sy3co,sy3s5,w4UyN,syto,sytp,EbPKJf,sys6,eX5ure,bBErTe,sy1u3,sy1u4,cNgdQc,sy13l,sy13o,sy1ty,sy1ua,sy1ub,xJdv9e,sy1ul,LdB9sd,sy1tv,sy1tz,sy1u0,Wn3aEc,sys9,sy455,Qqt3Gf,dLlj2,hezEbd,hPyGBb,G6wU6e,syxk,syxl,sy1vv,sy4lu,sy6u1,sy6u2,sy6u3,Um3BXb,syh5,UBXHI,syh6,R3fhkb,sy48o,sy6lz,J9Q59e,sy48p,a6Sgfb",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=AAAAAAAAAAAAAAAAAAAAAACAAAAAAKHQBQAAAQAAAQACACABhAAEYAUeCgqEADAAUBDw-U8AAAAAAIQJAAwA4AIAISAIAAAAAKAAAAA-AAAAQGA_AAAAAAAAAABwIH6AAQEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=0/dg=2/rs=ACT90oEpxiagflsSK1R1b_vEgGMUIe-0Cw/m=sy3co,sy3s5,w4UyN,syto,sytp,EbPKJf,sys6,eX5ure,bBErTe,sy1u3,sy1u4,cNgdQc,sy13l,sy13o,sy1ty,sy1ua,sy1ub,xJdv9e,sy1ul,LdB9sd,sy1tv,sy1tz,sy1u0,Wn3aEc,sys9,sy455,Qqt3Gf,dLlj2,hezEbd,hPyGBb,G6wU6e,syxk,syxl,sy1vv,sy4lu,sy6u1,sy6u2,sy6u3,Um3BXb,syh5,UBXHI,syh6,R3fhkb,sy48o,sy6lz,J9Q59e,sy48p,a6Sgfb?xjs=s3", true, false), 72, 100, "A1EED15BD552675DC81DE53363373334", 3);
				httpParallel.addRequest(2, request_52(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "m=syrd,syts,WlNQGd,sy1qk,sy1ql,nabPbb,syod,syoh,syoi,DPreE,syra,CnSW2d,syty,sytz,syu2,syu3,syu5,syu6,sy3ri,sy6hc,VD4Qme,sy4or,ND0kmf,pjDTFb,sy27v,sy285,sy288,sy289,KgxeNb,sy28b,khkNpe,sy3cn,EfPGub",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=AAAAAAAAAAAAAAAAAAAAAACAAAAAAKHQBQAAAQAAAQACACABhAAEYAUeCgqEADAAUBDw-U8AAAAAAIQJAAwA4AIAISAIAAAAAKAAAAA-AAAAQGA_AAAAAAAAAABwIH6AAQEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=0/dg=2/rs=ACT90oEpxiagflsSK1R1b_vEgGMUIe-0Cw/m=syrd,syts,WlNQGd,sy1qk,sy1ql,nabPbb,syod,syoh,syoi,DPreE,syra,CnSW2d,syty,sytz,syu2,syu3,syu5,syu6,sy3ri,sy6hc,VD4Qme,sy4or,ND0kmf,pjDTFb,sy27v,sy285,sy288,sy289,KgxeNb,sy28b,khkNpe,sy3cn,EfPGub?xjs=s3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_53(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "gen_204{16}",	"/gen_204?atyp=i&ei=nATXZfbCLtiYptQP0Lm46AM&vp-aft=1&zx=1708590238038&opi=89978449", true, false), 17, 100, "A1EED15BD5526810C81DE53363373334", 3);
				httpParallel.addRequest(1, request_54(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "vpkg",	"/async/vpkg?ei=nATXZfbCLtiYptQP0Lm46AM&opi=89978449&sca_esv=dcfe5edb8f188ebf&yv=3&cs=0&async=_ck:xjs.s.2yvZtZxi1-o.L.W.O,_k:xjs.s.en_US.TsusYybIbwg.O,_am:ACAAACoQAAAAAAAAAAAAAACAAAAAAKHQNRMOAdgAAeBLACABhAAEYIUeCgqEADAAUBDw-U8AAAAAAIQJCAwA4QJIITgIAACYIKoAsgM-AAAAQGA_QAwg8ICAAABwIH6ABYEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA,_csss:ACT90oFUALUssgLEVflv8f9pvOW6k4w6Sg,_fmt:prog,_id:QPwIld", true, false), 25, 100, "A1EED15BD5526810C81DE53363373334", 3);
				httpParallel.addRequest(2, request_55(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "m=syf1,syf2,aLUfP",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=AAAAAAAAAAAAAAAAAAAAAACAAAAAAKHQBQAAAQAAAQACACABhAAEYAUeCgqEADAAUBDw-U8AAAAAAIQJAAwA4AIAISAIAAAAAKAAAAA-AAAAQGA_AAAAAAAAAABwIH6AAQEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=0/dg=2/rs=ACT90oEpxiagflsSK1R1b_vEgGMUIe-0Cw/m=syf1,syf2,aLUfP?xjs=s3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_56(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "m=kMFpHd,sy8j,bm51tf",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=AAAAAAAAAAAAAAAAAAAAAACAAAAAAKHQBQAAAQAAAQACACABhAAEYAUeCgqEADAAUBDw-U8AAAAAAIQJAAwA4AIAISAIAAAAAKAAAAA-AAAAQGA_AAAAAAAAAABwIH6AAQEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=0/dg=2/rs=ACT90oEpxiagflsSK1R1b_vEgGMUIe-0Cw/m=kMFpHd,sy8j,bm51tf?xjs=s3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(5, request_57(this, false, "A1EED15BD554B169C81DE53363373334", true, false,
						"Config_6", "ADyTd2Ebo0aYQQBQPOoCuTwdtc12KDXF13v7cu5cY__QwBKnzMLAB7qPDiGWG0_DcKSeyUW0hHH8y8thmwZTTVnp8VsHUEkzw5RH7eY7MrBhmcB7yUUfeA",	"/verify/ADyTd2Ebo0aYQQBQPOoCuTwdtc12KDXF13v7cu5cY__QwBKnzMLAB7qPDiGWG0_DcKSeyUW0hHH8y8thmwZTTVnp8VsHUEkzw5RH7eY7MrBhmcB7yUUfeA", true, false), 82, 100, "A1EED15BD4DD844CC81DE53363373334", 3);
				httpParallel.addRequest(2, request_58(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "m=sy13s,sy13t,dt4g2b",	"/xjs/_/js/k=xjs.s.en_US.TsusYybIbwg.O/am=AAAAAAAAAAAAAAAAAAAAAACAAAAAAKHQBQAAAQAAAQACACABhAAEYAUeCgqEADAAUBDw-U8AAAAAAIQJAAwA4AIAISAIAAAAAKAAAAA-AAAAQGA_AAAAAAAAAABwIH6AAQEcIAhQAgQAAACQB-B5QA5SWwAAAAAAAAAAAAACkCAIB6RfEAABAAAAAAAAAAAAgFSaWHkYACA/d=0/dg=2/rs=ACT90oEpxiagflsSK1R1b_vEgGMUIe-0Cw/m=sy13s,sy13t,dt4g2b?xjs=s3", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(2, request_59(this, false, "A1EED15BD3F8A160C81DE53363373334", false, false,
						"Config_1", "gen_204{17}",	"/gen_204?atyp=i&ct=psnt&cad=&nt=navigate&ei=nATXZfbCLtiYptQP0Lm46AM&zx=1708590238166&opi=89978449", true, false), 54, 100, "A1EED15BD554B213C81DE53363373334", 3);
				httpParallel.addRequest(1, request_60(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204{18}",	"/gen_204?atyp=csi&ei=ngTXZZC9A-qs5NoPi8mE-AI&s=async&astyp=vpkg&ima=0&imn=0&mem=ujhs.21,tjhs.25,jhsl.4295,dm.8&nv=ne.2,feid.6fbbdccf-0e0b-41ff-a387-51bb7ba006c6&hp=&rt=ttfb.117,st.135,bs.81940,aaft.138,acrt.138,art.139&zx=1708590238179&opi=89978449", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(3, request_61(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "gen_204{19}",	"/gen_204?atyp=i&ei=nATXZfbCLtiYptQP0Lm46AM&vp-aft=1&vp-aftasync=1&zx=1708590238180&opi=89978449", true, false), 64, 100, "A1EED15BD554B213C81DE53363373334", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4D8CB6EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_11(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_99 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[17], false, "v", null, 0, false);
	subContainer_33.addSubInstruction(sub_99);
		ISubRule sub_100 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_33.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[14], false, "atyp", null, 0, false);
	subContainer_33.addSubInstruction(sub_101);
		ISubRule sub_102 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_55", null, 0, false);
	subContainer_33.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_62", null, 0, false);
	subContainer_33.addSubInstruction(sub_103);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4D8CB71C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_11(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_10 = new HTTPPostDataChunk("A1EED15BD4D8CBE6C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_10);

	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4D8CC2EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[21], "&atyp=(.*?)&", 1, 1, 0, 0, false, "atyp_32", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[22], ";sca_esv=(.*?)&", 1, 1, 0, 0, false, "sca_esv_4", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[23], ";sei=(.*?)\"", 1, 1, 0, 0, false, "sei", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[24], "\\?hl=(.*?)\"", 1, 1, 0, 0, false, "hl_33", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[25], "<(([^>]*value=\"([^>]*?)\"[^>]*)|(?:[^>]*?))name=\"q\"[^>]*>", 1, 1, 0, 0, false, "value_4", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[26], ";gclid=(.*?)&", 1, 1, 0, 0, false, "gclid_3", null, 0, false);
	harvestContainer_6.addHarvestInstruction ("resp_content", dcVars[27], ";opi=(.*?)&", 1, 1, 0, 0, false, "opi_33", null, 0, false);
	IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_104 = new SubRule("req_uri", 107, 44, true, (IDCCoreVar)dcVars[13], false, "iflsig", null, 0, false);
	subContainer_34.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_uri", 76, 23, true, (IDCCoreVar)dcVars[12], false, "ei", null, 0, false);
	subContainer_34.addSubInstruction(sub_105);
		ISubRule sub_106 = new SubRule("req_uri", 70, 2, true, (IDCCoreVar)dcVars[9], false, "source", null, 0, false);
	subContainer_34.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_uri", 46, 16, true, (IDCCoreVar)dcVars[11], false, "sca_esv", null, 0, false);
	subContainer_34.addSubInstruction(sub_107);
		ISubRule sub_108 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_54", null, 0, false);
	subContainer_34.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_61", null, 0, false);
	subContainer_34.addSubInstruction(sub_109);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4D8CC31C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4DD8399C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_110 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_53", null, 0, false);
	subContainer_35.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_60", null, 0, false);
	subContainer_35.addSubInstruction(sub_111);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4DD839CC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4DD844CC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(24);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "text/plain;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_12(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_112 = new SubRule("req_uri", 198, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_36.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_uri", 33, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_36.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_uri", 26, 3, true, (IDCCoreVar)dcVars[21], false, "atyp", null, 0, false);
	subContainer_36.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_52", null, 0, false);
	subContainer_36.addSubInstruction(sub_115);
		ISubRule sub_116 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_59", null, 0, false);
	subContainer_36.addSubInstruction(sub_116);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4DD844FC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_12(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_11 = new HTTPPostDataChunk("A1EED15BD4DD84C8C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_11);

	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4DD850FC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[28], "\\?atyp=(.*?)&", 1, 1, 0, 0, false, "atyp_33", null, 0, false);
	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[29], "&v=(.*?)\"", 1, 1, 0, 0, false, "v_5", null, 0, false);
	IDataSub subContainer_37 = new DataSub();
	reqAction.addDataSub(subContainer_37);

		ISubRule sub_117 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_51", null, 0, false);
	subContainer_37.addSubInstruction(sub_117);
		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_58", null, 0, false);
	subContainer_37.addSubInstruction(sub_118);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4DD8512C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4E4AF17C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_13(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_119 = new SubRule("req_uri", 583, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_38.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_uri", 21, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_38.addSubInstruction(sub_120);
		ISubRule sub_121 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[21], false, "atyp", null, 0, false);
	subContainer_38.addSubInstruction(sub_121);
		ISubRule sub_122 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_50", null, 0, false);
	subContainer_38.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_57", null, 0, false);
	subContainer_38.addSubInstruction(sub_123);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4E4AF1AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_13(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_12 = new HTTPPostDataChunk("A1EED15BD4E4AF8FC81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_12);

	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4E4AFD6C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_39 = new DataSub();
	reqAction.addDataSub(subContainer_39);

		ISubRule sub_124 = new SubRule("req_uri", 64, 2, true, (IDCCoreVar)dcVars[24], false, "hl", null, 0, false);
	subContainer_39.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_49", null, 0, false);
	subContainer_39.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_56", null, 0, false);
	subContainer_39.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4E4AFD9C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4E7201BC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_127 = new SubRule("req_uri", 98, 2, true, (IDCCoreVar)dcVars[24], false, "hl", null, 0, false);
	subContainer_40.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_uri", 19, 33, true, (IDCCoreVar)dcVars[25], false, "q", null, 0, false);
	subContainer_40.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_48", null, 0, false);
	subContainer_40.addSubInstruction(sub_129);
		ISubRule sub_130 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_55", null, 0, false);
	subContainer_40.addSubInstruction(sub_130);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4E7201EC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4E72106C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_131 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_47", null, 0, false);
	subContainer_41.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_54", null, 0, false);
	subContainer_41.addSubInstruction(sub_132);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4E72109C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4E96A07C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_133 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_46", null, 0, false);
	subContainer_42.addSubInstruction(sub_133);
		ISubRule sub_134 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_53", null, 0, false);
	subContainer_42.addSubInstruction(sub_134);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4E96A0AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4EBDB07C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_135 = new SubRule("req_uri", 76, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_43.addSubInstruction(sub_135);
		ISubRule sub_136 = new SubRule("req_uri", 48, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_43.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_uri", 17, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_43.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_45", null, 0, false);
	subContainer_43.addSubInstruction(sub_138);
		ISubRule sub_139 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_52", null, 0, false);
	subContainer_43.addSubInstruction(sub_139);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4DD850FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4EBDB0AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4EBDBBEC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[30], ";this\\.status=(.*?);", 2, 2, 0, 0, false, "this.status", null, 0, false);
	IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_140 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_44", null, 0, false);
	subContainer_44.addSubInstruction(sub_140);
		ISubRule sub_141 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_51", null, 0, false);
	subContainer_44.addSubInstruction(sub_141);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4EBDB07C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4EBDBC1C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4EE4C07C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_142 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_43", null, 0, false);
	subContainer_45.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_50", null, 0, false);
	subContainer_45.addSubInstruction(sub_143);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4EBDB07C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4EE4C0AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD4F095F7C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_144 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_42", null, 0, false);
	subContainer_46.addSubInstruction(sub_144);
		ISubRule sub_145 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_49", null, 0, false);
	subContainer_46.addSubInstruction(sub_145);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4EBDB07C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD4F095FAC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD5526500C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-DoS-Behavior", "Embed", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_146 = new SubRule("req_uri", 61, 16, true, (IDCCoreVar)dcVars[22], false, "sca_esv", null, 0, false);
	subContainer_47.addSubInstruction(sub_146);
		ISubRule sub_147 = new SubRule("req_uri", 44, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_47.addSubInstruction(sub_147);
		ISubRule sub_148 = new SubRule("req_uri", 16, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_47.addSubInstruction(sub_148);
		ISubRule sub_149 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_41", null, 0, false);
	subContainer_47.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_48", null, 0, false);
	subContainer_47.addSubInstruction(sub_150);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4EBDB07C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5526503C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD55265EBC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_151 = new SubRule("req_uri", 87, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_48.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_uri", 42, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_48.addSubInstruction(sub_152);
		ISubRule sub_153 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_48.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_40", null, 0, false);
	subContainer_48.addSubInstruction(sub_154);
		ISubRule sub_155 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_47", null, 0, false);
	subContainer_48.addSubInstruction(sub_155);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4EBDB07C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4DD850FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD55265EEC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD552669EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_14(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_156 = new SubRule("req_uri", 71, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_49.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_49.addSubInstruction(sub_157);
		ISubRule sub_158 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_49.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_39", null, 0, false);
	subContainer_49.addSubInstruction(sub_159);
		ISubRule sub_160 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_46", null, 0, false);
	subContainer_49.addSubInstruction(sub_160);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4DD850FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD55265EBC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD55266A1C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_14(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_13 = new HTTPPostDataChunk("A1EED15BD5526716C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_13);

	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD552675DC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_161 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_38", null, 0, false);
	subContainer_50.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_45", null, 0, false);
	subContainer_50.addSubInstruction(sub_162);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD55265EBC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5526760C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD5526810C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_163 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_37", null, 0, false);
	subContainer_51.addSubInstruction(sub_163);
		ISubRule sub_164 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_44", null, 0, false);
	subContainer_51.addSubInstruction(sub_164);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD55265EBC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5526813C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD55268CFC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_165 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_36", null, 0, false);
	subContainer_52.addSubInstruction(sub_165);
		ISubRule sub_166 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_43", null, 0, false);
	subContainer_52.addSubInstruction(sub_166);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD55265EBC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD55268D2C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD552698EC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_15(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_167 = new SubRule("req_uri", 73, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_53.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_53.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_53.addSubInstruction(sub_169);
		ISubRule sub_170 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_35", null, 0, false);
	subContainer_53.addSubInstruction(sub_170);
		ISubRule sub_171 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_42", null, 0, false);
	subContainer_53.addSubInstruction(sub_171);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4DD850FC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD55265EBC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5526991C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_15(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_14 = new HTTPPostDataChunk("A1EED15BD5526A06C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_14);

	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554AEF4C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(22);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-DoS-Behavior", "Embed", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_172 = new SubRule("req_uri", 60, 16, true, (IDCCoreVar)dcVars[22], false, "sca_esv", null, 0, false);
	subContainer_54.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_uri", 43, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_54.addSubInstruction(sub_173);
		ISubRule sub_174 = new SubRule("req_uri", 15, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_54.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_34", null, 0, false);
	subContainer_54.addSubInstruction(sub_175);
		ISubRule sub_176 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_41", null, 0, false);
	subContainer_54.addSubInstruction(sub_176);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD55265EBC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554AEF7C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554AFE7C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_177 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_33", null, 0, false);
	subContainer_55.addSubInstruction(sub_177);
		ISubRule sub_178 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_40", null, 0, false);
	subContainer_55.addSubInstruction(sub_178);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554AEF4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554AFEAC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B0A6C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_179 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_32", null, 0, false);
	subContainer_56.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_39", null, 0, false);
	subContainer_56.addSubInstruction(sub_180);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554AEF4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B0A9C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B177C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "id.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_181 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_31", null, 0, false);
	subContainer_57.addSubInstruction(sub_181);
		ISubRule sub_182 = new SubRule("req_hdr_Host_1", 0, 13, false, (IDCCoreVar)vars[6], false, "Host_38", null, 0, false);
	subContainer_57.addSubInstruction(sub_182);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554AEF4C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B17AC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B213C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_183 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_30", null, 0, false);
	subContainer_58.addSubInstruction(sub_183);
		ISubRule sub_184 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_37", null, 0, false);
	subContainer_58.addSubInstruction(sub_184);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554AEF4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B216C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B2D6C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(21);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_185 = new SubRule("req_uri", 89, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_59.addSubInstruction(sub_185);
		ISubRule sub_186 = new SubRule("req_uri", 44, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_59.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_59.addSubInstruction(sub_187);
		ISubRule sub_188 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_29", null, 0, false);
	subContainer_59.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_36", null, 0, false);
	subContainer_59.addSubInstruction(sub_189);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554AEF4C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554B177C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4DD850FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B2D9C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B389C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_16(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_190 = new SubRule("req_uri", 240, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_60.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[21], false, "atyp", null, 0, false);
	subContainer_60.addSubInstruction(sub_191);
		ISubRule sub_192 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_28", null, 0, false);
	subContainer_60.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_35", null, 0, false);
	subContainer_60.addSubInstruction(sub_193);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554B2D6C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554B177C81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B38CC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_16(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_15 = new HTTPPostDataChunk("A1EED15BD554B401C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_15);

	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B448C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_17(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_194 = new SubRule("req_uri", 87, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_61.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_61.addSubInstruction(sub_195);
		ISubRule sub_196 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_61.addSubInstruction(sub_196);
		ISubRule sub_197 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_27", null, 0, false);
	subContainer_61.addSubInstruction(sub_197);
		ISubRule sub_198 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_34", null, 0, false);
	subContainer_61.addSubInstruction(sub_198);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554B2D6C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4D8CC2EC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD554B177C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD4DD850FC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B44BC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_17(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_16 = new HTTPPostDataChunk("A1EED15BD554B4C0C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_16);

	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(499, 1, parent, parent, "A1EED15BD554B515C81DE53363373334");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "DevOps Test | IBM", "A1EED15BD554B515C81DE53363373334") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(10, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_62(this, true, "A1EED15BD554B507C81DE53363373334", true, false,
						"Config_5", "ui{1}",	"/adsid/google/ui", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(1, request_63(this, false, "A1EED15BD3C905E0C81DE53363373334", false, false,
						"Config_1", "gen_204{20}",	"/gen_204?atyp=i&ei=nATXZfbCLtiYptQP0Lm46AM&vp-aft=1&vp-aftasync=1&vp-aftrpc=1&zx=1708590239218&opi=89978449", true, false), 350, 100, "A1EED15BD554B519C81DE53363373334", 3);
				httpParallel.addRequest(2, request_64(this, false, "A1EED15BD4096A47C81DE53363373334", false, false,
						"Config_1", "gen_204{21}",	"/gen_204?atyp=csi&ei=nATXZfbCLtiYptQP0Lm46AM&s=uvpgws&rt=ns.-1304,uvpbet.0,uvpbs.1,uvpbe.1181&zx=1708590239218&opi=89978449", true, false), 350, 100, "A1EED15BD554B519C81DE53363373334", 3);
				httpParallel.addRequest(2, request_65(this, false, "A1EED15BD4096A47C81DE53363373334", true, false,
						"Config_1", "gen_204{22}",	"/gen_204?atyp=i&ei=nATXZfbCLtiYptQP0Lm46AM&ct=slh&v=t1&im=M&m=HV&aqid=nATXZY2MNIWUnboPpOCOsAk&pv=0.6569539365395121&me=1:1708590237138,V,0,0,1488,750:0,B,2802:0,N,1,nATXZfbCLtiYptQP0Lm46AM:0,R,1,9,27,36,92,34:0,R,1,CA0QAA,163,88,1120,40:0,R,1,CAsQAQ,163,88,72,40:0,R,1,CAwQAQ,242,88,75,40:0,R,1,CAoQAQ,323,88,110,40:0,R,1,CAkQAQ,440,88,65,40:0,R,1,CAgQAA,183,194,600,504:0,R,1,CAUQGg,183,727,652,1958:373,x:46,T:0,R,1,9,27,36,92,34:0,R,1,CA0QAA,163,88,961,40:0,R,1,CAsQAQ,163,88,72,40:0,R,1,CAwQAQ,242,88,75,40:0,R,1,CAoQAQ,323,88,110,40:0,R,1,CAkQAQ,440,88,65,40:0,R,1,CEAQAQ,510,88,89,40:0,R,1,CEMQAQ,606,88,68,40:0,R,1,CEQQAQ,680,88,64,40:0,R,1,CEIQAQ,750,88,71,40:0,R,1,CEEQAQ,827,88,79,40:0,R,1,CAgQAA,183,194,600,504:0,R,1,CAUQGg,183,727,652,1958:15,T:0,R,1,9,27,36,92,34:0,R,1,CA0QAA,163,88,961,40:0,R,1,CAsQAQ,163,88,72,40:0,R,1,CAwQAQ,242,88,75,40:0,R,1,CAoQAQ,323,88,110,40:0,R,1,CAkQAQ,440,88,65,40:0,R,1,CEAQAQ,510,88,89,40:0,R,1,CEMQAQ,606,88,68,40:0,R,1,CEQQAQ,680,88,64,40:0,R,1,CEIQAQ,750,88,71,40:0,R,1,CEEQAQ,827,88,79,40:0,R,1,CAgQAA,183,194,600,504:0,R,1,CAUQGg,183,727,652,1958:2431,h,1,CAgQAA,i:17,h,1,CAgQAA,o:15,h,1,CAgQAA,i:1953,G,1,CAgQAA,229,83,1:0,c,412,277:0,G,1,CAgQAA,229,83:4,e,U&zx=1708590241992&opi=89978449", true, false), 2751, 100, "A1EED15BD554B665C81DE53363373334", 3);
				httpParallel.addRequest(1, request_66(this, false, "A1EED15BD3C905E0C81DE53363373334", true, false,
						"Config_1", "gen_204{23}",	"/gen_204?atyp=i&ei=nATXZfbCLtiYptQP0Lm46AM&ct=fa&vt=paq:[1199,0,[[%22ibm.com%22,0.237]],null,0,null,null,[1,null,[[0,1,1316,1413,null,1708590237138]],%22nATXZY2MNIWUnboPpOCOsAk%22,1708590241995,1708590241988]]&pvt=4858&s=0&pv=2375&authuser=0&zx=1708590241996&opi=89978449", true, false), 2755, 100, "A1EED15BD554B665C81DE53363373334", 3);
				httpParallel.addRequest(3, request_67(this, false, "A1EED15BD3F8A160C81DE53363373334", true, false,
						"Config_1", "gen_204{24}",	"/gen_204?atyp=csi&ei=nATXZfbCLtiYptQP0Lm46AM&s=web&nt=navigate&t=fi&st=5142&fid=1&zx=1708590242001&opi=89978449", true, false), 2761, 100, "A1EED15BD554B665C81DE53363373334", 3);
				httpParallel.addRequest(4, request_68(this, false, "A1EED15BD559926FC81DE53363373334", false, true,
						"Config_7", "devops-test",	"/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", true, false), 2653, 100, "A1EED15BD554B665C81DE53363373334", 3);
				httpParallel.addRequest(4, request_69(this, false, "A1EED15BD559926FC81DE53363373334", false, false,
						"Config_7", "YV0RdDE",	"/Qi8hc/mUU/j_z4/2RxzOF/45/1a9DbJcJmL/GiAcSikD/JUQ1/YV0RdDE", true, false), 59, 100, "A1EED15BD559927DC81DE53363373334", 3);
				httpParallel.addRequest(4, request_70(this, false, "A1EED15BD559926FC81DE53363373334", false, false,
						"Config_7", "clientlib-idlBundle.min.ACSHASH8e0a5ada9d90d4e69372aa22f35e468f.js",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlBundle.min.ACSHASH8e0a5ada9d90d4e69372aa22f35e468f.js", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_71(this, false, "A1EED15BD559926FC81DE53363373334", false, false,
						"Config_7", "sec-4-2.css",	"/_sec/cp_challenge/sec-4-2.css", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(4, request_72(this, false, "A1EED15BD559926FC81DE53363373334", true, false,
						"Config_7", "clientlib-idlStyles.min.ACSHASHb07d72d124dca340f1f121a435a56f0a.css",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlStyles.min.ACSHASHb07d72d124dca340f1f121a435a56f0a.css", true, false), 1045, 100, "A1EED15BD5715F6CC81DE53363373334", 3);
				httpParallel.addRequest(5, request_73(this, false, "A1EED15BD58B9D77C81DE53363373334", true, false,
						"Config_7", "clientlib-idlStylesCarbon.min.ACSHASH6b7f7aca22f55d7ccef93668b20d1b11.css",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlStylesCarbon.min.ACSHASH6b7f7aca22f55d7ccef93668b20d1b11.css", true, false), 84, 100, "A1EED15BD559927DC81DE53363373334", 2);
				httpParallel.addRequest(6, request_74(this, false, "A1EED15BD58B9E0CC81DE53363373334", false, false,
						"Config_7", "clientlib-idlWebComponents.min.ACSHASHaa58d161067036934162c981c49c78ef.js",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlWebComponents.min.ACSHASHaa58d161067036934162c981c49c78ef.js", true, false), 107, 100, "A1EED15BD559927DC81DE53363373334", 2);
				httpParallel.addRequest(7, request_75(this, false, "A1EED15BD58B9EA1C81DE53363373334", true, false,
						"Config_7", "clientlib-target-antiflicker.min.ACSHASH36a1efb28e947b5873f4a28c2cf9d5eb.js",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-target-antiflicker.min.ACSHASH36a1efb28e947b5873f4a28c2cf9d5eb.js", true, false), 108, 100, "A1EED15BD559927DC81DE53363373334", 2);
				httpParallel.addRequest(8, request_76(this, false, "A1EED15BD58B9F36C81DE53363373334", true, false,
						"Config_7", "clientlib-idlStyles.min.ACSHASH0c4f9840b697954a53613c359277701b.js",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlStyles.min.ACSHASH0c4f9840b697954a53613c359277701b.js", true, false), 108, 100, "A1EED15BD559927DC81DE53363373334", 2);
				httpParallel.addRequest(9, request_77(this, false, "A1EED15BD58B9FCBC81DE53363373334", false, false,
						"Config_7", "cm-app.min.js",	"/common/digitaladvisor/cm-app/latest/cm-app.min.js", true, false), 109, 100, "A1EED15BD559927DC81DE53363373334", 2);
				httpParallel.addRequest(6, request_78(this, false, "A1EED15BD58B9E0CC81DE53363373334", true, false,
						"Config_7", "sec-cpt-4-2.js",	"/_sec/cp_challenge/sec-cpt-4-2.js", true, false), 924, 100, "A1EED15BD58B9E1AC81DE53363373334", 3);
				httpParallel.addRequest(9, request_79(this, false, "A1EED15BD58B9FCBC81DE53363373334", true, false,
						"Config_7", "ffc8ae5d07a2166e6af1.ttf",	"/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlStyles/resources/fonts/ffc8ae5d07a2166e6af1.ttf?6n2ho", true, false), 1838, 100, "A1EED15BD58B9FD9C81DE53363373334", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B519C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "adservice.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "image", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_199 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_26", null, 0, false);
	subContainer_62.addSubInstruction(sub_199);
		ISubRule sub_200 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[5], false, "Host_33", null, 0, false);
	subContainer_62.addSubInstruction(sub_200);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B51CC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B5A6C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_18(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_201 = new SubRule("req_uri", 99, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_63.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_63.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_63.addSubInstruction(sub_203);
		ISubRule sub_204 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_25", null, 0, false);
	subContainer_63.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_32", null, 0, false);
	subContainer_63.addSubInstruction(sub_205);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B5A9C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_18(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_17 = new HTTPPostDataChunk("A1EED15BD554B61EC81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_17);

	}

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD554B665C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_19(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_206 = new SubRule("req_uri", 115, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_64.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_uri", 21, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_64.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[21], false, "atyp", null, 0, false);
	subContainer_64.addSubInstruction(sub_208);
		ISubRule sub_209 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_24", null, 0, false);
	subContainer_64.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_31", null, 0, false);
	subContainer_64.addSubInstruction(sub_210);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD554B668C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_19(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_18 = new HTTPPostDataChunk("A1EED15BD5571FF5C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_18);

	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD557203CC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_20(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_211 = new SubRule("req_uri", 1233, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_65.addSubInstruction(sub_211);
		ISubRule sub_212 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[29], false, "v", null, 0, false);
	subContainer_65.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_65.addSubInstruction(sub_213);
		ISubRule sub_214 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_65.addSubInstruction(sub_214);
		ISubRule sub_215 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_23", null, 0, false);
	subContainer_65.addSubInstruction(sub_215);
		ISubRule sub_216 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_30", null, 0, false);
	subContainer_65.addSubInstruction(sub_216);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD557203FC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_20(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_19 = new HTTPPostDataChunk("A1EED15BD55720B4C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_19);

	}

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD55990F0C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_21(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_217 = new SubRule("req_uri", 263, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_66.addSubInstruction(sub_217);
		ISubRule sub_218 = new SubRule("req_uri", 221, 1, true, (IDCCoreVar)dcVars[30], false, "s", null, 0, false);
	subContainer_66.addSubInstruction(sub_218);
		ISubRule sub_219 = new SubRule("req_uri", 19, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_66.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_uri", 14, 1, true, (IDCCoreVar)dcVars[28], false, "atyp", null, 0, false);
	subContainer_66.addSubInstruction(sub_220);
		ISubRule sub_221 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_22", null, 0, false);
	subContainer_66.addSubInstruction(sub_221);
		ISubRule sub_222 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_29", null, 0, false);
	subContainer_66.addSubInstruction(sub_222);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD55990F3C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_21(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_20 = new HTTPPostDataChunk("A1EED15BD5599168C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_20);

	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD55991AFC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(23);
					
		headers.add(new RequestHeaderData("Host", "www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-arch", "\"x86\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version", "\"121.0.2277.128\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform-version", "\"7.0.0\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-full-version-list", "\"Not A(Brand\";v=\"99.0.0.0\", \"Microsoft Edge\";v=\"121.0.2277.128\", \"Chromium\";v=\"121.0.6167.184\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-bitness", "\"64\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-model", "\"\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-wow64", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.google.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "empty", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "OGPC=19037049-1:;DV=w05eGrS_ZtAfwPhEXvq4VJEOWqD-3Bg", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_22(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_223 = new SubRule("req_uri", 103, 8, true, (IDCCoreVar)dcVars[27], false, "opi", null, 0, false);
	subContainer_67.addSubInstruction(sub_223);
		ISubRule sub_224 = new SubRule("req_uri", 21, 23, true, (IDCCoreVar)dcVars[23], false, "ei", null, 0, false);
	subContainer_67.addSubInstruction(sub_224);
		ISubRule sub_225 = new SubRule("req_uri", 14, 3, true, (IDCCoreVar)dcVars[21], false, "atyp", null, 0, false);
	subContainer_67.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_21", null, 0, false);
	subContainer_67.addSubInstruction(sub_226);
		ISubRule sub_227 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[4], false, "Host_28", null, 0, false);
	subContainer_67.addSubInstruction(sub_227);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD55991B2C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(204);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(204)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_22(HTTPPostData postData) {
				
			
	HTTPPostDataChunk pdc_21 = new HTTPPostDataChunk("A1EED15BD5599227C81DE53363373334", postData, null, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_21);

	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD559927DC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "cross-site", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.google.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a;_abck=B01BFED79AD0FF3EB4A65D6BBC81C4DF~0~YAAQParBF8J872iNAQAA5iXuwwu0hi0/K3Nin8KXdjIuZjKMCPKsS6fCRLnK8RCzP8kcPDeqFZCutV7p2UTDvgIJRpfG/cnT9AGu6s79syeFXTY2jZE+rDmPFtubv1jE6qQUAIDqTMKfPPGWUhTFzrxmlM1Od+DMFtlV9F+7YsQjeAM2zztTHwNzP0xQvUgrUIf+xJT4AeERxWS8aDmHdgfkxjiVrJdK5ZRHnHVHMTwJwPdPbdf3HXKterbi/6TVOoSLOFh6MckasdUOxokUH/KmYzLzxEMIwc3RCeXn2kiPR3+pLvMf7+3GcTmGO2EwVEJKHpUO1N6+UdG1HQO8Q9qYrzS5INoluvqeI7cyQwE4bDx5gMxVmFmBMsU=~-1~-1~-1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[31], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[32], " href=\"(.*?)\"", 4, 4, 0, 0, false, "href", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[33], " href=\"(.*?)\"", 5, 1, 0, 0, false, "href_2", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[34], " src=\"(.*?)\"", 8, 5, 0, 0, false, "src_6", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[35], " src=\"(.*?)\"", 9, 1, 0, 0, false, "src_4", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[36], " src=\"(.*?)\"", 10, 1, 0, 0, false, "src_5", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[37], " src=\"(.*?)\"", 11, 1, 0, 0, false, "src_3", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[38], " src=\"(.*?)\"", 13, 2, 0, 0, false, "src_2", null, 0, false);
	IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_228 = new SubRule("req_uri", 95, 55, true, (IDCCoreVar)dcVars[26], false, "gclid", null, 0, false);
	subContainer_68.addSubInstruction(sub_228);
		ISubRule sub_229 = new SubRule("req_hdr_Referer_1", 0, 23, false, (IDCCoreVar)dcVars[0], false, "Referer_20", null, 0, false);
	subContainer_68.addSubInstruction(sub_229);
		ISubRule sub_230 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_27", null, 0, false);
	subContainer_68.addSubInstruction(sub_230);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5599280C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD55BDAE7C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_231 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_19", null, 0, false);
	subContainer_69.addSubInstruction(sub_231);
		ISubRule sub_232 = new SubRule("req_uri", 0, 58, false, (IDCCoreVar)dcVars[38], false, "DevOps Test | IBM_url_7", null, 0, false);
	subContainer_69.addSubInstruction(sub_232);
		ISubRule sub_233 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_26", null, 0, false);
	subContainer_69.addSubInstruction(sub_233);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD55BDAEAC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD5715EB9C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"75b0-610be9a034480-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 06 Feb 2024 23:04:34 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_234 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_18", null, 0, false);
	subContainer_70.addSubInstruction(sub_234);
		ISubRule sub_235 = new SubRule("req_uri", 0, 103, false, (IDCCoreVar)dcVars[34], false, "DevOps Test | IBM_url_6", null, 0, false);
	subContainer_70.addSubInstruction(sub_235);
		ISubRule sub_236 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_25", null, 0, false);
	subContainer_70.addSubInstruction(sub_236);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5715EBCC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD5715F6CC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"d03adb0cccd6140628218fde8b13041839954b993b6cf24e5486c5aec062c571\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 22 Jan 2024 20:27:34 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_237 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_17", null, 0, false);
	subContainer_71.addSubInstruction(sub_237);
		ISubRule sub_238 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_24", null, 0, false);
	subContainer_71.addSubInstruction(sub_238);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5715F6FC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD5892C70C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"84f7c-610be9a310b40-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 06 Feb 2024 23:04:37 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[39], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_239 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_16", null, 0, false);
	subContainer_72.addSubInstruction(sub_239);
		ISubRule sub_240 = new SubRule("req_uri", 0, 104, false, (IDCCoreVar)dcVars[33], false, "DevOps Test | IBM_url_5", null, 0, false);
	subContainer_72.addSubInstruction(sub_240);
		ISubRule sub_241 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_23", null, 0, false);
	subContainer_72.addSubInstruction(sub_241);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5892C73C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD58B9D85C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "style", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"2250c0-60f178fd48d00-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 16 Jan 2024 22:22:12 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_242 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_15", null, 0, false);
	subContainer_73.addSubInstruction(sub_242);
		ISubRule sub_243 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[32], false, "DevOps Test | IBM_url_4", null, 0, false);
	subContainer_73.addSubInstruction(sub_243);
		ISubRule sub_244 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_22", null, 0, false);
	subContainer_73.addSubInstruction(sub_244);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD58B9D88C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD58B9E1AC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"b57df8-60f178fd48d00-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 16 Jan 2024 22:22:12 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_245 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_14", null, 0, false);
	subContainer_74.addSubInstruction(sub_245);
		ISubRule sub_246 = new SubRule("req_uri", 0, 110, false, (IDCCoreVar)dcVars[36], false, "DevOps Test | IBM_url_3", null, 0, false);
	subContainer_74.addSubInstruction(sub_246);
		ISubRule sub_247 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_21", null, 0, false);
	subContainer_74.addSubInstruction(sub_247);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD58B9E1DC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD58B9EAFC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"15d-5ef30d004d6c0-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 06 Dec 2022 23:03:31 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_248 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_13", null, 0, false);
	subContainer_75.addSubInstruction(sub_248);
		ISubRule sub_249 = new SubRule("req_uri", 0, 112, false, (IDCCoreVar)dcVars[35], false, "DevOps Test | IBM_url_2", null, 0, false);
	subContainer_75.addSubInstruction(sub_249);
		ISubRule sub_250 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_20", null, 0, false);
	subContainer_75.addSubInstruction(sub_250);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD58B9EB2C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD58B9F44C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"2572d-610be9d3b3e00-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 06 Feb 2024 23:05:28 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_251 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_12", null, 0, false);
	subContainer_76.addSubInstruction(sub_251);
		ISubRule sub_252 = new SubRule("req_uri", 0, 103, false, (IDCCoreVar)dcVars[37], false, "DevOps Test | IBM_url", null, 0, false);
	subContainer_76.addSubInstruction(sub_252);
		ISubRule sub_253 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_19", null, 0, false);
	subContainer_76.addSubInstruction(sub_253);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD58B9F47C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD58B9FD9C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"d7ddf0c4798700e83728dc2933b66842\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Tue, 06 Feb 2024 14:35:49 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_254 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_11", null, 0, false);
	subContainer_77.addSubInstruction(sub_254);
		ISubRule sub_255 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_18", null, 0, false);
	subContainer_77.addSubInstruction(sub_255);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD58B9FDCC81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD59513ADC81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "no-cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "script", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/products/devops-test?utm_content=SRCWW&p1=Search&p4=43700074487975959&p5=e&gad_source=1&gclid=EAIaIQobChMIjcqJ0cK-hAMVBUpHAR0ksAOWEAAYASAAEgK-UvD_BwE&gclsrc=aw.ds", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"218f93008812f61a5c9ebf303c079840d7a472e7c95c0f0d93077edd0cf70f87\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Mon, 22 Jan 2024 20:27:21 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_256 = new SubRule("req_hdr_Referer_1", 0, 182, false, (IDCCoreVar)dcVars[31], false, "Referer_10", null, 0, false);
	subContainer_78.addSubInstruction(sub_256);
		ISubRule sub_257 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_17", null, 0, false);
	subContainer_78.addSubInstruction(sub_257);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD59513B0C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED15BD5978450C81DE53363373334", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(17);
					
		headers.add(new RequestHeaderData("Host", "www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua", "\"Not A(Brand\";v=\"99\", \"Microsoft Edge\";v=\"121\", \"Chromium\";v=\"121\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.ibm.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-mobile", "?0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Safari/537.36 Edg/121.0.0.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("sec-ch-ua-platform", "\"Windows\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "cors", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "font", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.ibm.com/etc.clientlibs/adobe-cms/clientlibs/clientlib-idlStyles.min.ACSHASHb07d72d124dca340f1f121a435a56f0a.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.9", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "BMAID=f8bfe77a-9e74-403f-897a-02c0d10659d4;umx-at={%22sessionId%22:%2200b00538-2bef-49e5-9a62-9e7949235ea3%22%2C%22tntId%22:%22009f6482-b3c3-4355-bf2f-42273c04086b.35_0%22};_rdt_uuid=1707896447291.8a353376-556d-4e31-8b8c-4da2bb824256;_mkto_trk=id:298-RSE-650&token:_mch-ibm.com-1707896447435-23286;ajs_anonymous_id=f8bfe77a-9e74-403f-897a-02c0d10659d4;CookieConsentPolicy=0:1;LSKey-c$CookieConsentPolicy=0:1;oinfo=c3RhdHVzPUFDVElWRSZ0eXBlPTYmb2lkPTAwRDNoMDAwMDA0WWtlWQ==;autocomplete=1;oid=00D3h000004YkeY;PreferredLanguage0DM3h00000051qhGAA=en-US;guest_uuid_essential_0DM3h00000051qh=56c482e6-771c-43bd-93b1-8d5919735135;_uetvid=5df853a0cb0c11ee822361c24e040cf6;mbox=session#4ccc43cbe15a42d699d4c9d421b8368c#1707898320|PC#4ccc43cbe15a42d699d4c9d421b8368c.41_0#1739432520;AMCV_D10F27705ED7F5130A495C99%40AdobeOrg=359503849%7CMCIDTS%7C19768%7CMCMID%7C77342787911190791051799366383942426870%7CMCAAMLH-1708600921%7C12%7CMCAAMB-1708600921%7C6G1ynYcLPuiQxYZrsz_pkqfLG9yMXBpb2zX5dvJdYQJzPXImdj0y%7CMCOPTOUT-1708003321s%7CNONE%7CMCSYNCSOP%7C411-19775%7CMCCIDH%7C-886976837%7CvVersion%7C5.0.1;SESSf6f1f3c26943b83ce2dc5cfe4e79ea08=3eXHfl5Z3QgNANLHgqTSViZ4OiUv0Gd5ukDltvM0fho-ehUu;OPTOUTMULTI=0:0%7Cc1:1%7Cc2:0%7Cc3:0;gaVisitor=Organic|Referral;_ga=GA1.2.522435894.1707896447;notice_gdpr_prefs=0|1|2:;notice_preferences=2:;cmapi_gtm_bl=;cmapi_cookie_privacy=permit_1|2|3;_ga_FYECCCS21D=GS1.1.1707996122.2.1.1707996147.0.0.0;utag_main=v_id:018da68f9d1700008e41c62b5d6e0507d001f07500978$_sn:2$_se:14$_ss:0$_st:1707997947229$is_country_requiring_explicit_consent:false$vapi_domain:ibm.com$dc_visit:2$ses_id:1707996120494%3Bexp-session$_pn:2%3Bexp-session$dc_event:11%3Bexp-session$dc_region:ap-east-1%3Bexp-session;userContext=n/a|1|0|0|US|NJ|0|2:|implied|zz|n/a|n/a|n/a;pageviewContext=10cf7571-270e-4c1a-953e-9cc53d2eae66", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "\"6012c-604cc125a2100-gzip\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-Modified-Since", "Thu, 07 Sep 2023 22:06:28 GMT", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_258 = new SubRule("req_hdr_Referer_1", 0, 123, false, (IDCCoreVar)dcVars[39], false, "Referer_9", null, 0, false);
	subContainer_79.addSubInstruction(sub_258);
		ISubRule sub_259 = new SubRule("req_hdr_Host_1", 0, 11, false, (IDCCoreVar)vars[1], false, "Host_16", null, 0, false);
	subContainer_79.addSubInstruction(sub_259);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD5892C70C81DE53363373334"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED15BD559927DC81DE53363373334"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED15BD5978453C81DE53363373334",
			true,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(304)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-ttf");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
