package org.gpi.interceptor;

import java.util.Map;

import org.gpi.domain.Iuser;
import org.gpi.utils.UserAware;
import org.gpi.utils.Util;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LoginInterceptor implements Interceptor{


	private static final long serialVersionUID = 1L;

	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> sessionAttributes = invocation.getInvocationContext().getSession();
		if (sessionAttributes != null) {
//			if  ( sessionAttributes != null && invocation.getAction().equals("login")){
//				
//				
//				return "redirectToIndex";
//			}
			Iuser user = (Iuser) sessionAttributes.get(Util.LOGIN);
			if (user == null ) {
				return Util.REDIRECT_TO_LOGIN;
			} 
		
			
			else {
				Object action =  invocation.getAction();
				if (action instanceof UserAware) {
					((UserAware) action).setUser(user);
				}
			}
		}
		return invocation.invoke();
		
		
	}

	public void destroy() {
		
	}

	public void init() {
		System.out.println("Initializing Logging Interceptor...ok");
	}
}
