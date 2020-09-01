package alekseybykov.portfolio.springcore.javaconfig.di.autowiring.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Aleksey Bykov
 * @since 01.09.2020
 */
public class BeanE {

	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}

	// required is true by default
	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
}
