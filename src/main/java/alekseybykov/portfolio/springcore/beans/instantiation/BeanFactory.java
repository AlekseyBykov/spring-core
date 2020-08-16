package alekseybykov.portfolio.springcore.beans.instantiation;

/**
 * @author Aleksey Bykov
 * @since 16.08.2020
 */
public class BeanFactory {

	private BeanFactory() { }

	public BeanC getBeanC() {
		return BeanC.getInstance();
	}
}
