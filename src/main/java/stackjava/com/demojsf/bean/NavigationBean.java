package stackjava.com.demojsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NavigationBean {

	public String moveToPage2() {
		return "page2"; // outcome
	}

}
